package com.optimusbank.optiverseetoken.ui.ChooseActivationIndividual;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class chooseactivationindividual_activity extends AppBaseActivity<chooseactivationindividual_mvp_view, chooseactivationindividual_presenter> implements chooseactivationindividual_mvp_view {
    @Override
    protected int getContentView() {
        return R.layout.activity_choose_activation_individual;
    }

    @Override
    protected void startUI() {
        initViews();

    }

    @Override
    public void onClick(View view) {

    }

    private void initViews() {

        /// textViewEmail = findViewById(R.id.test);
        /// textViewEmail.setText("new testing sweet Jesus ooooooo");
    }
}


