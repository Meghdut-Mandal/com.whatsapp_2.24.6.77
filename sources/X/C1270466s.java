package X;

import android.content.Context;

/* renamed from: X.66s  reason: invalid class name and case insensitive filesystem */
public class C1270466s {
    public C1031154a A00;
    public final Context A01;
    public final AnonymousClass004 A02;

    public AnonymousClass1M0 A01() {
        C1031154a r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (C1031154a) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public static AnonymousClass1M0 A00(AnonymousClass6F6 r0) {
        return r0.A00.A00.A01();
    }

    public C1270466s(Context context, AnonymousClass004 r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
