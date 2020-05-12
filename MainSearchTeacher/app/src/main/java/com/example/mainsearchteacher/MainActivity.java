package com.example.mainsearchteacher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        AppCompatButton studentBtn = findViewById(R.id.studentBtn);
//        AppCompatButton adminBtn = findViewById(R.id.adminBtn);
//
//        studentBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                goStudent(view);
//            }
//        });
//
//        TextView tv = findViewById(R.id.textView);



    }
    @OnClick(R.id.adminBtn)
    public void goAdmin(View view){

    }

    @OnClick(R.id.studentBtn)
    public void goStudent(View view){
        Intent intent=new Intent(this, MainStudent.class);
        startActivity(intent);
    }
}
