package org.niit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fibinaccoTest {
     Fibinaco fibinaco;

     @Before
     public void setUp(){
          fibinaco= new Fibinaco();
     }
     @After
     public void tearDown(){
          fibinaco= null;
     }
     @Test

     public void chechCorrect(){
          ArrayList<Integer> fb = (ArrayList<Integer>) fibinaco.fibinacci(5);
          ArrayList <Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3));
          Assert.assertEquals(expected,fb);
     }
     @Test
     public void chechNotCorrect(){
          ArrayList<Integer> fb = (ArrayList<Integer>) fibinaco.fibinacci(7);
          ArrayList <Integer> expected = new ArrayList<>(Arrays.asList(0,1,1,2,3));
          Assert.assertNotEquals(expected,fb);
     }
}
