package com.example.recapture_v_0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz_Page_2 extends AppCompatActivity {
    private int Ques_no = 0;
    public int Score_of_picture_mcq;


    protected TextView pq;
    private ImageView iv_o1 ;
    private ImageView iv_o2 ;
    private ImageView iv_o3 ;
    private ImageView iv_o4 ;

    int ans_arr [] = new int[4];
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

        ans_arr[0]=2;
        ans_arr[1]=1;
        ans_arr[2]=1;
        ans_arr[3]=3;
        Ques[0] = "Which animal can you have as a pet";
        Ques[1] = "Which animal is the biggest";
        Ques[2] = "Which of these is man-made";
        Score_of_picture_mcq = prev_scr.getIntExtra("score_till_now",0);
        Log.w("picture", String.valueOf(Score_of_picture_mcq));
        pq.setText(String.valueOf(Score_of_picture_mcq));
    }

    public void clk_img1 (View view)
    {

        TextView pq = (TextView) findViewById(R.id.textView_pq);
        ImageView iv_o1 = (ImageView) findViewById(R.id.imageView_op1);
        ImageView iv_o2 = (ImageView) findViewById(R.id.imageView_op2);
        ImageView iv_o3 = (ImageView) findViewById(R.id.imageView_op3);
        ImageView iv_o4 = (ImageView) findViewById(R.id.imageView_op4);

        if(ans_arr[Ques_no]==1)
        {
            Score_of_picture_mcq++;
            Log.w("picture_c1", String.valueOf(Score_of_picture_mcq));
        }

        Ques_no++;
        if (Ques_no==1)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q2_1);
            iv_o2.setImageResource(R.drawable.q2_2);
            iv_o3.setImageResource(R.drawable.q2_3);
            iv_o4.setImageResource(R.drawable.q2_4);

        }
        if (Ques_no==2)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q3_1);
            iv_o2.setImageResource(R.drawable.q3_2);
            iv_o3.setImageResource(R.drawable.q3_3);
            iv_o4.setImageResource(R.drawable.q3_4);
        }
        if (Ques_no==3)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q4_1);
            iv_o2.setImageResource(R.drawable.q4_2);
            iv_o3.setImageResource(R.drawable.q4_3);
            iv_o4.setImageResource(R.drawable.q4_4);
        }

        if (Ques_no==4)
        {
            pq.setText(String.valueOf(Score_of_picture_mcq));
        }
    }

    public void clk_img2 (View view)
    {
        TextView pq = (TextView) findViewById(R.id.textView_pq);
        ImageView iv_o1 = (ImageView) findViewById(R.id.imageView_op1);
        ImageView iv_o2 = (ImageView) findViewById(R.id.imageView_op2);
        ImageView iv_o3 = (ImageView) findViewById(R.id.imageView_op3);
        ImageView iv_o4 = (ImageView) findViewById(R.id.imageView_op4);


        if(ans_arr[Ques_no]==2)
        {
            Score_of_picture_mcq++;
            Log.w("picture_c2", String.valueOf(Score_of_picture_mcq));
        }
        Ques_no++;
        if (Ques_no==1)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q2_1);
            iv_o2.setImageResource(R.drawable.q2_2);
            iv_o3.setImageResource(R.drawable.q2_3);
            iv_o4.setImageResource(R.drawable.q2_4);

        }
        if (Ques_no==2)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q3_1);
            iv_o2.setImageResource(R.drawable.q3_2);
            iv_o3.setImageResource(R.drawable.q3_3);
            iv_o4.setImageResource(R.drawable.q3_4);
        }
        if (Ques_no==3)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q4_1);
            iv_o2.setImageResource(R.drawable.q4_2);
            iv_o3.setImageResource(R.drawable.q4_3);
            iv_o4.setImageResource(R.drawable.q4_4);
        }

        if (Ques_no==4 && Score_of_picture_mcq==4)
        {
            pq.setText(String.valueOf(Score_of_picture_mcq));
        }
    }

    public void clk_img3 (View view)
    {
        TextView pq = (TextView) findViewById(R.id.textView_pq);
        ImageView iv_o1 = (ImageView) findViewById(R.id.imageView_op1);
        ImageView iv_o2 = (ImageView) findViewById(R.id.imageView_op2);
        ImageView iv_o3 = (ImageView) findViewById(R.id.imageView_op3);
        ImageView iv_o4 = (ImageView) findViewById(R.id.imageView_op4);

        if(ans_arr[Ques_no]==3)
        {
            Score_of_picture_mcq++;
            Log.w("picture_c3", String.valueOf(Score_of_picture_mcq));
        }
        Ques_no++;
        if (Ques_no==1)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q2_1);
            iv_o2.setImageResource(R.drawable.q2_2);
            iv_o3.setImageResource(R.drawable.q2_3);
            iv_o4.setImageResource(R.drawable.q2_4);

        }
        if (Ques_no==2)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q3_1);
            iv_o2.setImageResource(R.drawable.q3_2);
            iv_o3.setImageResource(R.drawable.q3_3);
            iv_o4.setImageResource(R.drawable.q3_4);
        }
        if (Ques_no==3)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q4_1);
            iv_o2.setImageResource(R.drawable.q4_2);
            iv_o3.setImageResource(R.drawable.q4_3);
            iv_o4.setImageResource(R.drawable.q4_4);
        }

        if (Ques_no==4)
        {
            pq.setText(String.valueOf(Score_of_picture_mcq));
        }
    }

    public void clk_img4 (View view)
    {
        TextView pq = (TextView) findViewById(R.id.textView_pq);
        ImageView iv_o1 = (ImageView) findViewById(R.id.imageView_op1);
        ImageView iv_o2 = (ImageView) findViewById(R.id.imageView_op2);
        ImageView iv_o3 = (ImageView) findViewById(R.id.imageView_op3);
        ImageView iv_o4 = (ImageView) findViewById(R.id.imageView_op4);


        if(ans_arr[Ques_no]==4)
        {
            Score_of_picture_mcq++;
            Log.w("picture_c4", String.valueOf(Ques_no));
        }
        Ques_no++;

        if (Ques_no==1)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q2_1);
            iv_o2.setImageResource(R.drawable.q2_2);
            iv_o3.setImageResource(R.drawable.q2_3);
            iv_o4.setImageResource(R.drawable.q2_4);

        }
        if (Ques_no==2)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q3_1);
            iv_o2.setImageResource(R.drawable.q3_2);
            iv_o3.setImageResource(R.drawable.q3_3);
            iv_o4.setImageResource(R.drawable.q3_4);
        }
        if (Ques_no==3)
        {
            pq.setText(Ques[Ques_no-1]);
            iv_o1.setImageResource(R.drawable.q4_1);
            iv_o2.setImageResource(R.drawable.q4_2);
            iv_o3.setImageResource(R.drawable.q4_3);
            iv_o4.setImageResource(R.drawable.q4_4);
        }

        if (Ques_no==4)
        {

            pq.setText(String.valueOf(Score_of_picture_mcq));
        }
    }

}
