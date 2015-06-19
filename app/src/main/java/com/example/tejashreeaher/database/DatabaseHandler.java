package com.example.tejashreeaher.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tejashreeaher.model.CharacterImage;
import com.example.tejashreeaher.model.Quote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tejashree.aher on 16/06/15.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "quoteDb";
    private static final String PICTURE_TABLE  = "character_images";

    // Contacts table name
    private static final String TABLE = "series_quotes";
    private static final String ID = "id";
    private static final String CHARACTER = "character";
    private static final String QUOTE = "quote";
    private static final String SERIES = "series";
    private static final String IMAGE = "image";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        ///need to create our quotes table
        String CREATE_QUOTES_TABLE = "CREATE TABLE " + TABLE + "("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + SERIES + " TEXT, " +CHARACTER + " TEXT,"
                + QUOTE + " TEXT NOT NULL UNIQUE" + ")";
        sqLiteDatabase.execSQL(CREATE_QUOTES_TABLE);

        String CREATE_IMAGES_TABLE = "CREATE TABLE " + PICTURE_TABLE + "("
                + CHARACTER + " TEXT, " +IMAGE + " TEXT NOT NULL UNIQUE )";
        sqLiteDatabase.execSQL(CREATE_IMAGES_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(sqLiteDatabase);
    }

    public void addQuote(Quote quote) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CHARACTER, quote.getCharacter());
        values.put(SERIES, quote.getSeries());
        values.put(QUOTE, quote.getQuote());

        // Inserting Row
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }

    public void addCharacterImage(CharacterImage image) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CHARACTER, image.getCharacter());
        values.put(IMAGE, image.getImage());

        // Inserting Row
        db.insert(PICTURE_TABLE, null, values);
        db.close(); // Closing database connection
    }

    // Getting contacts Count
    public int getTotalQuotes() {
        String countQuery = "SELECT  * FROM " + TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int total = cursor.getCount();
        cursor.close();
        // return count
        return total;
    }

    // Getting single contact
    public Map<String, List<String>> getAllImages() {
        String countQuery = "SELECT  * FROM " + PICTURE_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int total = cursor.getCount();
        if(cursor == null){
            return null;
        }
        cursor.moveToFirst();
        HashMap<String, List<String>> images = new HashMap<>();
        int rows = cursor.getCount();
        for(int i=0; i<rows; i++){
            String character = cursor.getString(0);
            String image = cursor.getString(1);
            List<String> imageList = images.get(character);
            if(imageList == null){
                imageList = new ArrayList<>();
                images.put(character, imageList);
            }
            imageList.add(image);
            cursor.moveToNext();
        }
        cursor.close();
        // return count
        return images;
    }

    // Getting single contact
    public Quote getQuoteById(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE, new String[]{ID,
                        SERIES, CHARACTER, QUOTE}, ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if(cursor == null)
            return null;
        if (cursor != null)
            cursor.moveToFirst();
        int i=1;
        Quote currentQuote = new Quote(cursor.getString(i++), cursor.getString(i++), cursor.getString(i++));
        currentQuote.setId(Integer.parseInt(cursor.getString(0)));
        // return contact
        return  currentQuote;
    }
}
