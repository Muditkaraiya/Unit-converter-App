package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView3);
        textView2=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
////                Toast.makeText(MainActivity.this,"Click listener worked this is toast ",Toast.LENGTH_SHORT).show();
                  String s=editText.getText().toString();
//                  to ccnvert the string to int we used parseInt
                  int kg=Integer.parseInt(s);
                  float pound=(float) 2.2025*kg;
                  textView.setText(" "+ pound);
                  textView2.setText("Pounds");
//
            }
        });

    }
}