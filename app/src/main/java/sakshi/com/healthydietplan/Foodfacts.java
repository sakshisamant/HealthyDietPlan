package sakshi.com.healthydietplan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Foodfacts extends YouTubeBaseActivity{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodfacts);

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

        b1= (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="9+top+super+foods+eric+berk";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });
        b2= (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="Iyf5ViY2AbA";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b3= (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="-FVe0lWApDDs";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });
        b4= (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="Yn29mdxEw9w";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b5= (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="TankFrHtQiM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b6= (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="eXF4iD3O_oA";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b7= (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="ym7Jt7rehko";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b8= (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="5olzMcMCCkM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b9= (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="SD1qrbaTUYM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b10 = (Button) findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="cant+stick+to+healthy+diet+erik+berk";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b11= (Button) findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="K9x_xLBm1og";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b12 = (Button) findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="Jx2oj1OBnJs";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b13= (Button) findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="oerYACBHkuI";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b14= (Button) findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="ekN-SSAtUYg";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b15= (Button) findViewById(R.id.b15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="8nK8x8MSQe0";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b16= (Button) findViewById(R.id.b16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="6iKSL-bpbAM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b17= (Button) findViewById(R.id.b17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="XeHl5Y7m1xM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b18= (Button) findViewById(R.id.bl8);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="wLSYHzuVv78";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b19= (Button) findViewById(R.id.b19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="lx87378ZyFM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b20= (Button) findViewById(R.id.b20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="reX59MogfR8";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b21= (Button) findViewById(R.id.b21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="MTFKONvdsJ0";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b22= (Button) findViewById(R.id.b22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="gHbP94N7PmA";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b23= (Button) findViewById(R.id.b23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="SXVle9Ca7M4";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b24= (Button) findViewById(R.id.b24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="47U1ZS3dRY0";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b25= (Button) findViewById(R.id.b25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="8Lt7Hm8dd3Y";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b26= (Button) findViewById(R.id.b26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="Px8V89FqJE0";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b27= (Button) findViewById(R.id.b27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="ScXWNQdNBOM";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

        b28= (Button) findViewById(R.id.b28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a="ApxLTx5M45I";
                youTubePlayerView.initialize("AIzaSyDsBaz3OZkziEX3cXD5MI3Q4XWbnwUFFWk",onInitializedListener);

            }
        });

    }
}
