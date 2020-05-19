package com.zzq;

import com.zzq.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getBean("user"));

        System.out.println( "Hello World!" );
    }
}
