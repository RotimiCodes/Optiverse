package com.optimusbank.optiverseetoken.ui.GenerateOTP;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class generated_otp_activity extends AppBaseActivity<generated_otp_mvp_view, generated_otp_presenter> implements generated_otp_mvp_view {
    @Override
    protected int getContentView() {
        return R.layout.activity_generatedotp;
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
