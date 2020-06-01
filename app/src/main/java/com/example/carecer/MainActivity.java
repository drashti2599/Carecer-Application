package com.example.carecer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login=(Button)findViewById(R.id.button_login);
        final Button sign_up1=(Button)findViewById(R.id.button_signup);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.Password);
        login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                final String username1=user.getText().toString();
                final String password1=pass.getText().toString();
                if(username1.equals(password1)) {
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    intent.putExtra("NAME", username1);
                    startActivity(intent);


                }
                else
                {
                    showDialog(MainActivity.this,"Username and Password does not match.Try Again");
                }

            }
            });
        sign_up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sign_up.class);

                startActivity(intent);
            }
        });
    }
    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_login);
        TextView text = (TextView) dialog.findViewById(R.id.incorrect);
        text.setText(msg);
        Button dialogButton1 = (Button) dialog.findViewById(R.id.OK);
        dialogButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();



    }
}
