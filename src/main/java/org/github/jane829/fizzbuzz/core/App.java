package org.github.jane829.fizzbuzz.core;

import org.github.jane829.fizzbuzz.ApplicationRunner;
import org.github.jane829.fizzbuzz.config.DependencyConfiguration;
import org.github.jane829.fizzbuzz.exception.NumberInvalidException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{

    public static void main(String[] args) throws NumberInvalidException
    {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DependencyConfiguration.class);
        ApplicationRunner applicationRunner = (ApplicationRunner) annotationConfigApplicationContext.getBean("applicationRunner");

        for(int i = 1; i < 101; i++){
            String handle = applicationRunner.handle(String.valueOf(i));
            System.out.println(handle);
        }

    }

}
