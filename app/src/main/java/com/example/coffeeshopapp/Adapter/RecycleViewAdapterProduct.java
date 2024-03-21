package com.example.coffeeshopapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.coffeeshopapp.R;
import com.example.coffeeshopapp.model.Product;

import java.util.List;

public class RecycleViewAdapterProduct extends RecyclerView.Adapter<RecycleViewAdapterProduct.ViewHolder> {
    private List<Product> productList;


    public RecycleViewAdapterProduct(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_for_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.textViewName.setText(product.getName());
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));
        // Load ảnh vào ImageView bằng Glide
        Glide.with(holder.itemView.getContext())
                .load(product.getImage())
                .into(holder.hinh);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public TextView textViewPrice;
        public ImageView hinh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Khởi tạo các thành phần của ViewHolder
            textViewName=itemView.findViewById(R.id.tvNameItem);
            textViewPrice=itemView.findViewById(R.id.tvPriceItem);
            hinh=itemView.findViewById(R.id.imgItem);
        }
    }
}
