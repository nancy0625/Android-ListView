package cn.edu.gdmec.android.androidlistview;

/**
 * Created by asus on 2017/12/13.
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<ItemBean> list;
    private LayoutInflater mInflater;

    public MyAdapter(List<ItemBean> list, Context context) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            /*View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item, null);
            TextView textView = (TextView) view.findViewById(R.id.textView1);
            textView.setText(list.get(position));*/
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item, null);
            viewHolder.textView = convertView.findViewById(R.id.textView1);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        ItemBean bean = list.get(position);
        viewHolder.textView.setText(bean.ItemContent);


       // viewHolder.textView.setText(list.get(position));
        Log.i("-->>", position + "");


        return convertView;
    }

    class ViewHolder {
        public TextView textView;
    }

}
