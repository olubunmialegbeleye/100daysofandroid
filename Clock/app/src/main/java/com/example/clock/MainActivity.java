package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        while(true){
            TextView timeTextView = (TextView) findViewById(R.id.timeTextView);
            TextView dateTextView = (TextView) findViewById(R.id.dateTextView);
            Date time = new Date();
            SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE MMMM dd, yyyy");
            timeTextView.setText(timeFormatter.format(time));
            dateTextView.setText(dateFormatter.format(time));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
