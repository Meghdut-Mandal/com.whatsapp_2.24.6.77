package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6KD  reason: invalid class name */
public final class AnonymousClass6KD {
    public final AnonymousClass005 A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new C152157Jk(this));
    public final C19970wo A02;

    public static final void A00(AnonymousClass6KD r6) {
        C118975p2 r5 = (C118975p2) r6.A00.get();
        Map A16 = C90514aH.A16(r6.A01);
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A0y = AnonymousClass000.A0y(A16);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (!((Collection) A11.getValue()).isEmpty()) {
                C36411kG.A1T(A1G, A11);
            }
        }
        ArrayList A14 = C36441kJ.A14(A1G.size());
        Iterator A0y2 = AnonymousClass000.A0y(A1G);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C90494aF.A0f(A112));
            A0u.append(',');
            A14.add(AnonymousClass000.A0q(C36381kD.A0x(",", (Iterable) A112.getValue()), A0u));
        }
        C36351kA.A0A(r5.A01).putStringSet("battery:wake_ups_time", C007103b.A0f(A14)).apply();
    }

    public AnonymousClass6KD(C19970wo r2, AnonymousClass005 r3) {
        C36321k7.A0x(r2, r3);
        this.A02 = r2;
        this.A00 = r3;
    }
}
