package X;

import android.content.SharedPreferences;

/* renamed from: X.1At  reason: invalid class name and case insensitive filesystem */
public class C24021At {
    public SharedPreferences A00;
    public final Object A01 = new Object();
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final C19890wg A05;

    public static SharedPreferences A00(C24021At r2) {
        SharedPreferences sharedPreferences = r2.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = r2.A05.A00("stickers");
        r2.A00 = A002;
        return A002;
    }

    public C24021At(C19890wg r2) {
        this.A05 = r2;
    }
}
