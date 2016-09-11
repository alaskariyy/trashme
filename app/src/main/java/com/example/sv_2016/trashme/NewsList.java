package com.example.sv_2016.trashme;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sv-2016 on 9/4/16.
 */
public class NewsList extends ArrayAdapter<String> {
    String[] newsHead;
    String[] newsDescription;
    int[] newsPict;
    Context context;
    LayoutInflater layoutInflater;

    public NewsList(Context context, String[] newsHead, String[] newsDescription, int[] newsPict) {
        super(context, R.layout.news_list, newsHead);
        this.newsHead = newsHead;
        this.newsDescription = newsDescription;
        this.newsPict = newsPict;
        this.context = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.news_list, null);
        }
        TextView newsHeadView = (TextView)convertView.findViewById(R.id.newsHead);
        TextView newsDesView = (TextView)convertView.findViewById(R.id.newsDes);
        ImageView newsPictView = (ImageView)convertView.findViewById(R.id.newsImage);

        newsHeadView.setText(newsHead[position]);
        newsDesView.setText(newsDescription[position]);
        newsPictView.setImageResource(newsPict[position]);

        return convertView;
    }
}
