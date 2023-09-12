package com.optimusbank.optiverseetoken.ui.ValidationCode;

import android.view.View;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class validationcode_activity extends AppBaseActivity<validationcode_mvp_view, validationcode_presenter> implements validationcode_mvp_view{
    @Override
    protected int getContentView() {
        return R.layout.activity_validationcode;
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
