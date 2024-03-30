package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6TC  reason: invalid class name */
public class AnonymousClass6TC {
    public C118895ou A00;
    public C118895ou A01;
    public Float A02;
    public Integer A03;

    private int A00(View view, AnonymousClass0CY r6) {
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            return r6.A09(view);
        }
        if (intValue == 1) {
            return r6.A09(view) + (r6.A07(view) / 2);
        }
        if (intValue == 2) {
            return r6.A06(view);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Invalid gravity :");
        throw AnonymousClass000.A0c(AnonymousClass5ZL.A00(num), A0u);
    }

    private int A01(AnonymousClass0CY r4, AnonymousClass0CP r5) {
        int i;
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            Float f = this.A02;
            RecyclerView recyclerView = r5.A07;
            if (recyclerView == null || !recyclerView.A0R) {
                return 0;
            }
            return r4.A04() + Math.round(f.floatValue());
        } else if (intValue == 1) {
            RecyclerView recyclerView2 = r5.A07;
            if (recyclerView2 == null || !recyclerView2.A0R) {
                i = 0;
            } else {
                i = r4.A04();
            }
            return i + (r4.A05() / 2);
        } else if (intValue == 2) {
            RecyclerView recyclerView3 = r5.A07;
            if (recyclerView3 == null || !recyclerView3.A0R) {
                return r4.A01();
            }
            return r4.A02();
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid gravity :");
            throw AnonymousClass000.A0c(AnonymousClass5ZL.A00(num), A0u);
        }
    }

    public AnonymousClass6TC(Float f, Integer num) {
        this.A03 = num;
        this.A02 = f;
    }

    public View A02(AnonymousClass0CP r9) {
        C118895ou r1;
        if (r9.A1N()) {
            r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C118895ou(new C18180sk(r9, 0), r9);
                this.A00 = r1;
            }
        } else {
            r1 = this.A01;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C118895ou(new C18180sk(r9, 1), r9);
                this.A01 = r1;
            }
        }
        AnonymousClass0CY r6 = r1.A00;
        int A0L = r9.A0L();
        View view = null;
        if (A0L == 0) {
            return null;
        }
        if (this.A03 == C023109s.A01 && (r9 instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
            if (linearLayoutManager.A1S() == 0) {
                return r9.A0R(0);
            }
            if (linearLayoutManager.A1U() == r9.A0M() - 1) {
                return r9.A0R(r9.A0L() - 1);
            }
        }
        int i = Integer.MAX_VALUE;
        int A012 = A01(r6, r9);
        for (int i2 = 0; i2 < A0L; i2++) {
            View A0R = r9.A0R(i2);
            int A05 = AnonymousClass000.A05(A00(A0R, r6), A012);
            if (A05 < i) {
                view = A0R;
                i = A05;
            }
        }
        return view;
    }

    public int[] A03(View view, AnonymousClass0CP r7) {
        int[] A1O = C36441kJ.A1O();
        if (r7.A1N()) {
            C118895ou r1 = this.A00;
            if (r1 == null || r1.A01 != r7) {
                r1 = new C118895ou(new C18180sk(r7, 0), r7);
                this.A00 = r1;
            }
            AnonymousClass0CY r0 = r1.A00;
            A1O[0] = A00(view, r0) - A01(r0, r7);
        } else {
            A1O[0] = 0;
        }
        if (r7.A1O()) {
            C118895ou r12 = this.A01;
            if (r12 == null || r12.A01 != r7) {
                r12 = new C118895ou(new C18180sk(r7, 1), r7);
                this.A01 = r12;
            }
            AnonymousClass0CY r02 = r12.A00;
            A1O[1] = A00(view, r02) - A01(r02, r7);
            return A1O;
        }
        A1O[1] = 0;
        return A1O;
    }
}
