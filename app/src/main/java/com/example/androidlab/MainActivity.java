package com.example.androidlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button exp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exp1=findViewById(R.id.exp1);
        exp1.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.exp1:
                Intent obj=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(obj);
                break;
            case R.id.exp2:
                startActivity(new Intent(this,Main2Activity.class));
                default:
                  break;
        }
    }
}
