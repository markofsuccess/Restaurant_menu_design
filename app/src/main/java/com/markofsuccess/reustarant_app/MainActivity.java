package com.markofsuccess.reustarant_app;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.markofsuccess.reustarant_app.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        startersCard.findViewById(R.id.card_view_starters);
        mainsCard.findViewById(R.id.card_view_main);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //MainActivity.this means where we are right now and after the comma is where we want to go -->StartersActivity class
                Intent startersActivityIntent = new Intent(MainActivity.this,StartersActivity.class);

                //put the intent in the startActivity method
                // what this will do is that it will read the intent and say oh you want to go the startersActivity
                // and it will read the manifest and it will find the the starters activity and open the screen.
                //intent can be used for moving between screens, how to move to a new activity
                startActivity(startersActivityIntent);
            }
        });
    }

}

