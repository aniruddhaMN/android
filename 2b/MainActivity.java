package com.example.a2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView itemList;
    Button genBttn;
    ArrayList<Item> Items;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = (ListView)findViewById(R.id.ListView);
        genBttn = (Button)findViewById(R.id.genBttn);

        Items = new ArrayList<Item>();
        Items.add(new Item("Egg",12));
        Items.add(new Item("Maggie",20));
        Items.add(new Item("Pencil",4));
        Items.add(new Item("Eraser",5));

        itemAdapter adapter = new itemAdapter(Items, getApplicationContext());
        itemList.setAdapter(adapter);

        genBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0.0;
                for(Item item:Items){
                    total = total + (item.getPrice() * item.getQty());
                }

                Toast.makeText(getApplicationContext(), "Total price is : Rs." + String.valueOf(total), Toast.LENGTH_LONG).show();
            }
        });
    }
}
