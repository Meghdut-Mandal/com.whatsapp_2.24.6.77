package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0C7  reason: invalid class name */
public class AnonymousClass0C7 implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass0C7(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.A00;
        C02800By r0 = recyclerView.A0H;
        if (r0 != null) {
            r0.A0B();
        }
        recyclerView.A0X = false;
    }
}
