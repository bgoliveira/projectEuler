package me.brunogomes.projecteuler.problem1.test;

import me.brunogomes.projecteuler.problem1.MultipleOf3And5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipleOf3And5Test
{
    @Autowired
    private MultipleOf3And5 objectInTest;

    @Test
    public void shouldReturn233168(){

        Assert.assertTrue(objectInTest.getAnswer().equals("233168"));
    }
}
