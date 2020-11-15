package com.example.hanshutuxinghuizhiqi;

import java.util.IllegalFormatCodePointException;

public class ExpressionWithVars extends Expression{
    private String fx;//表达式，例如sin(x)
    private String x;//表达式中的自变量，例如x
    public ExpressionWithVars(String m_strExp,String m_strvar){
        this.fx=m_strExp;
        this.x=m_strvar;
    }


    public double evalf(double newx) {
        if(fx.equals("sin(x)")) {
            return Math.sin(newx);
        }
        else if(fx.equals("cos(x)")) {
            return Math.cos(newx);
        }
        else if(fx.equals("tan(x)")){
            return Math.tan(newx);
        }

        else
            return 0;
    }
}
