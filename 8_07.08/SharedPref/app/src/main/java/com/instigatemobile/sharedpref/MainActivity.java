package com.instigatemobile.sharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final String LIST = "LIST";
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sPrefs = getSharedPreferences(LIST, MODE_PRIVATE);
        Map<String, String> allEntries = (Map<String, String>) sPrefs.getAll();
        for (Map.Entry<String, String> entry : allEntries.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            mList.add(key + " " + value);
        }

        final EditText key = findViewById(R.id.ed1);
        final EditText value = findViewById(R.id.ed2);
        Button save = findViewById(R.id.saveBtn);
        final ListView list = findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mList);
        list.setAdapter(adapter);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(String.valueOf(key.getText()).isEmpty()) && !(String.valueOf(value.getText()).isEmpty())) {
                    mList.clear();
                    sPrefs.edit().putString(String.valueOf(key.getText()), String.valueOf(value.getText())).apply();
                    Map<String, String> allEntries = (Map<String, String>) sPrefs.getAll();
                    for (Map.Entry<String, String> entry : allEntries.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        mList.add(key + " " + value);
                    }
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getApplicationContext(), "This is my Toast message!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TAG" , "-------------------------------------------");
                String tmp = mList.get(i);
                String[] parts = tmp.split(" ");
                String part1 = parts[0];
                sPrefs.edit().remove(part1).apply();
                mList.clear();
                Map<String, String> allEntries = (Map<String, String>) sPrefs.getAll();
                for (Map.Entry<String, String> entry : allEntries.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    mList.add(key + " " + value);
                }
                adapter.notifyDataSetChanged();
                return false;
            }
        });


    }
}
