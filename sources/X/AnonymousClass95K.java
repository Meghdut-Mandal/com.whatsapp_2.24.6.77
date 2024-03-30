package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.95K  reason: invalid class name */
public class AnonymousClass95K implements C88374Sl {
    public Object A00;
    public final int A01;

    public AnonymousClass95K(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BZe(C207269up r5, long j) {
        View A0d;
        C18820ts r2;
        int i = this.A01;
        Object obj = this.A00;
        if (2 - i != 0) {
            C225314u r0 = (C225314u) obj;
            A0d = r0.A00;
            r2 = r0.A00;
        } else {
            BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) obj;
            A0d = businessProductListBaseFragment.A0d();
            r2 = businessProductListBaseFragment.A0C;
            if (r2 == null) {
                throw C36321k7.A09();
            }
        }
        Object[] A0L = AnonymousClass001.A0L();
        C90474aD.A1S(A0L, j);
        C99304t3.A01(A0d, r2.A0L(A0L, R.plurals.f10nameremoved, j), -1).A0P();
    }

    public void Bdz(C207269up r11, String str, String str2, String str3, int i, long j) {
        C195419Uf r2;
        UserJid userJid;
        C207269up r3 = r11;
        switch (this.A01) {
            case 0:
                C167507yA r1 = ((AnonymousClass8W7) this.A00).A0I;
                AnonymousClass00C.A0D(r11, 1);
                r2 = r1.A0E;
                userJid = r1.A0O;
                break;
            case 1:
                C167487y7 r12 = ((ProductListActivity) this.A00).A0G;
                AnonymousClass00C.A0D(r11, 1);
                r2 = r12.A04;
                userJid = r12.A09;
                break;
            default:
                AnonymousClass00C.A0D(r11, 1);
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                userJid = businessProductListBaseFragment.A1a();
                r2 = ((C167537yE) businessProductListBaseFragment.A0K.getValue()).A02;
                break;
        }
        r2.A01(r3, userJid, str, str2, str3, j);
    }
}
