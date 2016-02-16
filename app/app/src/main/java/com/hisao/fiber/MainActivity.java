package com.hisao.fiber;

import android.app.Activity;
import android.location.SettingInjectorService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity mActivity = this;

        final Spinner spnFormat = (Spinner) findViewById(R.id.spnFormat);
        final EditText edAppId = (EditText) findViewById(R.id.edAppId);
        final EditText edUid = (EditText) findViewById(R.id.edUid);
        final EditText edLocale = (EditText) findViewById(R.id.edLocale);
        final EditText edOsVersion = (EditText) findViewById(R.id.edOsVersion);
        final EditText edTimeStamp = (EditText) findViewById(R.id.edTimestamp);
        final EditText edGoogleAdId = (EditText) findViewById(R.id.edGoogle_ad_id);
        final Spinner spnGoogleAdIdLimited = (Spinner) findViewById(R.id.spntxtGoogle_ad_id_limited_tracking_enabled);
        Button btnRetrieve = (Button) findViewById(R.id.btnRetrieve);

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Testing
//                appid	The Fyber Application ID for your application.	157	yes
                edAppId.setText("157");
//                uid	The unique User ID, as used internally in your application.	player1	yes
                edUid.setText("player1");
//                locale	The locale used for the offer descriptions.	de	yes
                edLocale.setText("de");
//                os_version	Current version of the users Operating System, retrieve via android.os.Build.VERSION.RELEASE	4.1.1	yes
                edOsVersion.setText("4.1.1");
//                timestamp	The time the request is being sent by the device.	1312471066	yes
                edTimeStamp.setText("1312471066");
//                hashkey	The hash that signs the whole request.	eff26c67f527e6817bf6 935c75f8cc5cc5cffac2	yes
//                google_ad_id	The Google advertising ID obtained via AdvertisingIdClient.getAdvertisingIdInfo(mContext).getId();	38400000-8cf0-11bd-b23e-10b96e40000d	yes
                edGoogleAdId.setText("38400000-8cf0-11bd-b23e-10b96e40000d");
//                google_ad_id_limited_tracking_enabled	Retrieves whether the user has limit ad tracking enabled or not. Obtained via AdvertisingIdClient.getAdvertisingIdInfo(mContext).isLimitAdTrackingEnabled()	true or false	Yes

                boolean error = false;

                if (!Information.isValidFormat(spnFormat.getSelectedItem().toString())){
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
                }

                if (error){
                    Toast.makeText(mActivity, "Check the fields!", Toast.LENGTH_LONG).show();
                }else{


//                    final Spinner spnFormat = (Spinner) findViewById(R.id.spnFormat);
//                    final EditText edAppId = (EditText) findViewById(R.id.edAppId);
//                    final EditText edUid = (EditText) findViewById(R.id.edUid);
//                    final EditText edLocale = (EditText) findViewById(R.id.edLocale);
//                    final EditText edOsVersion = (EditText) findViewById(R.id.edOsVersion);
//                    final EditText edTimeStamp = (EditText) findViewById(R.id.edTimestamp);
//                    final EditText edGoogleAdId = (EditText) findViewById(R.id.edGoogle_ad_id);
//                    final Spinner spnGoogleAdIdLimited =

                    Information information = new Information();
                    information.setFormat(spnFormat.getSelectedItem().toString());
                    information.setAppid(edAppId.getText().toString());
                    information.setUid(edUid.getText().toString());
                    information.setLocale(edLocale.getText().toString());
                    information.setOs_version((edOsVersion.getText().toString()));
                    information.setTimestamp(edTimeStamp.getText().toString());
                    information.setGoogle_ad_id(edGoogleAdId.getText().toString());
                    information.setGoogle_ad_id_limited_tracking_enabled(Boolean.valueOf(spnGoogleAdIdLimited.getSelectedItem().toString()));

                    Log.d("VINICIUS", information.getHashkey() );
                    ;
            }
            }
        });

    }

}
