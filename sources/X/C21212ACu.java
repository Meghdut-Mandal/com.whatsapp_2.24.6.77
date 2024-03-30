package X;

/* renamed from: X.ACu  reason: case insensitive filesystem */
public final class C21212ACu implements B14 {
    public final AnonymousClass9ZI A00;
    public final C30681ab A01;

    public C21212ACu(AnonymousClass9ZI r1, C30681ab r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bd3(AnonymousClass6CO r7, AnonymousClass8NK r8, AnonymousClass3T1 r9) {
        AnonymousClass5J2 r4;
        C1886990j r0;
        boolean A1a = C36331k8.A1a(r9, r8);
        if (r9.A1S(8) && (r4 = r9.A1V) != null) {
            AnonymousClass8NN A0p = AnonymousClass8RM.DEFAULT_INSTANCE.A0p();
            AnonymousClass8NG A002 = AnonymousClass9ZI.A00(r4);
            AnonymousClass8RM r1 = (AnonymousClass8RM) C90524aI.A0H(A0p);
            r1.key_ = AnonymousClass8NN.A0G(A002);
            r1.bitField0_ |= 2;
            if (r4.A00 == A1a) {
                r0 = C1886990j.PIN_FOR_ALL;
            } else {
                r0 = C1886990j.UNPIN_FOR_ALL;
            }
            AnonymousClass8RM r12 = (AnonymousClass8RM) C90524aI.A0H(A0p);
            r12.type_ = r0.value;
            r12.bitField0_ |= 1;
            long j = r4.A01;
            AnonymousClass8RM r13 = (AnonymousClass8RM) C90524aI.A0H(A0p);
            r13.bitField0_ |= 4;
            r13.senderTimestampMs_ = j;
            long j2 = r4.A02;
            AnonymousClass8RM r14 = (AnonymousClass8RM) C90524aI.A0H(A0p);
            r14.bitField0_ |= 8;
            r14.serverTimestampMs_ = j2;
            if (r4.A1X() > 0) {
                AnonymousClass8NN A0p2 = AnonymousClass8OX.DEFAULT_INSTANCE.A0p();
                int A1X = r4.A1X();
                AnonymousClass8OX r15 = (AnonymousClass8OX) C90524aI.A0H(A0p2);
                r15.bitField0_ |= 1;
                r15.messageAddOnDurationInSecs_ = A1X;
                AnonymousClass8RM r16 = (AnonymousClass8RM) C90524aI.A0H(A0p);
                AnonymousClass8OX r02 = (AnonymousClass8OX) A0p2.A0R();
                r02.getClass();
                r16.messageAddOnContextInfo_ = r02;
                r16.bitField0_ |= 16;
            }
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r8);
            AnonymousClass8RM r17 = (AnonymousClass8RM) A0p.A0R();
            int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r17.getClass();
            A0I.pinInChat_ = r17;
            A0I.bitField1_ |= 128;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bd4(X.C1275768v r10, X.AnonymousClass8SU r11, X.AnonymousClass3T1 r12) {
        /*
            r9 = this;
            boolean r8 = X.C36331k8.A1a(r11, r12)
            int r0 = r11.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0071
            X.9Vv r6 = X.C195759Vv.A00(r12)
            long r2 = r12.A1N
            X.8RM r5 = r11.pinInChat_
            if (r5 != 0) goto L_0x0016
            X.8RM r5 = X.AnonymousClass8RM.DEFAULT_INSTANCE
        L_0x0016:
            long r0 = X.C30681ab.A00(r11)
            X.8SW r4 = r5.key_
            if (r4 != 0) goto L_0x0020
            X.8SW r4 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0020:
            X.AnonymousClass00C.A08(r4)
            X.3Qa r7 = X.C30681ab.A01(r4)
            X.5J2 r4 = new X.5J2
            r4.<init>(r7, r0)
            int r1 = r5.type_
            if (r1 == 0) goto L_0x0075
            if (r1 == r8) goto L_0x0072
            r0 = 2
            if (r1 != r0) goto L_0x0075
            X.90j r0 = X.C1886990j.UNPIN_FOR_ALL
        L_0x0037:
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r8) goto L_0x003f
            r0 = 0
        L_0x003f:
            r4.A00 = r0
            long r0 = r5.senderTimestampMs_
            r4.A01 = r0
            long r0 = r5.serverTimestampMs_
            r4.A1b(r0)
            r4.A04 = r6
            r4.A01 = r2
            int r0 = r5.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x006a
            X.8OX r1 = r5.messageAddOnContextInfo_
            if (r1 != 0) goto L_0x005a
            X.8OX r1 = X.AnonymousClass8OX.DEFAULT_INSTANCE
        L_0x005a:
            X.AnonymousClass00C.A08(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x006a
            int r0 = r1.messageAddOnDurationInSecs_
            if (r0 <= 0) goto L_0x006a
            r4.A1a(r0)
        L_0x006a:
            r12.A1V = r4
            r0 = 8
            r12.A0i(r0)
        L_0x0071:
            return
        L_0x0072:
            X.90j r0 = X.C1886990j.PIN_FOR_ALL
            goto L_0x0037
        L_0x0075:
            X.90j r0 = X.C1886990j.UNKNOWN_TYPE
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212ACu.Bd4(X.68v, X.8SU, X.3T1):void");
    }
}
