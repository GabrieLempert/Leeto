package com.example.foodfun_v2.model.database;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME_PREFIX = "trip_database_";
    private static final String DATABASE_EXTENSION = ".db";
    private final String userId;

    public DBHelper(Context context,String userId) {
        super(context, getDatabaseName(userId), null, DATABASE_VERSION);
        this.userId = userId;

    }
    private static String getDatabaseName(String userId) {
        return DATABASE_NAME_PREFIX + userId + DATABASE_EXTENSION;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the tables
        db.execSQL("CREATE TABLE " + TripContract.TripEntry.TABLE_NAME + " ("
                + TripContract.TripEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TripContract.TripEntry.COLUMN_NAME + " TEXT NOT NULL,"
                + TripContract.TripEntry.COLUMN_START_DATE + " TEXT,"
                + TripContract.TripEntry.COLUMN_END_DATE + " TEXT)");

        db.execSQL("CREATE TABLE " + TripContract.MealEntry.TABLE_NAME + " ("
                + TripContract.MealEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TripContract.MealEntry.COLUMN_TRIP_ID + " INTEGER,"
                + TripContract.MealEntry.COLUMN_NAME + " TEXT NOT NULL,"
                + TripContract.MealEntry.COLUMN_DATE + " TEXT,"
                + "FOREIGN KEY(" + TripContract.MealEntry.COLUMN_TRIP_ID + ") REFERENCES "
                + TripContract.TripEntry.TABLE_NAME + "(" + TripContract.TripEntry._ID + "))");

        db.execSQL("CREATE TABLE " + TripContract.IngredientEntry.TABLE_NAME + " ("
                + TripContract.IngredientEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TripContract.IngredientEntry.COLUMN_MEAL_ID + " INTEGER,"
                + TripContract.IngredientEntry.COLUMN_NAME + " TEXT NOT NULL,"
                + TripContract.IngredientEntry.COLUMN_QUANTITY + " TEXT,"
                + "FOREIGN KEY(" + TripContract.IngredientEntry.COLUMN_MEAL_ID + ") REFERENCES "
                + TripContract.MealEntry.TABLE_NAME + "(" + TripContract.MealEntry._ID + "))");

        db.execSQL("CREATE TABLE " + TripContract.SupplyEntry.TABLE_NAME + " ("
                + TripContract.SupplyEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TripContract.SupplyEntry.COLUMN_TRIP_ID + " INTEGER,"
                + TripContract.SupplyEntry.COLUMN_NAME + " TEXT NOT NULL,"
                + TripContract.SupplyEntry.COLUMN_QUANTITY + " TEXT,"
                + "FOREIGN KEY(" + TripContract.SupplyEntry.COLUMN_TRIP_ID + ") REFERENCES "
                + TripContract.TripEntry.TABLE_NAME + "(" + TripContract.TripEntry._ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Implement migration logic if needed
    }
}
