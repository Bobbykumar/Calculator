package com.example.bobby.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0,btdecimal, btadd, btmul, btdiv, btsub, btequal,btclear;

    EditText editText;

    float value1, value2;
    boolean mAdd, mMul, mDiv, mSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0=findViewById(R.id.btn_0);
        bt1=findViewById(R.id.btn_1);
        bt2=findViewById(R.id.btn_2);
        bt3=findViewById(R.id.btn_3);
        bt4=findViewById(R.id.btn_4);
        bt5=findViewById(R.id.btn_5);
        bt6=findViewById(R.id.btn_6);
        bt7=findViewById(R.id.btn_7);
        bt8=findViewById(R.id.btn_8);
        bt9=findViewById(R.id.btn_9);
        btdecimal=findViewById(R.id.btn_dec);
        btadd=findViewById(R.id.btn_Add);
        btsub=findViewById(R.id.btn_Sub);
        btmul=findViewById(R.id.btn_Mul);
        btdiv=findViewById(R.id.btn_Div);
        btclear=findViewById(R.id.btn_clear);
        btequal=findViewById(R.id.btn_calc);
        editText=findViewById(R.id.edText1);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });

        btdecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");

                } else {
                    value1 = Float.parseFloat(editText.getText() + "");
                    mAdd = true;
                    editText.setText(null);
                }

            }
        });


        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                mSub=true;
                editText.setText(null);
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                mDiv=true;
                editText.setText(null);
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+"");
                mMul=true;
                editText.setText(null);
            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2=Float.parseFloat(editText.getText()+"");

                if (mAdd==true){
                    editText.setText(value1+value2+"");
                    mAdd=false;
                }

                if (mSub==true){
                    editText.setText(value1-value2+"");
                    mSub=false;
                }

                if (mMul==true){
                    editText.setText(value1*value2+"");
                    mMul=false;
                }
                if (mDiv==true){
                    editText.setText(value1/value2+"");
                    mDiv=false;
                }
            }
        });

        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
    }
}
