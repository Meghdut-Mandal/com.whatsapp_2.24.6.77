package X;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;

/* renamed from: X.3UI  reason: invalid class name */
public class AnonymousClass3UI implements AnonymousClass7fY {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3UI(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BSQ(C207109uZ r10) {
        int i;
        MenuItem A0D;
        String str;
        if (this.A02 != 0) {
            AnonymousClass2H0 r5 = (AnonymousClass2H0) this.A00;
            Jid jid = (Jid) this.A01;
            String A002 = r5.A03.A00(r10);
            switch (A002.hashCode()) {
                case -839883634:
                    str = "PERMANENT";
                    break;
                case 181990675:
                    if (A002.equals("UNBLOCKED")) {
                        r5.A05.A01(7);
                        C24801Dv r3 = r5.A01;
                        AnonymousClass01L r2 = r5.A05;
                        r3.A06(r2, AnonymousClass190.A0m(r2, jid, (Integer) null, 12));
                        return;
                    }
                    return;
                case 476614193:
                    str = "TEMPORARY";
                    break;
                default:
                    return;
            }
            if (A002.equals(str)) {
                r5.A06.A02(r5.A05, A002);
                return;
            }
            return;
        }
        AnonymousClass2H0 r6 = (AnonymousClass2H0) this.A00;
        Menu menu = (Menu) this.A01;
        if (r10 == null) {
            return;
        }
        if (!r10.A0c || !r6.A0D.A0E(957)) {
            C63553Km r1 = r6.A03;
            if (r1.A01(r10)) {
                if (menu.findItem(30) != null) {
                    menu.removeItem(30);
                }
                i = R.string.f12nameremoved;
                A0D = menu.add(0, 30, 1, R.string.f12nameremoved).setIcon(R.drawable.ic_action_view_shop);
                View A0R = C36441kJ.A0R(A0D, R.layout.f9nameremoved);
                A0R.setTag(R.id.tag_shop_url, r10.A0J);
                C36331k8.A0q(r6.A05, A0R, R.string.f12nameremoved);
            } else if (!r10.A0Y) {
                return;
            } else {
                if ((!r10.A0X || r1.A03(r10)) && !"PERMANENT".equals(r1.A00(r10))) {
                    if (menu.findItem(29) != null) {
                        menu.removeItem(29);
                    }
                    i = R.string.f12nameremoved;
                    A0D = r6.A0D(menu, 29, R.string.f12nameremoved, R.drawable.ic_action_view_catalog);
                    AnonymousClass01L r22 = r6.A05;
                    ImageView imageView = (ImageView) C36431kI.A0J(LayoutInflater.from(r22), R.layout.f9nameremoved);
                    C36391kE.A18(r22, imageView, R.drawable.ic_action_view_catalog);
                    C36331k8.A0q(r22, imageView, R.string.f12nameremoved);
                    A0D.setActionView(imageView);
                } else {
                    return;
                }
            }
            r6.A0I(A0D, i, true);
            A0D.setShowAsAction(2);
        }
    }
}
