package com.moringaschool.alphabets;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter (Context context, String[] letters){
        this.mContext = context;
        this.mLetters = letters;

    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView==null){
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            letterView.setText(mLetters[position]);

        }
        else{
            gridView = (View) convertView;
        }
        return gridView;
    }
}
