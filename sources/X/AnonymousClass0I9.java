package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0I9  reason: invalid class name */
public abstract class AnonymousClass0I9 extends AnonymousClass0TY {
    public Scroller A00;
    public RecyclerView A01;
    public final AnonymousClass0UE A02 = new AnonymousClass0IB(this);

    public abstract int A03(AnonymousClass0CP r1, int i, int i2);

    public abstract View A04(AnonymousClass0CP r1);

    public abstract int[] A08(View view, AnonymousClass0CP r2);

    public boolean A02(int i, int i2) {
        AnonymousClass0IE A05;
        int A03;
        RecyclerView recyclerView = this.A01;
        AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || recyclerView.A0G == null) {
            return false;
        }
        int i3 = recyclerView.A0t;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(layoutManager instanceof AnonymousClass0CQ) || (A05 = A05(layoutManager)) == null || (A03 = A03(layoutManager, i, i2)) == -1) {
            return false;
        }
        A05.A00 = A03;
        layoutManager.A0g(A05);
        return true;
    }

    @Deprecated
    public AnonymousClass0IE A05(AnonymousClass0CP r4) {
        if (!(r4 instanceof AnonymousClass0CQ)) {
            return null;
        }
        return new C18170sj(this.A01.getContext(), this, 1);
    }

    public void A06() {
        AnonymousClass0CP layoutManager;
        View A04;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (A04 = A04(layoutManager)) != null) {
            int[] A08 = A08(A04, layoutManager);
            int i = A08[0];
            if (i != 0 || A08[1] != 0) {
                this.A01.A0n(i, A08[1]);
            }
        }
    }

    public void A07(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0w(this.A02);
                this.A01.A0J = null;
            }
            this.A01 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0J == null) {
                recyclerView.A0v(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0J = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A06();
                return;
            }
            throw AnonymousClass001.A09("An instance of OnFlingListener already set.");
        }
    }

    public static int A00(View view, AnonymousClass0CY r4) {
        return (r4.A09(view) + (r4.A07(view) / 2)) - (r4.A04() + (r4.A05() / 2));
    }
}
