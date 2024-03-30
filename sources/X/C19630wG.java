package X;

import android.content.Context;

/* renamed from: X.0wG  reason: invalid class name and case insensitive filesystem */
public class C19630wG {
    public Context A00;

    public String A01(int i) {
        return this.A00.getResources().getString(i);
    }

    public String A02(int i, Object... objArr) {
        return this.A00.getResources().getString(i, objArr);
    }

    public C19630wG(Context context) {
        this.A00 = context;
    }

    public Context A00() {
        return this.A00;
    }
}
