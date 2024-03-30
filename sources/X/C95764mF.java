package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.4mF  reason: invalid class name and case insensitive filesystem */
public class C95764mF extends AnonymousClass0IL {
    public AnonymousClass0CY A00;
    public final double A01 = 0.8d;
    public final boolean A02 = true;

    public int A03(AnonymousClass0CP r6, int i, int i2) {
        int A0M;
        View A04;
        int A022;
        if (!(r6 instanceof AnonymousClass0CQ) || (A0M = r6.A0M()) == 0 || (A04 = A04(r6)) == null || (A022 = AnonymousClass0CP.A02(A04)) == -1 || ((AnonymousClass0CQ) r6).B3K(A0M - 1) == null) {
            return -1;
        }
        int A03 = super.A03(r6, i, i2);
        if (A03 != -1 || i == 0) {
            return A03;
        }
        return A022 + (Math.abs(i) / i);
    }

    public View A04(AnonymousClass0CP r13) {
        if ((r13 instanceof LinearLayoutManager) && r13.A1N()) {
            AnonymousClass0CY r10 = this.A00;
            if (r10 == null) {
                r10 = new C18180sk(r13, 0);
                this.A00 = r10;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r13;
            int A1T = linearLayoutManager.A1T();
            boolean A1S = AnonymousClass000.A1S(linearLayoutManager.A1U(), r13.A0M() - 1);
            if (!this.A02 || linearLayoutManager.A1S() == 0 || A1S) {
                if (A1T == -1 || A1S) {
                    return null;
                }
                View A0k = r13.A0k(A1T);
                if (((double) r10.A06(A0k)) >= ((double) r10.A07(A0k)) * this.A01 && r10.A06(A0k) > 0) {
                    return A0k;
                }
                if (linearLayoutManager.A1U() != r13.A0M() - 1) {
                    return r13.A0k(A1T + 1);
                }
                return null;
            }
        }
        return super.A04(r13);
    }

    public int[] A08(View view, AnonymousClass0CP r7) {
        if (this.A02) {
            int A022 = AnonymousClass0CP.A02(view);
            boolean A1Q = AnonymousClass000.A1Q(A022);
            boolean A1S = AnonymousClass000.A1S(A022, r7.A0M() - 1);
            if (!A1Q && !A1S) {
                return super.A08(view, r7);
            }
        }
        int[] A1O = C36441kJ.A1O();
        AnonymousClass0CY r0 = this.A00;
        if (r0 == null) {
            r0 = new C18180sk(r7, 0);
            this.A00 = r0;
        }
        A1O[0] = r0.A09(view) - r0.A04();
        A1O[1] = 0;
        return A1O;
    }
}
