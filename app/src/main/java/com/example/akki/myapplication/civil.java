package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
    }

    public void firstyear(View view)
    {
        Intent intent=new Intent(civil.this,firstyear.class);
        startActivity(intent);
    }

    public void secondyearcivil(View view)
    {
        Intent intent=new Intent(civil.this,secondyearcivil.class);
        startActivity(intent);
    }

    public void thirdyearcivil(View view)
    {
        Intent intent=new Intent(civil.this,thirdyearcivil.class);
        startActivity(intent);
    }

    public void fourthyearcivil(View view)
    {
        Intent intent=new Intent(civil.this,fourthyearcivil.class);
        startActivity(intent);
    }
}
