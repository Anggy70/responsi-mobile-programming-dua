package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CrudDataBase extends AppCompatActivity implements View.OnClickListener {
    EditText inputText;
    TextView tampilText;
    Button btnTampil, btnReset, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_data_base);
        inputText = (EditText) findViewById(R.id.editText);
        tampilText = (TextView) findViewById(R.id.textView);
        btnTampil = (Button) findViewById(R.id.btnTampil);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnTampil.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnTampil:
                tampilText.setText(inputText.getText().toString());
                break;
            case R.id.btnReset:
                tampilText.setText("");
                inputText.setText("");
                break;
            case R.id.btnExit:
                finish();
                break;
        }
    }
}