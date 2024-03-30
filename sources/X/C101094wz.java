package X;

import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4wz  reason: invalid class name and case insensitive filesystem */
public abstract class C101094wz extends AnonymousClass18Q implements C88684Tq {
    public final C18820ts A00;

    public boolean BdM(Menu menu) {
        return false;
    }

    public void A01(C158047fi r7, C158057fj r8) {
        if (this instanceof AnonymousClass5Or) {
            AnonymousClass5Or r2 = (AnonymousClass5Or) this;
            r2.A00 = new C118065nH(r8.B7w());
            AnonymousClass5Or.A00(r2);
        } else if (this instanceof AnonymousClass5Oq) {
            AnonymousClass5Oq r1 = (AnonymousClass5Oq) this;
            r1.A01 = C122895vb.A00(r8).A02;
            r1.A00 = r7;
        } else if (this instanceof AnonymousClass5Op) {
            AnonymousClass5Op r5 = (AnonymousClass5Op) this;
            List<Object> A0c = r8.B7w().A0c(45);
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object r22 : A0c) {
                A0I.add(new C164927sb(r22, 7));
            }
            r5.A01 = A0I;
        }
    }

    public boolean Bbx(MenuItem menuItem) {
        if (this instanceof AnonymousClass5Or) {
            AnonymousClass5Or r3 = (AnonymousClass5Or) this;
            if (menuItem.getItemId() != 56) {
                return false;
            }
            C142326oh.A0B(r3.A03.BJB(), new C143326qM(new C164927sb(r3, 8), r3));
            return false;
        } else if (this instanceof AnonymousClass5Oq) {
            AnonymousClass5Oq r1 = (AnonymousClass5Oq) this;
            int itemId = menuItem.getItemId();
            Map map = r1.A03;
            Integer valueOf = Integer.valueOf(itemId);
            if (!map.containsKey(valueOf)) {
                return false;
            }
            C158047fi r0 = r1.A00;
            if (r0 != null) {
                AnonymousClass6JI.A01(((C158077fl) C90514aH.A0p(valueOf, map)).B7y(), ((C164207rR) r0).A00);
                return true;
            }
            C142326oh.A0B(r1.A02.BJB(), (C158077fl) C90514aH.A0p(valueOf, map));
            return true;
        } else if (!(this instanceof AnonymousClass5Op)) {
            return false;
        } else {
            AnonymousClass5Op r32 = (AnonymousClass5Op) this;
            if (r32.A01 != null && menuItem.getItemId() == 56) {
                C142326oh.A0B(r32.A02.BJB(), C164197rQ.A00(r32, 42));
            }
            return false;
        }
    }

    public C101094wz(C18820ts r1) {
        this.A00 = r1;
    }
}
