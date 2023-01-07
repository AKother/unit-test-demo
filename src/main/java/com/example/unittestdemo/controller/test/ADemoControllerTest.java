package com.example.unittestdemo.controller.test;

import com.example.unittestdemo.controller.DemoController;
import com.example.unittestdemo.service.DemoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ADemoControllerTest {
    @Mock
    DemoService mockDemoService;
    @InjectMocks
    DemoController demoController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    //TODO 稍复杂 Service/Controller 层
    public void testExecute() throws Exception {
        when(mockDemoService.getResult(anyString())).thenReturn("getResultResponse");
        String result = demoController.execute("request");
        Assert.assertEquals("replaceMeWithExpectedResult", result);

        assertThat(result).isEqualTo("replaceMeWithExpectedResult");
        assertThat(result).contains("replace");
    }

    @Test
    //TODO 如何测试 Exception
    public void testExecution_throwsException_whenServiceThrowsException() throws Exception {
        when(mockDemoService.getResult(anyString())).thenThrow(new IOException("TEST"));
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> demoController.execute("req"))
                .withCauseExactlyInstanceOf(IOException.class)
                .withMessageContaining("TEST");
        verify(mockDemoService).getResult(anyString());
        verifyNoMoreInteractions(mockDemoService);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme