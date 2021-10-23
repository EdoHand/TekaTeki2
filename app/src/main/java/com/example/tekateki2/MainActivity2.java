package com.example.tekateki2;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2main);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);

    }
    public void onRadioButton(View view) {

        Boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    tampilDialog();
                break;

            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }


    }

    //menampilkan dialog
    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!!");
        builder.setMessage("Jawaban kamu benar : Real Marid");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity2.this, "Selamat", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();

    }
    //menampilkan toast text jawaban salah
    public void jawabanSalah(){

        Toast.makeText(this, "Jawaban kamu Salah", Toast.LENGTH_SHORT).show();

    }
}
//        shuffleArray(keys);
//        for (int i = 0; i < keys.length; i++) {
//            System.out.println(keys[i] + " ");
//        }
//
//        if (textAnswer != keys; textAnswer ){
//            System.out.println();
//        }
//
//        keys = shuffleArray(keys);

//    private static int[] shuffleArray(int[] keys) {
//        Random rnd = new Random();
//        for (int i = keys.length - 1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
//            int a = keys[index];
//            keys[index] = keys[i];
//            keys[i] = a;
//        }
//        return keys;
//    }