package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9hc  reason: invalid class name and case insensitive filesystem */
public abstract class C200569hc {
    public static C197499bo A00 = C197499bo.A01("k");

    public static ArrayList A00(AnonymousClass9Y2 r8, C22855Ax5 ax5, C21655ATw aTw, float f, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        C21655ATw aTw2 = aTw;
        AnonymousClass9Y2 r3 = r8;
        if (aTw.A0H() == C023109s.A0S) {
            AnonymousClass9Y2.A00(r8, "Lottie doesn't support expressions.");
            return A0I;
        }
        aTw.A0M();
        while (aTw.A0S()) {
            if (aTw.A0F(A00) != 0) {
                aTw.A0Q();
            } else {
                C22855Ax5 ax52 = ax5;
                float f2 = f;
                if (aTw.A0H() == C023109s.A00) {
                    aTw.A0L();
                    if (aTw.A0H() == C023109s.A0V) {
                        C197499bo r0 = C200719i6.A00;
                        A0I.add(new C202689mQ(ax5.BlD(aTw, f)));
                    } else {
                        while (aTw.A0S()) {
                            A0I.add(C200719i6.A01(r3, ax52, aTw2, f2, true, z));
                        }
                    }
                    aTw.A0N();
                } else {
                    C197499bo r02 = C200719i6.A00;
                    A0I.add(new C202689mQ(ax5.BlD(aTw, f)));
                }
            }
        }
        aTw.A0O();
        A01(A0I);
        return A0I;
    }

    public static void A01(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C202689mQ r2 = (C202689mQ) list.get(i2);
            i2++;
            C202689mQ r1 = (C202689mQ) list.get(i2);
            r2.A07 = Float.valueOf(r1.A0A);
            if (r2.A08 == null && r1.A0E != null) {
                r2.A08 = r1.A0E;
                if (r2 instanceof AnonymousClass81J) {
                    ((AnonymousClass81J) r2).A04();
                }
            }
        }
        C202689mQ r12 = (C202689mQ) list.get(i);
        if ((r12.A0E == null || r12.A08 == null) && list.size() > 1) {
            list.remove(r12);
        }
    }
}
