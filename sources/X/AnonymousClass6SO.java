package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6SO  reason: invalid class name */
public final class AnonymousClass6SO {
    public static final AnonymousClass600 A07 = new AnonymousClass600();
    public final AnonymousClass17Y A00;
    public final AnonymousClass1DU A01;
    public final AnonymousClass1UJ A02;
    public final C35021i1 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;

    public AnonymousClass6SO(AnonymousClass17Y r2, AnonymousClass1DU r3, AnonymousClass1UJ r4, C35021i1 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A1A(r3, r5, r6, r7, 2);
        AnonymousClass00C.A0D(r8, 7);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
    }

    public static final void A00(C134876bk r4, C128256Bn r5, AnonymousClass6SO r6, List list) {
        ArrayList A002 = A07.A00(r4, r6.A02, list);
        C23931Ak r0 = r5.A00;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A002.contains(Long.valueOf(((AnonymousClass3T1) next).A1N))) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            C90464aC.A1T(A0J, it2);
        }
        AnonymousClass6Y4.A06(r6.A00, r6.A03, r6.A05, A0J, 3);
    }
}
