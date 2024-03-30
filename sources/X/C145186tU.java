package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6tU  reason: invalid class name and case insensitive filesystem */
public class C145186tU implements C159437jM {
    public final /* synthetic */ C96014me A00;

    public C145186tU(C96014me r1) {
        this.A00 = r1;
    }

    public void BWY() {
        RecyclerView recyclerView = this.A00.A09.A0P;
        if (recyclerView != null) {
            recyclerView.post(new C1503074t((Object) this, 47));
        }
    }

    public /* bridge */ /* synthetic */ void BeC(Object obj) {
        RecyclerView recyclerView = this.A00.A09.A0P;
        if (recyclerView != null) {
            recyclerView.post(new C1502074j(this, obj, 1));
        }
    }
}
