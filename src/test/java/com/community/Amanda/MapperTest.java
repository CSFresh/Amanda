package com.community.Amanda;

import com.community.Amanda.dao.DiscussPostMapper;
import com.community.Amanda.dao.UserMapper;
import com.community.Amanda.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = AmandaApplication.class)
public class MapperTest {

    @Resource
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testinsert(){
        List<DiscussPost> discuss_posts = discussPostMapper.selectDiscussPosts(151, 0, 10);
        discuss_posts.forEach(s-> System.out.println(s));
    }
}
