package com.example.anush.fragmentcommunication;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    EditText editText;
    Button button;
    OnNameSetListener onNameSetListener;


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        editText = view.findViewById(R.id.textEdit);
        button = view.findViewById(R.id.sendBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(editText.getText());
                onNameSetListener.setName(name);


            }
        });
        return view;
    }


    public interface OnNameSetListener {
        void setName(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            onNameSetListener = (OnNameSetListener) context;
        } catch (Exception o) { }

    }

}
