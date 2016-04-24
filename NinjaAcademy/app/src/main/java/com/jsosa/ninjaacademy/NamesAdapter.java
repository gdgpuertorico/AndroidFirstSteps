package com.jsosa.ninjaacademy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by joelr on 4/24/2016.
 */
public class NamesAdapter extends RecyclerView.Adapter<NameViewHolder> {

    /**
     * We should always a context to which 'construct" call can be made
     * Inflation and so on.
     */
    private Context context;

    public NamesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_view, null);
        return new NameViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
                holder.nameTextView.setText("Joel " + position);
                holder.cityTextView.setText("Ponce " + position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
