package com.optimusbank.optiverseetoken.data.helper.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder implements View.OnClickListener {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);


    protected void setClickListener(View... views) {
        for (View view : views) {
            view.setOnClickListener(this);
        }
    }
}
