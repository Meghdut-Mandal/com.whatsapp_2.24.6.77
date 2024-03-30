package X;

import android.graphics.Paint;

/* renamed from: X.9iv  reason: invalid class name and case insensitive filesystem */
public abstract class C201129iv {
    public static final C201129iv A03 = new B7C(2);
    public static final C201129iv A04 = new B7C(0);
    public static final C201129iv A05 = new B7C(1);
    public Paint A00 = new Paint();
    public final AnonymousClass007 A01 = new AnonymousClass007(0);
    public final Object A02 = C36441kJ.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (X.C06850Vi.A00(r6.A00, r0.toString()) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.put(r7, java.lang.Boolean.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C201129iv r6, java.lang.String r7) {
        /*
            java.lang.Object r2 = r6.A02
            monitor-enter(r2)
            X.007 r3 = r6.A01     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r3.get(r7)     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0013:
            X.B7C r6 = (X.B7C) r6
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0064;
                default: goto L_0x001a;
            }
        L_0x001a:
            r5 = 0
        L_0x001b:
            int r0 = r7.length()
            if (r5 >= r0) goto L_0x0062
            int r4 = r7.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r4 <= r0) goto L_0x0048
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r0) goto L_0x003e
            char r0 = (char) r4
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x0033:
            android.graphics.Paint r0 = r6.A00
            boolean r0 = X.C06850Vi.A00(r0, r1)
            if (r0 != 0) goto L_0x0048
        L_0x003b:
            r1 = 0
        L_0x003c:
            monitor-enter(r2)
            goto L_0x006b
        L_0x003e:
            char[] r0 = java.lang.Character.toChars(r4)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x0033
        L_0x0048:
            int r0 = java.lang.Character.charCount(r4)
            int r5 = r5 + r0
            goto L_0x001b
        L_0x004e:
            X.007 r0 = X.AnonymousClass9BF.A02
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r0.toString()
            android.graphics.Paint r0 = r6.A00
            boolean r0 = X.C06850Vi.A00(r0, r1)
            if (r0 == 0) goto L_0x003b
        L_0x0062:
            r1 = 1
            goto L_0x003c
        L_0x0064:
            android.graphics.Paint r0 = r6.A00
            boolean r1 = X.C06850Vi.A00(r0, r7)
            goto L_0x003c
        L_0x006b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0074 }
            r3.put(r7, r0)     // Catch:{ all -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            return r1
        L_0x0074:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201129iv.A00(X.9iv, java.lang.String):boolean");
    }
}
