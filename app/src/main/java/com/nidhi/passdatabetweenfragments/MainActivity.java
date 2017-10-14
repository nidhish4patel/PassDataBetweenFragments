package com.nidhi.passdatabetweenfragments;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context = MainActivity.this;
    private EditText etFname, etLname, etQual;
    private Button bsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFname = (EditText)findViewById(R.id.editText_fn);
        etLname = (EditText)findViewById(R.id.editText_ln);
        etQual = (EditText)findViewById(R.id.editText_q);
        bsave = (Button)findViewById(R.id.button_send);

        bsave.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {





    }
}
