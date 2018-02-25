package br.com.fiap.sortear;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("FIAP","onCreate passou por aqui");




        final Button button = findViewById(R.id.bSortear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i1 = (r.nextInt(5) + 1);
                Log.i("FIAP","bSortear " + i1);

                image = (ImageView) findViewById(R.id.dado1);

                    switch (i1) {
                        case 1:
                            image.setImageResource(R.drawable.dado1);
                            break;
                        case 2:
                            image.setImageResource(R.drawable.dado2);
                            break;
                        case 3:
                            image.setImageResource(R.drawable.dado3);
                            break;
                        case 4:
                            image.setImageResource(R.drawable.dado4);
                            break;
                        case 5:
                            image.setImageResource(R.drawable.dado5);
                            break;
                        case 6:
                            image.setImageResource(R.drawable.dado6);
                            break;
                        default:
                            image.setImageResource(R.drawable.dado1);
                            break;

                    }
                
            };

        });
    }

        @Override
    protected void onStart(){
        super.onStart();
        Log.i("FIAP","onStart passou por aqui");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("FIAP","onResume passou por aqui");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("FIAP","onPause passou por aqui");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("FIAP","onRestart passou por aqui");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("FIAP","onDestroy passou por aqui");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("FIAP","onStop passou por aqui");
    }

}
