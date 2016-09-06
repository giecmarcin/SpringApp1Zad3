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
        HelloWorld helloObj1 = context.getBean("helloBean", HelloWorld.class);
        HelloWorld helloObj2 = context.getBean("helloBean", HelloWorld.class);
        helloObj1.setName("Test Prototype");
        helloObj1.printHello();
        helloObj2.printHello();

        System.out.println();
        //Singleton and prototype
        ClassA classA1 = context.getBean("ClassA", ClassA.class);
        classA1.getPole().setName("Test prototype from object ");
        classA1.getPole().printHello();

        ClassA classA2 = context.getBean("ClassA", ClassA.class);
        classA2.getPole().printHello();

//         MovieFinder finderObj = (MovieFinder)context.getBean("MovieFinder");
//        finderObj.findAll();
//        MovieLister movieLister = (MovieLister)context.getBean("MovieLister");
//        movieLister.showAllMovies();
    }
}
