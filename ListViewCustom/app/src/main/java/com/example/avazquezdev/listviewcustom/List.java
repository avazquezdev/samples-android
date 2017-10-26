package com.example.avazquezdev.listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Apple","2"));
        items.add(new Item("Milk","5"));

        ListView lv = (ListView) findViewById(R.id.lista);

        AdapterItem adapter = new AdapterItem(this, items);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
}
