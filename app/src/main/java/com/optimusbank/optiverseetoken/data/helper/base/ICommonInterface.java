package com.optimusbank.optiverseetoken.data.helper.base;

import android.view.View;

public interface ICommonInterface {

    void setClickListener(View... views);

    void setSubtitle(String subtitle);

    void setToolbarText(String title, String subtitle);

    void setTitle(String title);

    void startUI();

    void stopUI();

    int getLayoutId();

    //int getToolbarId();

    int getMenuId();
}
