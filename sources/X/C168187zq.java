package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7zq  reason: invalid class name and case insensitive filesystem */
public final class C168187zq extends C02910Cj {
    public final /* synthetic */ AnonymousClass9OB A00;

    public C168187zq(AnonymousClass9OB r1) {
        this.A00 = r1;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r9, RecyclerView recyclerView) {
        C165567td.A1K(rect, view, recyclerView);
        AnonymousClass9OB r5 = this.A00;
        if (r5.A00 != 0) {
            int A002 = RecyclerView.A00(view);
            int i = r5.A00;
            int i2 = A002 % i;
            int i3 = (r5.A03 - (r5.A04 * i)) / (i + 1);
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * i3) / i;
            if (A002 < i) {
                rect.top = r5.A01;
            }
            rect.bottom = r5.A01;
        }
    }
}
