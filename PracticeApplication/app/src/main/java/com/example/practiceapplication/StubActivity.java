package com.example.practiceapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StubActivity extends Activity {
    EditText intext = (EditText) findViewById(R.id.intext_edit_text);
    View stub = (View) findViewById(R.id.stub_parent);
    TextView outText = (TextView) findViewById(R.id.stub_tv);
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stub);
    }
    public void displayText(View view){
        outText.setText(intext.getText());
    }

    public void inflateStub(View view) {
        stub.setVisibility(View.VISIBLE);
    }
}
