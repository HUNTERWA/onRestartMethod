package com.example.rohit.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yes=findViewById(R.id.yes);
        yes.animate().translationX(1000).setDuration(0);

        Button no=findViewById(R.id.no);
        no.animate().translationX(-1000).setDuration(0);

        Button cantSay=findViewById(R.id.cantSay);
        cantSay.animate().translationX(1000).setDuration(0);

        Thread thread=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    animation();
                }
            }
        };
        thread.start();

        /*ImageView imageView=findViewById(R.id.astute);
        imageView.animate().scaleX(1.5f).scaleY(1.5f).setDuration(3000);*/

    }

    public void animation()
    {
        Button yes = findViewById(R.id.yes);
        yes.animate().translationX(0).setDuration(1000);

        Button no=findViewById(R.id.no);
        no.animate().translationX(0).setDuration(1000);

        Button cantSay=findViewById(R.id.cantSay);
        cantSay.animate().translationX(0).setDuration(1000);
    }
}
