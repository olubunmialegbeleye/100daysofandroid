package com.example.todolist;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inflate View
        setContentView(R.layout.activity_main);
        //Get references to UI widgets
        ListView myListView = (ListView) findViewById(R.id.myListView);
        //Create the ArrayList of To Do Items
        final ArrayList<String> todoItems = new ArrayList<>();
        //Create ArrayAdapter to bind the Array to the List View
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, todoItems);
        myListView.setAdapter(aa);
    }
}
