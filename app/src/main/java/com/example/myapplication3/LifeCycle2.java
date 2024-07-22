package com.example.myapplication3;

import static android.net.http.SslCertificate.restoreState;
import static android.net.http.SslCertificate.saveState;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LifeCycle2 extends AppCompatActivity {
    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_life_cycle2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameInput = findViewById(R.id.editText);
    }
    protected void onPause(){
        super.onPause();

        Toast.makeText(this, "onPause 호출됨", Toast.LENGTH_SHORT).show();
        saveState();
    }

    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "onResume 호출됨", Toast.LENGTH_SHORT).show();
        restoreState();
    }

    private void restoreState(){
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if((pref != null) && pref.contains("name")){
            String name = pref.getString("name", "");
            nameInput.setText(name);
        }
    }

    private void saveState(){
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }

}
























