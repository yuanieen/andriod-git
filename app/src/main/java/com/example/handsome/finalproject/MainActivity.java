package com.example.handsome.finalproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int fanyi2 = 0;
    static final int fayin2 = 0;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button18;
    private Button button19;
    private EditText edittest1;
    private EditText edittest2;
    private Button plus;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //初始化
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button18.setOnClickListener(fanyi);
        button19.setOnClickListener(fayin);
        answer =(TextView)findViewById(R.id.answer);
        edittest1 = (EditText) findViewById(R.id.edittest1);
        edittest2 = (EditText) findViewById(R.id.edittest2);
        plus = (Button)findViewById(R.id.plus);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("媽媽");
                }
                else{
                    edittest2.setText("媽媽");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("爸爸");
                }
                else{
                    edittest2.setText("爸爸");
                }
            }
        });
        //清空功能clear
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittest1.setText("");
                edittest2.setText("");

            }
        });button5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("哥哥");
                }
                else{
                    edittest2.setText("哥哥");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("姊姊");
                }
                else{
                    edittest2.setText("姊姊");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("兒子");
                }
                else{
                    edittest2.setText("兒子");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("弟弟");
                }
                else{
                    edittest2.setText("弟弟");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("妹妹");
                }
                else{
                    edittest2.setText("妹妹");
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("女兒");
                }
                else{
                    edittest2.setText("女兒");
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("丈夫");
                }
                else{
                    edittest2.setText("丈夫");
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if(edittest1.isFocused()) {
                    edittest1.setText("妻子");
                }
                else{
                    edittest2.setText("妻子");
                }
            }
        });
        //顯示結果----------資料庫未完成/連結
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                answer.setText("結果");

            }
        });

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                edittest1.clearFocus();
                edittest2.requestFocus();
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private View.OnClickListener fanyi = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this,
                    Main2Activity.class);
            startActivityForResult(intent,fanyi2);
        }
    };

    private View.OnClickListener fayin = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent();
            intent.setClass(MainActivity.this,
                    Main3Activity.class);
            startActivityForResult(intent,fayin2);
        }
    };



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
        switch(item.getItemId()) {
            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("關於");
                ad.setMessage("組別：第三組");
                DialogInterface.OnClickListener listener =
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface di,int i){
                            }
                        };
                ad.setPositiveButton("OK",listener);
                ad.show();
                break;
            case R.id.action_settings:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
