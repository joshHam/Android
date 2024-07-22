package com.example.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditTexts extends AppCompatActivity {
    EditText ett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit_textt);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.editTextt), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ett = findViewById(R.id.usernameInput);
    }

    public void onInputButtonClicked(View view){
        Toast.makeText(getApplicationContext(), ett.getText(), Toast.LENGTH_SHORT).show();
    }

}