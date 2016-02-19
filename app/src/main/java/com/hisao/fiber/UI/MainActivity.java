package com.hisao.fiber.UI;

/**
 * Created by viniciushisao
 */

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hisao.fiber.Models.Information;
import com.hisao.fiber.R;

public class MainActivity extends AppCompatActivity implements InformationFragment.OnFragmentInteractionListener, RetrieveFiberFragment.OnFragmentInteractionListener {

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
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        Log.d("LOG", "MainActivity:onBackPressed " + count);
        if (count == 0) {
            super.onBackPressed();
            finish();
        } else {
            getFragmentManager().popBackStack();
        }
    }

    @Override
    public void onFragmentInteraction(Information information) {
        RetrieveFiberFragment newFragment = new RetrieveFiberFragment();
        newFragment.setInformation(information);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_information, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
