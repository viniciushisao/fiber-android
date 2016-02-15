package com.hisao.fiber;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity mActivity = this;

        final EditText edFormat = (EditText) findViewById(R.id.edFormat);
        final EditText edAppId = (EditText) findViewById(R.id.edAppId);
        final EditText edUid = (EditText) findViewById(R.id.edUid);
        final EditText edLocale = (EditText) findViewById(R.id.edLocale);
        final EditText edOsVersion = (EditText) findViewById(R.id.edOsVersion);
        final EditText edTimeStamp = (EditText) findViewById(R.id.edTimestamp);
        final EditText edGoogleAdId = (EditText) findViewById(R.id.edGoogle_ad_id);
        final EditText edGoogleAdIdLimited = (EditText) findViewById(R.id.edGoogle_ad_id_limited_tracking_enabled);

        Button btnRetrieve = (Button) findViewById(R.id.btnRetrieve);

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean error = false;

                if (!Information.isValidFormat(edFormat.getText().toString())){
                    error = true;
                }else if (!Information.isValidAppid(edAppId.getText().toString())){
                    error = true;
                }else if (!Information.isValidUid(edUid.getText().toString())){
                    error = true;
                }else if (!Information.isValidLocale(edLocale.getText().toString())){
                    error = true;
                }else if (!Information.isValidOs_version(edOsVersion.getText().toString())){
                    error = true;
                }else if (!Information.isValidTimestamp(edTimeStamp.getText().toString())){
                    error = true;
                }else if (!Information.isValidGoogle_ad_id(edGoogleAdId.getText().toString())){
                    error = true;
                }else if (!Information.isValidGoogle_ad_id_limited_tracking_enabled(edGoogleAdIdLimited.getText().toString())){
                    error = true;
                }

                if (error){
                    Toast.makeText(mActivity, "Check the fields!", Toast.LENGTH_LONG).show();
                }else{


                }
            }
        });

    }

}
