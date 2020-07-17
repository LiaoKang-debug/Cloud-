package com.inspur.cloud.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.inspur.cloud.R;
import com.inspur.cloud.fragment.ApplicationFragment;
import com.inspur.cloud.fragment.CircleFragment;
import com.inspur.cloud.fragment.MessageFragment;
import com.inspur.cloud.fragment.UserFragment;
import com.inspur.cloud.fragment.WorkFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int MESSAGE_FRAGMENT = 0;
    private static final int WORK_FRAGMENT = 1;
    private static final int APPLICATION_FRAGMENT = 2;
    private static final int CIRCLE_FRAGMENT = 3;
    private static final int USER_FRAGMENT = 4;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private MessageFragment tab_message;
    private WorkFragment tab_work;
    private ApplicationFragment tab_application;
    private CircleFragment tab_circle;
    private UserFragment tab_user;
    private List<Fragment> fragments;//存放五个fragment


    private LinearLayout ll_msg, ll_work, ll_app, ll_circle, ll_user;

    private ImageView img_msg, img_work, img_app, img_circle, img_user;
    private TextView tv_msg, tv_work, tv_app, tv_circle, tv_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        initEvents();
        initData();
    }

    public void findViews() {
        ll_msg = findViewById(R.id.ll_mess);
        ll_work = findViewById(R.id.ll_work);
        ll_app = findViewById(R.id.ll_app);
        ll_circle = findViewById(R.id.ll_circle);
        ll_user = findViewById(R.id.ll_user);

        img_msg = findViewById(R.id.img_mess);
        img_work = findViewById(R.id.img_work);
        img_app = findViewById(R.id.img_app);
        img_circle = findViewById(R.id.img_circle);
        img_user = findViewById(R.id.img_user);

        tv_msg = findViewById(R.id.tv_mess);
        tv_work = findViewById(R.id.tv_work);
        tv_app = findViewById(R.id.tv_app);
        tv_circle = findViewById(R.id.tv_circle);
        tv_user = findViewById(R.id.tv_user);
    }

    public void initEvents() {
        ll_msg.setOnClickListener(this);
        ll_work.setOnClickListener(this);
        ll_app.setOnClickListener(this);
        ll_circle.setOnClickListener(this);
        ll_user.setOnClickListener(this);
    }
    public void initData(){
        fragmentManager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        tab_application = new ApplicationFragment();
        fragments.add(tab_application);
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.main_container,tab_application);
        transaction.commit();
    }
    public void selectFragment(int i){

        transaction = fragmentManager.beginTransaction();
        transaction.hide(fragments.get(0));
        transaction.commit();
        fragments.clear();
        selectTab(i);
    }
    public void selectTab(int i){
        switch (i){
            case MESSAGE_FRAGMENT:
                transaction = fragmentManager.beginTransaction();
                if(tab_message != null){
                    transaction.show(tab_message);
                }else{
                    tab_message = new MessageFragment();
                    transaction.add(R.id.main_container,tab_message);
                }
                fragments.add(tab_message);
                transaction.commit();
                break;
            case WORK_FRAGMENT:
                transaction = fragmentManager.beginTransaction();
                if(tab_work != null){
                    transaction.show(tab_work);
                }else{
                    tab_work = new WorkFragment();
                    transaction.add(R.id.main_container,tab_work);
                }
                fragments.add(tab_work);
                transaction.commit();
                break;
            case APPLICATION_FRAGMENT:
                transaction = fragmentManager.beginTransaction();
                if(tab_application != null){
                    transaction.show(tab_application);
                }else{
                    tab_application = new ApplicationFragment();
                    transaction.add(R.id.main_container,tab_application);
                }
                fragments.add(tab_application);
                transaction.commit();
                break;
            case CIRCLE_FRAGMENT:
                transaction = fragmentManager.beginTransaction();
                if(tab_circle != null){
                    transaction.show(tab_circle);
                }else{
                    tab_circle = new CircleFragment();
                    transaction.add(R.id.main_container,tab_circle);
                }
                fragments.add(tab_circle);
                transaction.commit();
                break;
            case USER_FRAGMENT:
                transaction = fragmentManager.beginTransaction();
                if(tab_user != null){
                    transaction.show(tab_user);
                }else{
                    tab_user = new UserFragment();
                    transaction.add(R.id.main_container,tab_user);
                }
                fragments.add(tab_user);
                transaction.commit();
                break;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_mess:
                selectFragment(MESSAGE_FRAGMENT);
                break;
            case R.id.ll_work:
                selectFragment(WORK_FRAGMENT);
                break;
            case R.id.ll_app:
                selectFragment(APPLICATION_FRAGMENT);
                break;
            case R.id.ll_circle:
                selectFragment(CIRCLE_FRAGMENT);
                break;
            case R.id.ll_user:
                selectFragment(USER_FRAGMENT);
                break;
        }
    }
}
