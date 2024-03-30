package X;

import android.database.DataSetObserver;

/* renamed from: X.1lD  reason: invalid class name and case insensitive filesystem */
public final class C36731lD extends DataSetObserver {
    public final /* synthetic */ C40981wQ A00;

    public C36731lD(C40981wQ r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        super.onChanged();
        C40981wQ r1 = this.A00;
        r1.A01 = true;
        r1.A06();
    }

    public void onInvalidated() {
        super.onInvalidated();
        C40981wQ r1 = this.A00;
        r1.A01 = false;
        r1.A06();
    }
}
