package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void cse(View view)
    {
        Intent intent=new Intent(MainActivity.this,cse.class);
        startActivity(intent);

    }


    public void ece(View view)
    {
        Intent intent=new Intent(MainActivity.this,ece.class);
        startActivity(intent);

    }

    public void eee(View view)
    {
        Intent intent=new Intent(MainActivity.this,eee.class);
        startActivity(intent);

    }

    public void mech(View view)
    {
        Intent intent=new Intent(MainActivity.this,mech.class);
        startActivity(intent);

    }

    public void civil(View view)
    {
        Intent intent=new Intent(MainActivity.this,civil.class);
        startActivity(intent);

    }

    public void basics(View view)
    {
        Intent intent=new Intent(MainActivity.this,basics.class);
        startActivity(intent);

    }
}
