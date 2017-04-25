package com.localization;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button mBtnEnglish, mBtnMarathi;
    private TextView mTextView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnEnglish = (Button) findViewById(R.id.btn_english);
        mBtnMarathi = (Button) findViewById(R.id.btn_marathi);
        mTextView = (TextView) findViewById(R.id.text_title);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        mBtnMarathi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String languageToLoad  = "hi"; // your language code
                Locale locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                mTextView.setText(R.string.text_title);
                getSupportActionBar().setTitle(R.string.app_name);
                mBtnMarathi.setText(R.string.btn_marathi);
                mBtnEnglish.setText(R.string.btn_english);

            }
        });

        mBtnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String languageToLoad  = "en"; // your language code
                Locale locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                mTextView.setText(R.string.text_title);
                getSupportActionBar().setTitle(R.string.app_name);

                mBtnMarathi.setText(R.string.btn_marathi);
                mBtnEnglish.setText(R.string.btn_english);
            }
        });
    }
}
