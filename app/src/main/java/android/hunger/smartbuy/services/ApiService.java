package android.hunger.smartbuy.services;

import android.hunger.smartbuy.contants.Constants;
import android.hunger.smartbuy.models.Offers;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by mahesh on 9/2/2016.
 */
public interface ApiService {





    @GET("affiliate/offers/v1/all/json")
    Observable<Offers> getAllOffers(@Header("Fk-Affiliate-Id")String id,@Header("Fk-Affiliate-Token") String key);


}
