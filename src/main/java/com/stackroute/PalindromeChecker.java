package com.stackroute;
import java.util.*;

public class PalindromeChecker {

    public boolean checkPelindrome(int num)

   {
        int s=0;
        int temp=num;
        while(num>0){
            s=s*10+num%10;
            num=num/10;
        }
        if(temp==s){
            return true;
        }
        else{
            return false;
        }


    }
}
