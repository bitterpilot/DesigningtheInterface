package com.stackskills_learning.designingtheinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
        1m = 39.3701in
    */

    private EditText enterMeters;
    private Button convertButtonID;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resaultID);

        convertButtonID = (Button) findViewById(R.id.convertButtonID);
        convertButtonID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //conversion logic
                double multiplier = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(enterMeters.getText().toString());
                result = meterValue * multiplier;

                resultTextView.setText(String.format("%.2f",result) + " inches");
                                            //         ^ code inherited from C++
            }
        });

    }
}
