package com.example.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button obj;
CalendarView cv1;
//String a="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj=findViewById(R.id.cal);
        cv1=findViewById(R.id.cv);
        //text=findViewById(R.id.text1);
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            long a=cv1.getDate();

            }
        });



    }
}
