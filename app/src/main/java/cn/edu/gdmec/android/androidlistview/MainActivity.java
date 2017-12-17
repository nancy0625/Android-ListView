package cn.edu.gdmec.android.androidlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        listView = (ListView) this.findViewById(R.id.listView1);
        adapter = new MyAdapter(getData(),MainActivity.this);
        listView.setAdapter(adapter);

    }

    public List<ItemBean> getData() {
        List<ItemBean> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new ItemBean(R.mipmap.ic_launcher,"",""+i));
        }

        return list;
    }


}
