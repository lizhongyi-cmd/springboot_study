package test;


import dao.TestDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springboot_study
 * @description: bean test
 * @author: lizhongyi3
 * @create: 2021-08-21 19:55
 **/
public class Test {
    public static void main(String[] args) {

        ApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao tt=(TestDao) appcon.getBean("test");
        tt.sayHello();
    }
}
