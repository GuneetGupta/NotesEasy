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

public class firstyract extends AppCompatActivity {
    Button mathsone;
    Button mathstwo;
    Button chemistry;
    Button electrical;
    Button program;
    Button physics;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstyract);

        //maths one:-
        mathsone = findViewById(R.id.mathsone);
        mathsone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //mathstwo:-
        mathstwo = findViewById(R.id.mathstwo);
        mathstwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donload2();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //chemistry:-
        chemistry = findViewById(R.id.chemistry);
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donload3();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //electrical:-
        electrical = findViewById(R.id.electrical);
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donload4();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //program for problem solving:-
        program = findViewById(R.id.program);
        program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donload5();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });

        //physics:-
        physics = findViewById(R.id.physics);
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                donload6();
                Toast.makeText(firstyract.this, "Downloading ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //mathsone:-
    public void download() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("maths1.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles(firstyract.this, "maths1", ".pdf", DIRECTORY_DOWNLOADS, url);

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


    //mathstwo:-
    public void donload2() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("maths2_compressed.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles2(firstyract.this, "maths2_compressed", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //chemistry
    public void donload3() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("chemistry.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles3(firstyract.this, "chemistry", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //electrical:-
    public void donload4() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("electrical.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles4(firstyract.this, "electrical", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //program for problem solving:-

    public void donload5() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("problemsolving.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles5(firstyract.this, "problemsolving", ".pdf", DIRECTORY_DOWNLOADS, url);

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

    //physics:-
    public void donload6() {
        storageReference = firebaseStorage.getInstance().getReference();
        ref = storageReference.child("physics.pdf");
        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                downloadfiles6(firstyract.this, "physics", ".pdf", DIRECTORY_DOWNLOADS, url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }
    public void downloadfiles6(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);


        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadManager.enqueue(request);
    }

}
