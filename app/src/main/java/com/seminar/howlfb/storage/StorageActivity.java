package com.seminar.howlfb.storage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import com.seminar.howlfb.R;

public class StorageActivity extends AppCompatActivity {

    private Button btnShowGallery, btnUploadImage,btnDownloadImage,btnDeleteImage;

    private ImageView imageUpload,imageDownload;

    private EditText editUpload,editDownload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
    }
}
