package com.qzc.statusbarcompat;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author Administrator
 * created by QIN on 2/23/19.
 */
public class StatusBarView extends View {

    private int mBarSize;

    public StatusBarView(Context context) {
        this(context, null, 0);
    }

    public StatusBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StatusBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Resources resources = getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        mBarSize = resources.getDimensionPixelSize(resourceId);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), mBarSize);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /**
     * Get status bar height.
     */
    public int getBarSize() {
        return mBarSize;
    }
}
