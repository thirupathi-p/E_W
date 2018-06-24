package com.example.akki.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstyear extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstyear);
        ListView listView=(ListView)findViewById(R.id.lv);
        String[] lv=new String[]{
                "SYLLUBUS","PHYSICS","CHEMISTRY","BEE","COMPUTER PROGRAMMING"
        };
        List<String> subjectlist=new ArrayList<String>(Arrays.asList(lv));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,subjectlist);
       listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Intent intent=new Intent(firstyear.this,syllubus.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(firstyear.this,physics.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(firstyear.this,chemistry.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent=new Intent(firstyear.this,BEE.class);
                    startActivity(intent);
                }

                if(position==4)
                {
                    Intent intent=new Intent(firstyear.this,computerprogramming.class);
                    startActivity(intent);
                }

            }
        });

    }
}
