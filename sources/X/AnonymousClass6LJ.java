package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6LJ  reason: invalid class name */
public final class AnonymousClass6LJ {
    public final C18820ts A00;
    public final C20810yC A01;
    public final C63563Kn A02;
    public final C23871Ae A03;
    public final C122785vQ A04;
    public final C120215r9 A05;

    public static final List A00(AnonymousClass6LJ r2, List list, int i) {
        if (i != 5 || r2.A01.A0E(6383)) {
            return list;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            C135066c4 r1 = (C135066c4) next;
            if (!r1.A0I && !r1.A0L) {
                A0I.add(next);
            }
        }
        return A0I;
    }

    public AnonymousClass6LJ(C18820ts r1, C20810yC r2, C63563Kn r3, C23871Ae r4, C122785vQ r5, C120215r9 r6) {
        C36321k7.A18(r2, r4, r1, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }
}
