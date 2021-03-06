package projects.nyinyihtunlwin.foodplaces.data.vo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.google.gson.annotations.SerializedName;

import projects.nyinyihtunlwin.foodplaces.persistence.FoodPlacesContract;

/**
 * Created by Dell on 1/15/2018.
 */

public class FeaturedVO {

    @SerializedName("burpple-featured-id")
    private String featuredId;

    @SerializedName("burpple-featured-image")
    private String featuredImage;

    @SerializedName("burpple-featured-title")
    private String featuredTitle;

    @SerializedName("burpple-featured-desc")
    private String featuredDesc;

    @SerializedName("burpple-featured-tag")
    private String featuredTag;

    public String getFeaturedId() {
        return featuredId;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public String getFeaturedTitle() {
        return featuredTitle;
    }

    public String getFeaturedDesc() {
        return featuredDesc;
    }

    public String getFeaturedTag() {
        return featuredTag;
    }

    public ContentValues parseToContentValues() {
        ContentValues contentValues = new ContentValues();

        contentValues.put(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_ID, featuredId);
        contentValues.put(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_IMAGE, featuredImage);
        contentValues.put(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_TITLE, featuredTitle);
        contentValues.put(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_DESC, featuredDesc);
        contentValues.put(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_TAG, featuredTag);

        return contentValues;
    }

    public static FeaturedVO parseFromCursor(Context context, Cursor cursor) {

        FeaturedVO featuredVO = new FeaturedVO();

        featuredVO.featuredId = cursor.getString(cursor.getColumnIndex(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_ID));
        featuredVO.featuredImage = cursor.getString(cursor.getColumnIndex(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_IMAGE));
        featuredVO.featuredTitle = cursor.getString(cursor.getColumnIndex(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_TITLE));
        featuredVO.featuredDesc = cursor.getString(cursor.getColumnIndex(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_DESC));
        featuredVO.featuredTag = cursor.getString(cursor.getColumnIndex(FoodPlacesContract.FeaturedEntry.COLUMN_FEATURED_TAG));

        return featuredVO;

    }
}
