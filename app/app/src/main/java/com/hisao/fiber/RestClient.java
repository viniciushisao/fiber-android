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

    private static GitApiInterface gitApiInterface;
    private static String baseUrl = "http://api.fyber.com/";

    public static GitApiInterface getClient() {
        if (gitApiInterface == null) {

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
            gitApiInterface = client.create(GitApiInterface.class);
        }
        return gitApiInterface;
    }

    public interface GitApiInterface {

        //  @Headers("User-Agent: Retrofit2.0Tutorial-App")
        @GET("/feed/v1/offers.json")
        Call<OfferResponse> getOffer(@Query("q") String params);
    }
}

