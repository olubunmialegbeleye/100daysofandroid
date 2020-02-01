package com.example.practiceapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StubActivity extends Activity {
    EditText inText;
    View stub;
    TextView outText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stub);
        inText = findViewById(R.id.intext_edit_text);
        stub = findViewById(R.id.stub_parent);
    }
    public void displayText(View view){
        outText = findViewById(R.id.stub_tv);
        try{
            outText.setText(inText.getText().toString());
        }
        catch(NullPointerException e){
            Toast  errMsg = Toast.makeText(this, "You need to inflate the stub by pressing the \"Inflate\" button first",Toast.LENGTH_SHORT);
            errMsg.show();
        }
    }

    public void inflateStub(View view) {
        stub.setVisibility(View.VISIBLE);

    }
}
