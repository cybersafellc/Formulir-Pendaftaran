package com.example.uts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText nama;
    EditText email;
    EditText noHp;
    RadioButton radioLk;
    RadioButton radionPr;
    CheckBox web;
    CheckBox app;
    CheckBox cyber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnDaftar = findViewById(R.id.buttonDaftar);
        nama = findViewById(R.id.namaLengkap);
        email = findViewById(R.id.email);
        noHp = findViewById(R.id.noHp);
        radioLk = findViewById(R.id.radioLk);
        radionPr = findViewById(R.id.radioPr);
        web = findViewById(R.id.checkBoxWeb);
        app = findViewById(R.id.checkBoxApp);
        cyber = findViewById(R.id.checkBoxCyber);

        btnDaftar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(!nama.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, nama.getText(), Toast.LENGTH_SHORT).show();
                }
                if(!email.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, email.getText(), Toast.LENGTH_SHORT).show();
                }
                if(!noHp.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, noHp.getText(), Toast.LENGTH_SHORT).show();
                }
                if(radioLk.isChecked()){
                    Toast.makeText(MainActivity.this, radioLk.getText(), Toast.LENGTH_SHORT).show();
                }
                if(radionPr.isChecked()){
                    Toast.makeText(MainActivity.this, radionPr.getText(), Toast.LENGTH_SHORT).show();
                }
                if(web.isChecked()){
                    Toast.makeText(MainActivity.this, web.getText(), Toast.LENGTH_SHORT).show();
                }
                if(app.isChecked()){
                    Toast.makeText(MainActivity.this, app.getText(), Toast.LENGTH_SHORT).show();
                }
                if(cyber.isChecked()){
                    Toast.makeText(MainActivity.this, cyber.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        //
    }
}