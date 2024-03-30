package X;

/* renamed from: X.9kY  reason: invalid class name and case insensitive filesystem */
public abstract class C201849kY {
    public static final long A00 = Runtime.getRuntime().maxMemory();

    public static int A00(int i) {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
        } while (i > 127);
        return 1 + (5 - i2);
    }

    public static int A01(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r1 < 2147483647L) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.io.InputStream r5) {
        /*
            boolean r0 = r5 instanceof X.C187408xp
            if (r0 == 0) goto L_0x0009
            X.8xp r5 = (X.C187408xp) r5
            int r0 = r5.A00
            return r0
        L_0x0009:
            boolean r0 = r5 instanceof X.C187118xI
            if (r0 == 0) goto L_0x0012
            X.8xI r5 = (X.C187118xI) r5
            int r0 = r5.A00
            return r0
        L_0x0012:
            boolean r0 = r5 instanceof java.io.ByteArrayInputStream
            if (r0 == 0) goto L_0x001b
            int r0 = r5.available()
            return r0
        L_0x001b:
            boolean r0 = r5 instanceof java.io.FileInputStream
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r0 == 0) goto L_0x002f
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5     // Catch:{ IOException -> 0x002f }
            java.nio.channels.FileChannel r0 = r5.getChannel()     // Catch:{ IOException -> 0x002f }
            if (r0 == 0) goto L_0x002f
            long r1 = r0.size()     // Catch:{ IOException -> 0x002f }
            goto L_0x0039
        L_0x002f:
            long r1 = A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L_0x0039:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x003d:
            int r0 = (int) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201849kY.A02(java.io.InputStream):int");
    }
}
