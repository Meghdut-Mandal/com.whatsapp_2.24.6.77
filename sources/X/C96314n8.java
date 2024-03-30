package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4n8  reason: invalid class name and case insensitive filesystem */
public final class C96314n8 extends C02910Cj {
    public final int A00;
    public final C123625wo A01;
    public final C1271967i A02;
    public final C140456lc A03;
    public final Rect[] A04;

    public C96314n8(C1271967i r6, C140456lc r7) {
        int i;
        this.A03 = r7;
        this.A02 = r6;
        AnonymousClass6M4 r0 = AnonymousClass6M4.A00;
        Context context = r6.A00;
        AnonymousClass00C.A08(context);
        C123625wo A002 = r0.A00(context, r7);
        this.A01 = A002;
        int i2 = A002.A01;
        this.A00 = i2;
        boolean A003 = AnonymousClass5ZC.A00(context);
        if (i2 == 1) {
            i = A002.A00;
        } else {
            i = A002.A03;
        }
        this.A04 = AnonymousClass5Y3.A00(i2, i, A002.A02, A003);
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r11, RecyclerView recyclerView) {
        AnonymousClass0I8 r4;
        int i;
        List unmodifiableList;
        Rect rect2;
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A0v(view, 1, recyclerView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof AnonymousClass0I8) && (r4 = (AnonymousClass0I8) layoutParams) != null) {
            int A002 = RecyclerView.A00(view);
            C140456lc r7 = this.A03;
            Object obj = r7.A0b().get(A002);
            AnonymousClass00C.A08(obj);
            C140456lc A0B = C140456lc.A0B((C140456lc) obj);
            boolean z = false;
            if (A0B != null && A0B.A04 == 16482) {
                z = A0B.A0f(36, false);
            }
            r4.A01 = z;
            Object A042 = C133266Xn.A04(this.A02, r7);
            AnonymousClass00C.A08(A042);
            List list = ((AnonymousClass6OR) A042).A08;
            if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect2 = (Rect) C007103b.A0P(unmodifiableList, A002)) == null)) {
                if (this.A00 == 1) {
                    rect.top = rect2.top;
                    rect.bottom = rect2.bottom;
                } else {
                    rect.left = rect2.left;
                    rect.right = rect2.right;
                }
            }
            Rect[] rectArr = this.A04;
            AnonymousClass0V8 r0 = r4.A00;
            if (r0 == null) {
                i = -1;
            } else {
                i = r0.A04;
            }
            Rect rect3 = (Rect) AnonymousClass02R.A08(rectArr, i);
            if (!z && rect3 != null) {
                if (this.A00 == 1) {
                    rect.left = rect3.left;
                    rect.right = rect3.right;
                    return;
                }
                rect.top = rect3.top;
                rect.bottom = rect3.bottom;
            }
        }
    }
}
