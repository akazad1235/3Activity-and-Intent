package com.example.reyadmahabub.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText rollET, ageET;
    private Button display;
    private String name,dept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rollET=findViewById(R.id.rollET);
        ageET=findViewById(R.id.ageET);
        display=findViewById(R.id.displayBtn);



        Intent intent=getIntent();
        Student student= (Student) intent.getSerializableExtra("object");
        name=student.getName();
        dept=student.getDepartment();

//        Toast.makeText(this, ""+student.getDepartment(), Toast.LENGTH_SHORT).show();

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String roll=rollET.getText().toString();
                String age=ageET.getText().toString();
                Student student1=new Student(name,dept,roll,age);
                startActivity(new Intent(Main2Activity.this,Main3Activity.class).putExtra("object",student1));
            }
        });


//        student= (Student) new Intent().getSerializableExtra("object");
//        String name=student.getName();
//        String department=student.getDepartment();
//        Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();




    }
}
