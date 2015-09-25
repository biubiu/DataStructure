package com.lintcode;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.IsCollectionContaining.hasItems;



/**
 * Created by shawncao on 9/25/15.
 */
@RunWith(JUnit4.class)
public class Subsets {

    @Test
    public void test_non_empty_subsets(){
        ArrayList<List<Integer>>ints = Lists.newArrayList(asList(1), asList(2),asList(3),asList(1,2,3),asList(1,3),asList(1,2),asList(2,3),asList());
        assertThat(SetsUtil.subsets(Lists.newArrayList(1, 2, 3)), is(ints));
    }






}
