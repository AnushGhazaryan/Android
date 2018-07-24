package com.example.anush.chatandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView showText;
    private Button editBtn;
    private Button copyBtn;
    public static final String KEY = "key";
    public static final int CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view();
    }


    private void view(){
        editBtn=findViewById(R.id.editBtn);
        showText=findViewById(R.id.showText);
        editBtn=findViewById(R.id.editBtn);
        copyBtn=findViewById(R.id.copyBtn);
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            if(data == null){
                return;
            }
            showText.setText(data.getStringExtra(KEY));
        }
        @Override
        public void onClick(View view){
            if(view.getId() == R.id.sendBtn){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(KEY, String.valueOf(editText.getText()));
                startActivityForResult(intent, CODE);
            } else if (view.getId() == R.id.copyBtn){
                editText.setText(showText.getText());
            }




        }


}
