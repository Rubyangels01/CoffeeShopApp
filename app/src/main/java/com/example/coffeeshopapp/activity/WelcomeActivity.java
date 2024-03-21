package com.example.coffeeshopapp.activity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coffeeshopapp.DAO.ProductDAO;
import com.example.coffeeshopapp.R;
import com.example.coffeeshopapp.model.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {
    Button btnKhamPha;
    private SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
      //  processCopy();
      //  database=openOrCreateDatabase("DatabaseAppCoffee.db",MODE_PRIVATE,null);
        setControl();
        setEven();
      /*  Cursor cursor = db.query("Product", null, null, null, null, null, null);
        if (cursor != null) {
            String[] columnNames = cursor.getColumnNames();
            for (String columnName : columnNames) {
                Log.d("Column name", columnName);
            }
            cursor.close();
        }
*/
      /*  List<Product> productList = new ArrayList<>();

// Tạo các đối tượng sản phẩm và thêm vào danh sách
        Product product1 = new Product();
        product1.setName("Cafe americano");
        product1.setImage("https://firebasestorage.googleapis.com/v0/b/coffeeapp-c1842.appspot.com/o/caffe-americano_tcm89-2059_w1024_n.jpg?alt=media&token=bc139422-4122-4f1c-8eb5-1e763afc50fe");
        product1.setPrice(5000.0);
        productList.add(product1);

        Product product2 = new Product();
        product2.setName("Cafe Latte");
        product2.setImage("https://firebasestorage.googleapis.com/v0/b/coffeeapp-c1842.appspot.com/o/caffee-latte_tcm89-2062_w1024_n.jpg?alt=media&token=92f2dda5-47e6-4fbd-b61d-36ac16604054");
        product2.setPrice(10000.0);
        productList.add(product2);

// Tạo một đối tượng DAO
        Context context = null;
        ProductDAO productDAO = new ProductDAO(context); // context là đối tượng Context của ứng dụng

// Thêm các sản phẩm từ danh sách vào cơ sở dữ liệu bằng cách sử dụng vòng lặp
        for (Product product : productList) {
            productDAO.add(product);
        }*/
    }

    protected void setControl(){
        btnKhamPha = findViewById(R.id.btnKhamPha);
    }
    protected void setEven(){
        btnKhamPha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }


}