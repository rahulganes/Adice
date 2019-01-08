package com.adice.rahul.adice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private Button equal;
    private Button point;
    private TextView info;
    private TextView result;
    private final char Addition = '+';
    private final char Subtraction = '-';
    private final char Multiplication = '*';
    private final char Division = '/';
    private final char Equal = '=';
    private double val1 = Double.NaN;
    private double val2;
    private double ans = Double.NaN;
    private char Action;
    private char prevAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adice();
                Action = Addition;
                result.setText(String.valueOf(val1)+" + ");
                info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adice();
                Action = Subtraction;
                result.setText(String.valueOf(val1)+" - ");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adice();
                Action = Multiplication;
                result.setText(String.valueOf(val1)+" * ");
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adice();
                Action = Division;
                result.setText(String.valueOf(val1)+" / ");
                info.setText(null);
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+".");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0)
                {
                    adice();
                    prevAction = Action;
                    Action = Equal;
                    result.setText(String.valueOf(val1)+" "+String.valueOf(prevAction)+" "+String.valueOf(val2)+" = "+String.valueOf(ans));
                    info.setText(null);
                }
                else
                {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0)
                {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
    }

    private void setupUIViews()
    {
        one = (Button)findViewById(R.id.b1);
        two = (Button)findViewById(R.id.b2);
        three = (Button)findViewById(R.id.b3);
        four = (Button)findViewById(R.id.b4);
        five = (Button)findViewById(R.id.b5);
        six = (Button)findViewById(R.id.b6);
        seven = (Button)findViewById(R.id.b7);
        eight = (Button)findViewById(R.id.b8);
        nine = (Button)findViewById(R.id.b9);
        zero = (Button)findViewById(R.id.b0);
        add = (Button)findViewById(R.id.badd);
        sub = (Button)findViewById(R.id.bsub);
        mul = (Button)findViewById(R.id.bmul);
        div = (Button)findViewById(R.id.bdiv);
        clear  = (Button)findViewById(R.id.bclear);
        equal = (Button)findViewById(R.id.beq);
        point = (Button)findViewById(R.id.bpoint);
        info = (TextView)findViewById(R.id.control);
        result = (TextView)findViewById(R.id.result);
    }

    private void adice()
    {
        if(!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(info.getText().toString());

            switch(Action)
            {
                case Addition:
                    ans = val1+val2;
                    break;
                case Subtraction:
                    ans = val1-val2;
                    break;
                case Multiplication:
                    ans = val1*val2;
                    break;
                case Division:
                    ans = val1/val2;
                    break;
                case Equal:
                    break;
            }
        }
        else
        {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}
