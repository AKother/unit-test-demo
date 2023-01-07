package com.example.unittestdemo.controller.test;


import com.example.unittestdemo.controller.DemoController;
import com.example.unittestdemo.service.DemoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    DemoService mockDemoService;

    @InjectMocks
    DemoController demoController;

    @Test
    // 稍复杂 Service/Controller 层
    public void testExecute() throws Exception {

    }

    @Test
    //  如何测试 Exception
    public void testExecution_throwsException_whenServiceThrowsException() throws Exception {

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme