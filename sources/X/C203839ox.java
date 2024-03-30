package X;

/* renamed from: X.9ox  reason: invalid class name and case insensitive filesystem */
public class C203839ox implements C22897Ay9 {
    public Object A00;
    public final int A01;

    public C203839ox(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x0008;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A00
            return r2
        L_0x0008:
            java.lang.Object r1 = r11.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.A0S> r10 = X.A0S.class
            monitor-enter(r10)
            X.A0S r2 = X.A0S.A0A     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x00eb
            if (r1 == 0) goto L_0x002d
            r1.getApplicationContext()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x00ed }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x002d
            java.lang.String r2 = r0.getNetworkCountryIso()     // Catch:{ all -> 0x00ed }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = r0.getCountry()     // Catch:{ all -> 0x00ed }
        L_0x0035:
            int r4 = r2.length()     // Catch:{ all -> 0x00ed }
            r3 = 0
        L_0x003a:
            if (r3 >= r4) goto L_0x0067
            char r1 = r2.charAt(r3)     // Catch:{ all -> 0x00ed }
            r0 = 97
            if (r1 < r0) goto L_0x0049
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x004c:
            char[] r2 = r2.toCharArray()     // Catch:{ all -> 0x00ed }
        L_0x0050:
            if (r3 >= r4) goto L_0x0064
            char r1 = r2[r3]     // Catch:{ all -> 0x00ed }
            r0 = 97
            if (r1 < r0) goto L_0x0061
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x0061
            r0 = r1 ^ 32
            char r0 = (char) r0     // Catch:{ all -> 0x00ed }
            r2[r3] = r0     // Catch:{ all -> 0x00ed }
        L_0x0061:
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0064:
            java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00ed }
        L_0x0067:
            r0 = 6
            int[] r5 = new int[r0]     // Catch:{ all -> 0x00ed }
            r5 = {2, 2, 2, 2, 2, 2} // fill-array     // Catch:{ all -> 0x00ed }
            r0 = 8
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00ed }
            r3.<init>(r0)     // Catch:{ all -> 0x00ed }
            r9 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00ed }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            X.C36421kH.A1K(r2, r3, r0)     // Catch:{ all -> 0x00ed }
            r6 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ed }
            X.1Ak r4 = X.A0S.A0G     // Catch:{ all -> 0x00ed }
            r0 = r5[r9]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x00ed }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ed }
            r8 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00ed }
            X.1Ak r1 = X.A0S.A0B     // Catch:{ all -> 0x00ed }
            r0 = 1
            r0 = r5[r0]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ed }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ed }
            r7 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ed }
            X.1Ak r1 = X.A0S.A0C     // Catch:{ all -> 0x00ed }
            r0 = r5[r6]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ed }
            r3.put(r2, r0)     // Catch:{ all -> 0x00ed }
            r6 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ed }
            X.1Ak r1 = X.A0S.A0D     // Catch:{ all -> 0x00ed }
            r0 = r5[r8]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Integer r2 = X.C36331k8.A0S(r2, r0, r3)     // Catch:{ all -> 0x00ed }
            X.1Ak r1 = X.A0S.A0E     // Catch:{ all -> 0x00ed }
            r0 = r5[r7]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Integer r2 = X.C36331k8.A0R(r2, r0, r3)     // Catch:{ all -> 0x00ed }
            X.1Ak r1 = X.A0S.A0F     // Catch:{ all -> 0x00ed }
            r0 = r5[r6]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Integer r1 = X.C36331k8.A0P(r2, r0, r3)     // Catch:{ all -> 0x00ed }
            r0 = r5[r9]     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x00ed }
            r3.put(r1, r0)     // Catch:{ all -> 0x00ed }
            X.B40 r0 = X.B40.A00     // Catch:{ all -> 0x00ed }
            X.A0S r2 = new X.A0S     // Catch:{ all -> 0x00ed }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00ed }
            X.A0S.A0A = r2     // Catch:{ all -> 0x00ed }
        L_0x00eb:
            monitor-exit(r10)
            return r2
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00f0:
            r0 = 0
            X.83B r2 = new X.83B
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203839ox.get():java.lang.Object");
    }
}
