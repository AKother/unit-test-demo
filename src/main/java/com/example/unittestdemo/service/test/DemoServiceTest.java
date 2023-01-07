package com.example.unittestdemo.service.test;

import com.example.unittestdemo.mapper.DemoDBMapper;
import com.example.unittestdemo.service.DemoService;
import com.example.unittestdemo.service.DemoTairClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DemoServiceTest {

    @Mock
    DemoTairClient tairClient;

    @Mock
    DemoDBMapper dbMapper;

    @InjectMocks
    DemoService demoService;

    @Test
    //TODO 稍复杂 Service/Controller 层
    public void testGetResult_succeed_getFromCache() throws Exception {

    }

    @Test
    //TODO void 返回如何断言 -- Argument Captor 的使用
    public void testDeleteByKey_succeed_givenValidKey() {

    }

    @Test
    //TODO 依赖里面的 Lambda 表达式内的逻辑怎么执行？
    public void testGetResults_succeed_getFromDB(){



    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme