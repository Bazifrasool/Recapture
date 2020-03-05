package com.example.recapture_v_0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Genotype extends AppCompatActivity {
    private int Scr_final_page = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genotype);
        Intent skr = getIntent();
        Scr_final_page = skr.getIntExtra("skr",0);

    }

    public void Score_Get(View view)
    {
        EditText age = (EditText) findViewById(R.id.Age);
        Spinner gender = (Spinner) findViewById(R.id.spinner);
        Button btn = (Button) findViewById(R.id.Finish);
        String gen_is = String.valueOf(gender.getSelectedItem());
        int age_is = Integer.valueOf(age.getText().toString());
        age.setVisibility(View.INVISIBLE);
        gender.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);
        TextView result = (TextView) findViewById(R.id.Final_Score_Display);
        result.setVisibility(View.VISIBLE);
        String [] arr_conds = new String[3];
        arr_conds[0]= "Dementia";
        arr_conds[1]="Cognitive Imapirment";
        arr_conds[2] = "Normal Cognintion";
        int cond = 0;
        if(Scr_final_page>6){cond = 2;}
        if(Scr_final_page>4){cond = 1;}
        if(Scr_final_page<4){cond = 0;}

        result.setText("Score is :\n"+String.valueOf(Scr_final_page)+"\nand you have "+arr_conds[cond]);

    }

}
