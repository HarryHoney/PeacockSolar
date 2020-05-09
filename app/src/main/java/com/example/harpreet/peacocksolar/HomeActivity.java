package com.example.harpreet.peacocksolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {
    EditText email;
    EditText address;
    EditText mobile_number;
    EditText name;
    Button nextButton;
    public final static boolean isNotValidEmail(CharSequence target) {
        return TextUtils.isEmpty(target) || !android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    public final boolean isNotValidMobileNumber(CharSequence target)
    {
        return !TextUtils.isDigitsOnly(target)||!(target.toString().length()==10);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        email = findViewById(R.id.email_edit_text);
        name = findViewById(R.id.name);
        nextButton = findViewById(R.id.next);
        address = findViewById(R.id.address);
        mobile_number = findViewById(R.id.mobile);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail_text = email.getText().toString().trim();
                String mobile_text = mobile_number.getText().toString().trim();
                String address_text = address.getText().toString().trim();
                String name_text = name.getText().toString().trim();
                boolean allow=true;

                if(isNotValidEmail(mail_text))
                {
                    email.setError("Email is not valid!");
                    allow=false;
                }
                if(isNotValidMobileNumber(mobile_text)){
                    mobile_number.setError("Mobile Number is not valid!");
                    allow=false;
                }
                if(address_text.isEmpty())
                {
                    address.setError("Address can't be empty!");
                    allow=false;
                }

                if(name_text.isEmpty())
                {
                    allow=false;
                    name.setError("Name can't be empty!");
                }

                if(allow)
                {
                    Toast.makeText(HomeActivity.this, mail_text+"\n"+name_text+"\n"+address_text+"\n", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(HomeActivity.this, "We can't do it", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
