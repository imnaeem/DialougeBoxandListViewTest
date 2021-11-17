package com.example.dialougeboxandlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    EditText fName;
    ListView list;
    ArrayList<String> frindlist = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.myList);
        addBtn = findViewById(R.id.addbutton);
        fName = findViewById(R.id.friendName);

        frindlist.add("Naeem");
        frindlist.add("Hammad");
        frindlist.add("Ali");
        frindlist.add("Sir");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, frindlist);
        list.setAdapter(arrayAdapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frindlist.add(fName.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}