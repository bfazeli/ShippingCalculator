package edu.orangecoastcollege.cs273.bfazeli.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Associate the controller with the needed views


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
