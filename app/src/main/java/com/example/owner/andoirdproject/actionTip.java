package com.example.owner.andoirdproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Owner on 2017-06-21.
 */

public class actionTip extends AppCompatActivity implements View.OnClickListener {
    Button cool, normal, bad;
    ImageView cool1,normal1,bad1;
    FrameLayout frameLayout;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.action_tip);

        cool = (Button) findViewById(R.id.cool);
        normal = (Button) findViewById(R.id.normal);
        bad = (Button) findViewById(R.id.bad);

        cool1 = (ImageView) findViewById(R.id.cool1);
        normal1 = (ImageView) findViewById(R.id.normal1);
        bad1 = (ImageView) findViewById(R.id.bad1);

        frameLayout = (FrameLayout)findViewById(R.id.FrameLayout);

        cool.setOnClickListener(this);
        normal.setOnClickListener(this);
        bad.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch(v.getId())
        {
            // 빨간색버튼 클릭
            case R.id.cool:
                cool1.setVisibility(View.VISIBLE);
                normal1.setVisibility(View.INVISIBLE);
                bad1.setVisibility(View.INVISIBLE);
                break;

            // 파란색버튼 클릭
            case R.id.normal:
                cool1.setVisibility(View.INVISIBLE);
                normal1.setVisibility(View.VISIBLE);
                bad1.setVisibility(View.INVISIBLE);
                break;

            case R.id.bad:
                cool1.setVisibility(View.INVISIBLE);
                normal1.setVisibility(View.INVISIBLE);
                bad1.setVisibility(View.VISIBLE);
                break;
        }
    }
}
