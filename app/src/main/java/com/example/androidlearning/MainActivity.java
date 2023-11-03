package com.example.androidlearning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView02();
    }

//    private void initView(){
//        EditText editText = findViewById(R.id.editText01_id);
//        Button button = findViewById(R.id.button14_id);
//        Button button2 = findViewById(R.id.button15_id);
//        button.setOnClickListener(v->{
//           editText.setText(R.string.text_01);
//        });
//
//        button2.setOnClickListener(v->editText.setText(R.string.empty)
//        );
//
//    }

    private void initView02() {
        EditText editText = findViewById(R.id.edittext02_id);
        Button button = findViewById(R.id.button16_id);
        Button button1 = findViewById(R.id.button16_id3);
        button.setOnClickListener(v -> {
            editText.setText(R.string.text_01);
            button1.setBackgroundColor(getResources().getColor(R.color.black));



        });



    }
}




