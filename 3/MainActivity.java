package com.example.a3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout)findViewById(R.id.drawerLayout);
        NavigationView nv = (NavigationView)findViewById(R.id.navigationView);

        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                dl.closeDrawers();

                if(menuItem.getItemId()==R.id.Contacts){
                    startActivity(new Intent(Intent.ACTION_DEFAULT, ContactsContract.Contacts.CONTENT_URI));
                }
                else if(menuItem.getItemId()==R.id.Browser){
                    startActivity(new Intent(getApplicationContext(), BrowserActivity.class));
                }
                else if(menuItem.getItemId()==R.id.Search){
                    startActivity(new Intent(getApplicationContext(), SearchViewHandler.class));
                }
                else if(menuItem.getItemId()==R.id.Map){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?z=4&q=current+location")));
                }
                else{

                }

                return true;
            }
        });
    }
}
