package com.hisao.fiber.Models;

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

    private String link;
    private String title;
    private String offer_id;
    private String teaser;
    private String required_actions;
    private OfferThumbnail thumbnail;
    private List<OfferTypes> offer_types;
    private String payout;
    private OfferTimeToPayout time_to_payout;
}
