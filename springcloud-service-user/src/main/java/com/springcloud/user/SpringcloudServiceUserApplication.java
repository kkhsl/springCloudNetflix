package com.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

// 开启Feign并扫描Feign客户端
@EnableFeignClients({"com.hkk.springcloud.service", "com.springcloud.user."})

/*
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //开启Hystrix 断路器
*/
@ComponentScan(basePackages = {"com.hkk.springcloud.service","com.springcloud.user"})

@EnableHystrixDashboard
@SpringCloudApplication // 等价以上三个注解之和
public class SpringcloudServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceUserApplication.class, args);
    }

}
