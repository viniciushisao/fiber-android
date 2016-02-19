package com.hisao.fiber.UI;

/**
 * Created by viniciushisao
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hisao.fiber.Models.OfferResponseOffers;
import com.hisao.fiber.R;

import java.util.List;


public class OffersAdapter extends BaseAdapter {

    private List<OfferResponseOffers> offerResponseOffersList;
    private Context context;

    public OffersAdapter(List<OfferResponseOffers> offerResponseOffersList, Context context) {
        this.offerResponseOffersList = offerResponseOffersList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.offerResponseOffersList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.offerResponseOffersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.offer_cell, parent, false);
        TextView txtOffer = (TextView) v.findViewById(R.id.txtOffer);
        OfferResponseOffers offerResponseOffers = this.offerResponseOffersList.get(position);
        txtOffer.setText(offerResponseOffers.toString());
        return v;
    }
}
