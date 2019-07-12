package com.example.noteseasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class yearact extends AppCompatActivity {
    private Button firstyr;
    private Button secondyr;
    private Button thirdyr;

    private static final String APP_ID="ca-app-pub-5864155067336715~6835984518";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearact);

       //ads:-

        MobileAds.initialize(this, APP_ID);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //buttons:-

        firstyr = (Button) findViewById(R.id.first_yr);
        firstyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfirstyract();
            }
        });

        secondyr = (Button) findViewById(R.id.second_yr);
        secondyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensecondyract();
            }
        });

        thirdyr  = (Button) findViewById(R.id.third_yr);
        thirdyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openthirdyract();
            }
        });
    }
    public void openfirstyract() {
        Intent intent = new Intent(this, firstyract.class);
        startActivity(intent);
    }
    public void opensecondyract() {
        Intent intent1 = new Intent(this, secondyract.class);
        startActivity(intent1);
    }
    public void openthirdyract() {
        Intent intent2 = new Intent(this, thirdyract.class);
        startActivity(intent2);
    }

}
