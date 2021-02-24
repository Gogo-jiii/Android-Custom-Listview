package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] textArray = {"One", "Two", "Three"};
    Integer[] imageArray = {R.drawable.ic_android, R.drawable.ic_baseline_accessibility, R.drawable.ic_baseline_airplanemode_active};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        MyListAdapter adapter = new MyListAdapter(this, textArray, imageArray);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked: " + textArray[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}