package com.geektech.classworkapplication6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.classworkapplication6.databinding.ItemRvBinding;

import java.util.ArrayList;

public class MainAdapterRV extends RecyclerView.Adapter<MainAdapterRV.ViewHolder> {

    private ArrayList<String> list =new ArrayList<>();
    private ItemRvBinding binding;

    public void setList(ArrayList<String> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        binding = ItemRvBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull ItemRvBinding binding) {
            super(binding.getRoot());
        }

        public void onBind(String s) {
            binding.tvTitle.setText(s);
        }
    }
}
