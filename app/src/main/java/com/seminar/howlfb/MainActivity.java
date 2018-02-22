package com.seminar.howlfb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.seminar.howlfb.config.ConfigActivity;
import com.seminar.howlfb.database.DatabaseActivity;
import com.seminar.howlfb.login.LoginActivity;
import com.seminar.howlfb.notification.NotificationActivity;
import com.seminar.howlfb.storage.StorageActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login).setOnClickListener(this);
        findViewById(R.id.database).setOnClickListener(this);
        findViewById(R.id.storage).setOnClickListener(this);
        findViewById(R.id.notification).setOnClickListener(this);
        findViewById(R.id.config).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login :
                startActivity(new Intent(this, LoginActivity.class));
                break;
            case R.id.database :
                startActivity(new Intent(this, DatabaseActivity.class));
                break;
            case R.id.storage :
                startActivity(new Intent(this, StorageActivity.class));
                break;
            case R.id.notification :
                startActivity(new Intent(this, NotificationActivity.class));
                break;
            case R.id.config :
                startActivity(new Intent(this, ConfigActivity.class));
                break;
        }
    }
}
