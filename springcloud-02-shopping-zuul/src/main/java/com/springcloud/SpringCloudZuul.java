package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient //到eureka去发现服务
@EnableZuulProxy	//启用路由
public class SpringCloudZuul {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuul.class, args);

	}

}
