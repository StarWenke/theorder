package com.wk;

import com.wk.global.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

/**
 * @author Makonike
 * @date 2021-07-21 22:46
 **/
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void test(){
        redisUtils.set("order2",1,10);
    }


}
