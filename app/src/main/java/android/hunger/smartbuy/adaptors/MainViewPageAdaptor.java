package android.hunger.smartbuy.adaptors;

import android.content.Context;
import android.graphics.Typeface;

import android.hunger.smartbuy.R;
import android.hunger.smartbuy.data.DataService;
import android.hunger.smartbuy.utils.FontCache;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by hunger on 12/20/2016.
 */


public class MainViewPageAdaptor extends PagerAdapter {
    //private int[] listImages = {R.drawable.banner_second, R.drawable.banner_third, R.drawable.desktop_bunk};
    private Context mContext;

    public MainViewPageAdaptor(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        View itemView = null;
        Typeface qucikSandRegtypeface = FontCache.getTypeface(mContext, "fonts/Quicksand-Regular.ttf");
        Typeface qucikSandMediumtypeface = FontCache.getTypeface(mContext, "fonts/Quicksand-Medium.ttf");


        itemView = LayoutInflater.from(mContext).inflate(R.layout.banner_layout, container, false);
        TextView textview_title,textview_description;
        textview_description=(TextView) itemView.findViewById(R.id.textview_description);
        textview_title=(TextView) itemView.findViewById(R.id.textview_title);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.banner_image);

        Picasso.with(mContext).load(DataService.getAllOffers().getAllOffersList().get(position).getImageUrls().get(0).getUrl()).into(imageView);
        textview_title.setText(DataService.getAllOffers().getAllOffersList().get(position).getTitle());
        textview_description.setText(DataService.getAllOffers().getAllOffersList().get(position).getDescription());
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((RelativeLayout) object);
    }


}