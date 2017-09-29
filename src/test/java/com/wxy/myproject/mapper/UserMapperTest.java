package com.wxy.myproject.mapper;

import com.wxy.myproject.BeanTest;
import com.wxy.myproject.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiaoyu on 2017/9/4.
 */

public class UserMapperTest extends BeanTest{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testSelectByPrimaryKey(){
        User user = userMapper.selectByPrimaryKey(4);
        Assert.assertEquals("出错", "吴君如",user.getUserName());
        System.out.println("测试mybatis成功");
    }

    @Test
    public void testSelect(){
        redisTemplate.opsForValue().set("name", "wxy");
        System.out.println(redisTemplate.opsForValue().get("name"));
        System.out.println("测试redis成功");
    }
}
