package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Vj  reason: invalid class name and case insensitive filesystem */
public class C89134Vj extends C02910Cj {
    public int A00;
    public Object A01;
    public final int A02;

    public C89134Vj(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r5, RecyclerView recyclerView) {
        if (2 - this.A02 != 0) {
            int i = this.A00;
            rect.set(0, i, 0, i);
            return;
        }
        int i2 = this.A00;
        rect.set(0, i2, i2, i2);
    }
}
