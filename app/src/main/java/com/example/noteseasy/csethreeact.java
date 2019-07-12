package com.example.noteseasy;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class csethreeact extends AppCompatActivity {
    private Button cybersec;
    private Button ppl;
    private Button daa;

    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csethreeact);

        //cybersecurity
        cybersec = findViewById(R.id.cybersec);
        cybersec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
                Toast.makeText(csethreeact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //ppl
        ppl = findViewById(R.id.ppl);
        ppl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
                Toast.makeText(csethreeact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //daa
        daa = findViewById(R.id.daa);
        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download2();
                Toast.makeText(csethreeact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //microprocessor
    public void download() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("cybersecurity.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles(csethreeact.this, "cybersecurity", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    public void downloadfiles(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

    //ppl
    public void download1() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("PPL.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles1(csethreeact.this, "PPL", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    public void downloadfiles1(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

    //daa
    public void download2() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("DAA.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles2(csethreeact.this, "DAA", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    public void downloadfiles2(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

}
