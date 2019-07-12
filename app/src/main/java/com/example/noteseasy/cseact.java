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

public class cseact extends AppCompatActivity {
    private Button auto;
    private Button micro;
    private Button os;
    private Button evs;
    private Button se;
    private Button maths3;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cseact);

        //microprocessor
        micro = findViewById(R.id.micro);
        micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download1();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //operating system
        os = findViewById(R.id.os);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download2();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //tafl
        auto = findViewById(R.id.tafl);
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //evs
        evs = findViewById(R.id.evs);
        evs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download3();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //se
        se = findViewById(R.id.se);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download4();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //maths3
        maths3 =  findViewById(R.id.maths3);
        maths3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download5();
                Toast.makeText(cseact.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

    }


    //tafl
    public void download() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("auto.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles(cseact.this, "auto", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //microprocessor
    public void download1() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("microprocessor.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles1(cseact.this, "microprocessor", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //os
    public void download2() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("Operating System.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles2(cseact.this, "Operating System", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //evs
    public void download3() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("evs.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles3(cseact.this, "evs", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    public void downloadfiles3(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

    //se
    public void download4() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("SE.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles4(cseact.this, "SE", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    public void downloadfiles4(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

    //maths3:-
    public void download5() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("maths 3.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles5(cseact.this, "maths 3", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    public void downloadfiles5(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

}
