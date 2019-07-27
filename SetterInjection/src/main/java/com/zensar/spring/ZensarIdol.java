package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdol 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx=new ClassPathXmlApplicationContext("performers.xml");
    	 Performer p=ctx.getBean("Tina",Performer.class);
    	 p.perform();
    
    }
}
