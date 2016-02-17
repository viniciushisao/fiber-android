package com.hisao.fiber;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hisao.fiber.Models.OfferError;
import com.hisao.fiber.Models.OfferResponse;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RetrieveFiberFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RetrieveFiberFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RetrieveFiberFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RetrieveFiberFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RetrieveFiberFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RetrieveFiberFragment newInstance(String param1, String param2) {
        RetrieveFiberFragment fragment = new RetrieveFiberFragment();
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


        View inflate = inflater.inflate(R.layout.fragment_retrieve_fiber, container, false);
        final ProgressBar pbMain= (ProgressBar) inflate.findViewById(R.id.pbMain);
        final TextView txtError = (TextView) inflate.findViewById(R.id.txtError);

        pbMain.setVisibility(View.VISIBLE);
        txtError.setVisibility(View.GONE);


        //final List<OfferResponse> offerResponseList = new List<OfferResponse>();
        RestClient.OfferInterface service = RestClient.getClient();
        Call<OfferResponse> call = service.getOffer("tom");
        call.enqueue(new Callback<OfferResponse>() {
            @Override
            public void onResponse(Response<OfferResponse> response) {
                if (response.isSuccess()) {
                    // request successful (status code 200, 201)
                    OfferResponse result = response.body();

                    Log.d("LOG", "RetrieveFiberFragment:onResponse " + result.toString());

                    //offerResponseList = result.getItems();
                    //Log.d("MainActivity", "Items = " + Users.size());
                    //adapter = new UserAdapter(MainActivity.this, Users);
                    //listView.setAdapter(adapter);
                } else {
                    Log.d("LOG", "RetrieveFiberFragment:onResponse error");
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("LOG", "RetrieveFiberFragment:onFailure" + t.toString());
            }
        });


        return inflate;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
        void onFragmentInteraction(Uri uri);
    }
}
