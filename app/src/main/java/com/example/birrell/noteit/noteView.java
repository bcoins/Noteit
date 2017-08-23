package com.example.birrell.noteit;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by birrell on 2017/8/23.
 */

public class noteView extends LinearLayout {
    private TextView note_content;
    public noteView(Context context) {
        super(context);
        init(context);

    }


    public noteView(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    public noteView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public noteView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    private void init(Context context) {
        LinearLayout note = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.note,this);
        note_content=(TextView)note.findViewById(R.id.note_content);
    }

    public void setContent(String content){
        note_content.setText(content);
    }



}
