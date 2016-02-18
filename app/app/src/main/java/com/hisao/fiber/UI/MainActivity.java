package com.hisao.fiber.UI;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hisao.fiber.Information;
import com.hisao.fiber.R;
import com.hisao.fiber.UI.InformationFragment;
import com.hisao.fiber.UI.RetrieveFiberFragment;

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
