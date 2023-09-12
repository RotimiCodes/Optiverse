package com.optimusbank.optiverseetoken.data.helper.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class AppBaseActivity <V extends MvpView, P extends AppBasePresenter<V>>
        extends AppCompatActivity implements MvpView, View.OnClickListener {



    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        //ButterKnife.bind(this);
        onViewReady(savedInstanceState, getIntent());
        startUI();
    }

    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        //To be used by child activities
    }

    protected abstract int getContentView();

    protected abstract void startUI();


    





}
