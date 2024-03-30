package X;

import android.os.SystemClock;

public class AZ4 implements AnonymousClass004, AnonymousClass005 {
    public Object A00;
    public AnonymousClass004 A01;

    public static AZ4 A01(Object obj, int i) {
        return new AZ4((Object) null, new BAS(obj, i));
    }

    public static AZ4 A02(Object obj, Object obj2, int i) {
        return new AZ4((Object) null, new BAU(obj, obj2, i));
    }

    public Object get() {
        Object obj = this.A00;
        if (obj == null) {
            AnonymousClass004 r1 = this.A01;
            C18740tg.A0C(AnonymousClass000.A1V(r1));
            SystemClock.uptimeMillis();
            try {
                obj = r1.get();
                C18740tg.A06(obj);
                this.A00 = obj;
            } finally {
                SystemClock.uptimeMillis();
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r3 != null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AZ4(java.lang.Object r3, X.AnonymousClass004 r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 != 0) goto L_0x0008
            r1 = 0
            if (r3 == 0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.C18740tg.A0E(r1, r0)
            r2.A01 = r4
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZ4.<init>(java.lang.Object, X.004):void");
    }

    public static float A00(AZ4 az4) {
        return ((Number) az4.get()).floatValue();
    }
}
