package com.example.recapture_v_0;
// i will kill bhaavanaa

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Friend_Quiz_1 extends AppCompatActivity {

    protected  int score = 0;
    protected  int question_number = 0;
    String[] Questions_array = {"If so, is their memory worse than a few years ago?", "Does the patient repeat questions OR statements OR stories in the same day?", "Does the patient repeat questions OR statements OR stories in the same day?",
            "Have you had to take over tracking events OR appointments? OR Does the patient forget appointments?",

            "Does the patient misplace items more than once a month? OR Does the patient misplace objects so that he or she cannot find them?",
            "Does the patient suspect others are moving, hiding or stealing items when they cannot find them?",
            "Does the patient frequently have trouble knowing the day, date, month, year, time? OR Does the patient have to use cues like the newspaper or the calendar to know the day and date more than once a day?"
            , "Does the patient frequently have trouble knowing the day, date, month, year, time? OR Does the patient have to use cues like the newspaper or the calendar to know the day and date more than once a day?"
            , "Does the patient become disoriented in unfamiliar places?",

            "Does the patient become more confused outside the home or when traveling?",
            "Excluding physical limitations (e.g., tremor, hemiparesis, etc) does the patient have trouble handling money (tips,calculating change?)"
            , "Excluding physical limitations (e.g., tremor, hemiparesis, etc), does the patient have trouble paying bills or doing finances OR Are family members taking over finances because of concerns about ability?"
            , "Excluding physical limitations (e.g., tremor, hemiparesis, etc), does the patient have trouble paying bills or doing finances OR Are family members taking over finances because of concerns about ability?"
            , "Does the patient have trouble remembering to take medications or tracking medications taken?"
            , "Is the patient having difficulty driving? OR Are you concerned about the patient’s driving?"
            , "Is the patient having trouble using appliances (e.g. microwave, oven, stove, remote control, telephone, alarm clock)? "
            , "Excluding physical limitations, is the patient having difficulty in completing home repair or other home related tasks "
            , "Excluding physical limitations, has the patient given up or significantly reduced activities such as golfing, dancing etc"
            , "Is the patient getting lost in familiar surroundings (own neighborhood)?"
            , "Is the patient getting lost in familiar surroundings (own neighborhood)?"

            , "Does the patient have a decreased sense of direction?"
            , "Does the patient have trouble finding words other than names?"
            , "Does the patient confuse names of family members or friends?"
            , "Does the patient confuse names of family members or friends?"
            , "Does the patient have difficulty recognizing people familiar to him/her?"
            , "Does the patient have difficulty recognizing people familiar to him/her?"


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend__quiz_1);
    }


    public void Yes_button(View view)
    {
        TextView txtvw = findViewById(R.id.textView5);
        Button btny = findViewById(R.id.button3);
        Button btnn = findViewById(R.id.button2);
        if(question_number<Questions_array.length) {

            score++;
            txtvw.setText(Questions_array[question_number]);
            question_number++;
        }
        else{
            btnn.setVisibility(View.INVISIBLE);
            btny.setVisibility(View.INVISIBLE);
            if (score < 4) {
                //normal
                txtvw.setText(score + " is your Score and you are normal");
            }
            if (score < 14 && score >= 4) {
                //mild cog
                txtvw.setText(score + " is your Score and you have cognitive impairment");
            }
            if (score >= 14) {
                //dementia
                txtvw.setText(score + " is your Score and you have Alzhiemers");
            }

            //finish test and display result


        }
    }
    public void No_button(View view) {
        TextView txtvw = findViewById(R.id.textView5);
        Button btny = findViewById(R.id.button3);
        Button btnn = findViewById(R.id.button2);

        if(question_number<Questions_array.length) {

            txtvw.setText(Questions_array[question_number]);
            question_number++;
        }
        else{
            btnn.setVisibility(View.INVISIBLE);
            btny.setVisibility(View.INVISIBLE);
            if (score < 4) {
                //normal
                txtvw.setText(score + " is your Score and you are normal");
            }
            if (score < 14 && score >= 4) {
                //mild cog
                txtvw.setText(score + " is your Score and you have cognitive impairment");
            }
            if (score >= 14) {
                //dementia
                txtvw.setText(score + " is your Score and you have Alzhiemers");
            }
        }
    }


}
