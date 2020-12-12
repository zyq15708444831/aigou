package cn.zhengyq.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Administrator
 * @Date 2020/12/10 23:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
