package pruebafinal.com.pruebafinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Main3Activity extends AppCompatActivity {

    ImageView ubic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ubic = (ImageView) findViewById(R.id.ubi);

        ubic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH,
                        "geo:%s,%s?q=%s,%s(%s)", "14.6222849", "-90.5158223", "14.6222849", "-90.5158223", "IGA");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)).setPackage("com.google.android.apps.maps"));
            }
        });
    }
}
