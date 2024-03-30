package X;

import android.util.LruCache;

/* renamed from: X.9Fy  reason: invalid class name and case insensitive filesystem */
public class C192169Fy {
    public static C192169Fy A01;
    public final LruCache A00;

    public C192169Fy(int i) {
        this.A00 = new LruCache(i <= 0 ? 5 : i);
    }
}
