package com.optimusbank.optiverseetoken.ui.WelcomeAfterSignIn;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class welcomeaftersignin_activity extends AppBaseActivity<welcomeaftersignin_mvp_view, welcomeaftersignin_presenter> implements welcomeaftersignin_mvp_view{
    @Override
    protected int getContentView() {
        return R.layout.activity_welcomeaftersignin;
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
