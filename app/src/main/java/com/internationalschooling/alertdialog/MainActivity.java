package com.internationalschooling.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("ALERT");
        builder.setMessage("MESSAGE");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"YES click",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"No click",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"cancel",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        AlertDialog dialog =builder.create();
        dialog.show();
    }
}
