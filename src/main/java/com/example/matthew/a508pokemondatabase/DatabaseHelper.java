//package com.example.matthew.a508pokemondatabase;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
///**
// * Created by Matthew on 4/22/2018.
// */
//
//public class DatabaseHelper extends SQLiteOpenHelper {
//    // Database Info
//    private static final String DATABASE_NAME = "pokemonDatabase";
//    private static final int DATABASE_VERSION = 1;
//
//    // Table Names
//    private static final String TABLE_POKEMON = "Pokemon";
//    private static final String TABLE_CHARACTERISTICS = "Characteristics";
//    private static final String TABLE_MOVES = "Moves";
//    private static final String TABLE_TEAM = "Pokemon";
//    private static final String TABLE_BASESTATS = "Base_Stats";
//    private static final String TABLE_ITEMS = "Items";
//
//    // Pokemon Table Columns
//    private static final String KEY_POKEMON_NUMBER = "pokemon_number";
//    private static final String KEY_POKEMON_NAME = "pokemon_name";
//    private static final String KEY_SPECIES = "species";
//
//    // Moves Table Columns
//    private static final String KEY_POKE_NAME = "pokemon_name";
//    private static final String KEY_TYPE1 = "type_1";
//    private static final String KEY_TYPE2 = "type_2";
//
//    // Characteristics Table Columns
//    private static final String KEY_MOVE_NAME = "move_name";
//    private static final String KEY_MOVE_TYPE = "type_1";
//    private static final String KEY_STATUS = "status";
//    private static final String KEY_POWER_DAMAGE = "power_damage";
//    private static final String KEY_ACCURACY = "accuracy";
//    private static final String KEY_PP = "PP";
//    private static final String KEY_EFFECT = "status";
//
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    // Called when the database connection is being configured.
//    // Configure database settings for things like foreign key support, write-ahead logging, etc.
//    @Override
//    public void onConfigure(SQLiteDatabase db) {
//        super.onConfigure(db);
//        db.setForeignKeyConstraintsEnabled(true);
//    }
//
//    // Called when the database is created for the FIRST time.
//    // If a database already exists on disk with the same DATABASE_NAME, this method will NOT be called.
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String CREATE_POSTS_TABLE = "CREATE TABLE " + TABLE_POSTS +
//                "(" +
//                KEY_POST_ID + " INTEGER PRIMARY KEY," + // Define a primary key
//                KEY_POST_USER_ID_FK + " INTEGER REFERENCES " + TABLE_USERS + "," + // Define a foreign key
//                KEY_POST_TEXT + " TEXT" +
//                ")";
//
//        String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USERS +
//                "(" +
//                KEY_USER_ID + " INTEGER PRIMARY KEY," +
//                KEY_USER_NAME + " TEXT," +
//                KEY_USER_PROFILE_PICTURE_URL + " TEXT" +
//                ")";
//
//        db.execSQL(CREATE_POSTS_TABLE);
//        db.execSQL(CREATE_USERS_TABLE);
//    }
//
//    // Called when the database needs to be upgraded.
//    // This method will only be called if a database already exists on disk with the same DATABASE_NAME,
//    // but the DATABASE_VERSION is different than the version of the database that exists on disk.
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        if (oldVersion != newVersion) {
//            // Simplest implementation is to drop all old tables and recreate them
//            db.execSQL("DROP TABLE IF EXISTS " + TABLE_POSTS);
//            db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
//            onCreate(db);
//        }
//    }
//}
