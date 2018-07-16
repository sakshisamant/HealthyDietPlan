package sakshi.com.healthydietplan;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bmi= (Button) findViewById(R.id.button1);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Bmi.class);
                startActivity(i);
            }
        });


        Button tips= (Button) findViewById(R.id.button2);
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Tips.class);
                startActivity(i);
            }
        });
        Button dietplan= (Button) findViewById(R.id.button4);
        dietplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, youtube.class);
                startActivity(i);
            }
        });
        Button foodfacts= (Button) findViewById(R.id.foodfacts);
        foodfacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Foodfacts.class);
                startActivity(i);
            }
        });
        Button vitamins= (Button) findViewById(R.id.vitamins);
        vitamins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Vitamins.class);
                startActivity(i);
            }
        });




        Button cchart= (Button) findViewById(R.id.button3);
        cchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CopyReadAssets();
            }
        });



    }



    private void CopyReadAssets()
    {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), "chart.pdf");
        try
        {
            in = assetManager.open("chart.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(
                Uri.parse("file://" + getFilesDir() + "/chart.pdf"),
                "application/pdf");

        startActivity(intent);
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }
}



