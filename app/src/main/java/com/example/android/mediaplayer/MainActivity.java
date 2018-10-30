package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button volumeUp=(Button)findViewById(R.id.volume_up);
        Button volumeDown=(Button)findViewById(R.id.volume_down) ;
        Button play=(Button)findViewById(R.id.buttonplay);
        Button pause=(Button)findViewById(R.id.buttonpause);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.song);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mediaPlayer.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }


        });

        volumeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.setVolume(100,100);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this,"I'm done.",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
