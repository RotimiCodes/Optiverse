package com.optimusbank.optiverseetoken.data.helper.base;

import android.view.View;

public interface ItemLongClickListener<T> {

    void onItemLongClick(View v, T item);

    void onItemLongClick(View v, T item, int position, int listSize);
}
