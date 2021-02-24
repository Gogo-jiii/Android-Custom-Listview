package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    private Activity activity;
    private String[] textArray;
    private Integer[] imageArray;


    public MyListAdapter(MainActivity mainActivity, String[] textArray, Integer[] imageArray) {
        super(mainActivity, R.layout.custom_view, textArray);

        this.activity = mainActivity;
        this.textArray = textArray;
        this.imageArray = imageArray;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_view, null,true);

        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);

        textView.setText(textArray[position]);
        imageView.setImageResource(imageArray[position]);

        return rowView;
    }
}
