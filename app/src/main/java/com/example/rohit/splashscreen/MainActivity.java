package com.example.rohit.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
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
                    sleep(500);
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

        yes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Button yes = findViewById(R.id.yes);
                yes.animate().translationX(1000).setDuration(500);

                Button no=findViewById(R.id.no);
                no.animate().translationX(-1000).setDuration(500);

                Button cantSay=findViewById(R.id.cantSay);
                cantSay.animate().translationX(1000).setDuration(500);

                Thread th=new Thread()
                {
                   public void run()
                   {
                       try
                       {
                           sleep(750);
                       }
                       catch (InterruptedException e)
                       {
                           e.printStackTrace();
                       }
                       finally
                       {
                           Intent intent=new Intent(MainActivity.this,NextActivity.class);
                           startActivity(intent);
                       }
                   }
                };
                th.start();

                /*Intent intent=new Intent(getApplicationContext(),NextActivity.class);
                startActivity(intent);*/
            }
        });

    }

    public void animation()
    {
        Button yes = findViewById(R.id.yes);
        yes.animate().translationX(0).setDuration(500);

        Button no=findViewById(R.id.no);
        no.animate().translationX(0).setDuration(500);

        Button cantSay=findViewById(R.id.cantSay);
        cantSay.animate().translationX(0).setDuration(500);
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        animation();
    }
}
