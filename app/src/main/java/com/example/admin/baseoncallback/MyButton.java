package com.example.admin.baseoncallback;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.Toast;

public class MyButton extends android.support.v7.widget.AppCompatButton {
    Context context;
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.d("com.sise" , "the onKeyDown in MyButton");
        Toast.makeText(context,"MyButton is onclick",Toast.LENGTH_LONG).show();
        //返回true，表明该事件不会向外扩散
        return true;
    }


}
