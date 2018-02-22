package com.seminar.howlfb.database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.seminar.howlfb.R;
import com.seminar.howlfb.model.UserDTO;

public class DatabaseActivity extends AppCompatActivity {
    FirebaseFirestore db;
    EditText editText;
    Button button_input;
    Button button_read;
    String uid;
    UserDTO userDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);


        editText = (EditText)findViewById(R.id.editText_name);
        button_input = (Button)findViewById(R.id.button_input);
        button_read = (Button)findViewById(R.id.button_read);

        userDTO = new UserDTO();

        uid = FirebaseAuth.getInstance().getCurrentUser().getUid();



    }
}
