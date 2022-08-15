package com.example.schoole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Students> StudentLIst = new ArrayList<>();
    int Mm2 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText Id1 = findViewById(R.id.Name);
        EditText Id2 = findViewById(R.id.Age);
        EditText Id3 = findViewById(R.id.Greed);
        ImageView Id4 = findViewById(R.id.imageView);
        Button button= findViewById(R.id.button);

     Students S1 = new Students("TeReX",100,100000,R.drawable.terex);
     Students S2 = new Students("AnkI",150,108000,R.drawable.anki);
     Students S3 = new Students("BrotO",10000,19990,R.drawable.bronto);
     Students S4 = new Students("SpiNo",1000,100000,R.drawable.spino);

     StudentLIst.add(S1);
     StudentLIst.add(S2);
     StudentLIst.add(S3);
     StudentLIst.add(S4);

     Id4.setImageResource(StudentLIst.get(Mm2).getStudintPhoto());
     Id1.setText(StudentLIst.get(Mm2).getStudentName());
     Id2.setText(String.valueOf(StudentLIst.get(Mm2).getStudentAge()));
     Id3.setText(String.valueOf(StudentLIst.get(Mm2).getStudentGreed()));

     button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Mm2++;
        if (Mm2 == StudentLIst.size()) {
            Mm2 = 0;
        }
        Id4.setImageResource(StudentLIst.get(Mm2).getStudintPhoto());
        Id1.setText(StudentLIst.get(Mm2).getStudentName());
        Id2.setText(String.valueOf(StudentLIst.get(Mm2).getStudentAge()));
        Id3.setText(String.valueOf(StudentLIst.get(Mm2).getStudentGreed()));


    }
     })
    ;}
}




