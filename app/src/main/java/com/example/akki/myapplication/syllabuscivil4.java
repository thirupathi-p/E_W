package com.example.akki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class syllabuscivil4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabuscivil4);
        PDFView book=(PDFView)findViewById(R.id.pdfbook);
        book.fromAsset("CIVIL4-1.pdf").load();

    }
}
