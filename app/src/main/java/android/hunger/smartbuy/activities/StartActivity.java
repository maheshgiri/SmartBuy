
package android.hunger.smartbuy.activities;

import android.content.Intent;
import android.hunger.smartbuy.R;
import android.hunger.smartbuy.contants.Constants;
import android.hunger.smartbuy.data.DataService;
import android.hunger.smartbuy.models.Offers;
import android.hunger.smartbuy.services.ApiManager;
import android.hunger.smartbuy.services.ApiService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class StartActivity extends AppCompatActivity {

    ApiService apiService;
    Observable<Offers> offersObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        apiService = ApiManager.getApiService();
        offersObservable = apiService.getAllOffers(Constants.TRAKING_ID_VALUE,Constants.TOKEN_VALUE);

        offersObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Offers>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.i("DEBUG", "onNext: "+d);

                    }

                    @Override
                    public void onNext(Offers offers) {

                        Log.i("DEBUG", "onNext: "+offers);
                        DataService.setAllOffers(offers);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("DEBUG", "onNext: "+e.getMessage());

                    }

                    @Override
                    public void onComplete() {
                        startMainActivity();
                    }
                });
    }


    private  void startMainActivity(){
        final Intent mainActivity=new Intent(this,MainActivity.class);
        startActivity(mainActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
