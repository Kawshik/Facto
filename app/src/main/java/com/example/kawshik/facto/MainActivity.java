package com.example.kawshik.facto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        final EditText txt = findViewById(R.id.txt);
        final TextView txtView = findViewById(R.id.txtView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long num, fact = 1;
                int i;

                if(txt.getText().toString().equals("")){
                    fact = 0;
                } else {
                    num = Long.parseLong(txt.getText().toString());
                    for(i=1;i<=num;i++) {
                        fact = fact * i;
                    }
                }

                String res = String.valueOf(fact);
                txtView.setText(res);
            }
        });
    }
}
