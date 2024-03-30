package X;

import android.util.SparseArray;

/* renamed from: X.8zf  reason: invalid class name and case insensitive filesystem */
public enum C188488zf {
    ;
    
    public static final SparseArray A00 = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        A00 = new SparseArray();
        for (C188488zf r2 : values()) {
            A00.put(r2.mValue, r2);
        }
    }

    public static C188488zf A00(String str, int i, int i2) {
        return new C188488zf(str, i, i2);
    }

    /* access modifiers changed from: public */
    C188488zf(int i) {
        this.mValue = i;
    }
}
