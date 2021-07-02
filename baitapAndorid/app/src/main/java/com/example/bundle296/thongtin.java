package com.example.bundle296;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class thongtin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin);
        TextView textShowName =findViewById(R.id.textshowname);
        TextView textShowPhone=findViewById(R.id.textshowphone);
        TextView textShowAge=findViewById(R.id.textshowage);
        Bundle bundle=getIntent().getExtras();
        account getaccount= (account) bundle.getSerializable("key");
        String showName=getaccount.getName();
        String showPhone=getaccount.getPhone();
        String showAge=getaccount.getAge();
        textShowName.setText(showName);
        textShowPhone.setText(showPhone);
        textShowAge.setText(showAge);
    }
}