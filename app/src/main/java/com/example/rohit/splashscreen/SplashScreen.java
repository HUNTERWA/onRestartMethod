package com.example.rohit.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*ImageView imageView=findViewById(R.id.astute);
        imageView.animate().scaleX(2f).scaleY(2f).setDuration(2000);*/

        final ImageView imageView=findViewById(R.id.astute);
        //imageView.animate().alpha(0);

        final Thread thread=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    imageView.animate().alpha(1f).setDuration(3000);

                }
            }
        };
        thread.start();


        //imageView.animate().alpha(0.5f).setDuration(1000);
        //imageView.animate().alpha(1f).setDuration(1000);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
