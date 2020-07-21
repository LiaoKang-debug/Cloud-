package com.inspur.cloud.fragment;


import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.inspur.cloud.R;
import com.inspur.cloud.entity.Application;
import com.inspur.cloud.entity.FWDiscussAdapter;
import com.inspur.cloud.entity.Title;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ApplicationFragment extends Fragment {

    private Title title;
    private ImageView search;
    private List<HashMap<Integer, Application>> mlist;
    private List<String> titleName;
    private ListView listView;
    public ApplicationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_application, container, false);
        findView(view);
        title.setTitleText("应用");
        title.setBtnRight1(R.drawable.add);
        title.setBtnRight2(R.drawable.app_before);
        initData();

        return view;
    }
    public void findView(View view){
        title = view.findViewById(R.id.title);
        search = view.findViewById(R.id.search);
        listView = view.findViewById(R.id.list_item);
    }
    public void initData(){
        mlist = new ArrayList<>();
        titleName = new ArrayList<>();
        titleName.add("常用应用");
        titleName.add("集团办公");
        titleName.add("集团本部部门");
        titleName.add("差旅服务");
       // titleName.add("休闲娱乐");

//        for (int i = 0; i < 5; i++) {
//            HashMap<Integer,String> map = new HashMap<>();
//            map.put(0,"1");
//            map.put(1,"2");
//            map.put(2,"3");
//            map.put(3,"4");
//            mlist.add(map);
//        }
        HashMap<Integer, Application> map1 = new HashMap<>();
        map1.put(0,new Application("集团新闻",R.drawable.app_1));
        map1.put(1,new Application("报销审批",R.drawable.app_2));
        map1.put(2,new Application("云盘",R.drawable.app_3));
        map1.put(3,new Application("研发审批",R.drawable.app_4));
        map1.put(4,new Application("集团新闻",R.drawable.app_5));
        map1.put(5,new Application("挪车",R.drawable.app_6));
        map1.put(6,new Application("日志审核",R.drawable.app_7));
        map1.put(7,new Application("研发审批",R.drawable.app_8));
        mlist.add(map1);

        HashMap<Integer,Application> map2 = new HashMap<>();
        map2.put(0,new Application("集团新闻",R.drawable.app_3));
        map2.put(1,new Application("研发审批",R.drawable.app_7));
        map2.put(2,new Application("日志审核",R.drawable.app_8));
        map2.put(3,new Application("报销审批",R.drawable.app_2));
        mlist.add(map2);

        HashMap<Integer,Application> map3 = new HashMap<>();
        map3.put(0,new Application("云盘",R.drawable.app_3));
        map3.put(1,new Application("挪车",R.drawable.app_2));
        map3.put(2,new Application("集团新闻",R.drawable.app_5));
        mlist.add(map3);

        HashMap<Integer, Application> map4 = new HashMap<>();
        map4.put(0,new Application("集团新闻",R.drawable.app_1));
        map4.put(1,new Application("报销审批",R.drawable.app_2));
        map4.put(2,new Application("云盘",R.drawable.app_3));
        map4.put(3,new Application("研发审批",R.drawable.app_4));
        map4.put(4,new Application("集团新闻",R.drawable.app_5));
        map4.put(5,new Application("挪车",R.drawable.app_6));
        map4.put(6,new Application("日志审核",R.drawable.app_7));
        mlist.add(map4);

        FWDiscussAdapter adapter = new FWDiscussAdapter(getActivity(),mlist,titleName);
        listView.setAdapter(adapter);
    }

}
