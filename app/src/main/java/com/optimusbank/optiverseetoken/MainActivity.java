package com.optimusbank.optiverseetoken;

import com.optimusbank.optiverseetoken.data.helper.base.AppBaseActivity;

import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppBaseActivity {


    private TextView textViewEmail;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
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
      textViewEmail.setText("new testing");
    }


    @Override
    public void onClick(View v) {

    }
}