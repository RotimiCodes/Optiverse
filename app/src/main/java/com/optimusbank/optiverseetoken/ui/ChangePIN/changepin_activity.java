package com.optimusbank.optiverseetoken.ui.ChangePIN;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class changepin_activity extends AppBaseActivity<changepin_mvp_view, changepin_presenter> implements changepin_mvp_view{
    @Override
    protected int getContentView() {
        return R.layout.activity_changepin;
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
