package sakshi.com.healthydietplan;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vitamins extends Activity {

    Button v1,v2,v3,v4,v5,v6,m1,m2,m3,m4,m5,m6,m7,m8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vitamins);


        v1= (Button) findViewById(R.id.button8);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Avitamin.class);
                startActivity(i);
            }
        });

        v2= (Button) findViewById(R.id.button5);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Bvita.class);
                startActivity(i);
            }
        });

        v3= (Button) findViewById(R.id.button9);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Cvita.class);
                startActivity(i);
            }
        });

        v4= (Button) findViewById(R.id.button7);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Dvita.class);
                startActivity(i);
            }
        });

        v5= (Button) findViewById(R.id.button10);
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Evita.class);
                startActivity(i);
            }
        });

        v6= (Button) findViewById(R.id.button11);
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vitamins.this, Kvita.class);
                startActivity(i);
            }
        });

    }
}
