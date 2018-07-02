/*
package com.cnepay;

import com.cnepay.mybatis.Application;
import com.cnepay.mybatis.domain.AuthData;
import com.cnepay.mybatis.service.MyDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class MyTest {
    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);
	 @Autowired
	 private MyDataService myDataService;

	@Test
	public void addUser() {
		myDataService.findDataById(63L);

    }

    */
/**
     * 分页测试
     *//*

    @Test
    public void getPageList(){
        List<AuthData> list=  myDataService.findAllByPage(new AuthData());

        System.out.println("list:"+list.size());
    }
    */
/**
     * 更新有值的
     *//*

    @Test
    public void updateById(){
        AuthData authData = new AuthData();
        authData.setId(64L);
        authData.setAccountNo("123456789");
       int updateRow= myDataService.updateAuthDataById(authData);

        logger.info("update rowNum{}",updateRow);
    }

    @Test
    public void findAll(){
       List<AuthData> list = myDataService.findAll();


        logger.info("date size:{},dataInfo:{}",list.size(),list);
    }
}
*/
