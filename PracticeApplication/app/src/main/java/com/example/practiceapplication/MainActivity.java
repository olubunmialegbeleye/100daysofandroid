package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView menu_list;
    String[] menu = {"Stub", "Fragments"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_list = findViewById(R.id.menu_list);
        ArrayAdapter<String> menu_aa = new ArrayAdapter<String>(this, R.layout.menu_item, menu);
        menu_list.setAdapter(menu_aa);
        menu_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView itemClicked = (TextView) view;
                String menu_item = itemClicked.getText().toString();
                switch (menu_item){
                    case "Stub":
                        Intent stub_activity = new Intent(MainActivity.this, StubActivity.class);
                        startActivity(stub_activity);
                        break;
                }
            }
        });
    }
}
