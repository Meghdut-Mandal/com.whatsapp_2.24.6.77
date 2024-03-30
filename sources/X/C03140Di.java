package X;

import android.database.DataSetObserver;

/* renamed from: X.0Di  reason: invalid class name and case insensitive filesystem */
public class C03140Di extends DataSetObserver {
    public final /* synthetic */ C09470cQ A00;

    public C03140Di(C09470cQ r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        C09470cQ r1 = this.A00;
        if (r1.A0A.isShowing()) {
            r1.Btc();
        }
    }

    public void onInvalidated() {
        this.A00.dismiss();
    }
}
