package com.example.applicationb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class PageThree extends AppCompatActivity {

    int angka1;
    int angka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_three);
        setNumbers();

        Intent pageThree = getIntent();
    }

    public void mainAct(View view) {
        Intent mainAct = new Intent(this, MainActivity.class);
        startActivity(mainAct);
    }

    public void pageTwo(View view) {
        Intent pageTwo = new Intent(this, PageTwo.class);
        startActivity(pageTwo);
    }

    public void Submit (View view) {
        TextView Hasil = findViewById(R.id.Hasil);
        EditText Answer = findViewById(R.id.Answer);
        int Jawaban = Integer.parseInt(Answer.getText().toString());
        if (Jawaban == angka1+angka2) {
            Hasil.setText("Kamu benar!");
        }
        else {
            Hasil.setText("Kamu salah. Jawaban yang benar adalah " + (angka1+angka2) + ".");
        }
        setNumbers();
    }

    private void setNumbers() {
        Random r = new Random();
        angka1 = r.nextInt(999);
        angka2 = r.nextInt(999);
        TextView Number1 = findViewById(R.id.Number1);
        Number1.setText("" + angka1);
        TextView Number2 = findViewById(R.id.Number2);
        Number2.setText("" + angka2);
        EditText Answer = findViewById(R.id.Answer);
        Answer.setText("");
    }
}