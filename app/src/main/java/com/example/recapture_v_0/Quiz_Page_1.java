package com.example.recapture_v_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz_Page_1 extends AppCompatActivity {

    private int Main_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__page_1);
    }

    public int score_is ;
    protected int question_no = -1;
    protected boolean first_click = true;
    //Enter typing questions on this page
    String[] Ques_arr = {"You are buying Rs. 13.45 of groceries. How much change would you receive back from a Rs. 20 bill?"
            , "Can the given words be rearranged to form a complete sentence? a legs has eight spider .(Type \"yes\" or \"no\""};
    String[] Ans_arr = {"6.55", "yes"};
    public void nextbutton(View view)
    {
        EditText dt = findViewById(R.id.editText2);
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        //
        if (question_no == Ques_arr.length - 1) {
            Intent new_pg = new Intent(this, Quiz_page_3.class);
            new_pg.putExtra("Main_score", score_is+1);
            startActivity(new_pg);
        }

        if (first_click)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            String current_dt = sdf.format(new Date());
            String edittextget = dt.getText().toString();
            tv2.setVisibility(View.INVISIBLE);
            if (edittextget.equals(current_dt)) {
                first_click = false;
                score_is++;
                question_no++;
                tv.setText(Ques_arr[question_no]);
                dt.setText("");
            } else {
                first_click = false;
                question_no++;
                tv.setText(Ques_arr[question_no]);
                dt.setText("");
            }
        } else {

            String User_ans = dt.getText().toString();
            if (question_no < Ques_arr.length - 1) {
                if (User_ans.equals(Ans_arr[question_no])) {
                    question_no++;
                    score_is++;
                    tv.setText(Ques_arr[question_no]);
                    dt.setText("");
                } else {
                    question_no++;
                    tv.setText(Ques_arr[question_no]);
                    dt.setText("");
                }
            }
        }
        }


}   //angel.co
