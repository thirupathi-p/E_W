package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class eee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
    }

    public void firstyear(View view)
    {
        Intent intent=new Intent(eee.this,firstyear.class);
        startActivity(intent);
    }

    public void secondyeareee(View view)
    {
        Intent intent=new Intent(eee.this,secondyeareee.class);
        startActivity(intent);
    }

    public void thirdyeareee(View view)
    {
        Intent intent=new Intent(eee.this,thirdyeareee.class);
        startActivity(intent);
    }

    public void fourthyeareee(View view)
    {
        Intent intent=new Intent(eee.this,fourthyeareee.class);
        startActivity(intent);
    }
}
