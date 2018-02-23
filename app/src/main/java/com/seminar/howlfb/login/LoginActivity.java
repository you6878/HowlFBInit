package com.seminar.howlfb.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.seminar.howlfb.R;

public class LoginActivity extends AppCompatActivity {


    private EditText email;
    private EditText password;
    private Button emailLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }
}
