package com.example.tomer.switchandtoggle;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    LinearLayout mainL,SecondL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton)findViewById(R.id.tb);
        sw = (Switch)findViewById(R.id.sw);
        mainL = (LinearLayout)findViewById(R.id.mainL);
        SecondL = (LinearLayout)findViewById(R.id.SecondL);
    }

    public void check_status(View view) {
        if(sw.isChecked())
            mainL.setBackgroundColor(Color.BLUE);
        else
            mainL.setBackgroundColor(Color.WHITE);

        if(tb.isChecked())
            SecondL.setBackgroundResource(R.drawable.eagle);
        else
            SecondL.setBackgroundResource(R.drawable.lion);
        }
    }
