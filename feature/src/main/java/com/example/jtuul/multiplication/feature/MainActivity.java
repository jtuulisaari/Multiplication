package com.example.jtuul.multiplication.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final String TAG = getClass().getName();

    Button freeGameBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        freeGameBtn = findViewById(R.id.freeGameButton);
    }

    public void chooseGame(View view) {
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
        Log.d(TAG, "hello log");
    }
}
