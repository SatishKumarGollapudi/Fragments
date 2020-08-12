package com.greengold.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fragment firstFragment = new FirstFragment();
        final Fragment secondFragment = new SecondFragment();

        Button fragmentButton1 = (Button) findViewById(R.id.btnFragment1);
        Button fragmentButton2 = (Button) findViewById(R.id.btnFragment2);
        fragmentButton1.

                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.add(R.id.flFragment,firstFragment)
                        ft.replace(R.id.flFragment, firstFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }

                });

        fragmentButton2.

                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.flFragment, secondFragment);
                        ft.addToBackStack(null);
                        ft.commit();
                    }

                });
    }

}
