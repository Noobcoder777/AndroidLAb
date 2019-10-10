package com.example.taxcalculator;

import androidx.annotation.HalfFloat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
Button button;
EditText editText;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        //setSupportActionBar(toolbar);
        toolbar.setTitle("Income Tax Calculator");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setSubtitle("Made By nilesh Teji");
        toolbar.setSubtitleTextColor(Color.WHITE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               float a= (float) Float.valueOf(String.valueOf(editText.getText()));
               // Toast.makeText(MainActivity.this, String.valueOf(a), Toast.LENGTH_SHORT).show();
                if(a<500000){
          textView.setText("Congratulation you have no income tax");
                }
                else if(a>=500000 && a<1000000){
                    //textView.setText("Your Income Tax is "+String.valueOf(Float.valueOf((10/100)*a)));
                  //  float answer= (float) ((0.1)*a);
                    float answer=(float)((10*a)/100);
                    //Toast.makeText(MainActivity.this, String.valueOf(answer), Toast.LENGTH_LONG).show();

                    textView.setText("Your income tax is "+String.valueOf(answer));
                   // textView.setText("Your Income Tax is "+ String.valueOf(answer));
                }
                else if(a>=1000000 && a<1500000){
                    float answer=(float)((15*a)/100);
                    textView.setText("Your Income Tax is "+String.valueOf(answer));
                }
                else if(a>1500000){
                    float answer=(float)((18*a)/100);
textView.setText("Your Income Tax is "+String.valueOf(answer));
                }

            }
        });
    }
}
