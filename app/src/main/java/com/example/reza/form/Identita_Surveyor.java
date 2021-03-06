package com.example.reza.form;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reza.form.loginactivity.LoginAdminActivity;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Identita_Surveyor extends AppCompatActivity {

    private final int REQUEST_IMAGE_CAPTURE = 1, REQUEST_IMAGE_GALLERY = 2;
    private ImageView image;

    @BindView(R.id.rbYa)
    RadioButton rbYa;
    @BindView(R.id.rbTidak)
    RadioButton rbTidak;
    @BindView(R.id.btnFinish)
    Button btnFinish;
    @BindView(R.id.btnBackIdentitas)
    Button btnBackIdentitas;
    RadioGroup Radiogroup2;
    RadioButton radioButton;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }


       @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.btnCamera:
                Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(iCamera.resolveActivity(getPackageManager()) != null){
                    startActivityForResult(iCamera,0);
                }
                break;
            case R.id.btnGallery:
                Intent iGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                iGallery.setType("image/*");
                startActivityForResult(iGallery, REQUEST_IMAGE_GALLERY);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 0){
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                image.setImageBitmap(bitmap);
            }else if (requestCode == REQUEST_IMAGE_GALLERY){
                Uri uri = data.getData();
                Bitmap bitmap = null;
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                    image.setImageBitmap(bitmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identita__surveyor);
        ButterKnife.bind(this);

        image = (ImageView)findViewById(R.id.ivIdentitas);

    }
    @SuppressLint("ResourceType")
    @OnClick({R.id.btnFinish, R.id.btnBackIdentitas})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.btnFinish:


                if(Radiogroup2.getCheckedRadioButtonId()<=0){//Grp is your radio group object
                int radioPW = Radiogroup2.getCheckedRadioButtonId();
                radioButton = findViewById(radioPW);
                rbYa.setError("Select Item");//Set error to last Radio button
                    rbYa.setError(null);


            } else {
                Intent intent6 = new Intent(this, Identita_Surveyor.class);
                startActivity(intent6);
            }
                break;

                    case R.id.btnBackIdentitas:
                Intent intent8 = new Intent(this, InformasiDetailSurveyArea.class);
                startActivity(intent8);
                break;
        }
    }
}
