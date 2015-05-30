package com.dream.coder.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * Created by user on 30-May-15.
 */
public class SecondActivity extends ActionBarActivity {

    private static String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Log.d(TAG, "onCreate in SecondActivity called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart in SecondActivity called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart in SecondActivity called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume in SecondActivity called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause in SecondActivity called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop in SecondActivity called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy in SecondActivity called");
    }
}
