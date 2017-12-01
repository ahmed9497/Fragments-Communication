package com.example.ahmed.fragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager = getFragmentManager();
        FragmentB f = (FragmentB) manager.findFragmentById(R.id.fragment2);
        f.changetext(data);
    }
}
