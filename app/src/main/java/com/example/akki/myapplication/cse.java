package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
    }

    public void firstyear(View view)
    {
        Intent intent=new Intent(cse.this,firstyear.class);
        startActivity(intent);
    }

    public void secondyear(View view)
    {

        Intent intent=new Intent(cse.this,secondyearcse.class);
        startActivity(intent);
    }

    public void thirdyear(View view)
    {

        Intent intent=new Intent(cse.this,thirdyearcse.class);
        startActivity(intent);
    }

    public void fourthyear(View view)
    {

        Intent intent=new Intent(cse.this,fourthyearcse.class);
        startActivity(intent);
    }
}
