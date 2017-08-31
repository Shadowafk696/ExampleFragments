package com.school.fragments.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class ButtomFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        textView = view.findViewById(R.id.editable_text);
        Log.d("TEXTVIEW", textView.getText().toString());
        Log.d("BUTTON", "ASSIGNATED");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    public void changeText(TextView textView, String text) {
        textView.setText(text);
    }
}
