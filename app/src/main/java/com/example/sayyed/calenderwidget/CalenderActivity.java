package com.example.sayyed.calenderwidget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;


public class CalenderActivity extends Activity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_calender);
        Toast.makeText(context,"activity lanuched  ",Toast.LENGTH_SHORT ).show();
    }


}
