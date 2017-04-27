package android.hunger.smartbuy.holders;

import android.hunger.smartbuy.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by hunger on 4/27/2017.
 */

public class HomeCategoryViewHolder extends RecyclerView.ViewHolder {
    private RecyclerView recylerview_homecategory;
    private GridLayoutManager gridLayoutManager;


    public HomeCategoryViewHolder(View itemView) {
        super(itemView);
        recylerview_homecategory = (RecyclerView) itemView.findViewById(R.id.recyclerview_homecategory);
        gridLayoutManager=new GridLayoutManager(itemView.getContext(),4);
        recylerview_homecategory.setLayoutManager(gridLayoutManager);

    }


}
