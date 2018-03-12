package com.expedia.coderetreat;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class JunitTest {

    @Test
    public void sampleTest() {
        final boolean actual = true;
        final boolean expected = true;
        assertEquals(actual, expected);
    }

}
