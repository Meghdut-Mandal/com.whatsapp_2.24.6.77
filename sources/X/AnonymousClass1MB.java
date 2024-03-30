package X;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1MB  reason: invalid class name */
public class AnonymousClass1MB {
    public AnonymousClass1MC A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r3 != 16) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.AnonymousClass1ME r18, java.lang.Object r19, int r20) {
        /*
            r17 = this;
            r3 = r19
            r0 = r17
            java.util.concurrent.ConcurrentHashMap r12 = r0.A02
            r4 = r20
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r12.get(r11)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1 = 0
            if (r2 != 0) goto L_0x006a
            X.1MC r10 = r0.A00
            if (r10 == 0) goto L_0x0102
            monitor-enter(r10)
            android.util.SparseIntArray r0 = r10.A01     // Catch:{ all -> 0x0063 }
            int r0 = r0.get(r4)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0024
            goto L_0x0101
        L_0x0024:
            java.nio.MappedByteBuffer r9 = r10.A03     // Catch:{ all -> 0x0063 }
            r9.position(r0)     // Catch:{ all -> 0x0063 }
            int r0 = r9.position()     // Catch:{ all -> 0x0063 }
            byte r8 = r9.get(r0)     // Catch:{ all -> 0x0063 }
            int r13 = r0 + 1
            r0 = 6
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0063 }
            r7 = 0
            r6 = 0
        L_0x0038:
            if (r6 >= r8) goto L_0x0066
            byte r14 = r9.get(r13)     // Catch:{ all -> 0x0063 }
            int r0 = r13 + 1
            int r1 = X.AnonymousClass1MC.A01(r10, r0)     // Catch:{ all -> 0x0063 }
            int r0 = r0 + 4
            int r5 = X.AnonymousClass1MC.A00(r10, r0)     // Catch:{ all -> 0x0063 }
            int r13 = r0 + 2
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x0063 }
            int r0 = r10.A00     // Catch:{ all -> 0x0063 }
            int r0 = r0 + r1
            r9.position(r0)     // Catch:{ all -> 0x0063 }
            r9.get(r4, r7, r5)     // Catch:{ all -> 0x0063 }
            java.nio.charset.Charset r1 = r10.A04     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r0.<init>(r4, r7, r5, r1)     // Catch:{ all -> 0x0063 }
            r2[r14] = r0     // Catch:{ all -> 0x0063 }
            int r6 = r6 + 1
            goto L_0x0038
        L_0x0063:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0066:
            monitor-exit(r10)
            r12.put(r11, r2)
        L_0x006a:
            boolean r0 = r3 instanceof java.lang.String
            r6 = r18
            if (r0 == 0) goto L_0x00ce
            java.lang.String r3 = (java.lang.String) r3
            r0 = 46
            int r1 = r3.indexOf(r0)
            r0 = -1
            r5 = 0
            if (r1 != r0) goto L_0x008d
            long r0 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00f6 }
            double r7 = (double) r0     // Catch:{ NumberFormatException -> 0x00f6 }
            r13 = 0
            r9 = 0
            r10 = 0
            r15 = 0
            r11 = r0
            int r3 = r6.A01(r7, r9, r10, r11, r13, r15)     // Catch:{ NumberFormatException -> 0x00f6 }
            goto L_0x00e4
        L_0x008d:
            double r7 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00f6 }
            r15 = 0
            if (r1 != 0) goto L_0x0098
            r11 = 0
            goto L_0x00a0
        L_0x0098:
            java.lang.String r0 = r3.substring(r5, r1)     // Catch:{ NumberFormatException -> 0x00f6 }
            long r11 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x00a0:
            int r0 = r1 + 1
            java.lang.String r4 = r3.substring(r0)     // Catch:{ NumberFormatException -> 0x00f6 }
            int r9 = r4.length()     // Catch:{ NumberFormatException -> 0x00f6 }
            r3 = r9
        L_0x00ab:
            if (r3 <= 0) goto L_0x00ba
            int r0 = r3 + -1
            char r1 = r4.charAt(r0)     // Catch:{ NumberFormatException -> 0x00f6 }
            r0 = 48
            if (r1 != r0) goto L_0x00ba
            int r3 = r3 + -1
            goto L_0x00ab
        L_0x00ba:
            long r13 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r3 == 0) goto L_0x00c8
            java.lang.String r0 = r4.substring(r5, r3)     // Catch:{ NumberFormatException -> 0x00f6 }
            long r15 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x00c8:
            r10 = r3
            int r3 = r6.A01(r7, r9, r10, r11, r13, r15)     // Catch:{ NumberFormatException -> 0x00f6 }
            goto L_0x00e4
        L_0x00ce:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x00f6
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            double r7 = (double) r0
            r9 = 0
            r13 = 0
            r10 = 0
            r15 = 0
            r11 = r0
            int r3 = r6.A01(r7, r9, r10, r11, r13, r15)
        L_0x00e4:
            r1 = 1
            if (r3 == r1) goto L_0x00f7
            r1 = 2
            if (r3 == r1) goto L_0x00f7
            r1 = 4
            if (r3 == r1) goto L_0x00ff
            r0 = 8
            if (r3 == r0) goto L_0x00f7
            r0 = 16
            r1 = 5
            if (r3 == r0) goto L_0x00f7
        L_0x00f6:
            r1 = 0
        L_0x00f7:
            r1 = r2[r1]
            if (r1 != 0) goto L_0x0102
            r0 = 0
            r1 = r2[r0]
            return r1
        L_0x00ff:
            r1 = 3
            goto L_0x00f7
        L_0x0101:
            monitor-exit(r10)
        L_0x0102:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MB.A00(X.1ME, java.lang.Object, int):java.lang.String");
    }

    public AnonymousClass1MB(MappedByteBuffer mappedByteBuffer, List list) {
        if (mappedByteBuffer != null) {
            this.A00 = new AnonymousClass1MC(mappedByteBuffer, list);
        }
    }
}
