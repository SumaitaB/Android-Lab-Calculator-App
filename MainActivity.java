package com.example.generalcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button btndel, btnanswer, btnac, btnzero, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndiv, btnmul, btnmin, btnplus, btndot, btnpercent;
    EditText editText1, edtIn;

    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        casting
        btnzero = findViewById(R.id.btnzero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btndel = findViewById(R.id.btndel);
        btnanswer = findViewById(R.id.btnanswer);
        btnac = findViewById(R.id.btnac);
        btnmin = findViewById(R.id.btnmin);
        btndiv = findViewById(R.id.btndiv);
        btnplus = findViewById(R.id.btnplus);
        btnmul = findViewById(R.id.btnmul);
        btndot = findViewById(R.id.btndot);
        btnpercent = findViewById(R.id.btnpercent);

        edtIn = findViewById(R.id.editText1);

//--------        action set to buttons       -------//

        btnzero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtIn.setText(edtIn.getText()+".");
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText("");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtIn == null)
                {
                    edtIn.setText("");
                }
                else{
                    mValueOne = Float.parseFloat(edtIn.getText()+"");
                    Addition = true;
                    edtIn.setText(null);
                }
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Subtract=true;
                edtIn.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Multiplication=true;
                edtIn.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtIn.getText()+"");
                Division=true;
                edtIn.setText(null);
            }
        });
        btnanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edtIn.getText()+"");

//              logic for calculation
                if(Addition == true)
                {
                    edtIn.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if(Subtract == true )
                {
                    edtIn.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if(Multiplication ==  true)
                {
                    edtIn.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if(Division ==  true)
                {
                    edtIn.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

    }
}