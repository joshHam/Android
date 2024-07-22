package com.example.myapplication3;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GestureEvent extends AppCompatActivity {
    TextView textView;
    GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gesture_event);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    textView = findViewById(R.id.textView);

    View view = findViewById(R.id.view1);
    view.setOnTouchListener(new View.OnTouchListener(){
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            float curX = event.getX();
            float curY = event.getY();

            if (action == event.ACTION_DOWN) {
                println("손가락 눌림 : " + curX + ", " + curY);
            } else if (action == event.ACTION_MOVE) {
                println("손가락 움직임 : " + curX + ", " + curY);
            } else if (action == event.ACTION_UP) {
                println("손가락 뗌 : " + curX + ", " + curY);
            }
            return false;
        }
    });

    detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
        @Override
        public boolean onDown(@NonNull MotionEvent motionEvent) {
            println("onDown() 호출됨");
            return true;
        }

        @Override
        public void onShowPress(@NonNull MotionEvent motionEvent) {
            println("onShowPress() 호출됨");
        }

        @Override
        public boolean onSingleTapUp(@NonNull MotionEvent motionEvent) {
            println("onSingleTapUp() 호출됨");
            return true;
        }

        @Override
        public boolean onScroll(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent1, float distanceX, float distanceY) {
            println("onScroll() 호출됨 : " + distanceX + ", " + distanceY);
            return true;
        }

        @Override
        public void onLongPress(@NonNull MotionEvent motionEvent) {
            println("onLongPress() 호출됨");
        }

        @Override
        public boolean onFling(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent1, float velocityX, float velocityY) {
            println("onFling() 호출됨" + velocityX + ", " + velocityY);
            return true;
        }
    });

    View view2 = findViewById(R.id.view2);
    view2.setOnTouchListener(new View.OnTouchListener(){
        @Override
        public boolean onTouch(View v, MotionEvent event){
            detector.onTouchEvent(event);
            return true;
        }
    });

    }

    public void println(String data){
        textView.append(data + "\n");
    }
}



















