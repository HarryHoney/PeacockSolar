package com.example.harpreet.peacocksolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.harpreet.peacocksolar.UtilsClasses.Form;
import com.example.harpreet.peacocksolar.UtilsClasses.Validator;


public class HomeActivity extends AppCompatActivity {


    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nextButton = findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewGroup view = (ViewGroup) findViewById(android.R.id.content);
                Validator validate = new Validator(view);
                Form form = validate.check();


                if(form!=null)
                {
                    Toast.makeText(HomeActivity.this, form.getName_text()+"\n"+form.getMail_text()+"\n"+
                            form.getMobile_text()+"\n"+form.getAddress_text(), Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(HomeActivity.this, "We can't do it", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
