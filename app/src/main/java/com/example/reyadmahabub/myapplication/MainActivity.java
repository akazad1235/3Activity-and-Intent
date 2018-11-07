package com.example.reyadmahabub.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameET,deptET;
    private Button nextBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET=findViewById(R.id.nameET);
        deptET=findViewById(R.id.deptET);
        nextBtn=findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameET.getText().toString();
                String dept=deptET.getText().toString();
                Student student=new Student(name,dept);
//                Toast.makeText(MainActivity.this, "name: "+student.getName()+"dept: "+student.getDepartment(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("object",student);
                startActivity(intent);
//                startActivity(new Intent(MainActivity.this,Main2Activity.class).putExtra("object",student));

            }
        });
    }
}
