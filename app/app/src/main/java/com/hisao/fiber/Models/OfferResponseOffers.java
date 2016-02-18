package com.hisao.fiber.Models;

import java.util.List;

/**
 * Created by vinicius on 2/17/2016.
 */
public class OfferResponseOffers {

//    - link
//    - title
//    - offer_id
//    - teaser
//    - required_actions
//    - thumbnail (class)
//    - offer_types[] (class)
//    - payout
//    - time_to_payout (class)

    private String link;
    private String title;
    private String offer_id;
    private String teaser;
    private String required_actions;
    private OfferResponseOffersThumbnail thumbnail;
    private List<OfferResponseOffersOfferTypes> offer_types;
    private String payout;
    private OfferResponseOffersTimeToPayout time_to_payout;
}
