package com.example.bundle296;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Object account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=findViewById(R.id.name);
        EditText phone=findViewById(R.id.phone);
        EditText age =findViewById(R.id.age);
        Button send=findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=name.getText().toString();
                String Phone = phone.getText().toString();
                String Age =age.getText().toString();
                account Account=new account();
                Account.setName(Name);
                Account.setPhone(Phone);
                Account.setAge(Age);
              Intent intent =new Intent(MainActivity.this,thongtin.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("key",Account);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });
    }
}