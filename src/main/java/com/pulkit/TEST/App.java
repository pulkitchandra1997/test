package com.pulkit.TEST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	System.out.println("STARTING TEST APPLICATION");
    	SpringApplication.run(App.class, args);
    }
}
