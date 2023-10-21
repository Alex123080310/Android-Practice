package com.example.androidlearning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButton();
    }

    public void setButton(){
        Button button1= findViewById(R.id.button09_id);
        Button button2= findViewById(R.id.button10_id);
        Button button3= findViewById(R.id.button11_id);

        button1.setOnClickListener(v->{
            button1.setBackgroundColor(getResources().getColor(R.color.yellow));
            button2.setBackgroundColor(getResources().getColor(R.color.black));
            button3.setBackgroundColor(getResources().getColor(R.color.black));
        });

        button2.setOnClickListener(v->{
            button2.setBackgroundColor(getResources().getColor(R.color.yellow));
            button1.setBackgroundColor(getResources().getColor(R.color.black));
            button3.setBackgroundColor(getResources().getColor(R.color.black));
        });

        button3.setOnClickListener(v->{
            button3.setBackgroundColor(getResources().getColor(R.color.green));
            button1.setBackgroundColor(getResources().getColor(R.color.black));
            button2.setBackgroundColor(getResources().getColor(R.color.black));
        });
    }




}
