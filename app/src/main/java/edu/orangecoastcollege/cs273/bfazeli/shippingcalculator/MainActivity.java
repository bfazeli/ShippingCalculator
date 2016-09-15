package edu.orangecoastcollege.cs273.bfazeli.shippingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Associate the controller with the needed views
    private EditText weightEditText;
    private TextView baseCostOutput, addedCostOutput, totalCostOutput;

    // Associate the controller with the needed model
    ShipItem item = new ShipItem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the controller with the widgets in the application
        weightEditText  = (EditText) findViewById(R.id.weightEditText);
        baseCostOutput  = (TextView) findViewById(R.id.baseCostOutput);
        addedCostOutput = (TextView) findViewById(R.id.totalCostOutput);
        totalCostOutput = (TextView) findViewById(R.id.totalCostOutput);

        // Define listener for weightEditText(onTextChanged)
        weightEditText.addTextChangedListener(weightTextChangedListener);
    }

    private TextWatcher weightTextChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // Try to get the weight from the weightEditText
            try {

                double weight = s.length() < 1 ? 0.0 : Double.parseDouble(s.toString());
                item.setWeight(weight);

            } catch (NumberFormatException e) {

                weightEditText.setText("");
            }

            // No exception, input is valid
            // 1) Update the baseCostOutput

            // 2) Update the addedCostOutput

            // 3) Update the totalCostOutput
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
