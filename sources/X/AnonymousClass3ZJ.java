package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3ZJ  reason: invalid class name */
public final class AnonymousClass3ZJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final RecyclerView A01;
    public final C96424nJ A02;

    public void onGlobalLayout() {
        if (this.A00) {
            this.A02.A05(this.A01);
            this.A00 = false;
        }
    }

    public AnonymousClass3ZJ(RecyclerView recyclerView, C96424nJ r2) {
        this.A01 = recyclerView;
        this.A02 = r2;
    }
}
