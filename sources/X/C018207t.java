package X;

import android.view.MenuItem;

/* renamed from: X.07t  reason: invalid class name and case insensitive filesystem */
public class C018207t implements AnonymousClass02T {
    public final /* synthetic */ AnonymousClass07V A00;

    public void Bar(C016307a r1) {
    }

    public C018207t(AnonymousClass07V r1) {
        this.A00 = r1;
    }

    public boolean Baq(MenuItem menuItem, C016307a r6) {
        AnonymousClass07V r3 = this.A00;
        if (r3.A00 == null || menuItem.getItemId() != r3.A04.A0A) {
            AnonymousClass02I r0 = r3.A01;
            if (r0 == null) {
                return false;
            }
            r0.BbN(menuItem);
            return false;
        }
        r3.A00.BbM(menuItem);
        return true;
    }
}
