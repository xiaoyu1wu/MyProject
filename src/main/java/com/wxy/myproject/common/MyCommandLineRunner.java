package com.wxy.myproject.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoyu on 2017/9/2.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("CommandLineRunner run before SpringApplication");
    }
}
