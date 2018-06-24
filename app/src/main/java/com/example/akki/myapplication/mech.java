package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
    }

    public void firstyear(View view)
    {
        Intent intent=new Intent(mech.this,firstyear.class);
        startActivity(intent);
    }

    public void secondyearmech(View view)
    {
        Intent intent=new Intent(mech.this,secondyearmech.class);
        startActivity(intent);
    }

    public void thirdyearmech(View view)
    {
        Intent intent=new Intent(mech.this,thirdyearmech.class);
        startActivity(intent);
    }

    public void fourthyearmech(View view)
    {
        Intent intent=new Intent(mech.this,fourthyearmech.class);
        startActivity(intent);
    }
}
