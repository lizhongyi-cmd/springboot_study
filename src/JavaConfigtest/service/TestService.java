package JavaConfigtest.service;

import JavaConfigtest.dao.TestDao;

/**
 * @program: springboot_study
 * @description: test service
 * @author: lizhongyi3
 * @create: 2021-08-22 14:41
 **/
public class TestService {
    TestDao testDao;
    public void setTestDao(TestDao testDao){
        this.testDao=testDao;
    }
    public void save(){
        testDao.save();
    }
}
