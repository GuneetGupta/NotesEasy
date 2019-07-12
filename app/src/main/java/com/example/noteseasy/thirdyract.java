package com.example.noteseasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdyract extends AppCompatActivity {
    private Button csethreeact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdyract);

        csethreeact = (Button)findViewById(R.id.csethree);
        csethreeact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencsethreeact();
            }
        });
    }

    public void opencsethreeact(){
        Intent intent = new Intent(this, csethreeact.class);
        startActivity(intent);
    }
}
