package com.example.recapture_v_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Friend_Quiz_1 extends AppCompatActivity {

    protected  int score = 0;
    protected  int question_number = 0;
    String []Questions_array = {"If so, is their memory worse than a few years ago?","Does the patient repeat questions OR statements OR stories in the same day?",
                    "Does the patient suspect others are moving, hiding or stealing items when they cannot find them?"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend__quiz_1);
    }


    public void Yes_button(View view)
    {
        if(question_number<Questions_array.length) {
            TextView txtvw = (TextView) findViewById(R.id.textView5);
            score++;
            txtvw.setText(Questions_array[question_number]);
            question_number++;
        }
        else{
            //finish test and display result
        }
    }
    public void No_button(View view)
    {
        if(question_number<Questions_array.length) {
            TextView txtvw = (TextView) findViewById(R.id.textView5);
            txtvw.setText(Questions_array[question_number]);
            question_number++;
        }
        else{
            //finish test and display result
        }
    }


}
