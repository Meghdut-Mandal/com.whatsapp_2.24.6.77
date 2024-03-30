package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.6OR  reason: invalid class name */
public class AnonymousClass6OR {
    public static final ViewGroup.MarginLayoutParams A09;
    public C95734mC A00;
    public final C98314rE A01;
    public final C124785yn A02;
    public final C114875hy A03;
    public volatile AnonymousClass0C0 A04;
    public volatile AnonymousClass0I9 A05;
    public volatile C96324n9 A06;
    public volatile Integer A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public AnonymousClass6OR(C98314rE r1, C124785yn r2, C114875hy r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public void A00(int i, int i2, boolean z) {
        if (C132926Vv.A03()) {
            C124785yn r1 = this.A02;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A01 = i;
                r1.A02 = i2;
                r1.A0A = z;
            } else if (z) {
                recyclerView.A0n(i, i2);
            } else {
                recyclerView.scrollBy(i, i2);
            }
        } else {
            throw C90514aH.A0s("Cannot doScrollBy off the main thread!");
        }
    }

    public void A01(int i, boolean z) {
        if (C132926Vv.A03()) {
            C124785yn r1 = this.A02;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A00 = i;
                r1.A09 = z;
            } else if (z) {
                recyclerView.A0i(i);
            } else {
                recyclerView.A0h(i);
                C98314rE r3 = this.A01;
                C140456lc r2 = r3.A00;
                C160377ku A0X = r2.A0X(51);
                C160377ku A0X2 = r2.A0X(97);
                if (A0X != null || A0X2 != null) {
                    C96484nP.A00(r3.A02, r2, i, false);
                }
            }
        } else {
            throw C90514aH.A0s("Cannot doScrollTo off the main thread!");
        }
    }
}
