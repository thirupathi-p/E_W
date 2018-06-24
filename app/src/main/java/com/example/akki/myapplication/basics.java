package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class basics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);
    }

    public void html(View view)
    {
        Intent intent=new Intent(basics.this,html.class);
        startActivity(intent);
    }

    public void iot(View view)
    {
        Intent intent=new Intent(basics.this,iot.class);
        startActivity(intent);
    }
}
