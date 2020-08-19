package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.view.Menu;

public class FirstActivity extends AppCompatActivity {
    //    private Button button;
//    String myString = "You just clicked the OK button";
    public static final String EXTRA_NUmber = "com.example.intentsproj.EXTRA_NUMBER";
    public static final String EXTRA_NUmber2 = "com.example.intentsproj.EXTRA_NUMBER2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        openActivity2();

    }


    public void openActivity2() {
        Button Btn = (Button) findViewById(R.id.ok);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userTextEntry = (EditText) findViewById(R.id.editText3);

                int number = Integer.parseInt(userTextEntry.getText().toString());

                EditText userTextEntry2 = (EditText) findViewById(R.id.editText5);
                int number2 = Integer.parseInt(userTextEntry2.getText().toString());

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_NUmber, number);
                intent.putExtra(EXTRA_NUmber2, number2);
                startActivity(intent);

                showtoast();

            }
            public void showtoast() {
//                   A normal toast
//                   Toast toast = Toast.makeText(FirstActivity.this, "You just clicked the OK button", Toast.LENGTH_SHORT);
//                   toast.setGravity(Gravity.TOP | Gravity.LEFT, 200, 2000);
//                   toast.show();

//                   Custom toast as in Tutorial 2
//                   Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
//                   Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                // Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 1500);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();
            }

        });
    }
}