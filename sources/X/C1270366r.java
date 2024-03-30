package X;

import android.content.Context;

/* renamed from: X.66r  reason: invalid class name and case insensitive filesystem */
public class C1270366r {
    public C1031254b A00;
    public final Context A01;
    public final AnonymousClass004 A02;

    public AnonymousClass1M0 A00() {
        C1031254b r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (C1031254b) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public AnonymousClass1M0 A01() {
        C1031254b r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (C1031254b) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.A04();
    }

    public C1270366r(Context context, AnonymousClass004 r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
