package com.phuoctruong.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Item> arr;
    itemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        arr = new ArrayList<Item>();
        arr.add(new Item("d.atom.h",R.drawable.ins));
        arr.add(new Item("noonmare",R.drawable.tiktok));
        arr.add(new Item("Phước Trường",R.drawable.youtube));
        arr.add(new Item("0934802184",R.drawable.zl));

        adapter = new itemAdapter(this,arr,R.layout.custom);
        lv.setAdapter(adapter);


    }
}