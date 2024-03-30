package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4n1  reason: invalid class name and case insensitive filesystem */
public final class C96244n1 extends C02910Cj {
    public final C1271967i A00;
    public final C140456lc A01;

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        List unmodifiableList;
        Rect rect2;
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A0x(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        Object A04 = C133266Xn.A04(this.A00, this.A01);
        AnonymousClass00C.A08(A04);
        List list = ((AnonymousClass6OR) A04).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) C007103b.A0P(unmodifiableList, A002)) != null) {
            rect.set(rect2);
        }
    }

    public C96244n1(C1271967i r1, C140456lc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
