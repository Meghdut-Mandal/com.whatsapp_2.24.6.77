package X;

/* renamed from: X.ACt  reason: case insensitive filesystem */
public final class C21211ACt implements B14 {
    public final C30681ab A00;

    public C21211ACt(C30681ab r1) {
        this.A00 = r1;
    }

    public void Bd3(AnonymousClass6CO r7, AnonymousClass8NK r8, AnonymousClass3T1 r9) {
        AnonymousClass916 r0;
        boolean A1a = C36331k8.A1a(r9, r8);
        C46752bc r4 = r9.A1U;
        if (r4 != null) {
            AnonymousClass8NN A0p = AnonymousClass8RT.DEFAULT_INSTANCE.A0p();
            if (r9.A0E() == A1a) {
                r0 = AnonymousClass916.KEEP_FOR_ALL;
            } else {
                r0 = AnonymousClass916.UNDO_KEEP_FOR_ALL;
            }
            AnonymousClass8RT r1 = (AnonymousClass8RT) C90524aI.A0H(A0p);
            r1.keepType_ = r0.value;
            r1.bitField0_ |= 1;
            long j = r4.A0I;
            AnonymousClass8RT r12 = (AnonymousClass8RT) C90524aI.A0H(A0p);
            r12.bitField0_ |= 2;
            r12.serverTimestamp_ = j;
            long j2 = r4.A0I;
            AnonymousClass8RT r13 = (AnonymousClass8RT) C90524aI.A0H(A0p);
            r13.bitField0_ |= 32;
            r13.serverTimestampMs_ = j2;
            long j3 = r4.A02;
            AnonymousClass8RT r14 = (AnonymousClass8RT) C90524aI.A0H(A0p);
            r14.bitField0_ |= 16;
            r14.clientTimestampMs_ = j3;
            AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
            C64933Qa r15 = r4.A1J;
            AnonymousClass8NG.A01(r15.A00, A0i, r15);
            A0i.A0V(r15.A01);
            AnonymousClass8SW r02 = (AnonymousClass8SW) A0i.A0R();
            AnonymousClass8RT r16 = (AnonymousClass8RT) C90524aI.A0H(A0p);
            r02.getClass();
            r16.key_ = r02;
            r16.bitField0_ |= 4;
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r8);
            AnonymousClass8RT r17 = (AnonymousClass8RT) A0p.A0R();
            int i = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r17.getClass();
            A0I.keepInChat_ = r17;
            A0I.bitField1_ |= 8;
        }
    }

    public void Bd4(C1275768v r12, AnonymousClass8SU r13, AnonymousClass3T1 r14) {
        boolean A1a = C36331k8.A1a(r13, r14);
        if ((r13.bitField1_ & 8) != 0) {
            long A002 = C30681ab.A00(r13);
            C195759Vv A003 = C195759Vv.A00(r14);
            long j = r14.A1N;
            AnonymousClass8RT r1 = r13.keepInChat_;
            if (r1 == null) {
                r1 = AnonymousClass8RT.DEFAULT_INSTANCE;
            }
            AnonymousClass916 A004 = AnonymousClass916.A00(r1.keepType_);
            if (A004 == null) {
                A004 = AnonymousClass916.UNKNOWN;
            }
            boolean A1S = AnonymousClass000.A1S(A004.ordinal(), A1a ? 1 : 0);
            AnonymousClass8SW r0 = r1.key_;
            if (r0 == null) {
                r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
            }
            AnonymousClass00C.A08(r0);
            C46752bc r15 = new C46752bc(C30681ab.A01(r0), A003, A1S ? 1 : 0, A002, j, r1.clientTimestampMs_);
            r14.A1U = r15;
            r14.A07 = r15.A01;
            r14.A0i(4);
        }
    }
}
