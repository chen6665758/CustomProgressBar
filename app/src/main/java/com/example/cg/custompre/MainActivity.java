package com.example.cg.custompre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cg.custompre.custom.mPre;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_Add;
    private Button btn_add2;
    private mPre myPre;

    private int iNum = 50;
    private int oNum = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initControls();
    }

    /**
     * 初始化控件
     */
    private void initControls() {
        myPre = (mPre)findViewById(R.id.myPre);

        btn_Add = (Button)findViewById(R.id.btn_Add);
        btn_Add.setOnClickListener(this);

        btn_add2 = (Button)findViewById(R.id.btn_add2);
        btn_add2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_Add:
                iNum = iNum + 5;
                myPre.setINum(iNum);
                //myPre.setONum(0);
                break;
            case R.id.btn_add2:
                myPre.setONum(0);
                break;
        }
    }
}
