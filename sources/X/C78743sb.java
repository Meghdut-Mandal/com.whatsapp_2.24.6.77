package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3sb  reason: invalid class name and case insensitive filesystem */
public final class C78743sb implements C17820s5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmI(AnonymousClass3T1 r8, C52942qQ r9) {
        List list;
        AnonymousClass00C.A0D(r8, 0);
        if (r8.A1R(64) && !r8.A1J.A02 && ((C20800yB) this.A00.get()).A0E(5869)) {
            AnonymousClass005 r6 = this.A01;
            r8.A0v(((AnonymousClass3CW) r6.get()).A00(r8.A1N));
            long j = r8.A1N;
            if ((r8 instanceof AnonymousClass2bZ) && (list = (List) ((AnonymousClass2bZ) r8).A01.A00) != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it);
                    AnonymousClass3CW r3 = (AnonymousClass3CW) r6.get();
                    if (!AnonymousClass3T1.A06(A0l).A02) {
                        A0l.A0v(r3.A00(j));
                    }
                }
            }
            if (r9 != null) {
                throw C36321k7.A04(C78743sb.class);
            }
        }
    }

    public C78743sb(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
