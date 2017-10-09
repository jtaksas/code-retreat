package com.expedia.coderetreat;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = "unit")
public class UnitTestSpec {

    @Test
    public void sampleTest() {
        final boolean actual = true;
        final boolean expected = true;
        assertEquals(actual, expected);
    }

}
