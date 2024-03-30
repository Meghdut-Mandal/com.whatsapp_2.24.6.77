package X;

import java.util.List;

/* renamed from: X.3sH  reason: invalid class name and case insensitive filesystem */
public final class C78543sH implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmI(AnonymousClass3T1 r6, C52942qQ r7) {
        AnonymousClass00C.A0D(r6, 0);
        List<C80163ux> list = r6.A0w;
        if (list != null && !list.isEmpty()) {
            for (C80163ux r2 : list) {
                ((C219712j) this.A00.get()).A07(r2.A00);
            }
        }
        ((C25091Ey) this.A01.get()).A00(r6);
        if (list != null && !list.isEmpty() && r7 != null) {
            throw C36321k7.A04(C78543sH.class);
        }
    }

    public C78543sH(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
