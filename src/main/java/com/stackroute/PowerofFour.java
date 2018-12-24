package com.stackroute;

public class PowerofFour {
    String result="";
    public String checkPower(int num) {
        int n = num;
            if (n % 4 != 0) {
                return "this is not power of 4";

            }
            else
            {
                return "this is power of 4";
            }
    }
}
