package com.example.anush.task2;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

        private EditText text;
        private Button button;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second_activity);

            text = findViewById(R.id.text2);
            button = findViewById(R.id.button2);
            text.setText(getIntent().getStringExtra(MainActivity.KEY));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.putExtra(MainActivity.KEY, String.valueOf(text.getText()));
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra(MainActivity.KEY, String.valueOf(text.getText()));
            setResult(RESULT_OK, intent);
            finish();
        }
    }

