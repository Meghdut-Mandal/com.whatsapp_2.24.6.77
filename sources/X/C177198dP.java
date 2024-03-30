package X;

import java.util.List;

/* renamed from: X.8dP  reason: invalid class name and case insensitive filesystem */
public final class C177198dP extends C21197ACf {
    public final C19730wQ A00;
    public final AnonymousClass9ZI A01;
    public final C30681ab A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177198dP(C19730wQ r2, AnonymousClass9ZI r3, C20520xh r4, C30681ab r5) {
        super(r4);
        C36331k8.A1G(r2, 1, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0093 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A00(X.C1275768v r18, X.AnonymousClass8SU r19, X.AnonymousClass3T1 r20) {
        /*
            r17 = this;
            r5 = 0
            r4 = r19
            r3 = r20
            X.C36331k8.A1I(r3, r4)
            boolean r0 = r3 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x00cd
            r2 = r3
            X.2bT r2 = (X.AnonymousClass2bT) r2
            if (r2 == 0) goto L_0x00cd
            X.B6c r0 = r4.eventResponses_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00b3
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            com.whatsapp.jid.UserJid r6 = r2.A0L()
            X.3Qa r0 = r2.A1J
            X.9Vv r12 = new X.9Vv
            r12.<init>(r6, r0)
            X.B6c r0 = r4.eventResponses_
            java.util.Iterator r8 = r0.iterator()
        L_0x002e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r6 = r8.next()
            X.8Qq r6 = (X.C173168Qq) r6
            X.8SW r0 = r6.eventResponseMessageKey_
            if (r0 != 0) goto L_0x0040
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x0040:
            X.AnonymousClass00C.A08(r0)
            X.3Qa r11 = X.C30681ab.A01(r0)
            long r13 = r6.timestampMs_
            X.8P0 r7 = r6.eventResponseMessage_
            r0 = r7
            if (r7 != 0) goto L_0x0050
            X.8P0 r7 = X.AnonymousClass8P0.DEFAULT_INSTANCE
        L_0x0050:
            long r15 = r7.timestampMs_
            if (r0 != 0) goto L_0x0056
            X.8P0 r0 = X.AnonymousClass8P0.DEFAULT_INSTANCE
        L_0x0056:
            int r7 = r0.response_
            if (r7 == 0) goto L_0x00a0
            r0 = 1
            if (r7 == r0) goto L_0x009d
            r0 = 2
            if (r7 != r0) goto L_0x00a0
            X.90Z r0 = X.AnonymousClass90Z.NOT_GOING
        L_0x0062:
            int r7 = r0.ordinal()
            r0 = 1
            if (r7 == r0) goto L_0x009a
            r0 = 2
            if (r7 == r0) goto L_0x0097
            if (r7 != r5) goto L_0x00a3
            X.2pC r10 = X.C52292pC.UNKNOWN
        L_0x0070:
            X.2bd r9 = new X.2bd
            r9.<init>(r10, r11, r12, r13, r15)
            X.13q r7 = X.AnonymousClass11F.A00
            X.8SW r0 = r6.eventResponseMessageKey_
            if (r0 != 0) goto L_0x007d
            X.8SW r0 = X.AnonymousClass8SW.DEFAULT_INSTANCE
        L_0x007d:
            java.lang.String r0 = r0.participant_
            X.11F r0 = r7.A02(r0)
            r9.A0q(r0)
            boolean r0 = r6.unread_
            if (r0 == 0) goto L_0x008e
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0093
        L_0x008e:
            r0 = 17
            r9.A0n(r0)
        L_0x0093:
            r1.add(r9)
            goto L_0x002e
        L_0x0097:
            X.2pC r10 = X.C52292pC.NOT_GOING
            goto L_0x0070
        L_0x009a:
            X.2pC r10 = X.C52292pC.GOING
            goto L_0x0070
        L_0x009d:
            X.90Z r0 = X.AnonymousClass90Z.GOING
            goto L_0x0062
        L_0x00a0:
            X.90Z r0 = X.AnonymousClass90Z.UNKNOWN
            goto L_0x0062
        L_0x00a3:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00a8:
            java.util.List r1 = X.C007103b.A0Y(r1)
            r0 = r17
            X.0wQ r0 = r0.A00
            r2.A1a(r0, r1)
        L_0x00b3:
            int r1 = r4.bitField1_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c9
            X.8OV r0 = r4.eventAdditionalMetadata_
            if (r0 != 0) goto L_0x00c1
            X.8OV r0 = X.AnonymousClass8OV.DEFAULT_INSTANCE
        L_0x00c1:
            boolean r0 = r0.isStale_
            if (r0 == 0) goto L_0x00ca
            X.2p2 r0 = X.C52192p2.STALE
        L_0x00c7:
            r2.A02 = r0
        L_0x00c9:
            return r20
        L_0x00ca:
            X.2p2 r0 = X.C52192p2.VALID
            goto L_0x00c7
        L_0x00cd:
            X.1Tb r0 = X.C165567td.A0J(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177198dP.A00(X.68v, X.8SU, X.3T1):X.3T1");
    }

    public void B22(AnonymousClass6CO r11, AnonymousClass8NK r12, AnonymousClass3T1 r13) {
        AnonymousClass2bT r4;
        AnonymousClass90Z r0;
        AnonymousClass00C.A0D(r13, 0);
        C36321k7.A0x(r12, r11);
        if (!(r13 instanceof AnonymousClass2bT) || (r4 = (AnonymousClass2bT) r13) == null) {
            throw C165567td.A0K(0);
        }
        super.B22(r11, r12, r13);
        List<C46762bd> A1X = r4.A1X();
        if (A1X != null) {
            for (C46762bd r6 : A1X) {
                AnonymousClass8NN A0p = C173168Qq.DEFAULT_INSTANCE.A0p();
                AnonymousClass8NN A0p2 = AnonymousClass8P0.DEFAULT_INSTANCE.A0p();
                C52292pC r02 = r6.A01;
                if (r02 != null) {
                    int ordinal = r02.ordinal();
                    if (ordinal == 1) {
                        r0 = AnonymousClass90Z.GOING;
                    } else if (ordinal == 2) {
                        r0 = AnonymousClass90Z.NOT_GOING;
                    } else if (ordinal == 0) {
                        r0 = AnonymousClass90Z.UNKNOWN;
                    } else {
                        throw C36441kJ.A18();
                    }
                    AnonymousClass8P0 r1 = (AnonymousClass8P0) C90524aI.A0H(A0p2);
                    r1.response_ = r0.value;
                    r1.bitField0_ |= 1;
                    long j = r6.A00;
                    AnonymousClass8P0 r3 = (AnonymousClass8P0) C90524aI.A0H(A0p2);
                    r3.bitField0_ |= 2;
                    r3.timestampMs_ = j;
                    AnonymousClass8NG A002 = AnonymousClass9ZI.A00(r6);
                    C173168Qq r14 = (C173168Qq) C90524aI.A0H(A0p);
                    r14.eventResponseMessageKey_ = AnonymousClass8NN.A0G(A002);
                    r14.bitField0_ |= 1;
                    long j2 = r6.A0I;
                    C173168Qq r32 = (C173168Qq) C90524aI.A0H(A0p);
                    r32.bitField0_ |= 2;
                    r32.timestampMs_ = j2;
                    boolean A1U = C36381kD.A1U(r6.A0D, 17);
                    C173168Qq r15 = (C173168Qq) C90524aI.A0H(A0p);
                    r15.bitField0_ |= 8;
                    r15.unread_ = A1U;
                    C173168Qq r16 = (C173168Qq) C90524aI.A0H(A0p);
                    AnonymousClass8P0 r03 = (AnonymousClass8P0) A0p2.A0R();
                    r03.getClass();
                    r16.eventResponseMessage_ = r03;
                    r16.bitField0_ |= 4;
                    AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r12);
                    C170918Hz A0R = A0p.A0R();
                    int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
                    A0R.getClass();
                    C23122B6c b6c = A0I.eventResponses_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        A0I.eventResponses_ = b6c;
                    }
                    b6c.add(A0R);
                }
            }
        }
        AnonymousClass8NN A0p3 = AnonymousClass8OV.DEFAULT_INSTANCE.A0p();
        boolean A1a = C36361kB.A1a(r4.A02, C52192p2.STALE);
        AnonymousClass8OV r17 = (AnonymousClass8OV) C90524aI.A0H(A0p3);
        r17.bitField0_ |= 1;
        r17.isStale_ = A1a;
        AnonymousClass8SU A0I2 = AnonymousClass8NN.A0I(r12);
        AnonymousClass8OV r18 = (AnonymousClass8OV) A0p3.A0R();
        int i2 = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
        r18.getClass();
        A0I2.eventAdditionalMetadata_ = r18;
        A0I2.bitField1_ |= 32768;
    }
}
