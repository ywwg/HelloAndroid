package com.ywwg.helloandroid;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;


public class HelloAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.my_music);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        mediaPlayer.seekTo(10*1000);
    }
}

