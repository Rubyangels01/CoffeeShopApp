package com.example.coffeeshopapp.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.coffeeshopapp.model.Product;

public class ProductDAO extends GenericDAO<Product>{
    public ProductDAO(Context context) {
        super(context);
    }
    private static final String TABLE_NAME = "Product";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_NAME = "NameProduct";
    private static final String COLUMN_IMAGE = "Image";
    private static final String COLUMN_PRICE = "PriceProduct";

    @Override
    public void add(Product item) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NameProduct", item.getName());
        values.put("Image", item.getImage());
        values.put("PriceProduct", item.getPrice());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }


    @Override
    public Cursor getAll() {
        SQLiteDatabase db = getReadableDatabase();
        // Chỉ truy vấn các cột dữ liệu khác mà không bao gồm cột ID
        return db.query(TABLE_NAME, new String[]{COLUMN_NAME, COLUMN_IMAGE, COLUMN_PRICE}, null, null, null, null, null);
    }


    @Override
    public void update(Product item) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, item.getName());
        values.put(COLUMN_IMAGE, item.getImage());
        values.put(COLUMN_PRICE, item.getPrice());
        db.update(TABLE_NAME, values, COLUMN_ID + " = ?", new String[]{String.valueOf(item.getId())});
        db.close();
    }

    @Override
    public void delete(long id) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
    }
}
