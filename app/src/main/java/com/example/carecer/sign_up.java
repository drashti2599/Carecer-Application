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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    private RadioButton radiobutton;
    EditText pass1;
    EditText pass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
         Button signup1=(Button)findViewById(R.id.button_signup1);
        TextView mGenderSelection = (TextView) findViewById(R.id.txt_gender);
        pass1=(EditText)findViewById(R.id.password);
        pass2=(EditText)findViewById(R.id.rep_pass);
        mGenderSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog1(sign_up.this, "Gender");
            }
        });
        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String password1=pass1.getText().toString();
                final String password2=pass2.getText().toString();
                if(password2.equals(password1)) {
                    Intent intent = new Intent(sign_up.this, Welcome.class);

                    startActivity(intent);


                }
                else
                {
                    showDialog(sign_up.this,"Passwords are not matching.Try Again");
                }
            }
        });
    }
    public void showDialog1(Activity activity, String msg) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        final RadioGroup radiogroup = (RadioGroup) dialog.findViewById(R.id.radiogroup);

        RadioButton rb1 = (RadioButton) dialog.findViewById(R.id.radioButton1);

        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
        text.setText(msg);


        final TextView gender = (TextView) findViewById(R.id.gender_sel);


        Button dialogButton1 = (Button) dialog.findViewById(R.id.ok);
        dialogButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radiogroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radiobutton = (RadioButton) dialog.findViewById(selectedId);

                Toast.makeText(sign_up.this,
                        radiobutton.getText(), Toast.LENGTH_SHORT).show();
                gender.setText(radiobutton.getText());
                dialog.dismiss();
            }
        });

        Button dialogButton2 = (Button) dialog.findViewById(R.id.cancel);
        dialogButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

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
