package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6qe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143496qe implements AnonymousClass7g0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C119245pV A01;
    public final /* synthetic */ AnonymousClass6L1 A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C143496qe(C119245pV r1, AnonymousClass6L1 r2, List list, int i, boolean z) {
        this.A02 = r2;
        this.A04 = z;
        this.A03 = list;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void Be6() {
        int i;
        int i2;
        AnonymousClass6L1 r5 = this.A02;
        boolean z = this.A04;
        List list = this.A03;
        int i3 = this.A00;
        C119245pV r4 = this.A01;
        if (z) {
            i = list.size();
        } else {
            i = 14;
            if (i3 == 2) {
                i = 5;
            }
        }
        List list2 = r5.A03;
        int min = Math.min(i, Math.min(150 - list2.size(), list.size()));
        list2.addAll(list.subList(0, min));
        r5.A01 = list.subList(min, Math.min(list.size(), 150));
        ArrayList A15 = C36441kJ.A15(list2);
        C143516qg r3 = r4.A01;
        C128836Du r1 = r4.A00;
        C125025zC r2 = r3.A09;
        List list3 = r1.A06;
        r2.A05 = new C128836Du(r1.A00, r1.A01, r1.A03, r1.A05, r1.A04, r1.A02, r1.A07, list3, A15, r1.A08);
        r2.A0H |= AnonymousClass000.A1S(A15.size(), 150);
        C143516qg.A07(r3, 1);
        if (!r2.A05.A09.isEmpty() || !r2.A05.A06.isEmpty()) {
            int i4 = 1;
            if (r2.A00 > 0) {
                i4 = 7;
            }
            r2.A03 = i4;
            r3.A0B();
            C143516qg.A06(r3);
            r2.A00++;
            C143516qg.A04(r1, r3);
            if (r3.A05 != 0 && 5 == A15.size()) {
                i2 = 10;
            } else {
                return;
            }
        } else {
            i2 = 6;
        }
        r2.A03 = i2;
        r3.A0B();
    }
}
