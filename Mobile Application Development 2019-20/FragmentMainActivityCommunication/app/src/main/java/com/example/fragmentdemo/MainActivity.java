package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements BottomFragment.SendInfo{

    Button replaceButton;
    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceButton = findViewById(R.id.button);

        fragmentManager = getSupportFragmentManager();

        //Begin first transaction
        fragmentTransaction = fragmentManager.beginTransaction();

        //Create bottom fragment and add to layout on bottom of XML
        BottomFragment bottomFragment = new BottomFragment();
        fragmentTransaction.add(R.id.id_bottom, bottomFragment);

        //commit the transaction (end)
        fragmentTransaction.commit();


    }

    @Override
    public void update(String str) {
        replaceButton.setText(str);
    }
}
