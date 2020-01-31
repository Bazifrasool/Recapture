package com.example.recapture_v_0;

import android.os.Bundle;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_page_3 extends AppCompatActivity {

    CheckBox cb1 = findViewById(R.id.checkBox);
    CheckBox cb2 = findViewById(R.id.checkBox2);
    CheckBox cb3 = findViewById(R.id.checkBox5);
    CheckBox cb4 = findViewById(R.id.checkBox6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page_3);
    }


}
