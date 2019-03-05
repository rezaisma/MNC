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
              CBAklartipe, CBBklartipe, CBCklartipe, CBDklartipe, CBEklartipe, CBFklartipe,
              CBAMetod, CBBMetod, CBCMetod, CBDMetod,
              CBAAkses, CBBAkses, CBCAkses, CBDAkses,
              CBAKom, CBBKom, CBCKom, CBDKom, CBEKom, CBFKom,
              CBAPro, CBBPro, CBCPro, CBDPro, CBEPro, CBFPro;

    //TODO BUTTON GROUP
     Button btnNDS, btnBDS;

    //TODO STRING GROUP
     String s_cbajenispro, s_cbbjenispro, s_cbcjenispro,
            s_aklartipe, s_bklartipe, s_cklartipe, s_dklartipe, s_eklartipe, s_fklartipe,
            s_cbametode, s_cbbmetode, s_cbcmetode, s_cbdmetode,
            s_cbaakses, s_cbbakses, s_cbcakses, s_cbdakses,
            s_cbakom, s_cbbkom, s_cbckom, s_cbdkom, s_cbekom, s_cbfkom,
            s_cbapro, s_cbbpro, s_cbcpro, s_cbdpro, s_cbepro, s_cbfpro;



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

        //TODO METODE PEMBANGUNAN
        CBAMetod = findViewById(R.id.cbAMetode);
        CBBMetod = findViewById(R.id.cbBMetode);
        CBCMetod = findViewById(R.id.cbCMetode);
        CBDMetod = findViewById(R.id.cbDMetode);

        //TODO AKSES PENJUALAN
        CBAAkses = findViewById(R.id.cbAAkses);
        CBBAkses = findViewById(R.id.cbBAkses);
        CBCAkses = findViewById(R.id.cbCAkses);
        CBDAkses = findViewById(R.id.cbDAkses);

        //TODO KOMPETITOR
        CBAKom = findViewById(R.id.cbAkompetitor);
        CBBKom = findViewById(R.id.cbBkompetitor);
        CBCKom = findViewById(R.id.cbCkompetitor);
        CBDKom = findViewById(R.id.cbDkompetitor);
        CBEKom = findViewById(R.id.cbEkompetitor);
        CBFKom = findViewById(R.id.cbFKompetitor);

        //TODO MAYORITAS PROVIDER
        CBAPro = findViewById(R.id.cbAMayoritas);
        CBBPro = findViewById(R.id.cbBMayoritas);
        CBCPro = findViewById(R.id.cbCMayoritas);
        CBDPro = findViewById(R.id.cbDMayoritas);
        CBEPro = findViewById(R.id.cbEMayoritas);
        CBFPro = findViewById(R.id.cbFMayoritas);



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


            //TODO STRING METODE PEMBANGUNAN
            s_cbametode="";
            s_cbbmetode="";
            s_cbcmetode="";
            s_cbdmetode="";


            //TODO STRING AKSES PENJUALAN
            s_cbaakses="";
            s_cbbakses="";
            s_cbcakses="";
            s_cbdakses="";

            //TODO KOMPETITOR
            s_cbakom="";
            s_cbbkom="";
            s_cbckom="";
            s_cbdkom="";
            s_cbekom="";
            s_cbfkom="";

            //TODO MAYORITAS PROVIDER
            s_cbapro="";
            s_cbbpro="";
            s_cbcpro="";
            s_cbdpro="";
            s_cbepro="";
            s_cbfpro="";


        //TODO CHECKBOX JENIS PROPERTI
        if (CBAjenisPro.isChecked()){
            s_cbajenispro=CBAjenisPro.getText().toString();
            Toast.makeText(this, "Rumah Tinggal/Open Area", Toast.LENGTH_SHORT).show();
        } else {
            s_cbajenispro="";
        }

        if (CBBjenisPro.isChecked()){
            s_cbbjenispro=CBBjenisPro.getText().toString();
            Toast.makeText(this, "Rumah Tinggal/Komplek/Cluster", Toast.LENGTH_SHORT).show();
        } else {
            s_cbbjenispro="";
        }

        if (CBCjenisPro.isChecked()){
            s_cbcjenispro=CBCjenisPro.getText().toString();
            Toast.makeText(this, "Ruko/Rukan", Toast.LENGTH_SHORT).show();
        } else {
            s_cbcjenispro="";
        }


        //TODO CHECKBOX KLARIFIKASI TIPE
        if (CBAklartipe.isChecked()){
            s_aklartipe=CBAklartipe.getText().toString();
            Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
            } else {
            s_aklartipe="";
            }

            if (CBBklartipe.isChecked()){
            s_bklartipe=CBBklartipe.getText().toString();
            Toast.makeText(this, "B", Toast.LENGTH_SHORT).show();
            } else {
            s_bklartipe="";
            }

            if (CBCklartipe.isChecked()){
            s_cklartipe=CBCklartipe.getText().toString();
            Toast.makeText(this, "C", Toast.LENGTH_SHORT).show();
            } else {
            s_cklartipe="";
            }

            if (CBDklartipe.isChecked()){
            s_dklartipe=CBDklartipe.getText().toString();
            Toast.makeText(this, "D", Toast.LENGTH_SHORT).show();
            } else {
            s_dklartipe="";
            }

            if (CBEklartipe.isChecked()){
            s_eklartipe=CBEklartipe.getText().toString();
            Toast.makeText(this, "SOHO", Toast.LENGTH_SHORT).show();
            } else {
            s_eklartipe="";
            }

            if (CBFklartipe.isChecked()){
            s_fklartipe=CBFklartipe.getText().toString();
            Toast.makeText(this, "Kontrakan/Kos(KK)", Toast.LENGTH_SHORT).show();
            } else {
            s_fklartipe="";
            }


            //TODO CHECKBOX METODE PEMBANGUNAN
            if (CBAMetod.isChecked()){
            s_cbametode=CBAMetod.getText().toString();
            Toast.makeText(this, "Kabel Udara", Toast.LENGTH_SHORT).show();
            } else {
            s_cbametode="";
            }

            if (CBBMetod.isChecked()){
            s_cbbmetode=CBBMetod.getText().toString();
            Toast.makeText(this, "Underground", Toast.LENGTH_SHORT).show();
            } else {
            s_cbbmetode="";
            }

            if (CBCMetod.isChecked()){
            s_cbcmetode=CBCMetod.getText().toString();
            Toast.makeText(this, "Sewer/Got", Toast.LENGTH_SHORT).show();
            } else {
            s_cbcmetode="";
            }

            if (CBDMetod.isChecked()){
            s_cbdmetode=CBDMetod.getText().toString();
            Toast.makeText(this, "Yang Lain", Toast.LENGTH_SHORT).show();
            } else {
            s_cbdmetode="";
            }


            //TODO CHECKBOX AKSES PENJUALAN
            if (CBAAkses.isChecked()){
            s_cbaakses=CBAAkses.getText().toString();
            Toast.makeText(this, "Door To Door/Direct Mail", Toast.LENGTH_SHORT).show();
            } else {
            s_cbaakses="";
            }

            if (CBBAkses.isChecked()){
            s_cbbakses=CBBAkses.getText().toString();
            Toast.makeText(this, "Open Booth", Toast.LENGTH_SHORT).show();
            } else {
            s_cbbakses="";
            }

            if (CBCAkses.isChecked()){
            s_cbcakses=CBCAkses.getText().toString();
            Toast.makeText(this, "Branding Car", Toast.LENGTH_SHORT).show();
            } else {
            s_cbcakses="";
            }

            if (CBDAkses.isChecked()){
            s_cbdakses=CBDAkses.getText().toString();
            Toast.makeText(this, "Yang Lain", Toast.LENGTH_SHORT).show();
            } else {
            s_cbdakses="";
            }


            //TODO CHECKBOX KOMPETITOR
            if (CBAKom.isChecked()){
            s_cbakom=CBAKom.getText().toString();
            Toast.makeText(this, "First Media", Toast.LENGTH_SHORT).show();
            } else {
            s_cbakom="";
            }

            if (CBBKom.isChecked()){
            s_cbbkom=CBBKom.getText().toString();
            Toast.makeText(this, "Indihome", Toast.LENGTH_SHORT).show();
            } else {
            s_cbbkom="";
            }

            if (CBCKom.isChecked()){
            s_cbckom=CBCKom.getText().toString();
            Toast.makeText(this, "Biznet", Toast.LENGTH_SHORT).show();
            } else {
            s_cbckom="";
            }

            if (CBDKom.isChecked()){
            s_cbdkom=CBDKom.getText().toString();
            Toast.makeText(this, "Myrepublic", Toast.LENGTH_SHORT).show();
            } else {
            s_cbdkom="";
            }

            if (CBEKom.isChecked()){
            s_cbekom=CBEKom.getText().toString();
            Toast.makeText(this, "Indosat GIG", Toast.LENGTH_SHORT).show();
            } else {
            s_cbekom="";
            }

            if (CBFKom.isChecked()){
            s_cbfkom=CBFKom.getText().toString();
            Toast.makeText(this, "Yang Lain", Toast.LENGTH_SHORT).show();
            } else {
            s_cbfkom="";
            }


            //TODO CHECKBOX KOMPETITOR
            if (CBAPro.isChecked()){
            s_cbapro=CBAPro.getText().toString();
            Toast.makeText(this, "Indovision//OKE/TOP TV", Toast.LENGTH_SHORT).show();
            } else {
            s_cbapro="";
            }

            if (CBBPro.isChecked()){
            s_cbbpro=CBBPro.getText().toString();
            Toast.makeText(this, "Transvision", Toast.LENGTH_SHORT).show();
            } else {
            s_cbbpro="";
            }

            if (CBCPro.isChecked()){
            s_cbcpro=CBCPro.getText().toString();
            Toast.makeText(this, "Big TV", Toast.LENGTH_SHORT).show();
            } else {
            s_cbcpro="";
            }

            if (CBDPro.isChecked()){
            s_cbdpro=CBDPro.getText().toString();
            Toast.makeText(this, "Orange TV", Toast.LENGTH_SHORT).show();
            } else {
            s_cbdpro="";
            }

            if (CBEPro.isChecked()){
            s_cbepro=CBEPro.getText().toString();
            Toast.makeText(this, "Topas Tv", Toast.LENGTH_SHORT).show();
            } else {
            s_cbepro="";
            }

            if (CBFPro.isChecked()){
            s_cbfpro=CBFPro.getText().toString();
            Toast.makeText(this, "Yang Lain", Toast.LENGTH_SHORT).show();
            } else {
            s_cbfpro="";
            }



        //TODO BUTTON NEXT
        btnNDS.setOnClickListener(
                new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (!CBAjenisPro.isChecked() && !CBBjenisPro.isChecked() && !CBCjenisPro.isChecked()) {

                    CBAjenisPro.setError("isi data");
                    CBBjenisPro.setError("isi data");
                    CBCjenisPro.setError("isi data");

                    Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();
                }
                else    if (!CBAklartipe.isChecked() && !CBBklartipe.isChecked() && !CBCklartipe.isChecked() && !CBDklartipe.isChecked() && !CBEklartipe.isChecked() && !CBFklartipe.isChecked()) {

                        CBAklartipe.setError("isi data");
                        CBBklartipe.setError("isi data");
                        CBCklartipe.setError("isi data");
                        CBDklartipe.setError("isi data");
                        CBEklartipe.setError("isi data");
                        CBFklartipe.setError("isi data");

                        Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();

                    }


                    else   if (!CBAMetod.isChecked() && !CBBMetod.isChecked() && !CBCMetod.isChecked() && !CBDMetod.isChecked()) {

                        CBAMetod.setError("isi data");
                        CBBMetod.setError("isi data");
                        CBCMetod.setError("isi data");
                        CBDMetod.setError("isi data");

                        Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();

                    }


                    else     if (!CBAAkses.isChecked() && !CBBAkses.isChecked() && !CBCAkses.isChecked() && !CBDAkses.isChecked()){

                        CBAAkses.setError("isi data");
                        CBBAkses.setError("isi data");
                        CBCAkses.setError("isi data");
                        CBDAkses.setError("isi data");

                        Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();

                    }

                    else    if (!CBAKom.isChecked() && !CBBKom.isChecked() && !CBCKom.isChecked() && !CBDKom.isChecked() && !CBEKom.isChecked() && !CBFKom.isChecked()){

                        CBAKom.setError("isi data");
                        CBBKom.setError("isi data");
                        CBCKom.setError("isi data");
                        CBDKom.setError("isi data");
                        CBEKom.setError("isi data");
                        CBFKom.setError("isi data");

                        Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();
                    }

                    else   if (!CBAPro.isChecked() && !CBBPro.isChecked() && !CBCPro.isChecked() && !CBDPro.isChecked() && !CBEPro.isChecked() && !CBFPro.isChecked()){

                        CBAPro.setError("isi data");
                        CBBPro.setError("isi data");
                        CBCPro.setError("isi data");
                        CBDPro.setError("isi data");
                        CBEPro.setError("isi data");
                        CBFPro.setError("isi data");

                        Toast.makeText(InformasiDetailSurveyArea.this, "Isi terlebih dahulu sebelum melanjutkat ke halaman berikutnya", Toast.LENGTH_SHORT).show();
                    }

                    else   if (TextUtils.isEmpty(edRata2BiayaInternet.getText())) {
                            edRata2BiayaInternet.setError("Harus Diisi");

                        }

                        else    if (Radiogroup.getCheckedRadioButtonId() <= 0) {
                            int radioId = Radiogroup.getCheckedRadioButtonId();
                            radioButton = findViewById(radioId);
                            rbMotor.setError("Select Item");





                    } else {
                        Intent intentnext = new Intent(getApplicationContext(), Identita_Surveyor.class);
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
