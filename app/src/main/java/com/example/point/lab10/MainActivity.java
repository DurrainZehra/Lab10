package com.example.point.lab10;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MyFragment1 myFragment1;
    MyFragment2 myFragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFragment1 = new MyFragment1();
        myFragment2 = new MyFragment2();
        fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.MainContainer,myFragment1);
        fragmentTransaction.commit();


        Button btn1 = (Button) findViewById(R.id.Frag1);

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                        fragmentTransaction.replace(R.id.MainContainer,myFragment1);
                                        fragmentTransaction.commit();
                                    }
                                });


        Button btn2 = (Button) findViewById(R.id.Frag2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.MainContainer,myFragment2);

                fragmentTransaction.commit();
            }
        });
    }
}