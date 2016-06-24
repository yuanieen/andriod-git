package com.example.handsome.finalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class database extends ActionBarActivity {

    SQLiteDatabase db;
    DBOpenHelper openhelper;

    String DATABASE_TABLE = "relationshiptable";
    //建立column
    String DATABASE_CREATETABLE = "create table " +
            DATABASE_TABLE + "(稱謂, 父, 母, 兄, 弟, 姐， 妹， 子, 女, 夫, 妻);";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openhelper = new DBOpenHelper(this);
        db = openhelper.getWritableDatabase();
        //使用insert指令
        ContentValues cv = new ContentValues();
        cv.put("稱謂", "父");
        cv.put("父", "祖父");
        cv.put("母", "祖母");
        cv.put("兄", "伯父");
        cv.put("弟", "叔父");
        cv.put("姐", "姑姑");
        cv.put("妹", "姑姑");
        cv.put("子", "自己哥哥弟弟");
        cv.put("女", "自己姐姐妹妹");
        cv.put("夫", "XX");
        cv.put("妻", "母親");
        db.insert(DATABASE_TABLE, null, cv);
        //第二筆資料開始使用execSQL指令使用SQL指令
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(母," + "'外祖父'" + "," + "'外祖母'" + "," + "'大舅舅'" + "," + "'小舅舅'" + "," + "'阿姨'" + "," + "'阿姨'" + "," + "'自己或哥哥或弟弟'" + "," + "'自己或姐姐或妹妹'" + "," + "'父親'" + "," + "'XX'" + ");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(兄," + "'父親'" + "," + "'母親'" + "," + "'兄'" +"," + "'自己或弟弟'" +"," + "'姐姐'" +"," + "'自己或妹妹'" +"," + "'侄子'" +"," +"'姪女'" +"," + "'XX'" +"," +"'嫂子'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(弟," + "'父親'" + "," + "'母親'" + "," + "'自己或哥哥'" +"," + "'弟弟'" +"," + "'自己或姐姐'" +"," + "'妹妹'" +"," + "'侄子'" +"," +"'姪女'" +"," + "'XX'" +"," +"'弟媳'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(姐," + "'父親'" + "," + "'母親'" + "," + "'兄'" +"," + "'自己或弟弟'" +"," + "'姐姐'" +"," + "'自己或妹妹'" +"," + "'外甥'" +"," +"'外甥女'" +"," + "'姐夫'" +"," +"'XX'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(妹," + "'父親'" + "," + "'母親'" + "," + "'自己或哥哥'" +"," + "'弟弟'" +"," + "'自己或姐姐'" +"," + "'妹妹'" +"," + "'外甥'" +"," +"'外甥女'" +"," + "'妹夫'" +"," +"'XX'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(子," + "'自己或丈夫'" + "," + "'自己或妻子'" + "," + "'兒子'" +"," + "'兒子'" +"," + "'女兒'" +"," + "'女兒'" +"," + "'孫子'" +"," +"'孫女'" +"," + "'XX'" +"," +"'兒媳婦'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(女," + "'自己或丈夫'" + "," + "'自己或妻子'" + "," + "'兒子'" +"," + "'兒子'" +"," + "'女兒'" +"," + "'女兒'" +"," + "'外孫'" +"," +"'外孫女'" +"," + "'女婿'" +"," +"'XX'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(夫," + "'公公'" + "," + "'婆婆'" + "," + "'大伯'" +"," + "'小叔'" +"," + "'大姑'" +"," + "'小姑'" +"," + "'兒子'" +"," +"'女兒'" +"," + "'XX'" +"," +"'自己'" +");");
        db.execSQL("insert into " + DATABASE_TABLE +
                " values(妻," + "'岳父'" + "," + "'岳母'" + "," + "'大舅子'" +"," + "'小舅子'" +"," + "'大姨子'" +"," + "'小姨子'" +"," + "'兒子'" +"," +"'女兒'" +"," + "'自己'" +"," +"'XX'" +");");



    }

    @Override
    public void onStop() {
        super.onStop();
        db.execSQL("drop table if exists " + DATABASE_TABLE );
        db.execSQL(DATABASE_CREATETABLE);
        db.close();
    }
    //建立/管理資料庫
    class DBOpenHelper extends SQLiteOpenHelper {
        public DBOpenHelper(Context context) {
            super(context, "demo.db", null, 1);
        }
        //沒有資料庫時建立資料庫
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DATABASE_CREATETABLE);
        }
        //更新資料庫，但此project只有查詢沒有更新，所以沒有動作
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        }
    }
}
