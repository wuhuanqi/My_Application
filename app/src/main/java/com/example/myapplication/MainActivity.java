package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button bt1;
    private ImageButton bt2;
    private AutoCompleteTextView tv1;
    private String[] res={"beijing1","beijing2","shanghai1","shanghai2","shanghai3"};
    //初始化数组的数据源
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (ImageButton) findViewById(R.id.imageButton);
        bt2.setOnClickListener(this);
        tv1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,res);
        //数据源匹配文本框的内容

        //

        //初始化控件,设置监听1.匿名内部类

        bt1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //在当前方法中监听
                System.out.println("按钮贝蒂安吉");
            }

        });


    }

    @Override
    public void onClick(View v) {
        Log.i("tag","接口方法实现");
    }
}
