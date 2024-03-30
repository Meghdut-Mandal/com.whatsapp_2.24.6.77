package X;

/* renamed from: X.64b  reason: invalid class name and case insensitive filesystem */
public final class C1264564b {
    public final C19970wo A00;
    public final C26311Jr A01;
    public final AnonymousClass3PQ A02;
    public final C26341Ju A03;
    public final C19770wU A04;
    public final AnonymousClass1YE A05;
    public final C117725mj A06;

    public final void A00(AnonymousClass3T1 r10, int i, int i2) {
        AnonymousClass00C.A0D(r10, 0);
        if (i == 1 && i2 <= 0) {
            C90464aC.A1M("PinInChatUserActionHandler/pinOrUnpinInChatMessage Pinning must expire ", AnonymousClass000.A0u(), i2);
        }
        C64933Qa r1 = r10.A1J;
        C195759Vv r8 = new C195759Vv(r10.A0L(), r1);
        long j = r10.A1N;
        C117725mj r6 = this.A06;
        AnonymousClass11F r7 = r1.A00;
        C18740tg.A06(r7);
        AnonymousClass00C.A08(r7);
        C19970wo r0 = this.A00;
        long A002 = C19970wo.A00(r0);
        long A003 = C19970wo.A00(r0);
        AnonymousClass5J2 r62 = new AnonymousClass5J2(C36411kG.A0o(r7, r6.A00), A002);
        r62.A00 = i;
        r62.A01 = A003;
        r62.A04 = r8;
        r62.A01 = j;
        r62.A1a(i2);
        this.A05.A01(r62);
    }

    public C1264564b(C19970wo r2, C26311Jr r3, AnonymousClass1YE r4, C117725mj r5, AnonymousClass3PQ r6, C26341Ju r7, C19770wU r8) {
        C36321k7.A0x(r2, r8);
        AnonymousClass00C.A0D(r3, 5);
        C36321k7.A10(r6, r4);
        this.A00 = r2;
        this.A04 = r8;
        this.A06 = r5;
        this.A03 = r7;
        this.A01 = r3;
        this.A02 = r6;
        this.A05 = r4;
    }
}
