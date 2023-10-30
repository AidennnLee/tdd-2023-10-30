package com.ll;

public class Calc {
    public static int run(String exp) {
        if(exp.contains("-")){
            String[] exps = exp.split(" - ");
            int num1 = Integer.parseInt(exps[0]);
            int num2 = Integer.parseInt(exps[1]);
            return num1 - num2;
        }

        if(exp.contains("+")){
            String[] exps = exp.split(" \\+ ");
            int num1 = Integer.parseInt(exps[0]);
            int num2 = Integer.parseInt(exps[1]);
            return num1 + num2;
        }

        if(exp.contains("*")){
            String[] exps = exp.split(" \\* ");
            int num1 = Integer.parseInt(exps[0]);
            int num2 = Integer.parseInt(exps[1]);
            return num1 * num2;
        }

        if(exp.contains("/")){
            String[] exps = exp.split(" / ");
            int num1 = Integer.parseInt(exps[0]);
            int num2 = Integer.parseInt(exps[1]);
            return num1 / num2;
        }

        return 0;
    }
}