package X;

import android.os.Build;

/* renamed from: X.6XU  reason: invalid class name */
public abstract class AnonymousClass6XU {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet A06(byte[] r8) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            java.util.LinkedHashSet r7 = X.C36441kJ.A17()
            int r0 = r8.length
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x0053
            java.io.ByteArrayInputStream r5 = X.C90524aI.A0P(r8)
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0044 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0044 }
            int r3 = r4.readInt()     // Catch:{ all -> 0x003d }
        L_0x001d:
            if (r6 >= r3) goto L_0x0039
            java.lang.String r0 = r4.readUTF()     // Catch:{ all -> 0x003d }
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r4.readBoolean()     // Catch:{ all -> 0x003d }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x003d }
            X.667 r0 = new X.667     // Catch:{ all -> 0x003d }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x003d }
            r7.add(r0)     // Catch:{ all -> 0x003d }
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0039:
            r4.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x0044 }
            throw r0     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x004c }
        L_0x0048:
            r5.close()
            return r7
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x0053:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XU.A06(byte[]):java.util.LinkedHashSet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A07(java.util.Set r5) {
        /*
            r1 = 0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x000a
            byte[] r0 = new byte[r1]
            return r0
        L_0x000a:
            java.io.ByteArrayOutputStream r4 = X.C90524aI.A0Q()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x004e }
            r3.<init>(r4)     // Catch:{ all -> 0x004e }
            int r0 = r5.size()     // Catch:{ all -> 0x0047 }
            r3.writeInt(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x0047 }
        L_0x001e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0047 }
            X.667 r1 = (X.AnonymousClass667) r1     // Catch:{ all -> 0x0047 }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0047 }
            r3.writeUTF(r0)     // Catch:{ all -> 0x0047 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x0047 }
            r3.writeBoolean(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x001e
        L_0x0039:
            r3.close()     // Catch:{ all -> 0x004e }
            r4.close()
            byte[] r0 = r4.toByteArray()
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XU.A07(java.util.Set):byte[]");
    }

    public static final Integer A02(int i) {
        if (i == 0) {
            return C023109s.A00;
        }
        if (i == 1) {
            return C023109s.A01;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not convert ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" to BackoffPolicy", A0u);
    }

    public static final Integer A03(int i) {
        if (i == 0) {
            return C023109s.A00;
        }
        if (i == 1) {
            return C023109s.A01;
        }
        if (i == 2) {
            return C023109s.A0C;
        }
        if (i == 3) {
            return C023109s.A0G;
        }
        if (i == 4) {
            return C023109s.A0R;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return C023109s.A0S;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not convert ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" to NetworkType", A0u);
    }

    public static final Integer A04(int i) {
        if (i == 0) {
            return C023109s.A00;
        }
        if (i == 1) {
            return C023109s.A01;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not convert ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" to OutOfQuotaPolicy", A0u);
    }

    public static final Integer A05(int i) {
        if (i == 0) {
            return C023109s.A00;
        }
        if (i == 1) {
            return C023109s.A01;
        }
        if (i == 2) {
            return C023109s.A0C;
        }
        if (i == 3) {
            return C023109s.A0G;
        }
        if (i == 4) {
            return C023109s.A0R;
        }
        if (i == 5) {
            return C023109s.A0S;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not convert ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" to State", A0u);
    }

    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        if (intValue == 3) {
            return 3;
        }
        if (intValue == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && num == C023109s.A0S) {
            return 5;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Could not convert ");
        A0u.append(C109395Xk.A00(num));
        throw AnonymousClass000.A0c(" to int", A0u);
    }

    public static final int A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw C36441kJ.A18();
        }
    }
}
