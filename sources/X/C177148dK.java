package X;

/* renamed from: X.8dK  reason: invalid class name and case insensitive filesystem */
public final class C177148dK extends C21197ACf {
    public final AnonymousClass1P6 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177148dK(C20520xh r1, AnonymousClass1P6 r2) {
        super(r1);
        C36321k7.A0x(r2, r1);
        this.A00 = r2;
    }

    public void B22(AnonymousClass6CO r6, AnonymousClass8NK r7, AnonymousClass3T1 r8) {
        C165567td.A1K(r8, r7, r6);
        super.B22(r6, r7, r8);
        C46902br r82 = (C46902br) r8;
        int i = r82.A00;
        AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r7);
        A0J.bitField0_ |= 65536;
        A0J.duration_ = i;
        C63593Kq r4 = r82.A02;
        if (r4 != null) {
            long j = (r4.A05 - r82.A0I) / ((long) 1000);
            AnonymousClass8K6 r1 = (AnonymousClass8K6) C173448Rs.DEFAULT_INSTANCE.A0p();
            AnonymousClass1P6.A00(r1, r4, Integer.valueOf((int) j));
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r7);
            C173448Rs r0 = (C173448Rs) r1.A0R();
            r0.getClass();
            A0I.finalLiveLocation_ = r0;
            A0I.bitField0_ |= 262144;
        }
    }
}
