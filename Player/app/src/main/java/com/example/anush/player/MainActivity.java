package com.example.anush.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.start);
        Button stop = findViewById(R.id.stop);
        final Intent intent = new Intent(this, MyService.class);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putParcelableArrayListExtra(MusicService.ARG_QUEUE, tracks)
                intent.putExtra(MusicService.ARG_INDEX, position)
                intent.putExtra(MusicService.CMD_NAME, MusicService.CMD_PLAY)
                activity.startService(intent);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(intent);
            }
        });
    }
}
