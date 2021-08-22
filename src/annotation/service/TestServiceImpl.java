package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springboot_study
 * @description: ....
 * @author: lizhongyi3
 * @create: 2021-08-21 21:08
 **/
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
    @Resource(name="TestDaoImpl")
    private TestDao testDao;
    @Override
    public void save(){
        testDao.save();
        System.out.println("testService save");
    }

}
