package X;

import android.database.DataSetObserver;

/* renamed from: X.4VP  reason: invalid class name */
public class AnonymousClass4VP extends DataSetObserver {
    public Object A00;
    public final int A01;

    public AnonymousClass4VP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onChanged() {
        if (this.A01 == 0) {
            ((AnonymousClass07S) this.A00).A09();
        }
    }
}
