package com.optimusbank.optiverseetoken.ui.CardActivation;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public  class card_activity extends AppBaseActivity<card_mvp_view, card_presenter> implements card_mvp_view{


    @Override
    protected int getContentView() {
        return R.layout.activity_card;
    }

    @Override
    protected void startUI() {
        initViews();
    }

    @Override
    public void onClick(View v) {

    }



    private void initViews() {

       /// textViewEmail = findViewById(R.id.test);
       /// textViewEmail.setText("new testing sweet Jesus ooooooo");
    }
}
