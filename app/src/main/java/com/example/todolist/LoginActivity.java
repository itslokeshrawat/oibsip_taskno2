package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {
    EditText userid,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userid=(EditText) findViewById(R.id.username);
        pass=(EditText) findViewById(R.id.pass);
    }

    String uarray="ashh";
    String parray="123";


    public void login(View view) {
           String user=userid.getText().toString();
           String pas=pass.getText().toString();
           if((pas==parray)&&(user==uarray)){
                final Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
           }
        else{
        Toast.makeText(this, "User name or password is WRONG!!!", Toast.LENGTH_SHORT).show();
   }
}

    public void register(View view) {
        String user=userid.getText().toString();
        String pas=pass.getText().toString();
        uarray=user;
        parray=pas;
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
        userid.setText("");
        pass.setText("");
    }
}