package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 五环旗 on 2016/7/2.
 */
public class marquee extends TextView{
    public marquee(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public marquee(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public marquee(Context context) {
        super(context);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
