package annotation.controller;

import annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: springboot_study
 * @description: test controller
 * @author: lizhongyi3
 * @create: 2021-08-21 21:14
 **/
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    public void save(){
        testService.save();
        System.out.println("testController save");
    }

}
