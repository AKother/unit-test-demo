package com.example.unittestdemo.util.test;

import com.example.unittestdemo.util.DemoUtil;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class DemoUtilTest {

    @Test
    // 最简单的 Helper/Util/Validation 层
    public void testIsPositive()  {
        Assert.assertFalse(DemoUtil.isPositive( -1 ));
        Assert.assertFalse(DemoUtil.isPositive(0));
        Assert.assertTrue (DemoUtil.isPositive(1));
        Assert.assertFalse(DemoUtil.isPositive(null));
    }

}
