package X;

/* renamed from: X.0nF  reason: invalid class name and case insensitive filesystem */
public final class C15380nF extends C13130jD {
    public final Iterable A00;

    public Object A00(C023509x r6, C18000sQ r7) {
        C13030j3 r4 = new C13030j3(r7);
        for (AnonymousClass05H r1 : this.A00) {
            AnonymousClass0l6 r2 = new AnonymousClass0l6((C023509x) null, r1, r4);
            AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, r2, r7);
        }
        return AnonymousClass0AJ.A00;
    }

    public C17330r7 A02(AnonymousClass040 r7) {
        C005102h r5 = this.A02;
        int i = this.A00;
        AnonymousClass0l4 r4 = new AnonymousClass0l4((C023509x) null, this);
        Integer num = C023109s.A00;
        C15150mm r0 = new C15150mm(AnonymousClass0A3.A01(r5, r7), C05750Qx.A00(num, i));
        r0.A0x(num, r0, r4);
        return r0;
    }

    public C13130jD A04(Integer num, C005102h r4, int i) {
        return new C15380nF(num, this.A00, r4, i);
    }

    public C15380nF(Integer num, Iterable iterable, C005102h r3, int i) {
        super(num, r3, i);
        this.A00 = iterable;
    }
}
