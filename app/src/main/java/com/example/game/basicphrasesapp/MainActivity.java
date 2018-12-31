package com.example.game.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTap(View view) {
        int id = view.getId();
        String ourid = "";
        ourid = view.getResources().getResourceEntryName(id);
        MediaPlayer mplayer1 = MediaPlayer.create(this , R.raw.a);
        MediaPlayer mplayer2 = MediaPlayer.create(this , R.raw.b);
        MediaPlayer mplayer3 = MediaPlayer.create(this , R.raw.c);
        MediaPlayer mplayer4 = MediaPlayer.create(this , R.raw.d);
        MediaPlayer mplayer5 = MediaPlayer.create(this , R.raw.e);
        MediaPlayer mplayer6 = MediaPlayer.create(this , R.raw.f);
        MediaPlayer mplayer7 = MediaPlayer.create(this , R.raw.g);
        MediaPlayer mplayer8 = MediaPlayer.create(this , R.raw.h);


        switch (ourid){
            case "a" :
                mplayer1.start();break;
            case "b" :
                mplayer2.start();break;
            case "c" :
                mplayer3.start();break;
            case "d" :
                mplayer4.start();break;
            case "e" :
                mplayer5.start();break;
            case "f" :
                mplayer6.start();break;
            case "g" :
                mplayer7.start();break;
            case "h" :
                mplayer8.start();break;
        }

    }
}
