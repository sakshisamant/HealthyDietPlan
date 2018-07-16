package sakshi.com.healthydietplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sakshi on 3/4/2018.
 */
public class Calculate extends Activity {

    TextView ans,ans2;
    float calori;
    float bmi = 0.2f;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate1);

        bmi = getIntent().getFloatExtra("N1", 0);
        calori = getIntent().getFloatExtra("N2", 0);
        s1 = String.valueOf(bmi);
        s2=String.valueOf(calori);
        ans = (TextView) findViewById(R.id.ans);
        ans2 = (TextView) findViewById(R.id.ans2);
        ans.setText(s1);
        ans2.setText(s2);





    }
}