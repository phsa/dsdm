package br.ufc.crateus.dsdm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup group;
    Button confirm;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = findViewById(R.id.radioSexGroup);
        confirm = findViewById(R.id.confirmSex);
        spin = findViewById(R.id.spinner);

//        RadioButtonExample();
//        AlertDialogExample();
//        SpinnerExample();
//        ListViewExample();

//        startActivity(new Intent(this, RestaurantActivity.class));

        startActivity(new Intent(this, ListViewActivity.class));

    }

    private void ListViewExample() {
        final String[] country = { "India", "USA", "China", "Japan", "Other"};

        ListView listView = findViewById(R.id.listView);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, country);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void SpinnerExample() {
        final String[] country = { "India", "USA", "China", "Japan", "Other"};

        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), country[position] , Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void AlertDialogExample() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        confirm = findViewById(R.id.confirmSex);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose \'yes\' action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose \'no\' action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }).setTitle("AlertDialogExample").create().show();
            }
        });
    }

    private void RadioButtonExample() {

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = group.getCheckedRadioButtonId();
                RadioButton genderRadioButton = findViewById(selectedId);
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, genderRadioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
