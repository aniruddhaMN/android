package com.example.a2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    Button b;
    TextView result;
    HashMap hp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner)findViewById(R.id.spinner);
        b = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.translation);

        hp = new HashMap();
        hp.put("Hi", "Bonjour");

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String eng = sp.getSelectedItem().toString();
                try{
                    String tr = hp.get(eng.trim()).toString();
                    result.setText(tr);
                }
                catch (Exception e){
                    result.setText("Translation not found!");
                }
            }
        });
    }
}
