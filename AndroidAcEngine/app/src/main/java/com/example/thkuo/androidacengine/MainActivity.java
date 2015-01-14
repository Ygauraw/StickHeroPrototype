package com.example.thkuo.androidacengine;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    private String TAG = "MainActivity";
    private LinearLayout mBottomLinearLayout;
    private Button addViewBtn;
    private View initView;
    private int initColumnWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomLinearLayout = (LinearLayout)findViewById(R.id.columnsLinearLayout);
        initView = (View)findViewById(R.id.initView);
        initView.post(new Runnable() {
            @Override
            public void run() {
                initColumnWidth = initView.getHeight(); //height is ready
                Log.i(TAG, "initColumnWidth = "+initColumnWidth);
            }
        });
        //initColumnWidth = initView.getWidth();

        addViewBtn = (Button)findViewById(R.id.button);
        addViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewColumn();

            }


        });
    }

    private void addNewColumn() {
        Log.i(TAG, "addNewColumn BEGIN");

        View destinationView = new View(this);
        //mBottomLinearLayout.addView();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
