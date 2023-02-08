package com.example.foodfactory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper  extends SQLiteOpenHelper {
    public static final  String DATABASE_NAME="foodfactory.db";
    public static final  String TABLE_NAME="register";
    public static final  String  COL_1="NameOfTheProduct";
    public static final  String COL_2="Weight";
    public static final  String COL_3="Price";
    public static final  String COL_4="Description";

    public DatabaseHelper(Context context, String name , SQLiteDatabase.CursorFactory factory, int version){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME+"(ID INTERGER PRIMARY KEY  AUTOINCREMENT , NameOfTheProduct TEXT, Weight INT , Price DOUBLE , Description TEXT)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);// drop older table if exists
        onCreate(db);

    }
}
