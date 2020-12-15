package com.jie.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * 1.想要远程调用别的服务
 *   ①.引入open-feign
 *   ②.编写一个接口，告诉SpringCloud需要调用远程服务
 *      ①.声明接口的每一个方法都是调用哪个远程服务的那个请求
 *   ③.开启远程调用功能
 * */
@EnableFeignClients(basePackages = "com.jie.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
