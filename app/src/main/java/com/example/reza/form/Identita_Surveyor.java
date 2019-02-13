package com.example.reza.form;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Identita_Surveyor extends AppCompatActivity {

    @BindView(R.id.spinnerKabKota)
    Spinner spinnerKabKota;
    @BindView(R.id.etNoTlpn)
    TextView etNoTlpn;
    @BindView(R.id.edNoTlpn)
    EditText edNoTlpn;
    @BindView(R.id.rbYa)
    RadioButton rbYa;
    @BindView(R.id.rbTidak)
    RadioButton rbTidak;
    @BindView(R.id.btnFinish)
    Button btnFinish;
    @BindView(R.id.btnBackIdentitas)
    Button btnBackIdentitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identita__surveyor);
        ButterKnife.bind(this);
    }
}
