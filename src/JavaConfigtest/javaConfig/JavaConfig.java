package JavaConfigtest.javaConfig;

import JavaConfigtest.controller.TestController;
import JavaConfigtest.dao.TestDao;
import JavaConfigtest.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot_study
 * @description: java 配置类
 * @author: lizhongyi3
 * @create: 2021-08-22 14:48
 **/
@Configuration
public class JavaConfig {
    @Bean
    public TestDao getTestDao(){
        return new TestDao();
    }
    @Bean
    public TestService getTestService(){
        TestService ts= new TestService();
        ts.setTestDao(getTestDao());
        return ts;
    }
    @Bean
    public TestController getTestController(){
        TestController tc=new TestController();
        tc.setTestService(getTestService());
        return tc;
    }

}
