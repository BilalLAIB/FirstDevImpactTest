package com.example.android.onedevimpact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserData extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.userdata);

            Intent theValue = this.getIntent();

            TextView  email = (TextView) findViewById(R.id.email_textView);
            email.setText(theValue.getExtras().getString("email"));

            TextView password = (TextView) findViewById(R.id.password_textView);
            password.setText(theValue.getExtras().getString("password"));

            TextView password_again = (TextView) findViewById(R.id.again_textView);
            password_again.setText(theValue.getExtras().getString("again"));

            TextView mobileNumber = (TextView) findViewById(R.id.mobile_textView);
            mobileNumber.setText(theValue.getExtras().getString("mobile"));


        }
    }
