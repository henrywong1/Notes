package com.example.henry.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editNote extends AppCompatActivity {

    EditText editText;
    Button saveButton;

    public void onClick(View view) {
        MainActivity.notes.add(editText.getText().toString());
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        saveButton = findViewById(R.id.saveButton);
        editText = findViewById(R.id.editText);



    }
}
