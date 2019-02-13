package com.example.reza.form;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoKabKota extends AppCompatActivity {

    @BindView(R.id.spinnerKabKota)
    Spinner spinnerKabKota;
    @BindView(R.id.etKecamatan)
    TextView etKecamatan;
    @BindView(R.id.edKecamtan)
    EditText edKecamtan;
    @BindView(R.id.edKelurahan)
    EditText edKelurahan;
    @BindView(R.id.edKompleks)
    EditText edKompleks;
    @BindView(R.id.edDeveloper)
    EditText edDeveloper;
    @BindView(R.id.btnNextKab)
    Button btnNextKab;
    @BindView(R.id.btnBackKab)
    Button btnBackKab;
    @BindView(R.id.scrollKab)
    ScrollView scrollKab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_kab_kota);
        ButterKnife.bind(this);
    }
}
