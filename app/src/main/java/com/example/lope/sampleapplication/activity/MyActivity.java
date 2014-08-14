package com.example.lope.sampleapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lope.sampleapplication.R;


public class MyActivity extends Activity {

    //global class variable
    EditText edtQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //findViewById is accessible within the Activity class
        //(Button) is called type casting. findViewById returns a View object so we need to cast it to a Button object
        //this is why btnLogin (btn) naming convention is important
        Button button = (Button) findViewById(R.id.btnSubmit);
        edtQuestion = (EditText) findViewById(R.id.edtQuestion);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = edtQuestion.getText().toString();
                // Let's use the application's context for example purposes
                Toast.makeText(getApplicationContext(), "You clicked me!" + message, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
