package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.4mE  reason: invalid class name and case insensitive filesystem */
public final class C95754mE extends AnonymousClass0IL {
    public final C18820ts A00;

    public int[] A08(View view, AnonymousClass0CP r8) {
        int right;
        int A02;
        char A1a = C36341k9.A1a(r8, view);
        if (!r8.A1N()) {
            return super.A08(view, r8);
        }
        int[] A1O = C36441kJ.A1O();
        C18180sk r2 = new C18180sk(r8, 0);
        if (C36351kA.A1Y(this.A00)) {
            right = view.getLeft();
            A02 = r2.A04();
        } else {
            right = view.getRight();
            A02 = r2.A02();
        }
        A1O[0] = right - A02;
        A1O[A1a] = 0;
        return A1O;
    }

    public boolean A02(int i, int i2) {
        if (i < -3000) {
            i = -3000;
        } else if (i > 3000) {
            i = 3000;
        }
        return super.A02(i, i2);
    }

    public View A04(AnonymousClass0CP r10) {
        if (!(r10 instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r10;
        if (!linearLayoutManager.A1N()) {
            return null;
        }
        C18180sk r8 = new C18180sk(r10, 0);
        AnonymousClass00C.A0E(r10, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int A1T = linearLayoutManager.A1T();
        boolean A1S = AnonymousClass000.A1S(linearLayoutManager.A1U(), linearLayoutManager.A0M() - 1);
        if (A1T != -1 && !A1S) {
            View A0k = r10.A0k(A1T);
            int A06 = r8.A06(A0k);
            int A07 = r8.A07(A0k) / 2;
            if (C36401kF.A1X(this.A00)) {
                A06 = r8.A02.A03 - r8.A09(A0k);
            }
            if (A06 >= A07) {
                return A0k;
            }
            if (linearLayoutManager.A1S() != linearLayoutManager.A0M() - 1) {
                return r10.A0k(A1T + 1);
            }
        }
        return null;
    }

    public C95754mE(C18820ts r1) {
        this.A00 = r1;
    }
}
