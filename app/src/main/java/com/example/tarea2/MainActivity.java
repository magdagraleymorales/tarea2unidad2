package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
     EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);

    }


    public void Navegar(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("sitio web", et1.getText().toString());
        startActivity(i);

    }
}