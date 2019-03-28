package com.pruebasjava.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }
}