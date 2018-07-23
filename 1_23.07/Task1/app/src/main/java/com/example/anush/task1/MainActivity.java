package com.example.anush.task1;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //String url = "https://www.youtube.com/watch?v=dFlPARW5IX8";

   //final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url));
     private Button button;
     private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text();

       /* button= (Button)findViewById(R.id.clickBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
            */
        };
    private void text(){
        button = findViewById(R.id.clickBtn);
        input = findViewById(R.id.text1);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                String inputString = input.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, inputString);
                startActivity(intent);

            }
        });


    }




    }




