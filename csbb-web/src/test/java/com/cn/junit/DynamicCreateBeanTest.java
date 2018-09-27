package com.cn.junit;

import com.cn.myspring.controller.HelloworldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 * @create 2018-09-19 10:22
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/applicationContext.xml")
public class DynamicCreateBeanTest {

    @Autowired
    private HelloworldController helloworldController;

    @Test
    public void dynamicCreateBean(){
        helloworldController.hello();
    }

}
