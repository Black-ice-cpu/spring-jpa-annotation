package com.by;

import static org.junit.Assert.assertTrue;

import com.by.config.AppConfig;
import com.by.config.PropertiesConfig;
import com.by.repository.OrdersRepository;
import org.hibernate.dialect.MySQLDialect;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.transaction.Transactional;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void shouldAnswerWithTrue()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        OrdersRepository orders = annotationConfigApplicationContext.getBean(OrdersRepository.class);
        System.out.println(orders.getOne(1L).toString());
    }
}
