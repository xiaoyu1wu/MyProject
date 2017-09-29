package com.wxy.myproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //包含了@Controller、@ResponseBody
@SpringBootApplication //包括@Configuration、@EnableAutoConfiguration、@Componentng组件（包括@Configuration）
public class Application {

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }

    public  static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}