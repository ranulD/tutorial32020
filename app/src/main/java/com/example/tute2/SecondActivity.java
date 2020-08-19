package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get the Intent that started us to find the parameter (extra).
        Intent intent = getIntent();
        int myValue = intent.getIntExtra(FirstActivity.EXTRA_NUmber, 0);
        int myValue2 = intent.getIntExtra(FirstActivity.EXTRA_NUmber2, 0);
        //display the value to the screen.
        TextView displayNumber = (TextView) findViewById(R.id.textView5);
        TextView displaynumber2 = (TextView) findViewById(R.id.textView6);

        displayNumber.setText("" + myValue);
        displaynumber2.setText("" + myValue2);

        txt = (TextView) findViewById(R.id.result);
        bt1 = (Button) findViewById(R.id.plus);
        bt2 = (Button) findViewById(R.id.minus);
        bt3 = (Button) findViewById(R.id.multiply);
        bt4 = (Button) findViewById(R.id.divide);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Get the Intent that started us to find the parameter (extra).
        Intent intent = getIntent();
        int myValuer = intent.getIntExtra(FirstActivity.EXTRA_NUmber, 0);
        int myValuer2 = intent.getIntExtra(FirstActivity.EXTRA_NUmber2, 0);
        //display the value to the screen.
        TextView displayNumberr = (TextView) findViewById(R.id.result);


        switch (v.getId()) {
            case R.id.plus:
                int sum = myValuer + myValuer2;
                displayNumberr.setText( ("\t" + myValuer + "\t+" + "\t" +myValuer2 + "\t=" + sum));
                break;
            case R.id.minus:
                int tot = myValuer - myValuer2;
                displayNumberr.setText( ("\t" + myValuer + "\t-" + "\t" +myValuer2 + "\t=" + tot));
                break;
            case R.id.multiply:
                int tot1 = myValuer * myValuer2;
                displayNumberr.setText( ("\t" + myValuer + "\t*" + "\t" +myValuer2 + "\t=" + tot1));
                break;
            case R.id.divide:
                int tot2 = myValuer / myValuer2;
                displayNumberr.setText( ("\t" + myValuer + "\t/" + "\t" +myValuer2 + "\t=" + tot2));
                break;
        }

    }

}
