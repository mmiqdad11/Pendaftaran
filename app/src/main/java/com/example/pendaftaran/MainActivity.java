package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePickerDialog dtpick;
    EditText edtxt;
    TextView txvw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt=(EditText) findViewById(R.id.tgllhr);
        edtxt.setInputType(InputType.TYPE_NULL);
        edtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar klndr = Calendar.getInstance();
                int day = klndr.get(Calendar.DAY_OF_MONTH);
                int month = klndr.get(Calendar.MONTH);
                int year = klndr.get(Calendar.YEAR);
                dtpick = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                edtxt.setText(dayOfMonth + (monthOfYear + 1) + year);
                            }
                        }, year, month, day);
                dtpick.show();

            }
        });
        edtxt = (EditText) findViewById(R.id.pass);
        edtxt.setTransformationMethod(null);
        edtxt = (EditText) findViewById(R.id.ckpass);
        edtxt.setTransformationMethod(null);




    }
}
