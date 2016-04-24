package com.jsosa.ninjaacademy;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by joelr on 4/24/2016.
 */
public class NameViewHolder extends RecyclerView.ViewHolder {

    public TextView nameTextView, cityTextView;

    public NameViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
        cityTextView = (TextView) itemView.findViewById(R.id.city_text_view);
    }
}
