package com.example.henry.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editNote extends AppCompatActivity {

    EditText editText;
    int noteNum;

    public void onClick(View view) {
        if (MainActivity.notes.size() == 0) {
            MainActivity.notes.add(editText.getText().toString());
        } else {
            MainActivity.notes.set(noteNum, editText.getText().toString());
        }
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        editText = findViewById(R.id.editText);

        Intent intent = getIntent();
        noteNum = intent.getIntExtra("note", -1);

        if (MainActivity.notes.size() > 0) {
            Log.i("Note Says", MainActivity.notes.get(noteNum));
            editText.setText(MainActivity.notes.get(noteNum));
            MainActivity.notes.set(noteNum, editText.getText().toString());

        }


    }
}
