package android.hunger.smartbuy.holders;

import android.hunger.smartbuy.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by USER on 28-04-2017.
 */

public class HomeViewHolderParent extends RecyclerView.ViewHolder {
    private RecyclerView recylerview_homecategory;


    public HomeViewHolderParent(View itemView) {
        super(itemView);
        recylerview_homecategory = (RecyclerView) itemView.findViewById(R.id.recyclerview_homecategory);

    }


    public RecyclerView getRecylerview_homecategory() {
        return recylerview_homecategory;
    }


}
