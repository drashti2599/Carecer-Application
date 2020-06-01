package com.example.carecer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
     Button breast,cervical,oral;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        breast=(Button) findViewById(R.id.tv_bc);
        cervical=(Button)findViewById(R.id.tv_cc);
        oral=(Button)findViewById(R.id.tv_oc);
        breast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, gridpage.class);
                intent.putExtra("NAME", "Breast Cancer");
                startActivity(intent);
            }
        });
        cervical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, gridpage.class);
                intent.putExtra("NAME", "Cervical Cancer");
                startActivity(intent);
            }
        });
        oral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, gridpage.class);
                intent.putExtra("NAME", "Oral Cancer");
                startActivity(intent);
            }
        });
    }
}
