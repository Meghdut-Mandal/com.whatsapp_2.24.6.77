package X;

import android.database.DataSetObserver;

/* renamed from: X.0Dj  reason: invalid class name and case insensitive filesystem */
public class C03150Dj extends DataSetObserver {
    public final /* synthetic */ C03370Eh A00;

    public C03150Dj(C03370Eh r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        C03370Eh r1 = this.A00;
        r1.A06 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        C03370Eh r1 = this.A00;
        r1.A06 = false;
        r1.notifyDataSetInvalidated();
    }
}
