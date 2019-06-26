package io.github.suzhenyu.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.CallLog;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate execute");
        Log.d(TAG, "onCreate: cool");
        Log.d("data", "onCreate: ye");
    }
}
