package com.inspur.cloud.entity;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspur.cloud.R;

import java.util.HashMap;
import java.util.List;

public class FWDiscussAdapter extends BaseAdapter implements View.OnClickListener {

    Context context;
    List<String> titleName;
    List<HashMap<Integer, Application>> mlist;
    private InnerItemOnclickListener mListener;


    public FWDiscussAdapter(Context context, List<HashMap<Integer, Application>> mlist, List<String> titleName) {
        this.context = context;
        this.mlist = mlist;
        this.titleName = titleName;
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
        if (convertView == null) {
            view = View.inflate(context, R.layout.discuss_list_item, null);
            holder = new ViewHolder();

            holder.listcontent = (TextView) view.findViewById(R.id.dis_listcontent);
            holder.contentpic = (MyGridView) view.findViewById(R.id.dis_listcontentpic);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        holder.listcontent.setText(titleName.get(position));
        holder.listcontent.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        holder.listcontent.setOnClickListener(this);
        holder.listcontent.setTag(position);

        FwDiscussGridAdapter fwDiscussGridAdapter = new FwDiscussGridAdapter(context, mlist.get(position));
        holder.contentpic.setAdapter(fwDiscussGridAdapter);

        return view;

    }

    public interface InnerItemOnclickListener {
        void itemClick(View v);
    }

    public void setOnInnerItemOnClickListener(InnerItemOnclickListener listener) {
        this.mListener = listener;
    }

    @Override
    public void onClick(View v) {
        mListener.itemClick(v);
    }

    class ViewHolder {

        TextView listcontent;
        MyGridView contentpic;
    }
}
