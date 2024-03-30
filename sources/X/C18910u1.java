package X;

import android.os.SystemClock;

/* renamed from: X.0u1  reason: invalid class name and case insensitive filesystem */
public class C18910u1 implements AnonymousClass004, AnonymousClass005 {
    public long A00 = -1;
    public AnonymousClass004 A01;
    public volatile Object A02;

    public static C18910u1 A00(AnonymousClass004 r2) {
        return new C18910u1((Object) null, r2);
    }

    public boolean A01() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A02 != null) {
                z = true;
            }
        }
        return z;
    }

    public Object get() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    AnonymousClass004 r1 = this.A01;
                    boolean z = false;
                    if (r1 != null) {
                        z = true;
                    }
                    C18740tg.A0C(z);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Object obj = r1.get();
                        C18740tg.A06(obj);
                        this.A02 = obj;
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        this.A01 = null;
                    } catch (Throwable th) {
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        throw th;
                    }
                }
            }
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18910u1(java.lang.Object r3, X.AnonymousClass004 r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A00 = r0
            if (r4 != 0) goto L_0x000c
            r1 = 0
            if (r3 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.C18740tg.A0E(r1, r0)
            r2.A01 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18910u1.<init>(java.lang.Object, X.004):void");
    }
}
