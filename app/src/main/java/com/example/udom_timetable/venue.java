package com.example.udom_timetable;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class venue extends Fragment {
 TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_venue, container, false);
        text=root.findViewById(R.id.collegeee);
        text.setText(getActivity().getIntent().getExtras().getString("cive"));
        DataList[] mydata=new DataList[]{

                new DataList("LRB 105","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 106","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 101","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 102","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 103","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 104","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 105","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 105","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 105","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),
                new DataList("LRB 105","cive", R.drawable.ic_baseline_keyboard_arrow_right_24),

        };
        RecyclerView recyclerView=root.findViewById(R.id.recycler);
        MylistAdapter adapter=new MylistAdapter(mydata);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return root;
    }
}