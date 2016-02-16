package com.hisao.fiber;

import android.app.Activity;
import android.app.FragmentManager;
import android.location.SettingInjectorService;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InformationFragment.OnFragmentInteractionListener , RetrieveFiberFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_information, new InformationFragment());
        transaction.addToBackStack(null);
        transaction.commit();


    }

    @Override
    public void onFragmentInteraction(Information information) {
        Log.d("VINICIUS", information.getHashkey());

        RetrieveFiberFragment newFragment = new RetrieveFiberFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_information, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {


    }
}
