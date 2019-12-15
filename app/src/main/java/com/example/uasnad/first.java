package com.example.uasnad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class first extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);


        // Find the View that shows the activity search
        ImageButton main = (ImageButton) findViewById(R.id.btnmulai);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity search is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the activity search
                Intent MainIntent = new Intent(first.this, MainActivity.class);

                //menampilkan Toast
                Toast.makeText(getApplicationContext(),"Hallo, Selamat Datang", Toast.LENGTH_SHORT).show();


                // Start the new activity
                startActivity(MainIntent);
                finish();
            }
        });

    }
}