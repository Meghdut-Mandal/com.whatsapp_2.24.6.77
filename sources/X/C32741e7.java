package X;

/* renamed from: X.1e7  reason: invalid class name and case insensitive filesystem */
public final class C32741e7 {
    public final C19730wQ A00;
    public final AnonymousClass1NV A01;
    public final C20810yC A02;
    public final C32751e8 A03;
    public final AnonymousClass16D A04;

    public C32741e7(C19730wQ r2, C32751e8 r3, AnonymousClass1NV r4, AnonymousClass16D r5, C20810yC r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A03 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r10 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r8.A01.A00.A01(r9).A0E() != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.text.Spannable r7, X.C32741e7 r8, X.AnonymousClass11F r9, X.AnonymousClass11F r10) {
        /*
            boolean r0 = X.C197029b1.A00(r10)
            if (r0 != 0) goto L_0x0022
            boolean r0 = r10 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0023
            X.0yC r0 = r8.A02
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 == 0) goto L_0x0023
            X.1NV r0 = r8.A01
            if (r10 == 0) goto L_0x0032
            X.1A5 r0 = r0.A00
            X.141 r0 = r0.A01(r10)
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            return
        L_0x0023:
            if (r10 == 0) goto L_0x0032
        L_0x0025:
            X.16D r0 = r8.A04
            X.141 r0 = r0.A0D(r10)
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0032
            return
        L_0x0032:
            X.16D r0 = r8.A04
            X.141 r1 = r0.A0D(r9)
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0053
            X.0yC r0 = r8.A02
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 == 0) goto L_0x0053
            X.1NV r0 = r8.A01
            X.1A5 r0 = r0.A00
            X.141 r0 = r0.A01(r9)
            boolean r0 = r0.A0E()
            r4 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            boolean r3 = r1.A0C()
            if (r4 != 0) goto L_0x006c
            X.0yC r2 = r8.A02
            r1 = 5811(0x16b3, float:8.143E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = X.C197029b1.A00(r9)
            if (r0 == 0) goto L_0x00ee
        L_0x006c:
            X.1e8 r5 = r8.A03
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x0022
            r2 = 10
            if (r4 == 0) goto L_0x00af
            X.1KK r0 = r5.A01
            X.9uZ r0 = r0.A07(r9)
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r0.A0P
            int r0 = X.AnonymousClass03U.A06(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x008d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r4.next()
            X.3uw r0 = (X.C80153uw) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A00
            X.1e9 r1 = r5.A00
            java.lang.String r0 = r9.getRawString()
            r1.A00(r0, r3)
            X.3uw r0 = new X.3uw
            r0.<init>(r3, r2)
            r6.add(r0)
            goto L_0x008d
        L_0x00af:
            X.005 r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.6BB r0 = (X.AnonymousClass6BB) r0
            X.6E1 r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r0.A09
            int r0 = X.AnonymousClass03U.A06(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x00cc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r4.next()
            X.3uw r0 = (X.C80153uw) r0
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A00
            X.1e9 r1 = r5.A00
            java.lang.String r0 = r9.getRawString()
            r1.A00(r0, r3)
            X.3uw r0 = new X.3uw
            r0.<init>(r3, r2)
            r6.add(r0)
            goto L_0x00cc
        L_0x00ee:
            if (r3 == 0) goto L_0x0022
            X.1e8 r0 = r8.A03
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.util.List r6 = r0.A00(r9)
            if (r6 == 0) goto L_0x0022
        L_0x00fa:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0022
            java.util.List r0 = X.C007103b.A0V(r6)
            java.util.Iterator r4 = r0.iterator()
        L_0x0108:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r4.next()
            X.3uw r0 = (X.C80153uw) r0
            r2 = 47
            java.lang.String r1 = r0.A01
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r0 = 0
            int r3 = X.AnonymousClass099.A0C(r7, r1, r0, r0)
            int r2 = r1.length()
            int r2 = r2 + r3
            r0 = -1
            if (r3 == r0) goto L_0x0108
            int r0 = r7.length()
            if (r2 >= r0) goto L_0x0143
            char r1 = r7.charAt(r2)
            r0 = 32
            if (r1 == r0) goto L_0x0143
            goto L_0x0108
        L_0x0143:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "commands"
            r1.append(r0)
            java.lang.CharSequence r0 = r7.subSequence(r3, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.text.style.URLSpan r1 = new android.text.style.URLSpan
            r1.<init>(r0)
            r0 = 0
            r7.setSpan(r1, r3, r2, r0)
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32741e7.A00(android.text.Spannable, X.1e7, X.11F, X.11F):void");
    }
}
