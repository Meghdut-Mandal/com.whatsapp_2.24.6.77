package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6dP  reason: invalid class name and case insensitive filesystem */
public class C135876dP implements ViewTreeObserver.OnGlobalLayoutListener {
    public View A00;
    public C1271967i A01;
    public C140456lc A02;
    public C160377ku A03;
    public C160377ku A04;
    public String A05;
    public boolean A06;

    public static void A00(C135876dP r5) {
        if (r5.A01 != null) {
            r5.A06 = false;
            C160377ku r4 = r5.A04;
            if (r4 != null) {
                C140456lc r3 = r5.A02;
                C1273868b A002 = C1273868b.A00();
                A002.A09(r5.A05, 0);
                C131756Qk.A02(r5.A01, r3, C1273868b.A05(A002, r5.A01, 1), r4);
            }
        }
    }

    public void onGlobalLayout() {
        int visibility;
        int visibility2;
        View view = this.A00;
        if (view != null && this.A01 != null) {
            if (this.A06 && ((visibility2 = view.getVisibility()) == 4 || visibility2 == 8)) {
                A00(this);
            } else if (!this.A06 && (visibility = this.A00.getVisibility()) != 4 && visibility != 8 && this.A01 != null) {
                this.A06 = true;
                C160377ku r4 = this.A03;
                if (r4 != null) {
                    C140456lc r3 = this.A02;
                    C1273868b A002 = C1273868b.A00();
                    A002.A09(this.A05, 0);
                    C131756Qk.A02(this.A01, r3, C1273868b.A05(A002, this.A01, 1), r4);
                }
            }
        }
    }
}
