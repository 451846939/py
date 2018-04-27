package com.kdkj.py.commons.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Love丶TG
 * @ClassName: Result
 * @Description: 返回值
 * @date 2017年11月7日 上午11:33:50
 */
public class Result extends HashMap<String, Object> {

    private static final long serialVersionUID = -3108684259173888073L;

    public Result() {
        put("code", 0);
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result ok(String msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }

    public static Result ok(String msg, Object obj) {
        Result r = new Result();
        r.put("msg", msg);
        r.put("data", obj);
        return r;
    }

    public static Result ok(String msg, Map<String, Object> map) {
        Result r = new Result();
        r.put("msg", msg);
        r.put("data", map);
        return r;
    }

    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        return new Result();
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}