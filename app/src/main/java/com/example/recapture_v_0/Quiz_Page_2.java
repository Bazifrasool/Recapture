package com.example.recapture_v_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_Page_2 extends AppCompatActivity {
    private int Ques_no = 0;
    private int Score_of_picture_mcq=0;


    private TextView pq;
    private ImageView iv_o1 ;
    private ImageView iv_o2 ;
    private ImageView iv_o3 ;
    private ImageView iv_o4 ;

    int ans_arr [] = new int[3];
    String Ques [] = new String[3];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__page_2);
        TextView pq = (TextView) findViewById(R.id.textView_pq);
        ImageView iv_o1 = (ImageView) findViewById(R.id.imageView_op1);
        ImageView iv_o2 = (ImageView) findViewById(R.id.imageView_op2);
        ImageView iv_o3 = (ImageView) findViewById(R.id.imageView_op3);
        ImageView iv_o4 = (ImageView) findViewById(R.id.imageView_op4);
        pq.setText("Which number is even ?");
        iv_o1.setImageResource(R.drawable.q1_1);
        iv_o2.setImageResource(R.drawable.q1_2);
        iv_o3.setImageResource(R.drawable.q1_3);
        iv_o4.setImageResource(R.drawable.q1_4);
        Intent prev_scr = getIntent();

        ans_arr[0]=1;
        ans_arr[1]=2;
        ans_arr[2]=3;
        Ques[0] = "Which animal can you have as a pet";
        Ques[1] = "Which animal is the biggest";
        Ques[2] = "Which of these is man-made";
        Score_of_picture_mcq = prev_scr.getIntExtra("score_till_now",0);
    }

    public void clk_img1 (View view)
    {
        if(ans_arr[Ques_no]==1)
        {
            Score_of_picture_mcq++;
        }
        Ques_no++;
        pq.setText(Ques[Ques_no]);
    }

    public void clk_img2 (View view)
    {
        if(ans_arr[Ques_no]==2)
        {
            Score_of_picture_mcq++;
        }
        Ques_no++;
    }

    public void clk_img3 (View view)
    {
        if(ans_arr[Ques_no]==3)
        {
            Score_of_picture_mcq++;
        }
        Ques_no++;
    }

    public void clk_img4 (View view)
    {
        if(ans_arr[Ques_no]==4)
        {
            Score_of_picture_mcq++;
        }
        Ques_no++;
    }

}
