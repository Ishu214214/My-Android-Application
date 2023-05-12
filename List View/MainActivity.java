package com.example.list_view_and_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView cityname;

    String[] cityes = {"jaipur", "khagaria", "Patna", "GB Road", "hello world"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityname=findViewById(R.id.city);
        ArrayAdapter<String> obj;
        obj = new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, cityes);

        cityname.setAdapter(obj);


        cityname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                String item = (String) parent.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
            }


        });
    }
}