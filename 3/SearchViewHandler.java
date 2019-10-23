package com.example.a3;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SearchViewHandler extends AppCompatActivity {
    public ListView lv;
    ArrayList<String> data;
    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_search);

        SearchView sv = findViewById(R.id.search_view);
        lv = findViewById(R.id.list_view);

        data = new ArrayList<String>();
        data.add("Apple");
        data.add("Orange");
        data.add("Banana");
        data.add("Guava");
        data.add("Pineapple");
        data.add("Grapes");
        data.add("Pear");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(data.contains(s))
                {
                    adapter.getFilter().filter(s);
                }
                else
                    Toast.makeText(SearchViewHandler.this, "No Match found",Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}
