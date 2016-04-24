package com.jsosa.ninjaacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView name, city;

    public final static String ARG_NAME = "info.name";
    public final static String ARG_CITY = "info.city";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = (TextView) findViewById(R.id.name_text_view);
        city = (TextView) findViewById(R.id.city_text_view);

        //way 1
//        name.setText(getIntent().getStringExtra(ARG_NAME));
//        city.setText(getIntent().getStringExtra(ARG_CITY));

        //way 2
//        Person yo = (Person) getIntent().getSerializableExtra("person");
//        name.setText(yo.name);
//        city.setText(yo.city);

        //way 3
        Person yo = getIntent().getParcelableExtra("person");
        name.setText(yo.name);
        city.setText(yo.city);

    }
}
