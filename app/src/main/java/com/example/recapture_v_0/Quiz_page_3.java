package com.example.recapture_v_0;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_page_3 extends AppCompatActivity {

    protected int Ques_no = 0;
    protected int score__mcq = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page_3);
    }

    public void McQ_button(View view) {
        TextView ques = findViewById(R.id.textView3);
        CheckBox op1 = findViewById(R.id.checkBox);
        CheckBox op2 = findViewById(R.id.checkBox2);
        CheckBox op3 = findViewById(R.id.checkBox5);
        CheckBox op4 = findViewById(R.id.checkBox6);

        if (Ques_no == 0) {
            if (op2.isChecked() && !op1.isChecked() && !op3.isChecked() && !op4.isChecked()) ;
            score__mcq++;
        }



    }


}
