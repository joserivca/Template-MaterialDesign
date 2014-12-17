package com.robercid.materialdesign;

import android.app.*;
import android.os.*;
import android.support.v7.widget.*;
import android.support.v7.app.*;

public class MainActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
    }
}
