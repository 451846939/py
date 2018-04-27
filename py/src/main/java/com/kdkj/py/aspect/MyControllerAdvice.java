package com.kdkj.py.aspect;


import com.kdkj.py.commons.aspect.LogExceptionPointcut;
import com.kdkj.py.commons.util.Result;
import com.kdkj.py.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;


@ControllerAdvice
public class MyControllerAdvice {
    @Autowired
    private LogExceptionPointcut logExceptionPointcut;
//	  @ModelAttribute  
//	    public User newUser() {  
//	        System.out.println("============应用到所有@RequestMapping注解方法，在其执行之前把返回值放入Model");  
//	        return new User();  
//	    }  
//	  
//	    @InitBinder  
//	    public void initBinder(WebDataBinder binder) {  
//	        System.out.println("============应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器");  
//	    }  

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result processUnauthenticatedException(NativeWebRequest request, Exception e) {
        logExceptionPointcut.logException(Messages.showSysErr(getClass(), e));
        if (e instanceof HttpMessageNotReadableException){
            return Result.error("传参错误");
        }
        e.printStackTrace();
        return Result.error("你没有对应权限或内部错误请联系管理员"); //返回一个逻辑视图名
    }
}
