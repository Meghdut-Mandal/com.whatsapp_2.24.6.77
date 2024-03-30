package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Bw  reason: invalid class name and case insensitive filesystem */
public class C02780Bw implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public C02780Bw(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A02 && !recyclerView.isLayoutRequested()) {
            if (!recyclerView.A0V) {
                recyclerView.requestLayout();
            } else if (recyclerView.A04) {
                recyclerView.A05 = true;
            } else {
                recyclerView.A0U();
            }
        }
    }
}
