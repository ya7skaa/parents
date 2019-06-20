package com.example.mwana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LogActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button signupButton;
    Button signinButton;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        signinButton = findViewById(R.id.signin);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(LogActivity.this, "hey", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LogActivity.this,CategoriesActivity.class);
                startActivity(intent);

            }
        });



//        imageView.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
//            public void onSwipeTop() {
//            }
//
//            public void onSwipeRight() {
//                if (count == 0) {
//                    imageView.setImageResource(R.drawable.login_img);
//                    textView.setText("Night");
//                    count = 1;
//                } else {
//                    imageView.setImageResource(R.drawable.login_img);
//                    textView.setText("Morning");
//                    count = 0;
//                }
//            }
//
//            public void onSwipeLeft() {
//                if (count == 0) {
//                    imageView.setImageResource(R.drawable.login_img);
//                    textView.setText("Night");
//                    count = 1;
//                } else {
//                    imageView.setImageResource(R.drawable.login_img);
//                    textView.setText("Morning");
//                    count = 0;
//                }
//            }
//
//            public void onSwipeBottom() {
//            }
//
//        });
    }
}