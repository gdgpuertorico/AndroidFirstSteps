package com.jsosa.ninjaacademy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, cityEditText;
    private Button actionButton;
    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText) findViewById(R.id.name_edit_text);
        cityEditText = (EditText) findViewById(R.id.city_edit_text);
        actionButton = (Button) findViewById(R.id.pass_info_button);
        actionButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Person yo = new Person(nameEditText.getText().toString(), cityEditText.getText().toString());
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("person", yo);
        startActivity(intent);
    }
}
