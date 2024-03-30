package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.0cB  reason: invalid class name and case insensitive filesystem */
public class C09320cB implements C021809f {
    public C021809f A00;
    public final /* synthetic */ AnonymousClass02U A01;

    public C09320cB(AnonymousClass02U r1, C021809f r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean BQg(MenuItem menuItem, AnonymousClass0V9 r3) {
        return this.A00.BQg(menuItem, r3);
    }

    public boolean BUq(Menu menu, AnonymousClass0V9 r3) {
        return this.A00.BUq(menu, r3);
    }

    public void BVS(AnonymousClass0V9 r5) {
        this.A00.BVS(r5);
        AnonymousClass02U r3 = this.A01;
        if (r3.A0B != null) {
            r3.A0A.getDecorView().removeCallbacks(r3.A0N);
        }
        if (r3.A0J != null) {
            AnonymousClass0V7 r0 = r3.A0L;
            if (r0 != null) {
                r0.A00();
            }
            AnonymousClass0V7 A07 = C012005e.A07(r3.A0J);
            A07.A02(0.0f);
            r3.A0L = A07;
            A07.A09(new C18150sh(this, 1));
        }
        AnonymousClass01J r1 = r3.A0j;
        if (r1 != null) {
            r1.Bih(r3.A0I);
        }
        r3.A0I = null;
        AnonymousClass09G.A00(r3.A09);
    }

    public boolean BdJ(Menu menu, AnonymousClass0V9 r3) {
        AnonymousClass09G.A00(this.A01.A09);
        return this.A00.BdJ(menu, r3);
    }
}
