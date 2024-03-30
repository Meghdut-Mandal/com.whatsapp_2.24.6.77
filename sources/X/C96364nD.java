package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nD  reason: invalid class name and case insensitive filesystem */
public class C96364nD extends C02910Cj {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ PreferenceFragmentCompat A03;

    public C96364nD(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A03 = preferenceFragmentCompat;
    }

    public void A04(Canvas canvas, AnonymousClass0C4 r9, RecyclerView recyclerView) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (A00(childAt, recyclerView)) {
                    int A04 = C36431kI.A04(childAt, (int) childAt.getY());
                    this.A01.setBounds(0, A04, width, this.A00 + A04);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    private boolean A00(View view, RecyclerView recyclerView) {
        AnonymousClass0D3 A0S = recyclerView.A0S(view);
        if (!(A0S instanceof AnonymousClass80G) || !((AnonymousClass80G) A0S).A01) {
            return false;
        }
        boolean z = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        AnonymousClass0D3 A0S2 = recyclerView.A0S(recyclerView.getChildAt(indexOfChild + 1));
        if (!(A0S2 instanceof AnonymousClass80G) || !((AnonymousClass80G) A0S2).A00) {
            return false;
        }
        return true;
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r4, RecyclerView recyclerView) {
        if (A00(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }
}
