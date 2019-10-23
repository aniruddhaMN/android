package com.example.a1b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cie1, cie2, cie3, aat;
    Button calc;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cie1 = (EditText)findViewById(R.id.CIE1);
        cie2 = (EditText)findViewById(R.id.CIE2);
        cie3 = (EditText)findViewById(R.id.CIE3);
        aat = (EditText)findViewById(R.id.AAT);

        calc = (Button)findViewById(R.id.button);

        result = (TextView)findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double t1, t2, t3, t4, minimum, total;
                    t1 = (Double.parseDouble(cie1.getText().toString()));
                    t2 = (Double.parseDouble(cie2.getText().toString()));
                    t3 = (Double.parseDouble(cie3.getText().toString()));
                    t4 = (Double.parseDouble(aat.getText().toString()));

                    if(t1<t2){
                        if(t1<t3){
                            minimum = t1;
                        }
                        else{
                            minimum = t3;
                        }
                    }
                    else{
                        if(t2<t3){
                            minimum = t2;
                        }
                        else{
                            minimum = t3;
                        }
                    }

                    total = t1 + t2 + t3 + t4 - minimum;

                    result.setText(String.valueOf(total));

                    if(total < 20){
                        result.setTextColor(Color.RED);
                    }

                    else{
                        result.setTextColor(Color.GREEN
                        );
                    }
                }

                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Please enter valid values!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
