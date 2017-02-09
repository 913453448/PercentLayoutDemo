package com.example.leo.textdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by leo on 17/1/19.
 */

public class ItemTopLayout extends LinearLayout {
    private static final String TAG  = "TAG";
    private TextView tv_title;
    private View mDescView;
    private View mContentView;
    public ItemTopLayout(Context context) {
        this(context,null);

    }

    public ItemTopLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ItemTopLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View.inflate(getContext(),R.layout.activity_main,this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tv_title= (TextView) findViewById(R.id.id_title);
        mDescView=findViewById(R.id.id_desc);
        mContentView=findViewById(R.id.id_content);
    }
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if(changed){
            tv_title.setMaxWidth(mContentView.getWidth()-mDescView.getWidth());
        }
    }
}
