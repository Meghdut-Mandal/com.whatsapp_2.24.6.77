package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.9OB  reason: invalid class name */
public final class AnonymousClass9OB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;
    public final GridLayoutManager A06;
    public final RecyclerView A07;
    public final C96064mj A08;

    public AnonymousClass9OB(Context context, ViewGroup viewGroup, RecyclerView recyclerView, C96064mj r7) {
        int i;
        this.A07 = recyclerView;
        this.A08 = r7;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A04 = dimensionPixelSize;
        if (viewGroup != null) {
            i = viewGroup.getWidth();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C24801Dv.A00(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        this.A03 = i;
        this.A05 = new C207409vA(this);
        int i2 = i / dimensionPixelSize;
        this.A00 = i2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2 <= 0 ? 1 : i2);
        this.A06 = gridLayoutManager;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C168187zq r0 = new C168187zq(this);
        if (recyclerView != null) {
            recyclerView.A0t(r0);
            recyclerView.setItemAnimator((C02800By) null);
        }
    }
}
