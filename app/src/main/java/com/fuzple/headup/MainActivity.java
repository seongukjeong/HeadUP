package com.fuzple.headup;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView listview ;
    Myadapter adapter;
    Button re_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);

        listview = (ListView)findViewById(R.id.alarm_list);
        re_btn = (Button)findViewById(R.id.re_button);

        re_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, alregister_Activity.class);
                startActivityForResult(i,111);
            }
        });

        adapter = new Myadapter();
        listview.setAdapter(adapter);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 111 && resultCode == 222)
        {
            adapter.addItem(data.getStringExtra("t"),data.getStringExtra("d"));
            adapter.notifyDataSetChanged();
        }
    }
}
