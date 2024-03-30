package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nP  reason: invalid class name and case insensitive filesystem */
public class C96484nP extends AnonymousClass0UE {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass0I9 A02;
    public final C1271967i A03;
    public final C140456lc A04;

    public void A03(RecyclerView recyclerView, int i) {
        AnonymousClass0CP layoutManager;
        View A042;
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (A042 = this.A02.A04(layoutManager)) != null) {
                int A002 = RecyclerView.A00(A042);
                if (A002 != this.A00 || this.A01) {
                    A00(this.A03, this.A04, A002, this.A01);
                    this.A00 = A002;
                    z = false;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C96484nP r5 = (C96484nP) obj;
            return this.A02 == r5.A02 && this.A04.A03 == r5.A04.A03;
        }
        return false;
    }

    public static void A00(C1271967i r5, C140456lc r6, int i, boolean z) {
        C1273868b A002;
        C160377ku A0X = r6.A0X(97);
        if (A0X != null) {
            A002 = C1273868b.A00();
            A002.A09(Integer.valueOf(i), 0);
            A002.A09(Boolean.valueOf(z), 1);
            A002.A09(r5, 2);
        } else {
            A0X = r6.A0X(51);
            if (A0X != null) {
                A002 = C1273868b.A00();
                A002.A09(Integer.valueOf(i), 0);
                A002.A09(r5, 1);
            } else {
                return;
            }
        }
        C1273868b.A06(r5, r6, A002, A0X);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A02) + this.A04.A03;
    }

    public C96484nP(AnonymousClass0I9 r2, C1271967i r3, C140456lc r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
