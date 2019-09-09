package br.ufc.crateus.dsdm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import br.ufc.crateus.dsdm.R;
import br.ufc.crateus.dsdm.model.Country;

public class CountriesActivity extends AppCompatActivity {

    private Spinner countrySpin;
    private ImageView flagHolder;
    private TextView countryInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        countrySpin = findViewById(R.id.country_spin);
        flagHolder = findViewById(R.id.country_flag);
        countryInfo = findViewById(R.id.country_info);

        final Country[] countries = Country.getCountries();

        ArrayAdapter<String> aa = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Country.getDisplayNames());
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpin.setAdapter(aa);

        countrySpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position >= 0) {
                    flagHolder.setImageResource(countries[position].getResourceFlag());
                    countryInfo.setText(countries[position].getInfo());
                }
                else flagHolder.setImageResource(R.mipmap.no_flag_icon);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
