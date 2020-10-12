package com.example.intentsimpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txt;
    Button send_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt = findViewById(R.id.txt);
        send_back = (Button) findViewById(R.id.send_back);
        String receive_message = getIntent().getStringExtra("send_message");
        txt.setText(receive_message);
        send_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("send_back","This is send back");
                setResult(RESULT_OK,intent);
                finish();


            }
        });
    }
}