package com.example.sc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;

public class MainActivity extends AppCompatActivity {
TextView number,number2;
Button zero,brc,plus,minus,one,two,three,four,five,six,seven,eight,night,c,dot,eual,mul,per,div;
String process;
    boolean check=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(TextView)findViewById(R.id.tn1);
        number2=(TextView)findViewById(R.id.tn2);
        c=(Button)findViewById(R.id.c);
        zero=(Button)findViewById(R.id.z1);
        brc=(Button)findViewById(R.id.brc);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        mul=(Button)findViewById(R.id.mul);
        per=(Button)findViewById(R.id.per);
        one=(Button)findViewById(R.id.n1);
        two=(Button)findViewById(R.id.n2);
        three=(Button)findViewById(R.id.n3);
        four=(Button)findViewById(R.id.n4);
        five=(Button)findViewById(R.id.n5);
        six=(Button)findViewById(R.id.n6);
        seven=(Button)findViewById(R.id.n7);
        eight=(Button)findViewById(R.id.n8);
        night=(Button)findViewById(R.id.n9);
        dot=(Button)findViewById(R.id.dot);
        eual=(Button)findViewById(R.id.ans);
        div=(Button)findViewById(R.id.dived);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("");
                number2.setText("");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process= number.getText().toString();
                number.setText(process+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"8");
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"X");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"÷");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+".");
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                number.setText(process+"%");
            }
        });
        brc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(check)
              {
                  process= number.getText().toString();
                  number.setText(process+")");
                  check=false;
              }
              else
              {
                  process= number.getText().toString();
                  number.setText(process+"(");
                  check=true;

              }
            }
        });
        eual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process= number.getText().toString();
                process=process.replace("X","*");
                process=process.replace("%","/100");
                Context ra=Context.enter();
                ra.setOptimizationLevel(-1);
                String finalans="";
                try {
                    Scriptable scriptable=ra.initStandardObjects();
                    finalans=ra.evaluateString(scriptable,process,"javascript",1,null).toString();
                }
                catch (Exception e)
                {
                   finalans="0";
                }
                number2.setText(finalans);
            }
        });



    }
}