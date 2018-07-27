package com.example.android.onedevimpact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    databaseSQLite myDb;
    private EditText Email, Password, PasswordAgain, MobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb=new databaseSQLite(this);

        Email = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        PasswordAgain = (EditText) findViewById(R.id.again);
        MobileNumber = (EditText) findViewById(R.id.mobile);

        TextView Continue = (TextView) findViewById(R.id.cont);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String addressMail = Email.getText().toString();
                String userPassword = Password.getText().toString();
                String userpasswordAgain = PasswordAgain.getText().toString();
                String userMobile = MobileNumber.getText().toString();

                Intent intent = new Intent(MainActivity.this, UserData.class);

                intent.putExtra("email", "Email: " + addressMail);
                intent.putExtra("password", "Password: " + userPassword);
                intent.putExtra("again", "Again: " + userpasswordAgain);
                intent.putExtra("mobile", "Mobile: " + userMobile);

                startActivity(intent);
            }
        });


    }
}
