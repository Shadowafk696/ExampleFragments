package com.school.fragments.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements TopFragment.ToolbarListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {
        // Get Fragment B
        ButtomFragment buttomFragment = new ButtomFragment();
        getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
        TextView textView = findViewById(R.id.editable_text);
        buttomFragment.changeText(textView, text);
    }
}