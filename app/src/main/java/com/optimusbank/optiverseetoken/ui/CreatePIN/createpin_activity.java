package com.optimusbank.optiverseetoken.ui.CreatePIN;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class createpin_activity extends AppBaseActivity<createpin_mvp_view, createpin_presenter> implements createpin_mvp_view{
    @Override
    protected int getContentView() {
        return R.layout.activity_createpin;
    }

    @Override
    protected void startUI() {
        initViews();

    }

    private void initViews() {

        //textViewEmail = findViewById(R.id.test);
        //textViewEmail.setText("new testing sweet Jesus ooooooo");
    }

    @Override
    public void onClick(View view) {

    }
}
