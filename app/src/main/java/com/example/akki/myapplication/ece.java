package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);
    }

    public void firstyear(View view)
    {
        Intent intent=new Intent(ece.this,firstyear.class);
        startActivity(intent);
    }

    public void secondyearece(View view)
    {
        Intent intent=new Intent(ece.this,secondyearece.class);
        startActivity(intent);
    }

    public void thirdyearece(View view)
    {
        Intent intent=new Intent(ece.this,thirdyearece.class);
        startActivity(intent);
    }

    public void fourthyearece(View view)
    {
        Intent intent=new Intent(ece.this,fourthyearece.class);
        startActivity(intent);
    }
}
