package com.example.applicationb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mainAct = getIntent();

        button = (Button) findViewById(R.id.implicit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Test");
                sendIntent.setType("");
                startActivity(sendIntent);
            }
        });
    }

    public void pageTwo(View view) {
        Intent pageTwo = new Intent(this, PageTwo.class);
        startActivity(pageTwo);
    }

    public void pageThree(View view) {
        Intent pageThree = new Intent(this, PageThree.class);
        startActivity(pageThree);
    }
}