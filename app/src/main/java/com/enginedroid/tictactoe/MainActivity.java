package com.enginedroid.tictactoe;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0, count=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void Check(View view){
        Button btnCurrent = (Button) view;
        boolean win = false;

        if(btnCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    makeText(this, b1 + " is won!", LENGTH_SHORT).show();

                    win = true;
                    Disable();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    makeText(this, b4 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    makeText(this, b7 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    makeText(this, b1 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    makeText(this, b2 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    makeText(this, b3 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    makeText(this, b1 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    makeText(this, b3 + " is won!", LENGTH_SHORT).show();
                    win = true;
                    Disable();
                }
            }
            if (count == 9 && !win) {
                Toast.makeText(getApplicationContext(), "Match Draw", LENGTH_SHORT).show();
                Disable();
            }
        }
    }

    public void Disable(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        new Handler().postDelayed(this::Clear, 1500);
    }
    public void Clear(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
    }
}