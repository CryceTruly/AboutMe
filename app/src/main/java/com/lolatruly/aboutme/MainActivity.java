package com.lolatruly.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] info={"Name - Cryce Truly","Work - Web Developer","School - Code Academy", "Lifestyle - introversy","Github - github.com/CryceTruly","website - foodtest.freevar.com"
          ,"Previous - Must Mbra","Love life - currently commiting to git",
                "Future - C.E.O Truly Sites","Facebook - facebook.com/crycetruly","Twitter - twitter.com/crycetruly"
           ,"favourite programming language - Node JS","Others - PHP Laravel& Python Django", "More - Java,Swift"
        };
        ListAdapter trulyaddapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,info);
        ListView listView=(ListView)findViewById(R.id.lv);
        listView.setAdapter(trulyaddapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String info=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,info,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
