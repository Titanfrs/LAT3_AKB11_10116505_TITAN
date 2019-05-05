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

import titan.lat3_akb11_10116505_titan.Adapter.DailyAdapter;
import titan.lat3_akb11_10116505_titan.Model.DailyModel;

public class DailyFragment extends Fragment {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);

        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 05:00 - 05:30 Bangun Tidur"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 05:30 - 05:45 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 05:45 - 06:00 Mandi Pagi"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 06:00 - 09:00 Melakukan Aktifitas Dirumah"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 09:15 - 12:00 Tidur Kembali"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 12:00 - 15:15 Makan Siang"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 15:15 - 17:00 Melakukan Aktifitas Dirumah"));
        dailyModels.add(new DailyModel(R.drawable.calendar,"Pukul 18:30 - 19:00 belajar atau nonton film"));

        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        return myFragmentView;


    }

}
