package com.optimusbank.optiverseetoken.data.helper.base;

import androidx.lifecycle.Lifecycle;

public interface Presenter <V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

    void attachLifecycle(Lifecycle lifecycle);

    void detachLifecycle(Lifecycle lifecycle);

    void onPresenterCreated();

    void onPresenterDestroy();

}
