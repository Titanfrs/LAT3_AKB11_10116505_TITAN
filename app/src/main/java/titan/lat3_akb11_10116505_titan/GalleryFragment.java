package titan.lat3_akb11_10116505_titan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import titan.lat3_akb11_10116505_titan.Adapter.GalleryAdapter;
import titan.lat3_akb11_10116505_titan.Model.GalleryModel;

public class GalleryFragment extends Fragment {


    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragmentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ArrayList<GalleryModel> galleryModels = new ArrayList<>();
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));
        galleryModels.add(new GalleryModel(R.drawable.dp));

        mRecycleView = myFragmentView.findViewById(R.id.recyclerViewGrid);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getActivity(),3);
        mAdapter = new GalleryAdapter(galleryModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
//        RecyclerView recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recyclerViewGrid);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//
//        GalleryAdapter galleryAdapter = new GalleryAdapter(getActivity(),personNames,personImages);
//        recyclerView.setAdapter(galleryAdapter);
        return myFragmentView;
    }

}
