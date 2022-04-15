package com.android.simpleasynctask19110217;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    AsyncTaskClass asyncTaskClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void handleSleep(View view)  {
       asyncTaskClass =  new AsyncTaskClass(MainActivity.this);
       asyncTaskClass.execute();
     }
}