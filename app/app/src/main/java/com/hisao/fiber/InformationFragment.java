package com.hisao.fiber;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InformationFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InformationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InformationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public InformationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InformationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InformationFragment newInstance(String param1, String param2) {
        InformationFragment fragment = new InformationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_information, container, false);
        final Spinner spnFormat = (Spinner) inflate.findViewById(R.id.spnFormat);
        final EditText edAppId = (EditText) inflate.findViewById(R.id.edAppId);
        final EditText edUid = (EditText) inflate.findViewById(R.id.edUid);
        final EditText edLocale = (EditText) inflate.findViewById(R.id.edLocale);
        final EditText edOsVersion = (EditText) inflate.findViewById(R.id.edOsVersion);
        final EditText edTimeStamp = (EditText) inflate.findViewById(R.id.edTimestamp);
        final EditText edGoogleAdId = (EditText) inflate.findViewById(R.id.edGoogle_ad_id);
        final Spinner spnGoogleAdIdLimited = (Spinner) inflate.findViewById(R.id.spntxtGoogle_ad_id_limited_tracking_enabled);
        Button btnRetrieve = (Button) inflate.findViewById(R.id.btnRetrieve);

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


        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
                    Toast.makeText(getContext(), "Check the fields!", Toast.LENGTH_LONG).show();
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

                    mListener.onFragmentInteraction(information);
                    ;
                }
            }
        });

        return inflate;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Information information);
    }
}
