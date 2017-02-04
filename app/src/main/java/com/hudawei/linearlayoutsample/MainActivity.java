package com.hudawei.linearlayoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text_one=(TextView)findViewById(R.id.text_one);
        TextView text_two=(TextView)findViewById(R.id.text_two);
        TextView text_three=(TextView)findViewById(R.id.text_three);
        setWeight(text_one,1);
        setWeight(text_two,1.5f);
        setWeight(text_three,2);

    }

    /**
     * 代码设置权重
     * @param textView
     * @param weight
     */
    public void setWeight(TextView textView,float weight){
        LayoutParams params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT,weight);
        textView.setLayoutParams(params);
    }
}
