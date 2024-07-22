package com.example.myapplication3;

import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onButton1Clicked(View view) {
        //Toast.makeText(getApplicationContext(), "tel : 010-1234-5678", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel : 010-1234-5678"));
        startActivity(myIntent);
    }

    public void onButton2Clicked(View view) {
        //Toast.makeText(getApplicationContext(), "네이버접속 버튼이 눌렸습니다", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), MemuActivity.class);
        startActivity(intent);
    }

    public void onButton4Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), Margin_Padding.class);
        startActivity(intent);
    }

    public void onButton5Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), ScrollView.class);
        startActivity(intent);
    }

    public void onButton6Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), FrameLayout.class);
        startActivity(intent);
    }

    public void onButton7Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), RadioG.class);
        startActivity(intent);
    }

    public void onButton8Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), EditTexts.class);
        startActivity(intent);
    }

    public void onButton9Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), ImageVieww.class);
        startActivity(intent);
    }

    public void onButton10Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), Intent_main.class);
        startActivity(intent);
    }

    public void onButton11Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), Clockk.class);
        startActivity(intent);
    }

    public void onButton12Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), Pickerr.class);
        startActivity(intent);
    }

    public void onButton13Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), LayoutInflationn.class);
        startActivity(intent);
    }
    public void onButton14Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), SimpleDataa_Main.class);
        startActivity(intent);
    }
    public void onButton15Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), LifeCycle.class);
        startActivity(intent);
    }

    public void onButton16Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), LifeCycle2.class);
        startActivity(intent);
    }
    public void onButton17Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), TouchEvent.class);
        startActivity(intent);
    }

    public void onButton18Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), ServiceMain.class);
        startActivity(intent);
    }

    public void onButton19Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), GestureEvent.class);
        startActivity(intent);
    }

    public void onButton20Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), Snackbarr.class);
        startActivity(intent);
    }

    public void onButton21Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), AlertDialogg.class);
        startActivity(intent);
    }


}