package com.ainwik.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn=findViewById(R.id.button);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Dialog dialog=new Dialog(MainActivity.this);
                 dialog.setContentView(R.layout.feedback_form);
                 dialog.show();
                 RatingBar r=dialog.findViewById(R.id.ratingBar);
                 Button b=dialog.findViewById(R.id.button);
                 b.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         double rate =r.getRating();
                         Toast.makeText(MainActivity.this,  rate +"Star", Toast.LENGTH_SHORT).show();
                         dialog.dismiss();
                     }
                 });
             }
         });

    }
}