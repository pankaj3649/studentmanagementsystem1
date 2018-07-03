package com.example.windows.studentmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText phoneNumber,userName,collegeName,address;
    TextView displayText;
    Button btn,dbtn;
    ArrayList<Student> obj= new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phoneNumber = findViewById(R.id.phone);
        userName = findViewById(R.id.uname);
        collegeName= findViewById(R.id.collname);
        address = findViewById(R.id.address);
        displayText = findViewById(R.id.display);
        btn = findViewById(R.id.btn);
        dbtn=findViewById(R.id.Display);


        btn.setOnClickListener(new View.
                OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String collegename = collegeName.getText().toString();
                String addres = address.getText().toString();
                 int phno=Integer.parseInt (phoneNumber.getText().toString());
                obj.add(new Student(name,collegename,addres,phno));
            }

        });


        dbtn.setOnClickListener(new View.
                OnClickListener() {
            @Override
            public void onClick(View v) {
               for(int i=0;i<obj.size();i++)
               {
                   displayText.setText(displayText.getText()+"\n username is:"+obj.get(i).userName);
                   displayText.setText(displayText.getText()+"\n collegename is:"+obj.get(i).collegeName);
                   displayText.setText(displayText.getText()+"\n address is:"+obj.get(i).address);
                   displayText.setText(displayText.getText()+"\n phonenumber is:"+obj.get(i).phoneNumber);
               }
            }

        });

    }
}






