package com.example.reyadmahabub.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView displayTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        displayTV=findViewById(R.id.displayTV);

        Intent intent=getIntent();
        Student student= (Student) intent.getSerializableExtra("object");
        displayTV.setText("name: "+student.getName()+"\n"+"department: "+student.getDepartment()
        +"\n"+"roll: "+student.getRoll()+"\n"+"age: "+student.getAge());

    }
}
