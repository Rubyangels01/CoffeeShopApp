package com.example.coffeeshopapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.database.Cursor;
import android.os.Bundle;

import com.example.coffeeshopapp.Adapter.RecycleViewAdapterProduct;
import com.example.coffeeshopapp.DAO.ProductDAO;
import com.example.coffeeshopapp.R;
import com.example.coffeeshopapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProductActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleViewAdapterProduct adapter;
    private ProductDAO productDAO;
    private List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
       recyclerView = findViewById(R.id.);
        productDAO = new ProductDAO(this);
        Cursor cursor = productDAO.getAll();
        productList =new ArrayList<>();// Lấy danh sách sản phẩm từ cơ sở dữ liệu hoặc nguồn dữ liệu khác
        // Kiểm tra cursor không rỗng và di chuyển con trỏ đến dòng đầu tiên
        if (cursor != null && cursor.moveToFirst()) {
            do {
                // Đọc dữ liệu từ cursor và tạo đối tượng Product

            /*    String name = cursor.getString(cursor.getColumnIndex("NameProduct"));
                String image = cursor.getString(cursor.getColumnIndex("Image"));
                double price = cursor.getDouble(cursor.getColumnIndex("PriceProduct"));
               */
                String name = cursor.getString(1);
                String image = cursor.getString(2);
                double price = cursor.getDouble(3);
                Product product = new Product( name, image, price);

                // Thêm sản phẩm vào danh sách
                productList.add(product);
            } while (cursor.moveToNext());

            // Đóng cursor sau khi sử dụng
            cursor.close();
        }
                adapter = new RecycleViewAdapterProduct(productList);
        recyclerView.setAdapter(adapter);
        // định dạng
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}