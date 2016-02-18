package com.hisao.fiber.UI;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.hisao.fiber.Models.OfferResponseOffers;

import java.util.List;

/**
 * Created by vinicius on 2/18/2016.
 */


public class OffersAdapter extends BaseAdapter {

    private List<OfferResponseOffers> offerResponseOffersList;
    private Context context ;

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
        return null;
    }
}
