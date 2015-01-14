package com.example.thkuo.androidacengine;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by thkuo on 2015/1/14.
 */
public class GetViewSize extends View {

    private String TAG = "GetViewSize";
    private View myView;

    public GetViewSize(Context context,View view){
        super(context);
        myView = view;
        myView = new View(context) {
            @Override
            protected void onLayout(boolean changed, int l, int t, int r, int b) {
                super.onLayout(changed, l, t, r, b);
                int height = myView.getHeight(); //height is ready
                int width = myView.getWidth();
                //Log.i(TAG, )
            }
        };

    }
}
