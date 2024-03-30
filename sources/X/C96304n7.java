package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4n7  reason: invalid class name and case insensitive filesystem */
public final class C96304n7 extends C02910Cj {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C96304n7(int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r8, RecyclerView recyclerView) {
        int i;
        super.A05(rect, view, r8, recyclerView);
        int A002 = RecyclerView.A00(view);
        boolean z = this.A00;
        int width = recyclerView.getWidth();
        if (z) {
            i = (width - (this.A01 * 8)) / 2;
        } else {
            i = this.A02;
            int i2 = ((width - (i * 2)) - (8 * this.A03)) / 14;
            rect.left = i2;
            rect.right = i2;
        }
        if (A002 == 0) {
            rect.left = i;
        } else if (A002 == 7) {
            rect.right = i;
        }
    }
}
