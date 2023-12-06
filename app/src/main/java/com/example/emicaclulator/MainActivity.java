package com.example.emicaclulator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.security.Principal;
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
                int amt = Integer.parseInt(textedit1.getText().toString());

                double rest =  Double.parseDouble(textedit2.getText().toString());
                int mon = Integer.parseInt(textedit3.getText().toString());

                double r = rest/(12+100);
                double ans1 = 1;

                for (int i = 0; i <mon; i++) {
                    ans1 = (1+r);
                }

                double ans = amt * r  * (ans1/(ans1-1));
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits (1);
                txtans.setText("EMI "+df.format(ans));
                double tamt = ans*mon;
                txt2.setText("Total Amount : "+df.format(tamt));
                double iamt = tamt-amt;
                btnCALULATE.setText("Instrest Amount : "+df.format(iamt));


            }
        });

    }
}