package com.example.recapture_v_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void buttonclickyourself(View view)
    {
        Intent intent = new Intent(this,Quiz_Page_1.class);
        startActivity(intent);
    }
    public  void buttonclickfriend(View view)
    {
        Intent intent = new Intent(this,Friend_Quiz_1.class);
        startActivity(intent);
    }

}
