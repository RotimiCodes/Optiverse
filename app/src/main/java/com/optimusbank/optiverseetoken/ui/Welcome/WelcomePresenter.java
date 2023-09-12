package com.optimusbank.optiverseetoken.ui.Welcome;

public class WelcomePresenter {
    private WelcomeMvpView view;

    public WelcomePresenter(WelcomeMvpView view) {
        this.view = view;
    }

    public void onContinueButtonClicked() {
        view.navigateToUserType();
    }
}
