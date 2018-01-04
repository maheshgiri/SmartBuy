package android.hunger.smartbuy.data;

import android.hunger.smartbuy.models.Offers;

/**
 * Created by USER on 04-01-2018.
 */

public class DataService {

    private static Offers allOffers=new Offers();

    public static Offers getAllOffers() {
        return allOffers;
    }

    public static void setAllOffers(Offers allOffers) {
        DataService.allOffers = allOffers;
    }
}
