package com.example.jubaed.dialogmultipleitem;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Some Title");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    Toast.makeText(MainActivity.this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                }

                if (which == 1) {
                    Toast.makeText(MainActivity.this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                }

                if (which == 2) {
                    Toast.makeText(MainActivity.this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                }

                if(which == 3){
                    Toast.makeText(MainActivity.this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        builder.create().show();
    }
}
