package X;

/* renamed from: X.6Cm  reason: invalid class name and case insensitive filesystem */
public abstract class C128496Cm {
    public final int A00;
    public final C1268465w A01;
    public final AnonymousClass6F6 A02;
    public final String A03;
    public final String A04;

    public C128496Cm(C1268465w r1, AnonymousClass6F6 r2, String str, String str2, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2 A[Catch:{ all -> 0x0121, all -> 0x0126, all -> 0x012b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(android.os.CancellationSignal r18) {
        /*
            r17 = this;
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r2 = 1
            r11 = -1
            r1 = 1
        L_0x0008:
            boolean r0 = r18.isCanceled()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0013:
            r0 = r17
            boolean r3 = r0 instanceof X.C102084yl
            if (r3 == 0) goto L_0x0065
            r5 = r0
            X.4yl r5 = (X.C102084yl) r5
            X.5kl r4 = r5.A02
            X.3Sy r9 = r4.A00
            java.lang.String r10 = r5.A05
            long r13 = r5.A00
            int r4 = r5.A00
            long r15 = (long) r4
            X.33r r10 = r9.A06(r10, r11, r13, r15)
        L_0x002b:
            java.util.List r5 = r10.A01
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x014b
            int r4 = r5.size()
            int r6 = r0.A00
            r12 = 0
            if (r4 <= r6) goto L_0x0051
            java.util.List r7 = r5.subList(r12, r6)
            int r4 = X.C36421kH.A06(r7, r2)
            java.lang.Object r4 = r7.get(r4)
            long r4 = X.C36431kI.A09(r4)
            X.33r r10 = new X.33r
            r10.<init>(r7, r4)
        L_0x0051:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r0.A03
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.AnonymousClass000.A1L(r4, r1, r12)
            java.lang.String r9 = java.lang.String.format(r7, r5, r4)
            X.65w r4 = r0.A01
            java.io.File r11 = r4.A00(r9)
            goto L_0x009f
        L_0x0065:
            boolean r4 = r0 instanceof X.C102074yk
            if (r4 == 0) goto L_0x007c
            r5 = r0
            X.4yk r5 = (X.C102074yk) r5
            X.5kl r4 = r5.A01
            X.3Sy r9 = r4.A00
            java.lang.String r10 = r5.A02
            long r13 = r5.A00
            int r4 = r5.A00
            long r15 = (long) r4
            X.33r r10 = r9.A05(r10, r11, r13, r15)
            goto L_0x002b
        L_0x007c:
            r5 = r0
            X.4yj r5 = (X.C102064yj) r5
            X.5ww r4 = r5.A01
            X.3Sy r9 = r4.A00
            long r13 = r5.A00
            int r4 = r5.A00
            long r15 = (long) r4
            java.lang.String r10 = "message"
            X.33r r10 = r9.A05(r10, r11, r13, r15)
            X.5yZ r4 = r5.A02
            X.5wy r9 = r4.A02
            long r6 = r9.A01
            java.util.List r4 = r10.A01
            int r4 = r4.size()
            long r4 = (long) r4
            long r6 = r6 + r4
            r9.A01 = r6
            goto L_0x002b
        L_0x009f:
            java.io.FileOutputStream r4 = X.C90524aI.A0W(r11)     // Catch:{ JSONException -> 0x0135 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012b }
            r5.<init>(r4)     // Catch:{ all -> 0x012b }
            java.util.List r7 = r10.A01     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x00ca
            r14 = r0
            X.4yl r14 = (X.C102084yl) r14     // Catch:{ all -> 0x0121 }
            java.util.ArrayList r13 = X.C36361kB.A0r(r7)     // Catch:{ all -> 0x0121 }
            X.4ym r15 = new X.4ym     // Catch:{ all -> 0x0121 }
            r15.<init>(r14, r13)     // Catch:{ all -> 0x0121 }
            android.os.CancellationSignal r3 = r14.A01     // Catch:{ all -> 0x0121 }
            r15.A00(r3, r7)     // Catch:{ all -> 0x0121 }
            int r3 = r13.size()     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x00df
            X.6EK r3 = r14.A03     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r13 = r3.A01(r13)     // Catch:{ all -> 0x0121 }
            goto L_0x00e0
        L_0x00ca:
            boolean r3 = r0 instanceof X.C102074yk     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x00d5
            int r3 = r7.size()     // Catch:{ all -> 0x0121 }
            if (r3 != 0) goto L_0x00d5
            goto L_0x00df
        L_0x00d5:
            X.4yg r3 = new X.4yg     // Catch:{ all -> 0x0121 }
            r3.<init>()     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r13 = r3.A01(r7)     // Catch:{ all -> 0x0121 }
            goto L_0x00e0
        L_0x00df:
            r13 = 0
        L_0x00e0:
            if (r13 == 0) goto L_0x00eb
            r3 = 4
            java.lang.String r3 = r13.toString(r3)     // Catch:{ all -> 0x0121 }
            r5.write(r3)     // Catch:{ all -> 0x0121 }
            r12 = 1
        L_0x00eb:
            r5.close()     // Catch:{ all -> 0x012b }
            r4.close()     // Catch:{ JSONException -> 0x0135 }
            if (r12 == 0) goto L_0x010d
            X.6F6 r3 = r0.A02
            long r11 = r3.A02(r11, r9, r2)
            r4 = 0
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0111
            r8.add(r9)
            int r1 = r1 + 1
        L_0x0104:
            long r11 = r10.A00
            int r0 = r7.size()
            if (r0 >= r6) goto L_0x0008
            return r8
        L_0x010d:
            X.C90464aC.A18(r11)
            goto L_0x0104
        L_0x0111:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r0.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to export required file with IDs."
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)
            throw r0
        L_0x0121:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x012b }
        L_0x012a:
            throw r2     // Catch:{ all -> 0x012b }
        L_0x012b:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0134
        L_0x0130:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ JSONException -> 0x0135 }
        L_0x0134:
            throw r2     // Catch:{ JSONException -> 0x0135 }
        L_0x0135:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r0.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to write deleted message IDs to JSON"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x014b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128496Cm.A00(android.os.CancellationSignal):java.util.List");
    }
}
