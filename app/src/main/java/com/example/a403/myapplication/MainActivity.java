package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Chronometer chronometer;
    Button button1,button2;
    RadioGroup radio;
    RadioButton radioButton1, radioButton2;
    FrameLayout frameLayout;
    TimePicker timePicker;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2=(TextView)findViewById(R.id.textView2);
        chronometer=(Chronometer)findViewById(R.id.chronometer);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        radio=(RadioGroup)findViewById(R.id.radio);
        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        frameLayout=(FrameLayout)findViewById(R.id.frameLayout);
        timePicker=(TimePicker)findViewById(R.id.timePicker);
        calendarView=(CalendarView)findViewById(R.id.calendarView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButton1.isChecked()){

                }
            }
        });
    }
}
