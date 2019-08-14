package com.example.parsingdatapojo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityMoveWithObject extends AppCompatActivity {

    public static String EXTRA_PERSON = " extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Nama Anda : "+ mPerson.getNama() + "\nEmail :"+
        mPerson.getEmail() + "\nUmur : " + mPerson.getAge() + "\nTempat : "
        + mPerson.getCity();
        tvObject.setText(text);
    }
}
