package com.example.shivam.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResourceId=colorResource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word currentWord = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view for data population
        TextView mword = (TextView) convertView.findViewById(R.id.miwok_text_view);
        TextView dword = (TextView) convertView.findViewById(R.id.default_text_view);
        ImageView image=(ImageView) convertView.findViewById(R.id.image);
        // Populate the data into the template view using the data object
        mword.setText(currentWord.getMiwokTranslation());
        dword.setText(currentWord.getDefaultTranslation());
        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getmImageResouceId());
            image.setVisibility(View.VISIBLE);
        }
        else
        {
            image.setVisibility(View.GONE);
        }
        //Set the theme color of the list view item
        View textContainer=convertView.findViewById(R.id.text_container);
        //Find the color that resource ID maps to
        int color=ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the completed view to render on screen
        return convertView;
    }

}
