package com.seminar.howlfb.database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.seminar.howlfb.R;
import com.seminar.howlfb.model.UserDTO;

public class DatabaseActivity extends AppCompatActivity {

    EditText editText;
    Button button_input;
    Button button_read;
    String uid;
    UserDTO userDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

    }
}
