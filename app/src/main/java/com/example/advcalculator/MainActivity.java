package com.example.advcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText result;
    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,sign1,sign2,sign3,sign4,sign5,sign6,sign7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (EditText)findViewById(R.id.result);
        num0=(Button)findViewById(R.id.num0);
        num1=(Button)findViewById(R.id.num1);
        num2=(Button)findViewById(R.id.num2);
        num3=(Button)findViewById(R.id.num3);
        num4=(Button)findViewById(R.id.num4);
        num5=(Button)findViewById(R.id.num5);
        num6=(Button)findViewById(R.id.num6);
        num7=(Button)findViewById(R.id.num7);
        num8=(Button)findViewById(R.id.num8);
        num9=(Button)findViewById(R.id.num9);
        sign1=(Button)findViewById(R.id.sign1);
        sign2=(Button)findViewById(R.id.sign2);
        sign3=(Button)findViewById(R.id.sign3);
        sign4=(Button)findViewById(R.id.sign4);
        sign5=(Button)findViewById(R.id.sign5);
        sign6=(Button)findViewById(R.id.sign6);
        sign7=(Button)findViewById(R.id.sign7);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no0 = "1";
                int n0=Integer.parseInt(no0);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(""+n0);}
                else
                {
                    int a = res*10;
                    result.setText(a);
                }
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1 = num1.getText().toString();
                int n1=Integer.parseInt(no1);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n1);}
                else
                {
                    int a = (res*10)+1;
                    result.setText(a);
                }
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no2 = num2.getText().toString();
                int n2=Integer.parseInt(no2);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n2);}
                else
                {
                    int a = (res*10)+2;
                    result.setText(a);
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no3 = num3.getText().toString();
                int n3=Integer.parseInt(no3);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n3);}
                else
                {
                    int a = (res*10)+3;
                    result.setText(a);
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no4 = num4.getText().toString();
                int n4=Integer.parseInt(no4);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n4);}
                else
                {
                    int a = (res*10)+4;
                    result.setText(a);
                }
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no5 = num5.getText().toString();
                int n5=Integer.parseInt(no5);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n5);}
                else
                {
                    int a = (res*10)+5;
                    result.setText(a);
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no6 = num6.getText().toString();
                int n6=Integer.parseInt(no6);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n6);}
                else
                {
                    int a = (res*10)+6;
                    result.setText(a);
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no7 = num7.getText().toString();
                int n7=Integer.parseInt(no7);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n7);}
                else
                {
                    int a = (res*10)+7;
                    result.setText(a);
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no8 = num8.getText().toString();
                int n8=Integer.parseInt(no8);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n8);}
                else
                {
                    int a = (res*10)+8;
                    result.setText(a);
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no9 = num9.getText().toString();
                int n9=Integer.parseInt(no9);
                String r= result.getText().toString();
                int res=Integer.parseInt(r);
                if(TextUtils.isEmpty(r))
                {result.setText(n9);}
                else
                {
                    int a = (res*10)+9;
                    result.setText(a);
                }
            }
        });

    }
}
