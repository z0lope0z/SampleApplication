package com.metricbpo.myapplication2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.metricbpo.myapplication2.app.R;
import com.metricbpo.myapplication2.task.RequestTask;

/**
 * a background thread cannot access the main thread
 * http://developer.android.com/guide/components/processes-and-threads.html
 * <p/>
 * how to make it better
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //findViewById is accessible within the Activity class
        //(Button) is called type casting. findViewById returns a View object so we need to cast it to a Button object
        //this is why btnLogin (btn) naming convention is important
        Button button = (Button) findViewById(R.id.btnSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Let's use the application's context for example purposes
                Toast.makeText(getApplicationContext(), "You clicked me!", Toast.LENGTH_SHORT);

                // Launch the request object like so
                new RequestTask().execute();
            }
        });
    }

}