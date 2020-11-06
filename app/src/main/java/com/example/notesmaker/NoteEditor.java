package com.example.notesmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;

public class NoteEditor extends AppCompatActivity {
    Toolbar toolbar;
    EditText noteTitle,noteDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);
        toolbar=findViewById(R.id.toolbar2);
        noteTitle=findViewById(R.id.editTextTitle);
        noteDetails=findViewById(R.id.editTextNote);
        setSupportActionBar(toolbar);
    }
}