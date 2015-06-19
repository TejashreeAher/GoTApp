package com.example.tejashreeaher.quotesapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tejashreeaher.database.DatabaseHandler;
import com.example.tejashreeaher.model.Quote;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.example.tejashreeaher.quotesapp.R.drawable.general;

/**
 * Created by tejashree.aher on 16/06/15.
 */
public class QuoteActivity extends ActionBarActivity {
    DatabaseHandler dbHandler;
    int totalQuotes;
    Random r = new Random();
    int scale = getScaleToResize();
    Map<String, List<String>> characterImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote);
        dbHandler = new DatabaseHandler(this);
        characterImages = dbHandler.getAllImages();
        totalQuotes = (int) getIntent().getExtras().get("totalQuotes");
        int nextId = r.nextInt(totalQuotes) + 1;
        setQuoteInView(nextId);

        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextId = r.nextInt(totalQuotes) + 1;
                setQuoteInView(nextId);
            }
        });
    }

    public Drawable getScaledImage(Drawable image, float scaleFactor) {

        if ((image == null) || !(image instanceof BitmapDrawable)) {
            return image;
        }

        Bitmap b = ((BitmapDrawable)image).getBitmap();

        int sizeX = Math.round(image.getIntrinsicWidth() * scaleFactor);
        int sizeY = Math.round(image.getIntrinsicHeight() * scaleFactor);

        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, sizeX, sizeY, false);

        image = new BitmapDrawable(getResources(), bitmapResized);

        return image;

    }

    // Decodes image and scales it to reduce memory consumption
    private int getScaleToResize() {
        // Decode image size
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inJustDecodeBounds = true;
//            BitmapFactory.decodeStream(new FileInputStream(f), null, o);

        // The new size we want to scale to
        final int REQUIRED_SIZE=70;

        // Find the correct scale value. It should be the power of 2.
        int scale = 1;
        while(o.outWidth / scale / 2 >= REQUIRED_SIZE &&
                o.outHeight / scale / 2 >= REQUIRED_SIZE) {
            scale *= 2;
        }

        // Decode with inSampleSize
//            BitmapFactory.Options o2 = new BitmapFactory.Options();
//            o2.inSampleSize = scale;
//            return BitmapFactory.decodeStream(new FileInputStream(f), null, o2);

        return scale;
    }
    private void setQuoteInView(int id){
        Quote reqQuote = dbHandler.getQuoteById(id);
        if(reqQuote == null || reqQuote.getQuote() == null || reqQuote.getQuote().isEmpty()){
            int nextId = r.nextInt(totalQuotes) + 1;
            setQuoteInView(nextId);
        }else{
            TextView quoteView = (TextView) findViewById(R.id.quote);
//            Log.i("Quote Activity"," size of characters with images:  "+ characterImages.size());
//            List<String> currentCharacterImages = characterImages.get(reqQuote.getCharacter());
//            Log.i("Quote Activity"," character is : "+ reqQuote.getCharacter());
//            int backGroundDrawable = -1;
//            Drawable d;
//            if(currentCharacterImages == null || currentCharacterImages.size() == 0){
//                Log.i("Quote Activity"," no images for  "+ reqQuote.getCharacter());
//                backGroundDrawable = R.drawable.general_2;
//            }else{
//                Log.i("Quote Activity"," no. of  images for  "+ reqQuote.getCharacter() +" are : "+ currentCharacterImages.size());
//                int randomImageIndex = r.nextInt(currentCharacterImages.size());
//                String imageName = currentCharacterImages.get(randomImageIndex);
//                Log.i("Quote Activity"," Images name selected for  "+ reqQuote.getCharacter()+" is : "+ imageName);
//                backGroundDrawable = getResources().getIdentifier(imageName , "drawable", getPackageName());
//            }
//            Log.i("Quote Activity"," background drawable is  "+ backGroundDrawable);
            quoteView.setText(reqQuote.getQuote() + " - " + reqQuote.getCharacter());
            quoteView.setBackgroundDrawable(getScaledImage(getResources().getDrawable(R.drawable.general_2), getScaleToResize()));
        }
    }

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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
