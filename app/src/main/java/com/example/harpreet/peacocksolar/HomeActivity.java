package com.example.harpreet.peacocksolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText email;
    EditText address;
    EditText mobile_number;
    EditText name;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        email = findViewById(R.id.email_edit_text);
        name = findViewById(R.id.name);
        next = findViewById(R.id.next);
        address = findViewById(R.id.address);
        mobile_number = findViewById(R.id.mobile);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail_text = email.getText().toString();
                String mobile_text = mobile_number.getText().toString();
                String address_text = address.getText().toString();
                String name_text = name.getText().toString();
                Toast.makeText(HomeActivity.this, mail_text+"\n"+name_text+"\n"+address_text+"\n", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
