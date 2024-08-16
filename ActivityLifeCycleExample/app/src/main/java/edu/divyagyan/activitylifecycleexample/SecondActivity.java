package edu.divyagyan.activitylifecycleexample;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private final String TAG = SecondActivity.class.getCanonicalName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG,"Second Activity onCreate method call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Second Activity onStart method call");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Second Activity onResume method call");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Second Activity onPause method call");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Second Activity onStop method call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Second Activity onDestroy method call");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Second Activity onRestart method call");

    }
}
