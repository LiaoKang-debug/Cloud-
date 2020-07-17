package com.inspur.cloud.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspur.cloud.R;
import com.inspur.cloud.entity.Title;

/**
 * A simple {@link Fragment} subclass.
 */
public class ApplicationFragment extends Fragment {

    private Title title;

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
        return view;
    }
    public void findView(View view){
        title = view.findViewById(R.id.title);
    }

}
