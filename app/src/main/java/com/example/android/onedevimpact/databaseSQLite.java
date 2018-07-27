package com.example.android.onedevimpact;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseSQLite extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="SQLiteTest.db";
    public static final String TABLE_NAME ="access_table";
    public static final String ID ="ID";
    public static final String COL_1 ="EMAIL";
    public static final String COL_2 ="PASSWORD";
    public static final String COL_3 ="MOBILE";

    public databaseSQLite(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT, PASSWORD TEXT, MOBILE INTEGER)");
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(db);
    }
}
