package android.hunger.smartbuy.services;

import android.hunger.smartbuy.BuildConfig;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/*
import static com.facebook.FacebookSdk.getApplicationContext;
*/

/**
 * Created by mahesh on 9/2/2016.
 */
public class ApiManager {
    private static ApiService apiService;

    // volatile =
    static volatile Retrofit retrofit = null;

    private ApiManager() {
    }

    public static Retrofit getRetrofit() {
        //final SharedPrefManager sharedPrefManager = new SharedPrefManager(getApplicationContext());
        if (retrofit == null) {
            synchronized (ApiManager.class) {
                if (retrofit == null) {
                  /*  ObjectMapper mapper = new ObjectMapper();
                    JacksonConverterFactory factory = JacksonConverterFactory.create(mapper);
                  */
                    //OkHttpClient client = new OkHttpClient();
                    /*client.interceptors().add(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            /*Response response = chain.proceed(chain.request());
                            return response;/*

                            Request request = chain.request().newBuilder().addHeader("authentication", "token " + sharedPrefManager.getAuthToken()).build();
                            return chain.proceed(request);
                        }
                    });*/
                    retrofit = new Retrofit.Builder()
                            .baseUrl(BuildConfig.REST_BASE_URL)
                           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

                        //    .addConverterFactory(PrimitiveConvertorFactory.create())
                            .addConverterFactory(JacksonConverterFactory.create())
                            .client(getOkHttpClient())
                            .build();
                }
            }
        }

        return retrofit;
    }

    public static void initApiService() {
        if (apiService == null) {
            synchronized (ApiManager.class) {
                if (apiService == null) {
                    apiService = getRetrofit().create(ApiService.class);
                }
            }
        }
    }

    public static ApiService getApiService() {
        initApiService();
        return apiService;
    }

    private static OkHttpClient getOkHttpClient() {

        OkHttpClient.Builder okClientBuilder = new OkHttpClient.Builder();
     /*   okClientBuilder.addInterceptor(new TimberLoggingInterceptor());
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okClientBuilder.addInterceptor(httpLoggingInterceptor);
*/
        return okClientBuilder.build();

    }
}
