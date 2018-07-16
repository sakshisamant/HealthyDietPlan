package sakshi.com.healthydietplan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class youtube extends YouTubeBaseActivity{

    Button b1,b2,b3,b4,b5,b6;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(a);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b1= (Button) findViewById(R.id.underweight);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="WFKik6EXSOM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });
        b2= (Button) findViewById(R.id.normal);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="ph4HWGQAmIE";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b3= (Button) findViewById(R.id.overweight);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="-X6395gykhg";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });
        b4= (Button) findViewById(R.id.obese);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="CgjfzLMmGV0";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b5= (Button) findViewById(R.id.kids);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="oTQlks87hpI";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b6= (Button) findViewById(R.id.pwomen);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="PPpmWmt9taU";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });


    }
}
