package com.hassdata.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
          int port=8761;
          if(!NetUtil.isUsableLocalPort(port)){
              System.err.printf("端口%d被占用了，无法启动%n",port);
              System.exit(1);
              System.out.println("sdfsf");
          }
        new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port=" + port).run(args);    }
}
