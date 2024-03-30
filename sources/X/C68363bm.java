package X;

import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.scroller.RecyclerFastScroller;

/* renamed from: X.3bm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68363bm implements C17650rm {
    public final /* synthetic */ RecyclerFastScroller A00;

    public /* synthetic */ C68363bm(RecyclerFastScroller recyclerFastScroller) {
        this.A00 = recyclerFastScroller;
    }

    public final void Bbs(AppBarLayout appBarLayout, int i) {
        RecyclerFastScroller recyclerFastScroller = this.A00;
        int i2 = -i;
        if (recyclerFastScroller.A00 != i2) {
            RecyclerFastScroller.A01(recyclerFastScroller);
            recyclerFastScroller.A00 = i2;
        }
    }
}
