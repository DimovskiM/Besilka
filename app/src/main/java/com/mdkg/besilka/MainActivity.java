package com.mdkg.besilka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSolo = (Button) findViewById(R.id.btnSolo);
         btnSolo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent soloIntent = new Intent(MainActivity.this,Solo.class);
                 startActivity(soloIntent);
             }
         });
    }
}
