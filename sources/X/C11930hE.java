package X;

import android.view.MenuItem;

/* renamed from: X.0hE  reason: invalid class name and case insensitive filesystem */
public class C11930hE implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ C09490cS A01;
    public final /* synthetic */ C06140Sl A02;
    public final /* synthetic */ C016307a A03;

    public C11930hE(MenuItem menuItem, C09490cS r2, C06140Sl r3, C016307a r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = menuItem;
        this.A03 = r4;
    }

    public void run() {
        C06140Sl r1 = this.A02;
        if (r1 != null) {
            C03450Fb r2 = this.A01.A00;
            r2.A00 = true;
            r1.A01.A0F(false);
            r2.A00 = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0K(menuItem, (AnonymousClass07X) null, 4);
        }
    }
}
