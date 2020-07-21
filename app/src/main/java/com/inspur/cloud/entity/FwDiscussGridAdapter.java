package com.inspur.cloud.entity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspur.cloud.R;

import java.util.HashMap;

public class FwDiscussGridAdapter extends BaseAdapter {
    Context context;
    HashMap<Integer, Application> map;

    public FwDiscussGridAdapter(Context context, HashMap<Integer, Application> map) {
        this.context = context;
        this.map = map;
    }

    @Override
    public int getCount() {
        return map.size();
    }

    @Override
    public Object getItem(int position) {
        return map.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if (convertView == null) {
            view = View.inflate(context, R.layout.discuss_grid_item, null);
            holder = new ViewHolder();
            holder.gridimg = (ImageView) view.findViewById(R.id.dis_grid_img);
            holder.gridText = view.findViewById(R.id.dis_grid_tv);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        holder.gridimg.setImageResource(map.get(position).getImg_id());
        holder.gridText.setText(map.get(position).getName());
        return view;
    }

    class ViewHolder {
        ImageView gridimg;
        TextView gridText;
    }

}
