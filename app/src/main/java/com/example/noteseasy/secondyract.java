package com.example.noteseasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondyract extends AppCompatActivity {

    private Button cseact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondyract);

        cseact = findViewById(R.id.cse);
        cseact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencseact();
            }
        });
    }
    public void opencseact(){
        Intent intent = new Intent(this, cseact.class);
        startActivity(intent);
    }
}
