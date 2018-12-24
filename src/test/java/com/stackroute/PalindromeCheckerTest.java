
package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

     PalindromeChecker Checker=new PalindromeChecker();
    @Test
    public void test1()
    {
        assertEquals(true,Checker.checkPelindrome(12321));
    }
     @Test
    public void test2()
    {
        assertEquals(true,Checker.checkPelindrome(1245665421));
    }
    @Test
    public void test3()
    {
        assertEquals(false,Checker.checkPelindrome(1232112));
    }
    @Test
    public void test4()
    {
        assertEquals(false,Checker.checkPelindrome(123123));
    }
    @Test
    public void test5()
    {
        assertEquals(true,Checker.checkPelindrome(0000000));

     PalindromeChecker palindromeChecker=new PalindromeChecker();
    @Test
    public void test1(){
        assertEquals(true,palindromeChecker.checkPelindrome(12321));
    }
    @Test
    public void test2(){
        assertEquals(true,palindromeChecker.checkPelindrome(1245678765421));
    }
    @Test
    public void test3(){
        assertEquals(false,palindromeChecker.checkPelindrome(1232112));
    }
    @Test
    public void test4(){
        assertEquals(false,palindromeChecker.checkPelindrome(123123));
    }
    @Test
    public void test5(){
        assertEquals(true,PalindromeChecker.checkPelindrome(0000000));
    }

}