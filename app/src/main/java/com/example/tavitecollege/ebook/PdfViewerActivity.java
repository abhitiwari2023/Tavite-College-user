package com.example.tavitecollege.ebook;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.example.tavitecollege.R;


public class PdfViewerActivity extends AppCompatActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        url = getIntent().getStringExtra("pdfUrl");



    }

}