package edu.orangecoastcollege.cs273.rbarron11.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Define the button as an instance variable
    Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Restoring User settings from a previous session
        super.onCreate(savedInstanceState);
        //Opening the layout called activity_main
        setContentView(R.layout.activity_main);

        //hook up speak_button to the one in our view
        speakButton = (Button) findViewById(R.id.speakButton);
    }
}
