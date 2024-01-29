package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    LifeCycle lc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lc = new LifeCycle(
                this,
                (ListView) findViewById(R.id.list),
                (Button) findViewById(R.id.btn)
        );
        lc.addToList("onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        lc.addToList("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        lc.addToList("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        lc.addToList("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        lc.addToList("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lc.addToList("onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        lc.addToList("onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lc.addToList("onRestoreInstanceState()");
    }
}