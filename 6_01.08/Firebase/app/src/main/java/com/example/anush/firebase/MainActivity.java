package com.example.anush.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button send;
    Spinner spinner;

    DatabaseReference dataBaseForeginer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.input_text);
        send = (Button)findViewById(R.id.save_btn);
        spinner = (Spinner)findViewById(R.id.spinner);

        dataBaseForeginer = FirebaseDatabase.getInstance().getReference("foreginer");
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addForeginer();

            }
        });
    }
     private void addForeginer(){
        String name = editText.getText().toString().trim();
        String options = spinner.getSelectedItem().toString();

        if(TextUtils.isEmpty(name)){
           String id = dataBaseForeginer.push().getKey();
           Foreginer foreginer = new Foreginer(id, name,options);
           dataBaseForeginer.child(id).setValue(foreginer);
           Toast.makeText(this,"added language",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"Enter a text", Toast.LENGTH_LONG).show();

        }

     }

}
