package com.example.a1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button finishbttn, clickme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finishbttn = (Button)findViewById(R.id.finish);
        clickme = (Button)findViewById(R.id.clickbttn);

        finishbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        clickme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "You clicked the \"Click ME\" button", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("start", "Starting");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("resume", "Resuming");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("stop", "Stopping");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("pause", "Pausing");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("destroy", "Destroying");
    }
}
