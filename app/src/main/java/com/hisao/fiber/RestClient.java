package com.hisao.fiber;

import com.hisao.fiber.Models.OfferResponse;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Ashiq Uz Zoha on 9/13/15.
 * Dhrubok Infotech Services Ltd.
 * ashiq.ayon@gmail.com
 */
public class RestClient {

    private static OfferInterface offerInterface;
    private static String baseUrl = "http://api.fyber.com/";

    public static OfferInterface getClient() {
        if (offerInterface == null) {

            OkHttpClient okClient = new OkHttpClient();
            okClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            });

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverter(String.class, new ToStringConverter())
                    .client(okClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            offerInterface = client.create(OfferInterface.class);
        }
        return offerInterface;
    }

    public interface OfferInterface {
        @GET("/feed/v1/offers.json")
        Call<OfferResponse> getOffers(@Query("format") String format,
                                      @Query("appid") String appid,
                                      @Query("uid") String uid,
                                      @Query("locale") String locale,
                                      @Query("os_version") String os_version,
                                      @Query("timestamp") String timestamp,
                                      @Query("hashkey") String hashkey,
                                      @Query("google_ad_id") String google_ad_id,
                                      @Query("google_ad_id_limited_tracking_enabled") Boolean google_ad_id_limited_tracking_enabled,
                                      @Query("ip") String ip,
                                      @Query("pub0") String pub0,
                                      @Query("page") String page,
                                      @Query("offer_types") String offer_types,
                                      @Query("ps_time") String ps_time,
                                      @Query("device") String device);



//        Response getOffers(@Query("format") String format,
//                           @Query("appid") Integer appid,
//                           @Query("uid") String uid,
//                           @Query("locale") String locale,
//                           @Query("os_version") String os_version,
//                           @Query("timestamp") Long timestamp,
//                           @Query("hashkey") String hashkey,
//                           @Query("google_ad_id") String google_ad_id,
//                           @Query("google_ad_id_limited_tracking_enabled") Boolean google_ad_id_limited_tracking_enabled,
//                           @Query("ip") String ip,
//                           @Query("pub0") String pub0,
//                           @Query("page") Integer page,
//                           @Query("offer_types") String offer_types,
//                           @Query("ps_time") Long ps_time,
//                           @Query("device") String device);
  }
}

