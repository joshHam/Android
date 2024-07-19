//package com.example.myapplication;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//    RadioGroup rg;
//    RadioButton rb1, rb2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//
//        rg = findViewById(R.id.radioGroup01);
//        rb1 = findViewById(R.id.radio01);
//        rb2 = findViewById(R.id.radio02);
//
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (group.indexOfChild(findViewById(checkedId))) {
//                    case 0:
//                        Toast.makeText(getApplicationContext(), "1st check!", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 1:
//                        Toast.makeText(getApplicationContext(), "2nd check!", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });
//    }
//
//
//    public void onSelectButtonClicked(View view) {
//        if (rb1.isChecked() == true) {
//            Toast.makeText(getApplicationContext(), "남성을 선택하셨습니다.", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(getApplicationContext(), "여성을 선택하셨습니다.", Toast.LENGTH_SHORT).show();
//        }
//    }
//}