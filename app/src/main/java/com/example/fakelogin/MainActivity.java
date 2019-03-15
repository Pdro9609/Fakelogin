package com.example.fakelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        edt= (EditText)findViewById(R.id.user);
        btn1.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(),"Username", Toast.LENGTH_LONG).show();
    }
}
