package X;

import android.content.Context;
import android.database.ContentObserver;

/* renamed from: X.0WW  reason: invalid class name */
public final class AnonymousClass0WW {
    public static AnonymousClass0WW A02;
    public final Context A00;
    public final ContentObserver A01;

    public AnonymousClass0WW() {
        this.A00 = null;
        this.A01 = null;
    }

    public AnonymousClass0WW(Context context) {
        this.A00 = context;
        C03110Df r3 = new C03110Df();
        this.A01 = r3;
        context.getContentResolver().registerContentObserver(AnonymousClass0WD.A02, true, r3);
    }
}
