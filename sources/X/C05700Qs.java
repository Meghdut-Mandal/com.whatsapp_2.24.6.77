package X;

/* renamed from: X.0Qs  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C05700Qs {
    public static final Object A00(C005102h r4, C009003v r5) {
        AnonymousClass03G r0;
        C12870in r1;
        Thread currentThread = Thread.currentThread();
        if (r4.get(C005402k.A00) == null) {
            r0 = AnonymousClass0AL.A00();
            r1 = C12870in.A00;
            r4 = r4.plus(r0);
        } else {
            r0 = (AnonymousClass03G) AnonymousClass0AL.A00.get();
            r1 = C12870in.A00;
        }
        C15130mk r12 = new C15130mk(currentThread, AnonymousClass0A3.A01(r4, r1), r0);
        r12.A0x(C023109s.A00, r12, r5);
        return r12.A11();
    }
}
