package annotation.dao;

import annotation.dao.TestDao;

/**
 * @program: springboot_study
 * @description: ....
 * @author: lizhongyi3
 * @create: 2021-08-21 20:44
 **/
public class TestDaoImpl implements TestDao {
    @Override
    public void save(){
        System.out.println("testDao save");
    }
}
