package android.hunger.smartbuy.adaptors;

import android.content.Context;
import android.hunger.smartbuy.R;
import android.hunger.smartbuy.holders.HomeCategoryViewHolderChild;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hunger on 4/27/2017.
 */

public class HomeCategoryRecyclerAdaptorChild extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] categories = new String[]{"Deals & Offers",
            "Mobiles and Tablets",
            "Men",
            "Women",
            "TV & Entertaiment",
            "Laptops & Peripherals",
            "All Categories"};

    private int[] images = new int[]{R.drawable.ic_local_offer_black_24dp, R.drawable.ic_phone_iphone_black_24dp
            , R.drawable.ic_tv_black_24dp, R.drawable.ic_local_offer_black_24dp, R.drawable.ic_phone_iphone_black_24dp
            , R.drawable.ic_tv_black_24dp, R.drawable.ic_tv_black_24dp};

    private Context mContext;
    private LayoutInflater layoutInflater;

    public HomeCategoryRecyclerAdaptorChild(Context context) {
        this.mContext = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_recyclerhomecategory, parent, false);
        HomeCategoryViewHolderChild homeCategoryViewHolder = new HomeCategoryViewHolderChild(view);

        return homeCategoryViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HomeCategoryViewHolderChild homeCategoryViewHolderChild = (HomeCategoryViewHolderChild) holder;
        homeCategoryViewHolderChild.imageview_categoryicon.setImageResource(images[position]);
        homeCategoryViewHolderChild.textview_categoryname.setText("" + categories[position]);

    }

    @Override
    public int getItemCount() {
        return categories.length;
    }

}
