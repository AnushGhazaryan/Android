package com.example.anush.fragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    TextView textView;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_two, container, false);
        textView = view.findViewById(R.id.textView);
        textView.setVisibility(View.GONE);
        return view;
    }

    public void updateInfo(String name){
        textView.setText(name);
        textView.setVisibility(View.VISIBLE);
    }


}
