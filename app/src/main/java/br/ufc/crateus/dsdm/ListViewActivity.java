package br.ufc.crateus.dsdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    int count = 0;

    ArrayAdapter<String> adapter;

    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView itemList = findViewById(R.id.dynamicList);
        Button add = findViewById(R.id.addItemButton);

        list = new ArrayList<>(Arrays.asList("India", "USA", "China", "Japan", "Other"));

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, list);
        itemList.setAdapter(adapter);

        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add("Novo Item");
                count = count + 1;
                adapter.notifyDataSetChanged();
            }
        });

    }
}
