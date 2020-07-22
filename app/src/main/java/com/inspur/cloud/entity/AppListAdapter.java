package com.inspur.cloud.entity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspur.cloud.R;

import java.util.List;

public class AppListAdapter extends BaseAdapter {

    Context context;
    private List<Application> mlist;
    public AppListAdapter(Context context,List<Application> list){
        this.context = context;
        this.mlist = list;
    }
    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if(convertView == null){
            view = View.inflate(context, R.layout.app_list_item, null);
            holder = new ViewHolder();

            holder.listImg = view.findViewById(R.id.list_img);
            holder.textTitle = view.findViewById(R.id.text_title);
            holder.textDetail = view.findViewById(R.id.text_detail);
            holder.btnAdd = view.findViewById(R.id.btn_add);
            view.setTag(holder);

        }else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        holder.listImg.setImageResource(mlist.get(position).getImg_id());
        holder.textTitle.setText(mlist.get(position).getName());
        holder.textDetail.setText(mlist.get(position).getDetail());

        return view;
    }
    class ViewHolder{
        ImageView listImg;
        TextView textTitle, textDetail;
        Button btnAdd;
    }
}
