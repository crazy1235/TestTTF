package com.jacksen.testttf;

import android.graphics.Color;
import android.graphics.Typeface;
import android.renderscript.Type;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.text_view1);
        textView2 = (TextView) findViewById(R.id.text_view2);
        textView3 = (TextView) findViewById(R.id.text_view3);
        textView4 = (TextView) findViewById(R.id.text_view4);
        textView5 = (TextView) findViewById(R.id.text_view5);

        imageView = (ImageView) findViewById(R.id.image_view);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "icomoon.ttf");
        textView1.setTypeface(typeface);
        textView1.setTextSize(50);
        textView1.setTextColor(Color.RED);
        textView1.setText(getResources().getString(R.string.font_icon_home));

        //
        textView2.setTypeface(typeface);
        textView2.setTextColor(Color.rgb(60, 176, 52));
        textView2.setTextSize(60);
        textView2.setText(getResources().getString(R.string.font_icon_bubble));

        //
        textView3.setTypeface(typeface);
        textView3.setTextColor(Color.BLUE);
        textView3.setTextSize(70);
        textView3.setText(getResources().getString(R.string.font_icon_headphones));

        //
        textView4.setTypeface(typeface);
        textView4.setTextColor(Color.GREEN);
        textView4.setTextSize(80);
        textView4.setText(getResources().getString(R.string.font_icon_connection));

        //
        textView5.setTypeface(typeface);
        textView5.setTextColor(Color.BLACK);
        textView5.setTextSize(90);
        textView5.setText(getResources().getString(R.string.font_icon_compass));

        //
    }
}
