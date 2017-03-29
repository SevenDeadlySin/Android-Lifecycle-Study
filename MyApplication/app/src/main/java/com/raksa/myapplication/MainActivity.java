package com.raksa.myapplication;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private final String TAG = "LifeCycle Message : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"onCreate Method Loaded !");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG,"onStart Method Loaded !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume Method Loaded !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause Method Loaded !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop Method Loaded !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy Method Loaded !");
    }
}
