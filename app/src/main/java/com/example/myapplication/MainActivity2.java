package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowInsetsAnimation;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    Button btn;
    Button button;
    TextView txt1;
    public  int val;
    public int val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = findViewById(R.id.textView5);
        txt1 = findViewById(R.id.textView8);


        Random random = new Random();
        val = random.nextInt(15-1)+1;
        txt.setText(Integer.toString(val*2));

        btn= (Button) findViewById(R.id.button3);
        Intent refresh = new Intent(this, MainActivity2.class);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(refresh);
            }
        });


        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        Random random1 = new Random();
        val1 = random1.nextInt(8-1)+1;
        txt1.setText(Integer.toString(val1));



    }
    public void openNewActivity(){
        Intent intent = new Intent(this, MainActivity3.class);
        Bundle bundle = new Bundle();
        bundle.putInt("stuff",val);
        bundle.putInt("s",val1);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}