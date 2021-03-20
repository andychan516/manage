package com.andy.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ManageApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ManageApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
    System.out.println("外部tomcat,chapter启动!");
    return application.sources(ManageApplication.class);
  }


}
