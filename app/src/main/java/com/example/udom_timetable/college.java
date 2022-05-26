package com.example.udom_timetable;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class college extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_college, container, false);
        Spinner spinner =root.findViewById(R.id.spinner);
       LinearLayout layout=root.findViewById(R.id.linear);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.list_college, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), item, Toast.LENGTH_SHORT).show();
                String itemm=spinner.getSelectedItem().toString();
                if(itemm.equalsIgnoreCase("CIVE")){
                    Cive fragment2 = new Cive();
                    changeLayout(fragment2);
                    Toast.makeText(parent.getContext(), "inafikaaa", Toast.LENGTH_SHORT).show();
                }
                else if(itemm.equalsIgnoreCase("COED")){
                    changeLayout(new Coed());
                    //Toast.makeText(this.getContext(), "haijafikaa", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return root;
    }
    public void changeLayout(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lote, fragment);
        fragmentTransaction.commit();
    }
}