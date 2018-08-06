package com.example.anush.reminderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NewAdd extends AppCompatActivity {

    private static final String TAG = "CreateItem";

   private EditText title;
   private EditText description;
   private ImageView image;
   private Button upload;
   private Button save;
   private ImageView alarm;
   private ImageView date;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_add);

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        image = findViewById(R.id.add_image);
        upload = findViewById(R.id.upload_image);
        save = findViewById(R.id.save);
        alarm = findViewById(R.id.alarm);
        date = findViewById(R.id.date);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Title : " + title.getText().toString());
                startActivity(new Intent(NewAdd.this, AddTaskActivity.class));
                finish();
            }
        });

    }
}
