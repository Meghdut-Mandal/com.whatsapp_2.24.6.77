package X;

import android.content.Context;

/* renamed from: X.4qF  reason: invalid class name and case insensitive filesystem */
public class C97774qF extends AnonymousClass75L {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C97824qK A01;

    public C97774qF(Context context, C97824qK r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:81|82|83|84|(4:87|(2:89|121)(2:90|122)|119|85)|120|91) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r3 = r7.A09;
        r7.A00 = r4 - r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        X.C1495971y.A02(r0);
        X.C1495971y.A04(r7.A08);
        r11 = X.C36391kE.A10(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0195, code lost:
        if (r11.hasNext() != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0197, code lost:
        r10 = (X.C1271767g) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a0, code lost:
        if (r10.A01 == null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a2, code lost:
        r7.A02 += r10.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ac, code lost:
        r10.A01 = null;
        X.C1495971y.A04(r10.A00());
        X.C1495971y.A04(r10.A01());
        r11.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c1, code lost:
        r7.A03 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r17, true), r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x017c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:92:0x01d5=Splitter:B:92:0x01d5, B:81:0x017c=Splitter:B:81:0x017c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r0 = r0.A00
            java.io.File r5 = r0.getCacheDir()
            long r3 = r5.getFreeSpace()
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0245
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 < 0) goto L_0x001c
            r1 = 5242880(0x500000, float:7.34684E-39)
        L_0x001c:
            java.lang.String r0 = ".facebook_cache"
            java.io.File r6 = X.C36441kJ.A0w(r5, r0)
            long r1 = (long) r1
            r13 = 2
            r8 = 1
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0239
            java.lang.String r0 = "journal.bkp"
            java.io.File r4 = X.C36441kJ.A0w(r6, r0)     // Catch:{ IOException -> 0x0240 }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0240 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "journal"
            java.io.File r3 = X.C36441kJ.A0w(r6, r0)     // Catch:{ IOException -> 0x0240 }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0240 }
            if (r0 == 0) goto L_0x0056
            r4.delete()     // Catch:{ IOException -> 0x0240 }
        L_0x0046:
            X.71y r7 = new X.71y     // Catch:{ IOException -> 0x0240 }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x0240 }
            java.io.File r0 = r7.A07     // Catch:{ IOException -> 0x0240 }
            r17 = r0
            boolean r0 = r17.exists()     // Catch:{ IOException -> 0x0240 }
            if (r0 == 0) goto L_0x021b
            goto L_0x0063
        L_0x0056:
            boolean r0 = r4.renameTo(r3)     // Catch:{ IOException -> 0x0240 }
            if (r0 != 0) goto L_0x0046
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0240 }
            r0.<init>()     // Catch:{ IOException -> 0x0240 }
            goto L_0x023f
        L_0x0063:
            java.lang.String r11 = ", "
            java.io.FileInputStream r3 = X.C90524aI.A0U(r17)     // Catch:{ IOException -> 0x01f6 }
            java.nio.charset.Charset r5 = X.C1495971y.A0H     // Catch:{ IOException -> 0x01f6 }
            X.71r r16 = new X.71r     // Catch:{ IOException -> 0x01f6 }
            r0 = r16
            r0.<init>(r7, r3, r5)     // Catch:{ IOException -> 0x01f6 }
            java.lang.String r12 = r16.A00()     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = r16.A00()     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = r16.A00()     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = r16.A00()     // Catch:{ all -> 0x01f1 }
            java.lang.String r4 = r16.A00()     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x01f1 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x01f1 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x01d5
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x01d5
            r4 = 0
        L_0x00b3:
            java.lang.String r9 = r16.A00()     // Catch:{ EOFException -> 0x017c }
            r10 = 32
            int r14 = r9.indexOf(r10)     // Catch:{ EOFException -> 0x017c }
            java.lang.String r3 = "unexpected journal line: "
            r15 = -1
            if (r14 == r15) goto L_0x0166
            int r0 = r14 + 1
            int r13 = r9.indexOf(r10, r0)     // Catch:{ EOFException -> 0x017c }
            if (r13 != r15) goto L_0x00df
            java.lang.String r11 = r9.substring(r0)     // Catch:{ EOFException -> 0x017c }
            r0 = 6
            if (r14 != r0) goto L_0x00e3
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x017c }
            if (r0 == 0) goto L_0x00e3
            java.util.LinkedHashMap r0 = r7.A09     // Catch:{ EOFException -> 0x017c }
            r0.remove(r11)     // Catch:{ EOFException -> 0x017c }
            goto L_0x014c
        L_0x00df:
            java.lang.String r11 = r9.substring(r0, r13)     // Catch:{ EOFException -> 0x017c }
        L_0x00e3:
            java.util.LinkedHashMap r0 = r7.A09     // Catch:{ EOFException -> 0x017c }
            java.lang.Object r12 = r0.get(r11)     // Catch:{ EOFException -> 0x017c }
            X.67g r12 = (X.C1271767g) r12     // Catch:{ EOFException -> 0x017c }
            r10 = 0
            if (r12 != 0) goto L_0x00f6
            X.67g r12 = new X.67g     // Catch:{ EOFException -> 0x017c }
            r12.<init>(r7, r11)     // Catch:{ EOFException -> 0x017c }
            r0.put(r11, r12)     // Catch:{ EOFException -> 0x017c }
        L_0x00f6:
            r11 = 5
            if (r13 == r15) goto L_0x0129
            if (r14 != r11) goto L_0x012c
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x017c }
            if (r0 == 0) goto L_0x012c
            int r0 = r13 + 1
            java.lang.String r9 = r9.substring(r0)     // Catch:{ EOFException -> 0x017c }
            java.lang.String r0 = " "
            java.lang.String[] r13 = r9.split(r0)     // Catch:{ EOFException -> 0x017c }
            r12.A02 = r8     // Catch:{ EOFException -> 0x017c }
            r12.A01 = r10     // Catch:{ EOFException -> 0x017c }
            int r15 = r13.length     // Catch:{ EOFException -> 0x017c }
            X.71y r0 = r12.A05     // Catch:{ EOFException -> 0x017c }
            int r0 = r0.A05     // Catch:{ EOFException -> 0x017c }
            if (r15 != r0) goto L_0x016f
            r14 = 0
        L_0x011b:
            if (r14 >= r15) goto L_0x014c
            long[] r11 = r12.A04     // Catch:{ NumberFormatException -> 0x0150 }
            r0 = r13[r14]     // Catch:{ NumberFormatException -> 0x0150 }
            long r9 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0150 }
            r11[r14] = r9     // Catch:{ NumberFormatException -> 0x0150 }
            r14 = 1
            goto L_0x011b
        L_0x0129:
            if (r14 != r11) goto L_0x0130
            goto L_0x0134
        L_0x012c:
            if (r13 == r15) goto L_0x0129
            if (r13 != r15) goto L_0x015d
        L_0x0130:
            r0 = 4
            if (r14 != r0) goto L_0x015d
            goto L_0x0144
        L_0x0134:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x017c }
            if (r0 == 0) goto L_0x015d
            X.63n r0 = new X.63n     // Catch:{ EOFException -> 0x017c }
            r0.<init>(r12, r7)     // Catch:{ EOFException -> 0x017c }
            r12.A01 = r0     // Catch:{ EOFException -> 0x017c }
            goto L_0x014c
        L_0x0144:
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x017c }
            if (r0 == 0) goto L_0x015d
        L_0x014c:
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x0150:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r3)     // Catch:{ EOFException -> 0x017c }
            java.lang.String r0 = java.util.Arrays.toString(r13)     // Catch:{ EOFException -> 0x017c }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r3)     // Catch:{ EOFException -> 0x017c }
            goto L_0x017b
        L_0x015d:
            java.lang.String r0 = X.C36321k7.A0D(r3, r9)     // Catch:{ EOFException -> 0x017c }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x017c }
            goto L_0x017b
        L_0x0166:
            java.lang.String r0 = X.C36321k7.A0D(r3, r9)     // Catch:{ EOFException -> 0x017c }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x017c }
            goto L_0x017b
        L_0x016f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r3)     // Catch:{ EOFException -> 0x017c }
            java.lang.String r0 = java.util.Arrays.toString(r13)     // Catch:{ EOFException -> 0x017c }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r3)     // Catch:{ EOFException -> 0x017c }
        L_0x017b:
            throw r0     // Catch:{ EOFException -> 0x017c }
        L_0x017c:
            java.util.LinkedHashMap r3 = r7.A09     // Catch:{ all -> 0x01f1 }
            int r0 = r3.size()     // Catch:{ all -> 0x01f1 }
            int r4 = r4 - r0
            r7.A00 = r4     // Catch:{ all -> 0x01f1 }
            X.C1495971y.A02(r16)     // Catch:{ IOException -> 0x01f6 }
            java.io.File r0 = r7.A08     // Catch:{ IOException -> 0x01f6 }
            X.C1495971y.A04(r0)     // Catch:{ IOException -> 0x01f6 }
            java.util.Iterator r11 = X.C36391kE.A10(r3)     // Catch:{ IOException -> 0x01f6 }
        L_0x0191:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x01f6 }
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r10 = r11.next()     // Catch:{ IOException -> 0x01f6 }
            X.67g r10 = (X.C1271767g) r10     // Catch:{ IOException -> 0x01f6 }
            X.63n r0 = r10.A01     // Catch:{ IOException -> 0x01f6 }
            r9 = 0
            if (r0 != 0) goto L_0x01ac
            long r3 = r7.A02     // Catch:{ IOException -> 0x01f6 }
            long[] r0 = r10.A04     // Catch:{ IOException -> 0x01f6 }
            r9 = r0[r9]     // Catch:{ IOException -> 0x01f6 }
            long r3 = r3 + r9
            r7.A02 = r3     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0191
        L_0x01ac:
            r0 = 0
            r10.A01 = r0     // Catch:{ IOException -> 0x01f6 }
            java.io.File r0 = r10.A00()     // Catch:{ IOException -> 0x01f6 }
            X.C1495971y.A04(r0)     // Catch:{ IOException -> 0x01f6 }
            java.io.File r0 = r10.A01()     // Catch:{ IOException -> 0x01f6 }
            X.C1495971y.A04(r0)     // Catch:{ IOException -> 0x01f6 }
            r11.remove()     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0191
        L_0x01c1:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01f6 }
            r0 = r17
            r4.<init>(r0, r8)     // Catch:{ IOException -> 0x01f6 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x01f6 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x01f6 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x01f6 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01f6 }
            r7.A03 = r0     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0226
        L_0x01d5:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "unexpected journal header: ["
            X.C36321k7.A1O(r0, r12, r11, r10, r3)     // Catch:{ all -> 0x01f1 }
            r3.append(r11)     // Catch:{ all -> 0x01f1 }
            r3.append(r9)     // Catch:{ all -> 0x01f1 }
            r3.append(r11)     // Catch:{ all -> 0x01f1 }
            r3.append(r4)     // Catch:{ all -> 0x01f1 }
            java.lang.String r0 = "]"
            java.io.IOException r0 = X.C90464aC.A0M(r0, r3)     // Catch:{ all -> 0x01f1 }
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r0 = move-exception
            X.C1495971y.A02(r16)     // Catch:{ IOException -> 0x01f6 }
            throw r0     // Catch:{ IOException -> 0x01f6 }
        L_0x01f6:
            r5 = move-exception
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ IOException -> 0x0240 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0240 }
            java.lang.String r0 = "DiskLruCache "
            r3.append(r0)     // Catch:{ IOException -> 0x0240 }
            r3.append(r6)     // Catch:{ IOException -> 0x0240 }
            java.lang.String r0 = " is corrupt: "
            X.C90474aD.A1K(r0, r3, r5)     // Catch:{ IOException -> 0x0240 }
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ IOException -> 0x0240 }
            r4.println(r0)     // Catch:{ IOException -> 0x0240 }
            r7.close()     // Catch:{ IOException -> 0x0240 }
            java.io.File r0 = r7.A06     // Catch:{ IOException -> 0x0240 }
            X.C1495971y.A03(r0)     // Catch:{ IOException -> 0x0240 }
        L_0x021b:
            r6.mkdirs()     // Catch:{ IOException -> 0x0240 }
            X.71y r7 = new X.71y     // Catch:{ IOException -> 0x0240 }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x0240 }
            X.C1495971y.A01(r7)     // Catch:{ IOException -> 0x0240 }
        L_0x0226:
            X.C97824qK.A05 = r7     // Catch:{ IOException -> 0x0240 }
            r0 = 0
            X.72g r1 = new X.72g     // Catch:{ IOException -> 0x0240 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0240 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ IOException -> 0x0240 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0240 }
            X.C97824qK.A02 = r0     // Catch:{ IOException -> 0x0240 }
            r0.start()     // Catch:{ IOException -> 0x0240 }
            return
        L_0x0239:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IOException -> 0x0240 }
        L_0x023f:
            throw r0     // Catch:{ IOException -> 0x0240 }
        L_0x0240:
            X.6TY r0 = X.AnonymousClass6TY.A08
            r0.A03()
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97774qF.run():void");
    }
}
