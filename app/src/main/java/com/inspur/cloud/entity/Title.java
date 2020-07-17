package com.inspur.cloud.entity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.inspur.cloud.R;

public class Title extends RelativeLayout {
    private Context mContext;
    private TextView tv_title;
    private ImageView img_right1,img_right2;
    public Title(Context context) {
        super(context);
        initView();
    }
    public Title(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        initView();
    }
    public void initView(){
        LayoutInflater.from(mContext).inflate(R.layout.title_bar,this);
        tv_title = findViewById(R.id.tv_title);
        img_right1 = findViewById(R.id.img_right1);
        img_right2 = findViewById(R.id.img_right2);
    }

    //设置popwindow
    @SuppressLint("NewApi")
    public void setPopWindow(PopupWindow mPopWindow, Title titleBaarView){
        mPopWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E9E9E9")));
        mPopWindow.showAsDropDown(titleBaarView, 0,-15);
        //mPopWindow.setAnimationStyle(R.style.popwin_anim_style);
        mPopWindow.setFocusable(true);
        mPopWindow.setOutsideTouchable(true);
        mPopWindow.update();
        //setBtnRight(R.drawable.skin_conversation_title_right_btn_selected);
    }
    //设置标题右侧图片
    public void setBtnRight1(int icon){
        img_right1.setImageResource(icon);
    }
    public void setBtnRight2(int icon){
        img_right2.setImageResource(icon);
    }
    //设置标题
    public void setTitleText(String txtRes){
        tv_title.setText(txtRes);
    }
    public void setBtnRight1OnclickListener(OnClickListener listener){
        img_right1.setOnClickListener(listener);
    }
    public void setBtnRight2OnclickListener(OnClickListener listener){
        img_right2.setOnClickListener(listener);
    }

}
