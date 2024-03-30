package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.54c  reason: invalid class name and case insensitive filesystem */
public class C1031354c extends C229616q {
    public final AnonymousClass11g A00;
    public final AnonymousClass12S A01;

    public C1031354c(C19700wN r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        super(r5.A00, r4, "commerce.db", 1);
        this.A01 = r7;
        this.A00 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C224614k.A01(sQLiteDatabase, "cart_item");
        sQLiteDatabase.execSQL("CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_scaled_image_url TEXT, product_quantity INTEGER, product_sale_price_1000 INTEGER, product_sale_start_date TIMESTAMP, product_sale_end_date TIMESTAMP, product_max_available INTEGER, product_variant_props TEXT, product_total_variant_quantity INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_minimum_cart_price INTEGER, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
    }

    public C224114e A07() {
        try {
            String databaseName = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable commerce store", e);
            String databaseName2 = getDatabaseName();
            return C224014d.A01(super.A02(), this.A00, this.A01, databaseName2);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = C132766Ve.A01(sQLiteDatabase, "cart_item");
        if (!TextUtils.isEmpty(A012)) {
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_price_1000", "INTEGER");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_sale_price_1000", "INTEGER");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_sale_start_date", "TIMESTAMP");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_sale_end_date", "TIMESTAMP");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_max_available", "INTEGER");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_variant_props", "TEXT");
            C132766Ve.A03(sQLiteDatabase, A012, "cart_item", "product_total_variant_quantity", "INTEGER");
            C132766Ve.A02(sQLiteDatabase, "cart_item", "product_scaled_image_url", "TEXT");
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_minimum_cart_price INTEGER, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
        C132766Ve.A02(sQLiteDatabase, "cart_applied_promotion", "promotion_minimum_cart_price", "INTEGER");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
