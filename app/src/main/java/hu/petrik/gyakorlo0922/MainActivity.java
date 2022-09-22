package hu.petrik.gyakorlo0922;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText szoveg;
    private Button nagy;
    private Button kis;
    private Button veletlen;
    private TextView kiir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        nagy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kiir.setText(szoveg.getText().toString().toUpperCase());
            }
        });

        kis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kiir.setText(szoveg.getText().toString().toLowerCase());
            }
        });

        veletlen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                kiir.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
    }

    private void init(){
        szoveg = findViewById(R.id.szoveg);
        nagy = findViewById(R.id.nagy);
        kis = findViewById(R.id.kis);
        veletlen = findViewById(R.id.veletlen);
        kiir = findViewById(R.id.kiir);
    }
}