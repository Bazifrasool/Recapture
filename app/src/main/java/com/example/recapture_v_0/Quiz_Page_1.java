package com.example.recapture_v_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Quiz_Page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__page_1);
    }
    public void nextbutton(View view)
    {
        EditText dt = (EditText) findViewById(R.id.editText2);
        String s = dt.getText().toString();
        String dtx =  "30/01/20";String dxr =  "ayes";

        if(s.equals(dtx))
        {
            //increment score
            dt.setText("Gello");
        }
        else {
            dt.setText(dtx);
        }
    }

}
