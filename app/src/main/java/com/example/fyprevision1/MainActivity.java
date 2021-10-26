package com.example.fyprevision1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button counterBtn;
        Button resetBtn;

        TextView textView;
        count=0;

        textView=findViewById(R.id.message);


        counterBtn = findViewById (R.id.clickBtn);
        resetBtn=findViewById(R.id.resetBtn);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                textView.setText(""+count);
            }

        });


        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count % 100 == 0){
                    Toast.makeText(getApplicationContext(),"Ma Sha ALLAH  you have completed a tasbih !!",Toast.LENGTH_SHORT);
                }
               count++;
               textView.setText("" + count);
            }
        });



    }


}