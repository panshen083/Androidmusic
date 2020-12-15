package me.wcy.music.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import me.wcy.music.R;
import me.wcy.music.utils.ScreenUtils;

/**
 * 播放页Indicator
 * Created by wcy on 2015/11/30.
 */
public class IndicatorLayout extends LinearLayout {
    public IndicatorLayout(Context context) {
        this(context, null);
    }

    public IndicatorLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IndicatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOrientation(HORIZONTAL);
        setGravity(Gravity.CENTER);
    }
}
