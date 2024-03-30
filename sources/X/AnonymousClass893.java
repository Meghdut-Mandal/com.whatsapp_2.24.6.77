package X;

/* renamed from: X.893  reason: invalid class name */
public final class AnonymousClass893 extends C21653ATt {
    public final C1693888z[] A00;
    public final /* synthetic */ AnonymousClass895 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass893(X.AnonymousClass895 r16, X.AnonymousClass10I r17) {
        /*
            r15 = this;
            r0 = r16
            r15.A01 = r0
            r15.<init>()
            android.content.Context r2 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "/data/local/tmp/exopackage/"
            r1.append(r0)
            java.lang.String r0 = r2.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/native-libs/"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r12 = X.C90524aI.A0S(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.LinkedHashSet r11 = X.C36441kJ.A17()
            java.lang.String[] r10 = X.C131706Qe.A02()
            int r9 = r10.length
            r3 = 0
            r7 = 0
        L_0x0032:
            if (r7 >= r9) goto L_0x00d5
            r1 = r10[r7]
            java.io.File r6 = X.C36441kJ.A0w(r12, r1)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00ab
            r11.add(r1)
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = X.C36441kJ.A0w(r6, r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x00ab
            java.io.FileReader r5 = new java.io.FileReader
            r5.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00cb }
            r4.<init>(r5)     // Catch:{ all -> 0x00cb }
        L_0x0059:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x00a5
            int r0 = r2.length()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0059
            r0 = 32
            int r14 = r2.indexOf(r0)     // Catch:{ all -> 0x00c1 }
            r0 = -1
            if (r14 == r0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00c1 }
            X.C165577te.A1O(r2, r1, r3, r14)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = ".so"
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x00c1 }
            int r13 = r8.size()     // Catch:{ all -> 0x00c1 }
            r1 = 0
        L_0x0080:
            if (r1 >= r13) goto L_0x0093
            java.lang.Object r0 = r8.get(r1)     // Catch:{ all -> 0x00c1 }
            X.88z r0 = (X.C1693888z) r0     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00c1 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00a3
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0093:
            java.lang.String r2 = X.C165607th.A0o(r14, r2)     // Catch:{ all -> 0x00c1 }
            java.io.File r1 = X.C36441kJ.A0w(r6, r2)     // Catch:{ all -> 0x00c1 }
            X.88z r0 = new X.88z     // Catch:{ all -> 0x00c1 }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00c1 }
            r8.add(r0)     // Catch:{ all -> 0x00c1 }
        L_0x00a3:
            r3 = 0
            goto L_0x0059
        L_0x00a5:
            r4.close()     // Catch:{ all -> 0x00cb }
            r5.close()
        L_0x00ab:
            int r7 = r7 + 1
            goto L_0x0032
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "illegal line in exopackage metadata: ["
            r1.append(r0)     // Catch:{ all -> 0x00c1 }
            r1.append(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "]"
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r0, r1)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00d0 }
            throw r1
        L_0x00d0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00d5:
            int r0 = r11.size()
            java.lang.String[] r0 = X.C36371kC.A1b(r11, r0)
            r1 = r17
            r1.A01 = r0
            int r0 = r8.size()
            X.88z[] r0 = new X.C1693888z[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            X.88z[] r0 = (X.C1693888z[]) r0
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass893.<init>(X.895, X.10I):void");
    }
}
