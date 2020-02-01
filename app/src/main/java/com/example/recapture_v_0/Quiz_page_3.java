package com.example.recapture_v_0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

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
        ques.setVisibility(View.VISIBLE);
        CheckBox op1 = findViewById(R.id.checkBox);
        CheckBox op2 = findViewById(R.id.checkBox2);
        CheckBox op3 = findViewById(R.id.checkBox5);
        CheckBox op4 = findViewById(R.id.checkBox6);
        if (!op2.isChecked() && !op1.isChecked() && !op3.isChecked() && !op4.isChecked()) {
            //empty
            //display a toast
            Context context = getApplicationContext();
            CharSequence text = "You didn't select anything !";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
        if (op2.isChecked() && !op1.isChecked() && !op3.isChecked() && !op4.isChecked()) {
            score__mcq++;
        }

        if (Ques_no == 0) {
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
            ques.setText("Which two statements together prove that Megan has brown hair?");
            op1.setText("Jane likes the colour of Megan’s hair.");
            op2.setText("The only hair that Jane likes is brown.");
            op3.setText("Megan likes long hair. Jane has long hair.");
            op4.setText("Megan’s hair is not blonde.");
            Ques_no++;


        }
        if (Ques_no == 1 && op1.isChecked() && op2.isChecked() && !op3.isChecked() && !op4.isChecked()) {
            score__mcq++;
        }
        if (Ques_no == 1) {
            op1.setChecked(false);
            op2.setChecked(false);
            op3.setChecked(false);
            op4.setChecked(false);
            ques.setText("Stan is working as an administrator at an investment bank. In three months the branch will change its banking information-system. What is the best response Stan should take in order to respond to this change?");
            op1.setText("Refer clients and staff members to employees " + "\n with more experience in the system.");
            op2.setText("Stan should turn to his supervisor every time he " + "\n has an important question.");
            op3.setText("Stan should take time to take the online course " + "\n and read the system guide.");
            op4.setText("None of the above");
            Ques_no++;


        }
        if (Ques_no == 2 && !op1.isChecked() && !op2.isChecked() && op3.isChecked() && !op4.isChecked()) {
            score__mcq++;
        }



    }


}
