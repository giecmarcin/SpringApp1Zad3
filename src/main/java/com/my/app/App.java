package com.my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld helloObj = (HelloWorld)context.getBean("helloBean");

       // MovieFinder finderObj = (MovieFinder)context.getBean("MovieFinder");

        helloObj.printHello();
        //finderObj.findAll();

        MovieLister movieLister = (MovieLister)context.getBean("MovieLister");
        movieLister.showAllMovies();
    }
}
