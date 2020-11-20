package com.example.touchlogger;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MyView extends ViewGroup {
    public MyView(Context context) {
        super(context);
//        this.setAlpha(0);
        this.setClickable(false);
        this.setFocusable(false);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//        super.onLayout(changed, l, t, r, b);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        super.onInterceptTouchEvent(ev);
        Log.d("GP", ev.getX() + "," + ev.getY());
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
//        super.onTouchEvent(ev);
        Log.d("GP", ev.getX() + "," + ev.getY());
        return false;

    }
}
