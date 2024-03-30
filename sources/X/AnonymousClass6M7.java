package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6M7  reason: invalid class name */
public final class AnonymousClass6M7 {
    public static final AnonymousClass6M7 A00 = new AnonymousClass6M7();

    public final void A00(C139266jV r17, List list, boolean z) {
        double d;
        double d2;
        List<C134976bv> list2 = list;
        AnonymousClass00C.A0D(list2, 1);
        C139266jV r11 = r17;
        AnonymousClass6WY r6 = r11.A0R;
        C135076c5 r7 = r6.A06().A04;
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list2) {
            if (r7.A02((C134976bv) next)) {
                A0I.add(next);
            }
        }
        if (A0I.size() != list2.size()) {
            C134976bv A002 = r7.A00();
            for (C134976bv A01 : list2) {
                r7 = r7.A01(A01);
            }
            AnonymousClass00C.A0B(A002);
            C134976bv r0 = r7.A00;
            C134976bv r2 = r7.A01;
            double d3 = A002.A00;
            double A003 = C90504aG.A00(d3, r0.A00);
            double A004 = C90504aG.A00(r2.A00, d3);
            if (A003 > A004) {
                d = d3 - A003;
            } else {
                d = d3 + A004;
            }
            double d4 = A002.A01;
            C135076c5 A012 = r7.A01(C134976bv.A00(d, d4));
            AnonymousClass00C.A0B(A012);
            C134976bv r02 = A012.A00;
            C134976bv r9 = A012.A01;
            double A005 = C90504aG.A00(d4, r02.A01);
            double A006 = C90504aG.A00(r9.A01, d4);
            if (A005 > A006) {
                d2 = d4 - A005;
            } else {
                d2 = d4 + A006;
            }
            C135076c5 A013 = A012.A01(C134976bv.A00(d3, d2));
            AnonymousClass00C.A0B(A013);
            C134976bv r22 = A013.A00;
            C134976bv r10 = A013.A01;
            float A014 = C90524aI.A01(r11.A0O, 120.0f);
            float A007 = C134996bx.A00(r11);
            double d5 = (double) (A014 / (((float) ((1 << ((int) A007)) * r6.A00.A0N)) * ((A007 % 1.0f) + 1.0f)));
            double A015 = AnonymousClass6WY.A01(r22.A01);
            double A008 = AnonymousClass6WY.A00(r22.A00);
            C135076c5 A016 = A013.A01(C134976bv.A00(AnonymousClass6WY.A02(AnonymousClass6WY.A00(r10.A00) + d5), ((AnonymousClass6WY.A01(r10.A01) - d5) * 360.0d) - 180.0d)).A01(C134976bv.A00(AnonymousClass6WY.A02(A008 - d5), ((A015 + d5) * 360.0d) - 180.0d));
            C1264964g r23 = new C1264964g();
            r23.A07 = A016;
            r23.A06 = A002;
            if (z) {
                r11.A0A(r23, (C158997ia) null, 150);
            } else {
                r11.A09(r23);
            }
        }
    }
}
