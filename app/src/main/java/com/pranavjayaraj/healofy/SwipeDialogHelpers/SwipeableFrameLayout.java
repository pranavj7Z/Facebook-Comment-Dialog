package com.pranavjayaraj.healofy.SwipeDialogHelpers;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import com.pranavjayaraj.healofy.SwipeDialogHelpers.DismissOnSwipeListener;

public class SwipeableFrameLayout extends FrameLayout {

    private DismissOnSwipeListener mTouchListener;

    public SwipeableFrameLayout(Context context) {
        super(context);
    }

    public void setSwipeDismissTouchListener(DismissOnSwipeListener touchListener) {
        mTouchListener = touchListener;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (mTouchListener != null) {
            if (mTouchListener.onTouch(this, ev)) {
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

}