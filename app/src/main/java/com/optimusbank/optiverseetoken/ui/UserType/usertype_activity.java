package com.optimusbank.optiverseetoken.ui.UserType;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.ui.ChooseActivationIndividual.chooseactivationindividual_activity;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

public class usertype_activity extends AppBaseActivity<usertype_mvp_view, usertype_presenter> implements usertype_mvp_view {
    @Override
    protected int getContentView() {
        return R.layout.activity_user_type ;
    }

    @Override
    protected void startUI() {
        initViews();

    }


    @Override
    public void onClick(View view) {
        Button individual_button = findViewById(R.id.individual_button);
         {
                presenter.onContinueButtonClicked();
        };

    }

    private void initViews() {

        /// textViewEmail = findViewById(R.id.test);
        /// textViewEmail.setText("new testing sweet Jesus ooooooo");
    }

    @Override
    public void navigateToUserType() {
        Intent intent = new Intent(usertype_activity.this,chooseactivationindividual_activity.class);
        startActivity(intent);

    }
}


