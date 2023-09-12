package com.optimusbank.optiverseetoken.ui.SignIn;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class signin_activity extends AppBaseActivity<signin_mvp_view, signin_presenter> implements signin_mvp_view{
    @Override
    protected int getContentView() {
        return R.layout.activity_signin;
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


