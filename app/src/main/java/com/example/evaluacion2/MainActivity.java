package com.example.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn111;
    private RatingBar bar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn111 = (Button) findViewById(R.id.btn111);

        bar1 = (RatingBar) findViewById(R.id.bar1);


    }

    public void siguiente(View v){
        Intent sig =  new Intent(this,MainActivity2.class);
        startActivity(sig);
    }
    public  void  cuantasEstrellas(View v){
        Toast.makeText(MainActivity.this, "Usted ha otorgado: "+bar1.getRating()+" estrellas!!!", Toast.LENGTH_SHORT).show();
    }
}
