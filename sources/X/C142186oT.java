package X;

import java.util.Iterator;

/* renamed from: X.6oT  reason: invalid class name and case insensitive filesystem */
public class C142186oT implements AnonymousClass7fI {
    public final AnonymousClass7fI A00;

    public C142186oT(AnonymousClass7fI r1) {
        this.A00 = r1;
    }

    public boolean BvX(C140456lc r9) {
        AnonymousClass6T8 A01 = AnonymousClass6NR.A01();
        int i = r9.A04;
        int[] A002 = A01.A00(i);
        for (int A0c : A002) {
            Iterator it = r9.A0c(A0c).iterator();
            while (it.hasNext()) {
                C140456lc A0Y = C90514aH.A0Y(it);
                if (A0Y != null && this.A00.BvX(A0Y)) {
                    return true;
                }
            }
        }
        int[] A012 = AnonymousClass6NR.A01().A01(i);
        for (int A0W : A012) {
            C140456lc A0W2 = r9.A0W(A0W);
            if (A0W2 != null && this.A00.BvX(A0W2)) {
                return true;
            }
        }
        return false;
    }
}
