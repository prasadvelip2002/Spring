package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");
       JavaTrainer Jva = (JavaTrainer)cpx.getBean("Java");
       System.out.println(Jva);
       System.out.println(Jva.getName());
       
       SQLTrainer sql = (SQLTrainer)cpx.getBean("SQL");
       System.out.println(sql);
       System.out.println(sql.getName());
       
       WebTrainer web = (WebTrainer)cpx.getBean("WEB");
       System.out.println(web);
       System.out.println(web.getName());
       
  
    }
}
