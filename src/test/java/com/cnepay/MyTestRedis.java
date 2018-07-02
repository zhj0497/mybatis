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
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class)
public class MyTestRedis {
    private static final Logger logger = LoggerFactory.getLogger(MyTestRedis.class);
    @Autowired //操作字符串的template，StringRedisTemplate是RedisTemplate的一个子集
    private StringRedisTemplate stringRedisTemplate;

    @Autowired  // RedisTemplate，可以进行所有的操作
    private RedisTemplate<Object,Object> redisTemplate;

    @Test
	public void addUser() {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key="test";
        boolean bExistent = this.stringRedisTemplate.hasKey(key);
        if (bExistent) {
            System.out.println("this key is bExistent!");
        }else{
            ops.set(key, "1");
        }
        this.stringRedisTemplate.opsForValue().get(key);
        logger.error("key:"+key+",val:"+this.stringRedisTemplate.opsForValue().get(key));
    }


}
*/
