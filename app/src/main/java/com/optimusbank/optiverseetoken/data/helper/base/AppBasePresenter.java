package com.optimusbank.optiverseetoken.data.helper.base;

import android.os.Bundle;

import androidx.lifecycle.Lifecycle;

public class AppBasePresenter <V extends MvpView> implements  Presenter<V>{


    private V mMvpView;
    private Bundle stateBundle;

    @Override
    public void attachView(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public void attachLifecycle(Lifecycle lifecycle) {

    }

    @Override
    public void detachLifecycle(Lifecycle lifecycle) {

    }

    @Override
    public void onPresenterCreated() {

    }

    @Override
    public void onPresenterDestroy() {
        if (stateBundle != null && !stateBundle.isEmpty()) {
            stateBundle.clear();
        }
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }


    /**
     * get MVP view of the Activity
     *
     * @return
     */
    public V getMvpView() {
        return mMvpView;
    }


    /**
     * get Activity bundle state
     *
     * @return
     */
    public Bundle getStateBundle() {
        return stateBundle == null ?
                stateBundle = new Bundle() : stateBundle;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new BasePresenter.MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
