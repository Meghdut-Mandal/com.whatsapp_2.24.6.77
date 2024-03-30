package X;

import android.util.SparseArray;

/* renamed from: X.8zj  reason: invalid class name and case insensitive filesystem */
public enum C188528zj {
    NOT_CACHED(0, "NOT_CACHED"),
    CACHED(1, "CACHED"),
    SEMI_CACHED(2, "SEMI_CACHED");
    
    public static final SparseArray A00 = null;
    public final String mName;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = new SparseArray();
        for (C188528zj r2 : values()) {
            A00.put(r2.mValue, r2);
        }
    }

    /* access modifiers changed from: public */
    C188528zj(int i, String str) {
        this.mValue = i;
        this.mName = str;
    }
}
