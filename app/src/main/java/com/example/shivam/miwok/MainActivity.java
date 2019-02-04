package com.example.shivam.miwok;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

// Find the View that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);

// Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

// Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);

// Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView family = (TextView) findViewById(R.id.family);

// Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        TextView textView = (TextView) findViewById(R.id.numbers);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/FFF.ttf");
        textView.setTypeface(typeface);
        TextView textView2 = (TextView) findViewById(R.id.colors);
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "Fonts/FFF.ttf");
        textView2.setTypeface(typeface2);
        TextView textView3 = (TextView) findViewById(R.id.family);
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "Fonts/FFF.ttf");
        textView3.setTypeface(typeface3);
        TextView textView4 = (TextView) findViewById(R.id.phrases);
        Typeface typeface4 = Typeface.createFromAsset(getAssets(), "Fonts/FFF.ttf");
        textView4.setTypeface(typeface4);
    }

}
