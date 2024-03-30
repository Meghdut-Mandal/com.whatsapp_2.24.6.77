package X;

/* renamed from: X.6Ep  reason: invalid class name and case insensitive filesystem */
public final class C129016Ep {
    public final C24041Av A00;
    public final C19630wG A01;
    public final C20810yC A02;
    public final AnonymousClass1BB A03;
    public final AnonymousClass6SF A04;
    public final C63563Kn A05;
    public final AnonymousClass1B5 A06;
    public final C005502l A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.A04.A0E(4772) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C135066c4 r14, X.C023509x r15) {
        /*
            r13 = this;
            X.3Kn r1 = r13.A05
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0013
            X.0yC r1 = r1.A04
            r0 = 4772(0x12a4, float:6.687E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x01c7
            X.0yC r1 = r13.A02
            r0 = 4842(0x12ea, float:6.785E-42)
            java.lang.String r2 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = X.C36371kC.A0y(r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0029
            r2 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x01c7
            r0 = 4843(0x12eb, float:6.786E-42)
            java.lang.String r2 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = X.C36371kC.A0y(r2)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003c
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x01c7
            java.lang.String r0 = r13.A01()
            if (r0 == 0) goto L_0x01c7
            X.1B5 r5 = r13.A06
            X.68B r6 = r5.A03(r0)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r3 = 0
            if (r6 == 0) goto L_0x0055
            java.util.List r7 = r6.A05
            if (r7 != 0) goto L_0x0059
        L_0x0055:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
        L_0x0059:
            java.util.Iterator r9 = r7.iterator()
        L_0x005d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008b
            X.6c4 r8 = X.C90504aG.A0U(r9)
            java.lang.String r2 = r8.A0B
            java.lang.String r0 = r14.A0B
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x01c7
            java.lang.String r2 = r8.A0H
            java.lang.String r0 = r14.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x01c7
            java.lang.String r2 = r8.A0E
            java.lang.String r0 = r14.A0E
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = r8.A0B
            r4.append(r0)
            goto L_0x005d
        L_0x008b:
            java.lang.String r2 = X.C36381kD.A0y(r4)
            r7.add(r14)
            java.lang.String r12 = r13.A01()
            java.lang.String r9 = ""
            if (r12 != 0) goto L_0x009b
            r12 = r9
        L_0x009b:
            r0 = 4842(0x12ea, float:6.785E-42)
            java.lang.String r11 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = X.C36371kC.A0y(r11)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ac
            r11 = 0
        L_0x00ac:
            if (r11 != 0) goto L_0x00af
            r11 = r9
        L_0x00af:
            r0 = 4843(0x12eb, float:6.786E-42)
            java.lang.String r10 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = X.C36371kC.A0y(r10)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c0
            r10 = 0
        L_0x00c0:
            if (r10 != 0) goto L_0x00c3
            r10 = r9
        L_0x00c3:
            r0 = 4880(0x1310, float:6.838E-42)
            java.lang.String r1 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = X.C36371kC.A0y(r1)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d4
            r9 = r1
        L_0x00d4:
            java.lang.String r8 = X.C18750th.A05(r2)
            java.util.Iterator r2 = r7.iterator()
            r1 = 0
        L_0x00dd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00eb
            X.6c4 r0 = X.C90504aG.A0U(r2)
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x00dd
        L_0x00eb:
            long r1 = (long) r1
            X.65S r4 = new X.65S
            r4.<init>()
            if (r6 == 0) goto L_0x00f8
            java.lang.String r0 = r6.A0F
            if (r0 == 0) goto L_0x00f8
            r12 = r0
        L_0x00f8:
            r4.A0E = r12
            if (r6 == 0) goto L_0x0101
            java.lang.String r0 = r6.A0H
            if (r0 == 0) goto L_0x0101
            r11 = r0
        L_0x0101:
            r4.A0G = r11
            if (r6 == 0) goto L_0x010a
            java.lang.String r0 = r6.A0J
            if (r0 == 0) goto L_0x010a
            r10 = r0
        L_0x010a:
            r4.A0I = r10
            if (r6 == 0) goto L_0x0113
            java.lang.String r0 = r6.A0B
            if (r0 == 0) goto L_0x0113
            r9 = r0
        L_0x0113:
            r4.A03 = r9
            r0 = 0
            r4.A0O = r0
            r4.A0F = r8
            if (r6 == 0) goto L_0x0120
            java.lang.String r0 = r6.A0L
            if (r0 != 0) goto L_0x0122
        L_0x0120:
            java.lang.String r0 = "-1"
        L_0x0122:
            r4.A0K = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r4.A0M = r0
            r4.A01 = r1
            r4.A0N = r7
            r0 = 0
            r4.A0R = r0
            r4.A0V = r0
            r4.A0T = r0
            X.68B r4 = r4.A00()
            if (r6 != 0) goto L_0x013c
            r0 = 1
        L_0x013c:
            r4.A07 = r0
            r0 = 0
            r4.A09 = r0
            X.6SF r2 = r13.A04
            X.C18740tg.A00()
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x0193
            java.lang.String r1 = r4.A0F
            X.AnonymousClass00C.A08(r1)
            X.C18740tg.A00()
            java.io.File r0 = X.AnonymousClass6SF.A01(r2, r1)
        L_0x0156:
            android.graphics.Bitmap r0 = X.AnonymousClass6SF.A00(r2, r0, r1)
            if (r0 != 0) goto L_0x01b4
            X.1Av r0 = r13.A00
            X.0y0 r0 = r0.A00
            java.io.File r7 = r0.A0G()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = ".png"
            java.lang.String r6 = X.AnonymousClass000.A0q(r0, r1)
            X.0wG r0 = r13.A01
            android.content.Context r2 = r0.A00
            r1 = 2131234123(0x7f080d4b, float:1.8084403E38)
            r0 = 2131102866(0x7f060c92, float:1.7818182E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A02(r2, r1, r0)
            android.graphics.Bitmap r2 = X.AnonymousClass3UF.A00(r0)
            X.AnonymousClass00C.A08(r2)
            java.io.File r1 = X.C36441kJ.A0w(r7, r6)
            java.io.ByteArrayOutputStream r0 = X.C90524aI.A0Q()
            X.C90514aH.A1F(r2, r0)
            java.io.BufferedOutputStream r2 = X.C90504aG.A0Y(r1)
            goto L_0x019f
        L_0x0193:
            X.1BI r0 = r2.A00
            java.lang.String r1 = r4.A0F
            X.AnonymousClass00C.A08(r1)
            java.io.File r0 = r0.A01(r1)
            goto L_0x0156
        L_0x019f:
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x01a7 }
            r2.write(r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x01b1
        L_0x01a7:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01ac }
            throw r1
        L_0x01ac:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01b1:
            r2.close()
        L_0x01b4:
            r5.A04(r4)
            X.02l r1 = r13.A07
            com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3 r0 = new com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3
            r0.<init>(r13, r4, r3)
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r15, r1, r0)
            X.0AO r0 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x01c7
            return r1
        L_0x01c7:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129016Ep.A00(X.6c4, X.09x):java.lang.Object");
    }

    public final String A01() {
        String A19 = C36431kI.A19(this.A02, 4841);
        if (C36371kC.A0y(A19).length() == 0) {
            return null;
        }
        return A19;
    }

    public C129016Ep(C24041Av r1, C19630wG r2, C20810yC r3, C63563Kn r4, AnonymousClass1BB r5, AnonymousClass1B5 r6, AnonymousClass6SF r7, C005502l r8) {
        C36321k7.A1B(r3, r2, r5, r6, r4);
        C36321k7.A13(r8, r7, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
        this.A06 = r6;
        this.A05 = r4;
        this.A07 = r8;
        this.A04 = r7;
        this.A00 = r1;
    }
}
