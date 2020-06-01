package com.example.carecer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class gridpage extends AppCompatActivity {
    private CardView nutrition,appoint,symptom,medi;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridpage);

        nutrition=(CardView)findViewById(R.id.nutrition);
        appoint=(CardView)findViewById(R.id.appoint);
        symptom=(CardView)findViewById(R.id.symptom);
        medi=(CardView)findViewById(R.id.medication);
        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridpage.this, Guidelines.class);

                startActivity(intent);
            }
        });
        appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridpage.this, Appointment.class);

                startActivity(intent);
            }
        });
        medi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridpage.this, prescription.class);

                startActivity(intent);
            }
        });
        symptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridpage.this, Symptom.class);

                startActivity(intent);
            }
        });

    }
}
