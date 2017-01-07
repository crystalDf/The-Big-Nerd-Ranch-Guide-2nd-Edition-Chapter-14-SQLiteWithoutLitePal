package com.star.sqlitewithoutlitepal.databases;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.star.sqlitewithoutlitepal.databases.MySQLiteDbSchema.CommentTable;
import com.star.sqlitewithoutlitepal.databases.MySQLiteDbSchema.NewsTable;

public class MySQLiteBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 3;
    private static final String DATABASE_NAME = "demo.db";

    public MySQLiteBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NewsTable.CREATE_TABLE);
        db.execSQL(CommentTable.CREATE_TABLE);
        db.execSQL(CommentTable.ALTER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
                db.execSQL(CommentTable.CREATE_TABLE);
            case 2:
                db.execSQL(CommentTable.ALTER_TABLE);
            default:
        }
    }

}
