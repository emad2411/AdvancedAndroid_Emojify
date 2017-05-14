package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;


public class Emojifier {

    public static void detectFaces(Context context,Bitmap bitmap){
        Frame frame = new Frame.Builder()
                .setBitmap(bitmap)
                .build();


        FaceDetector faceDetector=new FaceDetector.Builder(context)
                .setTrackingEnabled(false)
                .setClassificationType(FaceDetector.ALL_CLASSIFICATIONS)
                .build();

        SparseArray<Face> faces = faceDetector.detect(frame);

        Log.i("TAG",faces.size()+"");
    }
}
