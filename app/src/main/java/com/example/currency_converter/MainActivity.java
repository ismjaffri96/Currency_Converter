package com.example.currency_converter;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import android.widget.Toast;

import com.example.currency_converter.R;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();
        int currency = Integer.parseInt(str);
        currency = currency * 7;
        goToActivity2(currency);

    }

    public void goToActivity2(int s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", String.valueOf(s));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
