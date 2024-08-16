package edu.divyagyan.fragmentlifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate Method Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop Method Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy Method Called");

    }
}
