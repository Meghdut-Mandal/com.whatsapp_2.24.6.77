package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.0Tp  reason: invalid class name and case insensitive filesystem */
public abstract class C06440Tp {
    public AnonymousClass007 A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof AnonymousClass07L)) {
            return menuItem;
        }
        AnonymousClass07L r2 = (AnonymousClass07L) menuItem;
        AnonymousClass007 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass007(0);
            this.A00 = r1;
        }
        MenuItem menuItem2 = (MenuItem) r1.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        AnonymousClass0FY r4 = new AnonymousClass0FY(this.A01, r2);
        this.A00.put(r2, r4);
        return r4;
    }

    public C06440Tp(Context context) {
        this.A01 = context;
    }
}
