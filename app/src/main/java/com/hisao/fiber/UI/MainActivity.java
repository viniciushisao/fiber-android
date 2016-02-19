package com.hisao.fiber.UI;

/**
 * Created by viniciushisao
 */

import android.app.Fragment;
import android.app.FragmentManager;
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
        transaction.add(R.id.fragment_information, new InformationFragment());
        transaction.addToBackStack(InformationFragment.TAG);
        transaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    @Override
    public void onFragmentInteraction(Information information) {
        RetrieveFiberFragment newFragment = new RetrieveFiberFragment();
        newFragment.setInformation(information);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_information, newFragment);
        transaction.addToBackStack(RetrieveFiberFragment.TAG);
        transaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        }
        super.onBackPressed();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
