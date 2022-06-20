package com.example.bailan_buoi15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv = findViewById(R.id.wv);

        SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
        String name = sharedPreferences.getString("hoten","");
        String email = sharedPreferences.getString("email","");
        String sdt = sharedPreferences.getString("sdt","");
        String gt  = sharedPreferences.getString("gioithieu","");

        String chuoiHTML = "<h1 align=\"center\" style=\"color: blue;\">THÔNG TIN SINH VIÊN</h1>\n"+
                "<p>Họ tên: <strong style='color:red'>"+name+"</strong></p>\n"+
                "<p>Email: <strong style='color:green'>"+email+"</strong></p>\n"+
                "<p>Số điện thoại: <strong style='color:purple'>"+sdt+"</strong></p>\n"+
                "<p>Ghi chú: "+gt+"<p>";

        wv.loadData(chuoiHTML,"text/html","utf-8");
    }
}