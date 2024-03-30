package X;

import java.util.Set;

/* renamed from: X.8p9  reason: invalid class name and case insensitive filesystem */
public final class C182478p9 extends C21198ACg {
    public final C30681ab A00;
    public final AnonymousClass1TU A01;

    public C182478p9(C30681ab r2, AnonymousClass1TU r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void B22(AnonymousClass6CO r4, AnonymousClass8NK r5, AnonymousClass3T1 r6) {
        AnonymousClass2bO r1;
        AnonymousClass00C.A0D(r6, 0);
        C36321k7.A0x(r5, r4);
        if (!(r6 instanceof AnonymousClass2c7) || (r1 = (AnonymousClass2bO) r6) == null) {
            throw C165567td.A0K(0);
        }
        super.B22(r4, r5, r6);
        r5.A0X(AnonymousClass91I.A2o);
        String str = r1.A01;
        if (str != null) {
            r5.A0Y(str);
        }
    }

    public AnonymousClass3T1 BlF(C1275768v r7, AnonymousClass8SU r8) {
        String str;
        AnonymousClass91I A0u = r8.A0u();
        if (A0u == AnonymousClass91I.A2o) {
            C64933Qa A02 = this.A00.A02(r8);
            long A002 = C30681ab.A00(r8);
            AnonymousClass2c7 r4 = new AnonymousClass2c7(A02, A002);
            r4.A0n(5);
            r4.A0H = r4.A0I;
            r4.A00 = r8.revokeMessageTimestamp_;
            if (C170918Hz.A00(r8) > 0) {
                str = C36401kF.A0s(r8.messageStubParameters_, 0);
            } else {
                str = new AnonymousClass2c7((AnonymousClass3T1) r4, C36411kG.A0o(r4.A1J.A00, this.A01.A01), A002).A1J.A01;
            }
            r4.A01 = str;
            return r4;
        }
        throw C165617ti.A0S(0, AnonymousClass000.A0l(A0u, "Unexpected stub type: ", AnonymousClass000.A0u()));
    }

    public Set BCE() {
        return C36411kG.A15(AnonymousClass91I.A2o);
    }
}
