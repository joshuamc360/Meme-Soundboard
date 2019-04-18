package com.example.joshuamc.meme_soundboard;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnYeet, btnJohnCena, btnBaby, btnIlluminati, btnNani, btnRunning, btnMilk, btnCrack;

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Member Variables
    SoundPool mSoundPool;
    int mNaniId;
    int mCrackHeadId;
    int mMilkId;
    int mRunningId;
    int mYeetId;
    int mIlluminatiID;
    int mJohnCenaID;
    int mBabyID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // locks screen in portrait

        btnYeet = findViewById(R.id.btn1);
        btnJohnCena = findViewById(R.id.btn2);
        btnBaby = findViewById(R.id.btn3);
        btnIlluminati = findViewById(R.id.btn4);
        btnNani = findViewById(R.id.btn5);
        btnRunning = findViewById(R.id.btn6);
        btnMilk = findViewById(R.id.btn7);
        btnCrack = findViewById(R.id.btn8);

        // 	Updated way to create a SoundPool for API levels newer than Android Lollipop
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
                    .build();
        } else {
            // Deprecated way of creating a SoundPool before Android API 21.
            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        }

        // Get the resource IDs to identify the sounds and store them in variables
        mYeetId = mSoundPool.load(getApplicationContext(), R.raw.yeet, 1);
        mNaniId = mSoundPool.load(getApplicationContext(), R.raw.naniiii, 1);
        mCrackHeadId = mSoundPool.load(getApplicationContext(), R.raw.crack, 1);
        mMilkId = mSoundPool.load(getApplicationContext(), R.raw.milk, 1);
        mIlluminatiID = mSoundPool.load(getApplicationContext(), R.raw.illuminati, 1);
        mRunningId = mSoundPool.load(getApplicationContext(), R.raw.running, 1);
        mJohnCenaID= mSoundPool.load(getApplicationContext(), R.raw.johncena, 1);
        mBabyID= mSoundPool.load(getApplicationContext(), R.raw.babycomeback, 1);


        


        btnYeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mYeetId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnJohnCena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mJohnCenaID, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mBabyID, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnIlluminati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mIlluminatiID, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnNani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mNaniId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btnRunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mRunningId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mMilkId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btnCrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mCrackHeadId, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
    }
}
