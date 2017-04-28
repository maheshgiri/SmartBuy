package android.hunger.smartbuy.adaptors;

import android.content.Context;
import android.hunger.smartbuy.R;
import android.hunger.smartbuy.holders.HomeViewHolderParent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hunger on 4/27/2017.
 */

public class HomeRecyclerAdaptorParent extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private LayoutInflater layoutInflater;
    private GridLayoutManager gridLayoutManager;

    public HomeRecyclerAdaptorParent(Context context) {
        mContext = context;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.viewholder_home, parent, false);
        HomeViewHolderParent homeViewHolderParent = new HomeViewHolderParent(view);
        return homeViewHolderParent;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HomeViewHolderParent homeViewHolderParent = (HomeViewHolderParent) holder;
        gridLayoutManager = new GridLayoutManager(mContext, 4);
        homeViewHolderParent.getRecylerview_homecategory().setLayoutManager(gridLayoutManager);
        homeViewHolderParent.getRecylerview_homecategory().setAdapter(new HomeCategoryRecyclerAdaptorChild(mContext));
    }

    @Override
    public int getItemCount() {
        return 10;
    }


}
