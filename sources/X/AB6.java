package X;

public final class AB6 implements B6B {
    public void B25(C192559Hl r3, AnonymousClass3T1 r4) {
        C36331k8.A1I(r4, r3);
        if (r4 instanceof AnonymousClass2bV) {
            r3.A00.A0k(r4.A0b());
            return;
        }
        throw C165567td.A0K(0);
    }

    public AnonymousClass3T1 BlI(AnonymousClass9XL r6) {
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass8RS r1 = r6.A02;
        if ((r1.bitField0_ & 1) == 0) {
            return null;
        }
        C64933Qa r0 = r6.A03;
        long j = r6.A01;
        String str = r1.conversation_;
        AnonymousClass2bV r12 = new AnonymousClass2bV(r0, j);
        r12.A16(AnonymousClass14B.A0C(str, 65536));
        return r12;
    }
}
