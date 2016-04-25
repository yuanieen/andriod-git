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
    private TextView textView;
    private Button button2;
    private Button button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);
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



        textView = (TextView) findViewById(R.id.editText2);
        button3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.setText("");
            }
        });
        button4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("的");
            }
        });
        button5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("哥哥");
            }
        });
        button6.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("姐姐");
            }
        });
        button7.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("兒子");
            }
        });
        button8.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("弟弟");
            }
        });
        button9.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("妹妹");
            }
        });
        button10.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("女兒");
            }
        });
        button11.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("丈夫");
            }
        });
        button12.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.append("妻子");
            }
        });
        button14.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                textView.setText("");
            }
        });

        button.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                textView.append("媽媽");
            }
            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("爸爸");
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
