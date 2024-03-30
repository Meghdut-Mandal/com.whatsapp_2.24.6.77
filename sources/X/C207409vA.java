package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9vA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207409vA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass9OB A00;

    public /* synthetic */ C207409vA(AnonymousClass9OB r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        int i;
        AnonymousClass9OB r4 = this.A00;
        int i2 = 0;
        AnonymousClass00C.A0D(r4, 0);
        RecyclerView recyclerView = r4.A07;
        int i3 = 0;
        if (recyclerView != null) {
            i2 = recyclerView.getHeight();
        }
        if (i2 != r4.A02) {
            r4.A02 = i2;
            int i4 = r4.A04;
            int i5 = (i4 * 3) / 4;
            int i6 = i2 % i4;
            if (i6 >= i4 / 4 && i6 <= i5) {
                i5 = i6;
            }
            int max = Math.max(0, i2 - i5);
            r4.A01 = (max % i4) / ((max / i4) + 1);
        }
        if (recyclerView != null) {
            i3 = recyclerView.getWidth();
        }
        if (r4.A03 != i3) {
            r4.A03 = i3;
            int i7 = r4.A04;
            if (!(i7 == 0 || r4.A00 == (i = i3 / i7))) {
                r4.A00 = i;
                r4.A06.A1o(i);
                C96064mj r0 = r4.A08;
                if (r0 != null) {
                    r0.A06();
                }
            }
            C96064mj r02 = r4.A08;
            if (r02 != null) {
                r02.A06();
            }
        }
    }
}
