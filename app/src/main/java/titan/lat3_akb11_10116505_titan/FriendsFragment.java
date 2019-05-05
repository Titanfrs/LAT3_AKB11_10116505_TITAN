package titan.lat3_akb11_10116505_titan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import titan.lat3_akb11_10116505_titan.Adapter.FriendAdapter;
import titan.lat3_akb11_10116505_titan.Model.FriendsModel;

public class FriendsFragment extends Fragment {



    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);



        ArrayList<FriendsModel> friendsModels = new ArrayList<>();
        friendsModels.add(new FriendsModel(R.drawable.dp,"Team Beng-Beng"));
        friendsModels.add(new FriendsModel(R.drawable.dp,"Team FREN"));
        friendsModels.add(new FriendsModel(R.drawable.dp,"TEAM UNIKOM"));
        friendsModels.add(new FriendsModel(R.drawable.dp,"TEAM RT06"));

        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r_h);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new FriendAdapter(friendsModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        return myFragmentView;


    }

}
