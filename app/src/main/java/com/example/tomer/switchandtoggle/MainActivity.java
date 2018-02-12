package com.example.tomer.switchandtoggle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    LinearLayout mainL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton)findViewById(R.id.tb);
        sw = (Switch)findViewById(R.id.sw);
        mainL = (LinearLayout)findViewById(R.id.mainL);
    }

    public void check_Sw(View view) {
        if(sw.isChecked())
            mainL.setBackgroundColor(Color.BLUE);
        else
            mainL.setBackgroundColor(Color.WHITE);
    }

    public void check_tb(View view) {
        if(tb.isChecked())
            mainL.setBackgroundColor(Color.RED);
        else
            mainL.setBackgroundColor(Color.GREEN);
    }
}
