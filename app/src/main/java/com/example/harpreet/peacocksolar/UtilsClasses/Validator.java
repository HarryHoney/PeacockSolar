package com.example.harpreet.peacocksolar.UtilsClasses;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import com.example.harpreet.peacocksolar.R;


public class Validator {
    EditText email;
    EditText address;
    EditText mobile_number;
    EditText name;

    public Validator(){}

    public Validator(ViewGroup view){
        email = view.findViewById(R.id.email_edit_text);
        name = view.findViewById(R.id.name);
        address = view.findViewById(R.id.address);
        mobile_number = view.findViewById(R.id.mobile);
    }

    public static boolean isValidEmail(CharSequence target) {
        if(TextUtils.isEmpty(target))
            return false;
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    public boolean isValidMobileNumber(CharSequence target)
    {
      return  (target.toString().length()==10)&&TextUtils.isDigitsOnly(target);
    }

    public Form check()
    {

        String mail_text = email.getText().toString().trim();
        String mobile_text = mobile_number.getText().toString().trim();
        String address_text = address.getText().toString().trim();
        String name_text = name.getText().toString().trim();
        boolean allow=true;
        if(!isValidEmail(mail_text))
        {
            email.setError("Email is not valid!");
            allow=false;
        }
        if(!isValidMobileNumber(mobile_text)){
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
            Form form  = new Form(mail_text,mobile_text,address_text,name_text);
            return form;
        }

        return null;
    }
}
