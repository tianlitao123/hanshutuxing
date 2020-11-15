package com.example.hanshutuxinghuizhiqi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;


public class CustomView extends View {
    private String mExampleString1; // TODO: use a default from R.string...
    private int mExampleColor1 = Color.RED; // TODO: use a default from R.color...
    private float mExampleDimension1 = 0; // TODO: use a default from R.dimen...
    String strFunction;//获取函数文本
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(strFunction==null || strFunction.length()==0)
            return;

        Rect rect=new Rect();
        rect.left=0;
        rect.top=0;
        rect.right = getWidth();
        rect.bottom=getHeight();

        Axis axis=new Axis(rect);
        axis.draw(canvas);

        Plot plot=new Plot(axis,strFunction,"x");
        plot.draw(canvas);
    }
    public String getStrFunction() {
        return strFunction;
    }
    public void setStrFunction(String strFunction) {
        this.strFunction = strFunction;
    }

}
