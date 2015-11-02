package com.star.sqlitewithoutlitepal;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.star.sqlitewithoutlitepal.databases.MySQLiteBaseHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySQLiteBaseHelper mySQLiteBaseHelper = new MySQLiteBaseHelper(this);
        SQLiteDatabase sqLiteDatabase = mySQLiteBaseHelper.getWritableDatabase();
    }
}
