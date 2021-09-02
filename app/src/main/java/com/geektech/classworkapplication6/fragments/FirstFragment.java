package com.geektech.classworkapplication6.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.classworkapplication6.MainAdapterRV;
import com.geektech.classworkapplication6.R;
import com.geektech.classworkapplication6.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private ArrayList<String> list = new ArrayList<>();
    private MainAdapterRV adapterRV = new MainAdapterRV();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler();

    }

    private void createList() {
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Good");
        list.add("Hello");


    }

    private void initRecycler() {
        adapterRV.setList(list);
        binding.rvMain.setAdapter(adapterRV);
    }
}