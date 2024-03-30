package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.5Or  reason: invalid class name */
public class AnonymousClass5Or extends C101094wz {
    public C118065nH A00;
    public MenuItem A01;
    public MenuItem A02;
    public final C159757js A03;

    public static void A00(AnonymousClass5Or r4) {
        MenuItem menuItem;
        MenuItem menuItem2;
        C118065nH r0 = r4.A00;
        if (r0 != null) {
            if (r0.A00.A0f(41, false) && (menuItem2 = r4.A01) != null) {
                menuItem2.setVisible(true);
            }
            if (r4.A00.A00.A0f(44, false) && (menuItem = r4.A02) != null) {
                menuItem.setVisible(true);
            }
        }
    }

    public void BUv(Menu menu) {
        MenuItem add = menu.add(0, 55, 0, "cart");
        this.A01 = add;
        add.setShowAsAction(1);
        this.A01.setIcon(R.drawable.ic_action_view_shop);
        this.A01.setVisible(false);
        MenuItem add2 = menu.add(0, 56, 0, "more");
        this.A02 = add2;
        add2.setShowAsAction(1);
        this.A02.setIcon(AnonymousClass3UF.A02(C36441kJ.A0G(this.A03.BJB().A04).getApplicationContext(), R.drawable.vec_ic_more, R.color.f6nameremoved));
        this.A02.setVisible(false);
        A00(this);
    }

    public AnonymousClass5Or(C18820ts r1, C159757js r2) {
        super(r1);
        this.A03 = r2;
    }
}
