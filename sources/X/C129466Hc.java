package X;

import java.util.List;

/* renamed from: X.6Hc  reason: invalid class name and case insensitive filesystem */
public abstract class C129466Hc {
    public static final AnonymousClass011 A00;

    static {
        C023409w r1 = C023409w.A00;
        A00 = new AnonymousClass011(r1, r1);
    }

    public static final void A00(C161337ma r12, AnonymousClass72L r13, List list, int i) {
        r12.Bun(-1794596951);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C128326Bu r0 = (C128326Bu) list.get(i2);
            C019408g r6 = (C019408g) r0.A02;
            int i3 = r0.A01;
            int i4 = r0.A00;
            C137696gZ r11 = C137696gZ.A00;
            r12.Bum(-1323940314);
            C137296fu r9 = C161267mT.A00;
            C136916fF r2 = (C136916fF) r12;
            int i5 = r2.A02;
            C161557n6 A04 = C136916fF.A04(r2);
            AnonymousClass00S r02 = AnonymousClass6JB.A00;
            C1509977p A002 = C109165Wn.A00(r9);
            C136916fF.A0F(r12, r2, r02);
            AnonymousClass5WF.A00(r12, r11, A04);
            C009003v r1 = AnonymousClass6JB.A01;
            if (r2.A0L || !C90464aC.A1W(r12, i5)) {
                C90464aC.A0v(r12, r1, i5);
            }
            A002.BKt(new AnonymousClass68J(r12), r12, 0);
            r12.Bum(2058660585);
            r6.BKt(r13.subSequence(i3, i4).A00, r12, 0);
            C136916fF.A0M(r2, false);
            C136916fF.A0M(r2, true);
            C136916fF.A0M(r2, false);
        }
        C136976fO B6Z = r12.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7YQ(r13, list, i);
        }
    }
}
