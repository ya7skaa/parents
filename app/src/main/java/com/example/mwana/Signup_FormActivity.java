package com.example.mwana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import android.widget.Toast;

public class Signup_FormActivity extends AppCompatActivity {


  private Button buttonSign;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signup_form);

        buttonSign = (Button) findViewById(R.id.signUp);


        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(Signup_FormActivity.this, "hey", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Signup_FormActivity.this,CategoriesActivity.class);
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
