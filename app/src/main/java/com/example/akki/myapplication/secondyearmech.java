package com.example.akki.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secondyearmech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondyearmech);
        ListView listView=(ListView)findViewById(R.id.lv);
        String[] lv=new String[]{
                "SYLLUBUS"
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
                if (position == 0)
                {
                    Intent intent = new Intent(secondyearmech.this, syllabusmech2.class);
                    startActivity(intent);
                }
            }
        });

    }
}
