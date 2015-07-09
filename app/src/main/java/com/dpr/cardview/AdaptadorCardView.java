package com.dpr.cardview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;

/**
 * Created by jjimenez on 07/07/2015.
 */
public class AdaptadorCardView extends ArrayAdapter<ContentData> {

    ContentData[] data;

    public AdaptadorCardView(Context context, ContentData[] datos) {
        super(context, R.layout.cardview, datos);
        this.data=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        ViewHolder holder;

        if (item == null){

            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.cardview, null);

            holder = new ViewHolder();
            holder.title = (TextView)item.findViewById(R.id.txt1);
            holder.description = (TextView)item.findViewById(R.id.txt2);
            holder.carta = (CardView)item.findViewById(R.id.card2);
            item.setTag(holder);

        }else{

            holder = (ViewHolder)item.getTag();

        }
            holder.title.setText(data[position].getTitle());
            holder.description.setText(data[position].getdescription());

            return(item);
    }
    static class ViewHolder {
        TextView title;
        TextView description;
        CardView carta;
    }
}
