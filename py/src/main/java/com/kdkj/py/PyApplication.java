package com.kdkj.py;


//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.kdkj.py.dao")
//@EnableCaching
public class PyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PyApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
