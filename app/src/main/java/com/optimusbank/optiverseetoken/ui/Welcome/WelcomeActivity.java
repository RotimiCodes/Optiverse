package com.optimusbank.optiverseetoken.ui.Welcome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.optimusbank.optiverseetoken.R;
import com.optimusbank.optiverseetoken.ui.UserType.usertype_activity;

public class WelcomeActivity extends AppCompatActivity implements WelcomeMvpView {
    private WelcomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        presenter = new WelcomePresenter(this);

        Button continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onContinueButtonClicked();
            }
        });
    }

    @Override
    public void navigateToUserType() {
        Intent intent = new Intent(this, usertype_activity.class);
        startActivity(intent);
    }
}
