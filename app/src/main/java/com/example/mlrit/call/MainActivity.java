package com.example.mlrit.call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { 
                Toast.makeText(MainActivity.this,"Calling",Toast.LENGTH_SHORT).show();
                Intent call=new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:9912951669"));
                startActivity(call);

            }
        });
    }
}
