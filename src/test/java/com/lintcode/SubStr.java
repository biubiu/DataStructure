package com.lintcode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by shawncao on 9/25/15.
 */
@RunWith(JUnit4.class)
public class SubStr {

    @Test
    public void find_pattern_in_mid_given_str(){
        assertEquals("should find given str and return 3", 3, StrUtils.strStr("source","rc"));
    }

    @Test
    public void find_pattern_in_last_given_str(){
        assertEquals("should find given str and return 1", 4, StrUtils.strStr("source","ce"));
    }

    @Test
    public void find_pattern_in_begin_given_str(){
        assertEquals("should find given str and return 1", 0, StrUtils.strStr("source","sou"));
    }

    @Test
    public void find_pattern_perfect_match_given_str(){
       assertEquals("should find given str and return 1", 0, StrUtils.strStr("source","source"));
    }

}
