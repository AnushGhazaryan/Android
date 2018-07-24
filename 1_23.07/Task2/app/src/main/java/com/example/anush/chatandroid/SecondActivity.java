package com.example.anush.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText editText=findViewById(R.id.editText);
        final Button editBtn=findViewById(R.id.editBtn);
        editText.setText(getIntent().getStringExtra(MainActivity.KEY));
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(MainActivity.KEY, String.valueOf(editText.getText()));
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }



}
