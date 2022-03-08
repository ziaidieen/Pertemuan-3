package com.example.applicationb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);

        Intent pageTwo = getIntent();
    }

    public void mainAct(View view) {
        Intent mainAct = new Intent(this, MainActivity.class);
        startActivity(mainAct);
    }

    public void pageThree(View view) {
        Intent pageThree = new Intent(this, PageThree.class);
        startActivity(pageThree);
    }
}