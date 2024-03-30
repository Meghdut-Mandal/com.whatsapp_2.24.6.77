package X;

import java.util.List;

/* renamed from: X.4lK  reason: invalid class name and case insensitive filesystem */
public final class C95494lK extends AnonymousClass04R {
    public String A00 = "";
    public boolean A01;
    public final C001700s A02 = C36431kI.A0S();
    public final C19420v0 A03;
    public final C20810yC A04;
    public final C122815vT A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new C153017Ms(this));

    public static final void A01(C95494lK r7, String str, boolean z) {
        r7.A01 = z;
        if (str.length() <= 20) {
            String A0y = C36411kG.A0y(str, "[\\p{Punct}¥%，。？；：（）【】「」《》—¡!«»¿?{}]");
            if (AnonymousClass00C.A0J(A0y, r7.A00) && !z) {
                return;
            }
            if (A0y.length() != 0) {
                r7.A00 = A0y;
                C122815vT r6 = r7.A05;
                C18740tg.A01();
                AnonymousClass66P r4 = new AnonymousClass66P();
                if (r6.A01.A02) {
                    AnonymousClass5MG r1 = r6.A00;
                    if (r1 != null) {
                        r1.A0D(true);
                        r6.A00 = null;
                    }
                    AnonymousClass5MG r3 = new AnonymousClass5MG(new C165477tU(r4, 2), r6, r6.A02);
                    r6.A00 = r3;
                    r6.A03.Box(r3, A0y);
                }
                r4.A00((C158307gi) r7.A06.getValue());
                return;
            }
        }
        r7.A02.A0D(C023409w.A00);
        r7.A00 = "";
        C122815vT r2 = r7.A05;
        AnonymousClass5MG r12 = r2.A00;
        if (r12 != null) {
            r12.A0D(true);
            r2.A00 = null;
        }
    }

    public void A0S() {
        List A0w = C36401kF.A0w(this.A02);
        if (A0w != null && !A0w.isEmpty()) {
            A01(this, this.A00, true);
        }
    }

    public C95494lK(C19420v0 r2, C20810yC r3, C122815vT r4) {
        C36321k7.A11(r3, r2, r4);
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
