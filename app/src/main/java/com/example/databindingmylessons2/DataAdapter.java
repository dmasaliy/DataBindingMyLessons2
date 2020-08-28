package com.example.databindingmylessons2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingConversion;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter {

    @BindingAdapter({"android:url", "android:placeholder"})
       public static void loadByUrl(ImageView imageView, String url, Drawable placeholder){
        Picasso.get().load(url).error(placeholder).into(imageView);
    }


    @BindingConversion
    public static String mapToString(ArrayList<String> strings){
        return strings.toString();
    }
}

