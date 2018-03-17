package pruebafinal.com.pruebafinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    CardView btn1, btn2,btn3,btn4;
    private Context context;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            btn1 = (CardView) findViewById(R.id.bankcardId);
            btn2 = (CardView) findViewById(R.id.publicas);
            btn3 = (CardView) findViewById(R.id.religiosas);
            btn4 = (CardView) findViewById(R.id.militares);
            this.context = context;

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent1);
                }
            });


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent btn2 = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(btn2);
                }
            });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent btn3 = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(btn3);
                }
            });

            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btn4 = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(btn4);
                }
            });
        }

}

