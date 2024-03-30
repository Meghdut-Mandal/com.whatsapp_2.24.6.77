package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5t2  reason: invalid class name and case insensitive filesystem */
public class C121375t2 {
    public final RecyclerView A00;
    public final C95804mJ A01 = new C95804mJ();
    public final C159277j6 A02;

    public C121375t2(RecyclerView recyclerView, C159277j6 r4) {
        this.A00 = recyclerView;
        this.A02 = r4;
        RecyclerView recyclerView2 = this.A00;
        recyclerView2.setNestedScrollingEnabled(true);
        recyclerView2.setAdapter(this.A01);
    }
}
