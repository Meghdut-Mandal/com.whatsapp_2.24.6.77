package X;

import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0zN  reason: invalid class name and case insensitive filesystem */
public class C21520zN extends C20800yB {
    public static SharedPreferences A03;
    public final C20810yC A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap(0);
    public final C19890wg A02;

    public synchronized SharedPreferences A0F() {
        SharedPreferences sharedPreferences;
        sharedPreferences = A03;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("ab-prechatd-props");
            A03 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C21520zN(C20810yC r9, C20790yA r10, C19890wg r11, C19770wU r12, AnonymousClass005 r13) {
        super(r10, r11, r12, r13, "ab-prechatd-props");
        this.A00 = r9;
        this.A02 = r11;
    }
}
