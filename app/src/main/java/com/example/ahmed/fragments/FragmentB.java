package com.example.ahmed.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ahmed on 11/30/2017.
 */

public class FragmentB extends Fragment {

    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

       imageView=(ImageView) getActivity().findViewById(R.id.imageView);
    }
    public void changetext(String img){
        imageView.setVisibility(View.VISIBLE);
        int id = getResources().getIdentifier("com.example.ahmed.fragments:drawable/" +img, null, null);
        imageView.setImageResource(id);
       // imageView.setImageDrawable(R.drawable.img);
    }
}
