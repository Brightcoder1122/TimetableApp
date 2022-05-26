package com.example.udom_timetable;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class Home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_home, container, false);
        CollageList[] data =new CollageList[]{
                new CollageList(R.drawable.cive,R.drawable.tiba,R.drawable.social_humanity,R.drawable.cnms,"CIVE", "HEALTH", "SOCIAL", "CNMS"),
                new CollageList(R.drawable.cive,R.drawable.tiba,R.drawable.social_humanity,R.drawable.cnms,"CIVE", "HEALTH", "SOCIAL", "CNMS"),
        };
        RecyclerView recyclerView=root.findViewById(R.id.collage_recycler);
        collage_items_adapter adapter=new collage_items_adapter(data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), recyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        return root;
    }
}