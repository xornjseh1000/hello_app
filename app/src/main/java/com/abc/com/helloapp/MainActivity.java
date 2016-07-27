package com.abc.com.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{


    EditText et_first_num,et_second_num;
    Button bt_plus,bt_minus,bt_multi,bt_divide,bt_rest,bt_equal;
    TextView tv_result;
    private int calcResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_first_num = (EditText) findViewById(R.id.et_first_num);
        et_second_num = (EditText) findViewById(R.id.et_second_num);
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_minus = (Button) findViewById(R.id.bt_minus);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_divide = (Button) findViewById(R.id.bt_divide);
        bt_rest = (Button) findViewById(R.id.bt_rest);
        bt_equal = (Button) findViewById(R.id.bt_equal);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_plus.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_divide.setOnClickListener(this);
        bt_rest.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.bt_plus:

            this.setCalcResult(
                Integer.parseInt(et_first_num.getText().toString())
                        +Integer.parseInt(et_second_num.getText().toString()));
            break;
        case R.id.bt_minus:

            this.setCalcResult(
                    Integer.parseInt(et_first_num.getText().toString())
                            -Integer.parseInt(et_second_num.getText().toString()));
            break;
        case R.id.bt_multi:

            this.setCalcResult(
                    Integer.parseInt(et_first_num.getText().toString())
                            *Integer.parseInt(et_second_num.getText().toString()));
            break;
        case R.id.bt_divide:

            this.setCalcResult(
                    Integer.parseInt(et_first_num.getText().toString())
                            /Integer.parseInt(et_second_num.getText().toString()));
            break;
        case R.id.bt_rest:
            this.setCalcResult(
                    Integer.parseInt(et_first_num.getText().toString())
                            %Integer.parseInt(et_second_num.getText().toString()));
            break;
        case R.id.bt_equal:
            this.tv_result.setText("계산결과 : "+this.getCalcResult());
            break;

    }
    }

    public int getCalcResult() {
        return calcResult;
    }

    public void setCalcResult(int calcResult) {
        this.calcResult = calcResult;
    }
}
