package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bejaeger on 12/4/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currWord=getItem(position);

        TextView miwokTextView= (TextView)listItemView.findViewById(R.id.miwok);
        miwokTextView.setText(currWord.getMiwok());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        englishTextView.setText(currWord.getEnglish());
/*
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        iconView.setImageResource(currWord.getImageResourceId());
*/
        return listItemView;
    }
}
