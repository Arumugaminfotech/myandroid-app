package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt2 = findViewById(R.id.textView9);
        Bundle bundle = getIntent().getExtras();
        int x = bundle.getInt("stuff");
        int y = bundle.getInt("s");
        int res= ((x*2)/2)+y;
        txt2.setText(Integer.toString(res));

    }
}
