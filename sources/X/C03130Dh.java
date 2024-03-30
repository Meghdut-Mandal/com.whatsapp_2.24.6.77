package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.0Dh  reason: invalid class name and case insensitive filesystem */
public class C03130Dh extends ContentObserver {
    public final /* synthetic */ C03370Eh A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03130Dh(C03370Eh r2) {
        super(new Handler());
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        Cursor cursor;
        C03370Eh r1 = this.A00;
        if (r1.A05 && (cursor = r1.A02) != null && !cursor.isClosed()) {
            r1.A06 = r1.A02.requery();
        }
    }
}
