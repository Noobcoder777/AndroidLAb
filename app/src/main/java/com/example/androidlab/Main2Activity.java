package com.example.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button obj;
    CalendarView cv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        obj=findViewById(R.id.cal);
        cv1=findViewById(R.id.cv);
        //text=findViewById(R.id.text1);
        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long a=cv1.getDate();
                long b=cv1.getFirstDayOfWeek();
                Toast.makeText(Main2Activity.this, String.valueOf(a)+" "+String.valueOf(b), Toast.LENGTH_SHORT).show();


            }
        });

    }
}
