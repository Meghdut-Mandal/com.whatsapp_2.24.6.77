package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.6ZN  reason: invalid class name */
public class AnonymousClass6ZN implements SQLiteTransactionListener {
    public final /* synthetic */ C128596Cw A00;

    public void onBegin() {
    }

    public void onCommit() {
    }

    public AnonymousClass6ZN(C128596Cw r1) {
        this.A00 = r1;
    }

    public void onRollback() {
        C128596Cw r1 = this.A00;
        synchronized (r1) {
            r1.A00 = null;
        }
    }
}
