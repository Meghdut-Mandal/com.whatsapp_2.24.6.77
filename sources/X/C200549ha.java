package X;

import java.util.ArrayList;

/* renamed from: X.9ha  reason: invalid class name and case insensitive filesystem */
public abstract class C200549ha {
    public static final C197499bo A00 = C197499bo.A01("k", "x", "y");

    public static C208449yG A00(AnonymousClass9Y2 r9, C21655ATw aTw) {
        ArrayList A0I = AnonymousClass001.A0I();
        C21655ATw aTw2 = aTw;
        if (aTw.A0H() == C023109s.A00) {
            aTw.A0L();
            while (aTw.A0S()) {
                boolean A1a = C36361kB.A1a(aTw.A0H(), C023109s.A0C);
                AnonymousClass9Y2 r3 = r9;
                A0I.add(new AnonymousClass81J(r9, C200719i6.A01(r3, C208639yb.A00, aTw2, C203079nF.A00(), A1a, false)));
            }
            aTw.A0N();
            C200569hc.A01(A0I);
        } else {
            A0I.add(new C202689mQ(C202379li.A02(aTw, C203079nF.A00())));
        }
        return new C208449yG(A0I);
    }

    public static B25 A01(AnonymousClass9Y2 r7, C21655ATw aTw) {
        aTw.A0M();
        C208449yG r5 = null;
        AnonymousClass815 r4 = null;
        AnonymousClass815 r3 = null;
        boolean z = false;
        while (aTw.A0H() != C023109s.A0G) {
            int A0F = aTw.A0F(A00);
            if (A0F != 0) {
                if (A0F != 1) {
                    if (A0F != 2) {
                        aTw.A0P();
                        aTw.A0Q();
                    } else if (aTw.A0H() != C023109s.A0S) {
                        r3 = C200299h7.A01(r7, aTw, true);
                    }
                } else if (aTw.A0H() != C023109s.A0S) {
                    r4 = C200299h7.A01(r7, aTw, true);
                }
                aTw.A0Q();
                z = true;
            } else {
                r5 = A00(r7, aTw);
            }
        }
        aTw.A0O();
        if (z) {
            AnonymousClass9Y2.A00(r7, "Lottie doesn't support expressions.");
        }
        if (r5 != null) {
            return r5;
        }
        return new C208469yI(r4, r3);
    }
}
