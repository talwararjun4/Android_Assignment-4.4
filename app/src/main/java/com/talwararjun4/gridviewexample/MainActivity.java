package com.talwararjun4.gridviewexample;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridViewAdapter gridViewAdapter = null;
    GridView gridView = null;
    List<ImagePOJO> imagePOJOs = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);

        fillList();

        gridViewAdapter = new GridViewAdapter(this,R.layout.grid_item_layout,imagePOJOs);
        gridView.setAdapter(gridViewAdapter);
    }

    private void fillList() {
        imagePOJOs = new ArrayList<ImagePOJO>();
        TypedArray imgsArray = getResources().obtainTypedArray(R.array.image_ids);
        TypedArray imgsNamesArray = getResources().obtainTypedArray(R.array.image_names);
        for(int i=0;i<imgsArray.length();i++){
            ImagePOJO imagePOJO = new ImagePOJO();
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgsArray.getResourceId(i, 1));
            imagePOJO.setImage(bitmap);
            String imageName = imgsNamesArray.getString(i);
            imagePOJO.setImagename(imageName);
            imagePOJOs.add(imagePOJO);
        }
    }
}
