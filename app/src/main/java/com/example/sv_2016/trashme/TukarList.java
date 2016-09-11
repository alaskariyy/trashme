package com.example.sv_2016.trashme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by sv-2016 on 9/10/16.
 */
public class TukarList extends ArrayAdapter<String> {
    String[] tukarTitle;
    String[] tukarMin;
    Context context;
    LayoutInflater layoutInflater;

    public TukarList(Context context, String[] tukarTitle, String[] tukarMin) {
        super(context, R.layout.tukar_list, tukarTitle);
        this.tukarTitle = tukarTitle;
        this.tukarMin = tukarMin;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.tukar_list, null);
        }
        TextView tukarTitleView = (TextView)convertView.findViewById(R.id.tukarTitle);
        TextView tukarMinView = (TextView)convertView.findViewById(R.id.tukarMin);

        tukarTitleView.setText(tukarTitle[position]);
        tukarMinView.setText(tukarMin[position]);

        return convertView;
    }
}
