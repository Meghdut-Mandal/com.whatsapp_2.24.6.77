package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public final class C41221wr extends C02910Cj {
    public final int A00;
    public final C18820ts A01;

    public C41221wr(C18820ts r2, int i) {
        AnonymousClass00C.A0D(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r5, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A0x(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A002 == 0) {
            rect.left = 0;
        } else if (C36351kA.A1Y(this.A01)) {
            rect.left = this.A00;
        } else {
            rect.left = 0;
            rect.right = this.A00;
            return;
        }
        rect.right = 0;
    }
}
