package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1ws  reason: invalid class name and case insensitive filesystem */
public final class C41231ws extends C02910Cj {
    public int A00 = 0;
    public int A01;
    public final int A02;

    public C41231ws(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A0x(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        if (A002 == 0) {
            rect.set(0, this.A01, 0, 0);
        } else if (A002 == this.A02 - 1) {
            rect.set(0, 0, 0, this.A00);
        }
    }
}
