package com.optimusbank.optiverseetoken.ui.Splash;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;


public class splash_activity extends AppBaseActivity<splash_mvp_view, splash_presenter> implements splash_mvp_view {

    private TextView textViewEmail;

    @Override
    protected int getContentView() {
        return R.layout.activity_splash;
    }

    @Override
    protected void startUI() {

        initViews();
        //Toast.makeText(this, "hellooooooooooooooooooooo", Toast.LENGTH_LONG).show();
        Toast.makeText(getBaseContext(), "Reason can not be blank", Toast.LENGTH_SHORT).show();
        //WebView webView = (WebView) findViewById(R.id.web_view);
        //webView.loadUrl(Constants.ServerUrl.ABOUT_US);
        //initToolbar();

    }


    private void initViews() {

        textViewEmail = findViewById(R.id.test);
        textViewEmail.setText("new testing sweet Jesus ooooooo");
    }


    @Override
    public void onClick(View v) {

    }
}
