package X;

import android.content.res.ColorStateList;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.3Zy  reason: invalid class name and case insensitive filesystem */
public final class C67473Zy implements C021809f {
    public final int A00;
    public final ColorStateList A01;
    public final C021809f A02;

    public C67473Zy(C021809f r2, int i) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        this.A00 = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        AnonymousClass00C.A08(valueOf);
        this.A01 = valueOf;
    }

    public void BVS(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02.BVS(r2);
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r3) {
        C36321k7.A0w(r3, menuItem);
        return this.A02.BQg(menuItem, r3);
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r6) {
        C36321k7.A0w(r6, menu);
        boolean BUq = this.A02.BUq(menu, r6);
        C56022vb.A00(this.A01, menu, (C27981Qp) null, this.A00);
        return BUq;
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r6) {
        C36321k7.A0w(r6, menu);
        boolean BdJ = this.A02.BdJ(menu, r6);
        C56022vb.A00(this.A01, menu, (C27981Qp) null, this.A00);
        return BdJ;
    }
}
