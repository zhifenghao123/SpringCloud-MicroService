package com.howdev.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * CloudProviderPayment8001Application class
 *
 * @author haozhifeng
 * @date 2023/04/06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
        System.out.println("启动成功");
    }
}
