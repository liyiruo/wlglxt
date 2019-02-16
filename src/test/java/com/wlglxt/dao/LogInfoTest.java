package com.wlglxt.dao;

import com.wlglxt.bean.Iaccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.Assert.*;

/**
 * Created by admin on 2019/2/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LogInfoTest {
    @Autowired
    //自动装配
    private ApplicationContext cxf;

    @Test
    public void getAccInfo() throws Exception {


        LogInfo logInfo = (LogInfo) cxf.getBean(LogInfo.class);

        //Iaccount iaccount = logInfo.getAccInfo("1","123");

        System.out.println(logInfo.toString()+"----------------------------------------------");
    }

}