package X;

/* renamed from: X.3sm  reason: invalid class name and case insensitive filesystem */
public final class C78853sm implements AnonymousClass4S6 {
    public final AnonymousClass005 A00;

    public C78853sm(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmK(X.AnonymousClass3T1 r16, X.C52942qQ r17, int r18) {
        /*
            r15 = this;
            r0 = 0
            r11 = r16
            X.AnonymousClass00C.A0D(r11, r0)
            X.3Qa r5 = r11.A1J
            boolean r0 = r5.A02
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            boolean r0 = r11.A10
            if (r0 == 0) goto L_0x001d
            X.11F r1 = r5.A00
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1 instanceof X.C177528dw
            r1 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r0 = 4
            r4 = r18
            if (r4 == r0) goto L_0x0025
            if (r4 != r3) goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00e5
            X.005 r0 = r15.A00
            java.lang.Object r9 = r0.get()
            X.0xM r9 = (X.C20310xM) r9
            java.util.List r8 = r11.A0e()
            java.util.HashMap r12 = X.AnonymousClass001.A0J()
            X.0wo r0 = r9.A0C
            long r13 = X.C19970wo.A00(r0)
            X.C18740tg.A06(r8)
            java.util.Iterator r7 = r8.iterator()
            r2 = 0
        L_0x0048:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0099
            com.whatsapp.jid.UserJid r10 = X.C36441kJ.A0o(r7)
            X.3T1 r4 = r9.A0V(r10, r11, r12, r13)     // Catch:{ SQLiteConstraintException -> 0x008a }
            X.17T r0 = r9.A0j     // Catch:{ SQLiteConstraintException -> 0x008a }
            boolean r0 = r0.A08(r10)     // Catch:{ SQLiteConstraintException -> 0x008a }
            X.C20310xM.A0E(r9, r4)     // Catch:{ SQLiteConstraintException -> 0x008a }
            X.C20310xM.A04(r9, r10, r4, r0)     // Catch:{ SQLiteConstraintException -> 0x008a }
            X.0v5 r6 = r9.A02     // Catch:{ SQLiteConstraintException -> 0x008a }
            boolean r0 = r6.A05()     // Catch:{ SQLiteConstraintException -> 0x008a }
            if (r0 == 0) goto L_0x007f
            r1 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r4.A0A     // Catch:{ SQLiteConstraintException -> 0x008a }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x008a }
            if (r0 == 0) goto L_0x007f
            r6.A02()     // Catch:{ SQLiteConstraintException -> 0x008a }
            java.lang.String r0 = "hasPlaceholder"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ SQLiteConstraintException -> 0x008a }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x008a }
        L_0x007f:
            X.1A1 r0 = r9.A1B     // Catch:{ SQLiteConstraintException -> 0x008a }
            r0.A04(r4)     // Catch:{ SQLiteConstraintException -> 0x008a }
            r9.A0i(r4)     // Catch:{ SQLiteConstraintException -> 0x008a }
            int r2 = r2 + 1
            goto L_0x0048
        L_0x008a:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CoreMessageStore/updatemessageinbackground duplicate key="
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)
            com.whatsapp.util.Log.i(r0, r4)
            goto L_0x0048
        L_0x0099:
            boolean r0 = r11 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x00ad
            if (r2 <= 0) goto L_0x00ad
            r0 = r11
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.io.File r1 = X.AnonymousClass2bU.A01(r0)
            if (r1 == 0) goto L_0x00ad
            X.1Av r0 = r9.A09
            r0.A06(r1, r2, r3)
        L_0x00ad:
            X.3T1 r1 = r11.A0S()
            boolean r0 = r1 instanceof X.C46962bx
            if (r0 == 0) goto L_0x00c4
            if (r2 <= 0) goto L_0x00c4
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.io.File r1 = X.AnonymousClass2bU.A01(r1)
            if (r1 == 0) goto L_0x00c4
            X.1Av r0 = r9.A09
            r0.A06(r1, r2, r3)
        L_0x00c4:
            int r1 = r8.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x00d9
            r11.A0y = r12
        L_0x00d0:
            if (r17 == 0) goto L_0x00e5
            java.lang.Class<X.3sm> r0 = X.C78853sm.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x00d9:
            int r0 = r12.size()
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00d0
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78853sm.BmK(X.3T1, X.2qQ, int):void");
    }
}
