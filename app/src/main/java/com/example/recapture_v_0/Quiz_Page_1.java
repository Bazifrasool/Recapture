package com.example.recapture_v_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz_Page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__page_1);
    }

    protected int score_is = 0;
    //Enter typing questions on this page
    String[] Ques_arr = {"You are buying Rs. 13.45 of groceries. How much change would you receive back from a Rs. 20 bill?"
            , "Can the given words be rearranged to form a complete sentence? a legs has eight spider .(Type \"yes\" or \"no\""};

    public void nextbutton(View view)
    {
        EditText dt = findViewById(R.id.editText2);
        //
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String current_dt = sdf.format(new Date());

        if (current_dt.equals(dt))
        {
            score_is++;
        }

        Intent int_page = new Intent(this, Quiz_page_3.class);
        startActivity(int_page);
    }

}
