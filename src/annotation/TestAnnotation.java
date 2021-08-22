package annotation;

import annotation.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: springboot_study
 * @description: test annotation
 * @author: lizhongyi3
 * @create: 2021-08-22 14:09
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appcon = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
        TestController tc=appcon.getBean(TestController.class);
        tc.save();
        appcon.close();
    }
}
