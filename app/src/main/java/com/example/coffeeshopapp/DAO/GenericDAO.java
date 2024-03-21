package com.example.coffeeshopapp.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class GenericDAO<T> extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "my_database.db";
    private static final int DATABASE_VERSION = 1;

    public GenericDAO(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    // Phương thức để thực hiện CRUD
    public abstract void add(T item);
    public abstract Cursor getAll();
    public abstract void update(T item);
    public abstract void delete(long id);


   /* // Phương thức để thêm dữ liệu
    public void ThemDLSP(Product sp) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NameProduct", sp.getName());
        values.put("Image", sp.getImage());
        values.put("PriceProduct", sp.getPrice());
        db.insert("Product", null, values);
        db.close();
    }


    // Phương thức để đọc dữ liệu
    public String readData(int id) {
        Cursor cursor = db.query("table_name", new String[]{"column_name"}, "id = ?", new String[]{String.valueOf(id)}, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            String data = cursor.getString(cursor.getColumnIndex("column_name"));
            cursor.close();
            return data;
        }
        return null;
    }

    // Phương thức để cập nhật dữ liệu
    public void updateData(int id, String newData) {
        ContentValues values = new ContentValues();
        values.put("column_name", newData);
        database.update("table_name", values, "id = ?", new String[]{String.valueOf(id)});
    }

    // Phương thức để xóa dữ liệu
    public void deleteData(int id) {
        database.delete("table_name", "id = ?", new String[]{String.valueOf(id)});
    }
*/
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
