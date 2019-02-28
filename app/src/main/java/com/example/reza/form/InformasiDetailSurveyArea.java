package com.example.reza.form;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InformasiDetailSurveyArea extends AppCompatActivity {


    //TODO CHECKBOX GROUP
     CheckBox CBAjenisPro, CBBjenisPro, CBCjenisPro,
              CBAklartipe, CBBklartipe, CBCklartipe, CBDklartipe, CBEklartipe, CBFklartipe;

    //TODO BUTTON GROUP
     Button btnNDS, btnBDS;

    //TODO STRING GROUP
     String s_cbajenispro, s_cbbjenispro, s_cbcjenispro,
            s_aklartipe, s_bklartipe, s_cklartipe, s_dklartipe, s_eklartipe, s_fklartipe;



    @BindView(R.id.cbAjenisPro)
    CheckBox cbAjenisPro;
    @BindView(R.id.cbBjenisPro)
    CheckBox cbBjenisPro;
    @BindView(R.id.cbCjenisPro)
    CheckBox cbCjenisPro;
    @BindView(R.id.cbAKlarifikasiTipe)
    CheckBox cbAKlarifikasiTipe;
    @BindView(R.id.cbBKlarifikasiTipe)
    CheckBox cbBKlarifikasiTipe;
    @BindView(R.id.cbCKlarifikasiTipe)
    CheckBox cbCKlarifikasiTipe;
    @BindView(R.id.cbDKlarifikasiTipe)
    CheckBox cbDKlarifikasiTipe;
    @BindView(R.id.cbEKlarifikasiTipe)
    CheckBox cbEKlarifikasiTipe;
    @BindView(R.id.cbFKlarifikasiTipe)
    CheckBox cbFKlarifikasiTipe;
    @BindView(R.id.rbMobilMotor)
    RadioButton rbMobilMotor;
    @BindView(R.id.rbMotor)
    RadioButton rbMotor;
    @BindView(R.id.cbAMetode)
    CheckBox cbAMetode;
    @BindView(R.id.cbBMetode)
    CheckBox cbBMetode;
    @BindView(R.id.cbCMetode)
    CheckBox cbCMetode;
    @BindView(R.id.cbDMetode)
    CheckBox cbDMetode;
    @BindView(R.id.edMetode)
    EditText edMetode;
    @BindView(R.id.etAkses)
    TextView etAkses;
    @BindView(R.id.cbAAkses)
    CheckBox cbAAkses;
    @BindView(R.id.cbBAkses)
    CheckBox cbBAkses;
    @BindView(R.id.cbCAkses)
    CheckBox cbCAkses;
    @BindView(R.id.cbDAkses)
    CheckBox cbDAkses;
    @BindView(R.id.edAkses)
    EditText edAkses;
    @BindView(R.id.etkompetitor)
    TextView etkompetitor;
    @BindView(R.id.cbAkompetitor)
    CheckBox cbAkompetitor;
    @BindView(R.id.cbBkompetitor)
    CheckBox cbBkompetitor;
    @BindView(R.id.cbCkompetitor)
    CheckBox cbCkompetitor;
    @BindView(R.id.cbDkompetitor)
    CheckBox cbDkompetitor;
    @BindView(R.id.cbEkompetitor)
    CheckBox cbEkompetitor;
    @BindView(R.id.cbFKompetitor)
    CheckBox cbFKompetitor;
    @BindView(R.id.edkompetitor)
    EditText edkompetitor;
    @BindView(R.id.cbAMayoritas)
    CheckBox cbAMayoritas;
    @BindView(R.id.cbBMayoritas)
    CheckBox cbBMayoritas;
    @BindView(R.id.cbCMayoritas)
    CheckBox cbCMayoritas;
    @BindView(R.id.cbDMayoritas)
    CheckBox cbDMayoritas;
    @BindView(R.id.cbEMayoritas)
    CheckBox cbEMayoritas;
    @BindView(R.id.cbFMayoritas)
    CheckBox cbFMayoritas;
    @BindView(R.id.edMayoritas)
    EditText edMayoritas;
    @BindView(R.id.edRata2BiayaInternet)
    EditText edRata2BiayaInternet;
    @BindView(R.id.btnNextDetailSurvey)
    Button btnNextDetailSurvey;
    @BindView(R.id.btnBackDetailSurvey)
    Button btnBackDetailSurvey;
    @BindView(R.id.scrollKab)
    ScrollView scrollKab;
    @BindView(R.id.etMayoritasKendaraan)
    TextView etMayoritasKendaraan;
    @BindView(R.id.etMetodePembangunan)
    TextView etMetodePembangunan;
    @BindView(R.id.etMayoritasProvider)
    TextView etMayoritasProvider;
    RadioGroup Radiogroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_detail_survey_area);
        ButterKnife.bind(this);


        //TODO RADIO GROUP
        Radiogroup = findViewById(R.id.Radiogroup1);

        //TODO CHECKBOX JENIS PROPERTI
        CBAjenisPro =  findViewById(R.id.cbAjenisPro);
        CBBjenisPro =  findViewById(R.id.cbBjenisPro);
        CBCjenisPro =  findViewById(R.id.cbCjenisPro);

        //TODO KLARIFIKASI TIPE
        CBAklartipe =  findViewById(R.id.cbAKlarifikasiTipe);
        CBBklartipe =  findViewById(R.id.cbBKlarifikasiTipe);
        CBCklartipe =  findViewById(R.id.cbCKlarifikasiTipe);
        CBDklartipe =  findViewById(R.id.cbDKlarifikasiTipe);
        CBEklartipe =  findViewById(R.id.cbEKlarifikasiTipe);
        CBFklartipe =  findViewById(R.id.cbFKlarifikasiTipe);

        //TODO BUTTON
        btnNDS =  findViewById(R.id.btnNextDetailSurvey);
        btnBDS =  findViewById(R.id.btnBackDetailSurvey);



    //TODO STRING JENIS PROPERTI
        s_cbajenispro="";
        s_cbbjenispro="";
        s_cbcjenispro="";


    //TODO STRING KLARIFIKASI TIPE
        s_aklartipe="";
        s_bklartipe="";
        s_cklartipe="";
        s_dklartipe="";
        s_eklartipe="";
        s_fklartipe="";


        //TODO CHECKBOX JENIS PROPERTI
        if (CBAjenisPro.isChecked()){
            s_cbajenispro=CBAjenisPro.getText().toString();
        } else {
            s_cbajenispro="";
        }

        if (CBBjenisPro.isChecked()){
            s_cbbjenispro=CBBjenisPro.getText().toString();
        } else {
            s_cbbjenispro="";
        }

        if (CBCjenisPro.isChecked()){
            s_cbcjenispro=CBCjenisPro.getText().toString();
        } else {
            s_cbcjenispro="";
        }


        //TODO CHECKBOX KLARIFIKASI TIPE
        if (CBAklartipe.isChecked()){
            s_aklartipe=CBAklartipe.getText().toString();
        } else {
            s_aklartipe="";
        }

        if (CBBklartipe.isChecked()){
            s_bklartipe=CBBklartipe.getText().toString();
        } else {
            s_bklartipe="";
        }

        if (CBCklartipe.isChecked()){
            s_cklartipe=CBCklartipe.getText().toString();
        } else {
            s_cklartipe="";
        }

        if (CBDklartipe.isChecked()){
            s_dklartipe=CBDklartipe.getText().toString();
        } else {
            s_dklartipe="";
        }

        if (CBEklartipe.isChecked()){
            s_eklartipe=CBEklartipe.getText().toString();
        } else {
            s_eklartipe="";
        }

        if (CBFklartipe.isChecked()){
            s_fklartipe=CBFklartipe.getText().toString();
        } else {
            s_fklartipe="";
        }


        //TODO BUTTON NEXT
        btnNDS.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (!CBAjenisPro.isChecked() && !CBBjenisPro.isChecked() && !CBCjenisPro.isChecked()){

                    CBAjenisPro.setError("isi data");
                    CBBjenisPro.setError("isi data");
                    CBCjenisPro.setError("isi data");

                    Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();

                if (!CBAklartipe.isChecked() && !CBBklartipe.isChecked() && !CBCklartipe.isChecked() && !CBDklartipe.isChecked() && !CBEklartipe.isChecked() && !CBFklartipe.isChecked())

                    CBAklartipe.setError("isi data");
                    CBBklartipe.setError("isi data");
                    CBCklartipe.setError("isi data");
                    CBDklartipe.setError("isi data");
                    CBEklartipe.setError("isi data");
                    CBFklartipe.setError("isi data");

                    Toast.makeText(InformasiDetailSurveyArea.this, "Isi data", Toast.LENGTH_SHORT).show();

                    if (TextUtils.isEmpty(edRata2BiayaInternet.getText())) {
                        edRata2BiayaInternet.setError("Harus Diisi");
                    }

                    if (Radiogroup.getCheckedRadioButtonId() <= 0) {
                        int radioId = Radiogroup.getCheckedRadioButtonId();
                        radioButton = findViewById(radioId);
                        rbMotor.setError("Select Item");
                    }
                } else {
                    Intent intentnext = new Intent(getApplicationContext(),Identita_Surveyor.class);
                    startActivity(intentnext);
                }
            }

        });


        //TODO BUTTON BACK
        btnBDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentback = new Intent(getApplicationContext(),InfoKabKota.class);
                startActivity(intentback);

            }
        });

    }

}