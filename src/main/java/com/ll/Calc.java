package com.ll;

public class Calc {
    public static int run(String exp) {
        if(exp.isBlank()) return 0;

        if(exp.startsWith("(") && exp.endsWith(")")){
            exp = exp.substring(1, exp.length() - 1);
        }

        String[] exps = exp.split(" ");
        String sign = exps[1];
        int num1 = Integer.parseInt(exps[0]);
        int num2 = Integer.parseInt(exps[2]);

        switch (sign){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case  "/":
                return num1 / num2;
        }
        return 0;
    }
}