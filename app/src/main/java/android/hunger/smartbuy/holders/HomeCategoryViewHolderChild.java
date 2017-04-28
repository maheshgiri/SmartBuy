package android.hunger.smartbuy.holders;

import android.hunger.smartbuy.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hunger on 4/27/2017.
 */

public class HomeCategoryViewHolderChild extends RecyclerView.ViewHolder {
     public ImageView imageview_categoryicon;
     public TextView textview_categorydiscount, textview_categoryname;


    public HomeCategoryViewHolderChild(View itemView) {
        super(itemView);

        textview_categoryname = (TextView) itemView.findViewById(R.id.textview_categoryname);
        textview_categorydiscount = (TextView) itemView.findViewById(R.id.textview_categorydiscount);
        imageview_categoryicon = (ImageView) itemView.findViewById(R.id.imageview_categoryicon);
    }


}
