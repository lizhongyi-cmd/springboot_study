package JavaConfigtest.controller;

import JavaConfigtest.service.TestService;

/**
 * @program: springboot_study
 * @description: test controller
 * @author: lizhongyi3
 * @create: 2021-08-22 14:45
 **/
public class TestController {
    TestService testService;
    public void setTestService(TestService testService){
        this.testService=testService;
    }
    public void save(){
        testService.save();
    }
}
