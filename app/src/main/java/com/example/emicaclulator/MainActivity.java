package com.example.emicaclulator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
   TextInputEditText textedit1, textedit2, textedit3;

    Button btnCALULATE;

    TextView txtans, txt2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textedit1 = findViewById(R.id.textedit1);
        textedit2 = findViewById(R.id.textedit2);
        textedit3 = findViewById(R.id.textedit3);
        txtans = findViewById(R.id.txtans);
        txt2= findViewById(R.id.txt2);
        btnCALULATE= findViewById(R.id.btnCALULATE);

        btnCALULATE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double P = Integer.parseInt(textedit1.getText().toString());
                double intre = Integer.parseInt(textedit3.getText().toString());
                double loan = Integer.parseInt(textedit3.getText().toString());
                double ans;

                ans = P * intre %;
                txtans.setText(new DecimalFormat().format(ans));


            }
        });

    }
}