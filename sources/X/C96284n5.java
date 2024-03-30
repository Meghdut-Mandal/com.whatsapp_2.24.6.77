package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4n5  reason: invalid class name and case insensitive filesystem */
public class C96284n5 extends C02910Cj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6F9 A01;
    public final /* synthetic */ C18820ts A02;

    public C96284n5(AnonymousClass6F9 r1, C18820ts r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        boolean A1Y = C36351kA.A1Y(this.A02);
        int i = this.A00;
        if (A1Y) {
            rect.set(0, 0, i, 0);
        } else {
            rect.set(i, 0, 0, 0);
        }
    }
}
