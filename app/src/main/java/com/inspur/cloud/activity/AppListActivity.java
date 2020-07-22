package com.inspur.cloud.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.inspur.cloud.R;
import com.inspur.cloud.entity.AppListAdapter;
import com.inspur.cloud.entity.Application;

import java.util.ArrayList;
import java.util.List;

public class AppListActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView listBack,listFind;
    private ListView mlistView;
    private List<Application> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
        findViews();
        setEvents();
        initData();
    }
    public void initData(){
        list = new ArrayList<>();
        list.add(new Application("集团新闻",R.drawable.app_1,"浪潮集团新闻",false));
        list.add(new Application("报销审批",R.drawable.app_2,"浪潮集团新闻",false));
        list.add(new Application("日志审核",R.drawable.app_3,"浪潮集团新闻",false));
        list.add(new Application("研发审批",R.drawable.app_4,"浪潮集团新闻",false));
        list.add(new Application("我的申请",R.drawable.app_5,"浪潮集团新闻",false));
        list.add(new Application("日志录入",R.drawable.app_6,"浪潮集团新闻",false));
        list.add(new Application("集团新闻",R.drawable.app_7,"浪潮集团新闻",false));
        list.add(new Application("研发审批",R.drawable.app_8,"浪潮集团新闻",false));
        list.add(new Application("报销审核",R.drawable.app_4,"浪潮集团新闻",false));
        list.add(new Application("集团新闻",R.drawable.app_3,"浪潮集团新闻",false));
        list.add(new Application("我的申请",R.drawable.app_5,"浪潮集团新闻",false));
        list.add(new Application("日志录入",R.drawable.app_7,"浪潮集团新闻",false));
        list.add(new Application("研发审批",R.drawable.app_1,"浪潮集团新闻",false));

        AppListAdapter adapter = new AppListAdapter(this,list);
        mlistView.setAdapter(adapter);
    }
    public void findViews(){
        listBack = findViewById(R.id.list_back);
        listFind = findViewById(R.id.list_find);
        mlistView = findViewById(R.id.app_list);
    }
    public void setEvents(){
        listBack.setOnClickListener(this);
        listFind.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.list_back:
                finish();
                break;
            case R.id.list_find:
                Intent intent = new Intent(AppListActivity.this,SearchActivity.class);
                startActivity(intent);
                break;
        }
    }
}
