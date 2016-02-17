package com.hisao.fiber.Models;

import com.google.gson.annotations.SerializedName;
import com.hisao.fiber.Models.OfferThumbnail;
import com.hisao.fiber.Models.OfferTypes;

import java.util.List;

/**
 * Created by vinicius on 2/17/2016.
 */
public class ResponseOffer {

//    - link
//    - title
//    - offer_id
//    - teaser
//    - required_actions
//    - thumbnail (class)
//    - offer_types[] (class)
//    - payout
//    - time_to_payout (class)

    @SerializedName("link")
    private String mLink;

    @SerializedName("title")
    private String mTitle;

    @SerializedName("offer_id")
    private String mOfferId;

    @SerializedName("teaser")
    private String mTeaer;

    @SerializedName("required_actions")
    private String mRequiredActions;

    @SerializedName("thumbnail")
    private OfferThumbnail mThumbnail;

    @SerializedName("offer_types")
    private List<OfferTypes> mOfferTypes;

    @SerializedName("payout")
    private String mPayout;

    @SerializedName("time_to_payout")
    private String mTimeToPayout;


}
