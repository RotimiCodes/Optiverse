package com.optimusbank.optiverseetoken.ui.ChooseActivationCorporate;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class chooseactivationcorporate_activity extends AppBaseActivity<chooseactivationcorporate_mvp_view, chooseactivationcorporate_presenter> implements chooseactivationcorporate_mvp_view {
    @Override
    protected int getContentView() {
        return R.layout.activity_chooseactivationcorporate;
    }

    @Override
    protected void startUI() {
        initViews();

    }

    @Override
    public void onClick(View view) {

    }

    private void initViews() {

        //textViewEmail = findViewById(R.id.test);
        //textViewEmail.setText("new testing sweet Jesus ooooooo");
    }
}

