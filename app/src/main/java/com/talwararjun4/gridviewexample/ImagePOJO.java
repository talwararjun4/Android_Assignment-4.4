package com.talwararjun4.gridviewexample;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.widget.ImageView;

/**
 * Created by artalwar on 12/16/2016.
 */

public class ImagePOJO {


    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    String imagename;
    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    private Bitmap image;
}
