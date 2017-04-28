package android.hunger.smartbuy.fragments;

import android.hunger.smartbuy.R;
import android.hunger.smartbuy.adaptors.HomeRecyclerAdaptorParent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hunger on 4/27/2017.
 */

public class HomeFragment extends Fragment {

    private RecyclerView recyclerview_home;
    private LinearLayoutManager linearLayoutManager;
    private HomeRecyclerAdaptorParent homeRecyclerAdaptorParent;

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerview_home=(RecyclerView) view.findViewById(R.id.recyclerview_home);
        linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerview_home.setLayoutManager(linearLayoutManager);
        homeRecyclerAdaptorParent=new HomeRecyclerAdaptorParent(getContext());
        recyclerview_home.setAdapter(homeRecyclerAdaptorParent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

}
