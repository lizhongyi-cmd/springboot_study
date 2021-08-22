package JavaConfigtest.javaConfig;

import JavaConfigtest.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: springboot_study
 * @description: test config
 * @author: lizhongyi3
 * @create: 2021-08-22 14:58
 **/
public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon=new AnnotationConfigApplicationContext(JavaConfig.class);
        TestController tc = appCon.getBean(TestController.class);
        tc.save();
        appCon.close();
    }
}
