package com.example.ss.autocompleteexamples;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends Activity {

    AutoCompleteTextView tvCountry;
    MultiAutoCompleteTextView tvCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCountry = (AutoCompleteTextView)findViewById(R.id.autocomplete_country);
        tvCity = (MultiAutoCompleteTextView)findViewById(R.id.autocomplete_city);

        String[] countries = getResources().getStringArray(R.array.countries);
        String[] cities = getResources().getStringArray(R.array.cities);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this, R.layout.item, countries);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this, R.layout.item, cities);

        tvCountry.setAdapter(countryAdapter);
        tvCity.setAdapter(cityAdapter);
        tvCity.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
