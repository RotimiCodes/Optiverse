package com.optimusbank.optiverseetoken.ui.UserType;

import com.optimusbank.optiverseetoken.data.helper.base.AppBasePresenter;
import com.optimusbank.optiverseetoken.ui.UserType.usertype_mvp_view;
import com.optimusbank.optiverseetoken.ui.Welcome.WelcomeMvpView;

public class usertype_presenter extends AppBasePresenter<usertype_mvp_view> {

    private usertype_mvp_view view;

    public void onContinueButtonClicked() {
        view.navigateToUserType();
    }
}
