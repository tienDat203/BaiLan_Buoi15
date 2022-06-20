package com.example.bailan_buoi15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class formdangky extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    EditText ed_name , ed_email, ed_sdt , ed_gioithieu;
    Button btn_dangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formdangky);


        ed_name = findViewById(R.id.ed_name);
        ed_gioithieu = findViewById(R.id.ed_gioithieu);
        ed_email = findViewById(R.id.ed_email);
        ed_sdt = findViewById(R.id.ed_sdt);
        btn_dangky = findViewById(R.id.btn_dangky);

        btn_dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luuDuLieu();
                Intent intent  = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void luuDuLieu(){
        SharedPreferences preferences = getSharedPreferences("login",MODE_PRIVATE);
        SharedPreferences.Editor editor =preferences.edit();

        editor.putString("sdt",ed_sdt.getText().toString());
        editor.putString("email",ed_email.getText().toString());
        editor.putString("gioithieu",ed_gioithieu.getText().toString());
        editor.putString("hoten",ed_name.getText().toString());

        editor.commit();
    }
}