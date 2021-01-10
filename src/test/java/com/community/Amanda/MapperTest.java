package com.community.Amanda;

import com.community.Amanda.dao.DiscussPostMapper;
import com.community.Amanda.dao.LoginTicketMapper;
import com.community.Amanda.dao.UserMapper;
import com.community.Amanda.entity.DiscussPost;
import com.community.Amanda.entity.LoginTicket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = AmandaApplication.class)
public class MapperTest {

    @Resource
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginTicketMapper loginTicketMapper;
    @Test
    public void testinsert(){
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setStatus(2);
        loginTicket.setUserId(152);
        loginTicket.setExpired(new Date(System.currentTimeMillis()+1000*60*10));
        loginTicket.setTicket("152");
        loginTicketMapper.insertLoginTicket(loginTicket);
    }
}
