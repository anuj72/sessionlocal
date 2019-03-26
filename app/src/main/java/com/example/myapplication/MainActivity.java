package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText uid,pass;
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uid=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Session session =new Session(MainActivity.this);
                session.setUid(uid.toString());
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


        Session session =new Session(MainActivity.this);
      String value=session.getUid();
      if(value!=""){
          Intent intent =new Intent(MainActivity.this,SecondActivity.class);
          startActivity(intent);
      }

    }
}
