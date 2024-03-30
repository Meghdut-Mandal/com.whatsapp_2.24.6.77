package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7ps  reason: invalid class name and case insensitive filesystem */
public class C163237ps implements C159207iz {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163237ps(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BXd(C128516Co r3, int i) {
        if (this.A02 != 0) {
            ((C159207iz) this.A00).BXd(r3, i);
            return;
        }
        if (406 == i) {
            ((C167507yA) this.A01).A0N.A03(r3.A02);
        }
        ((C167507yA) this.A01).A0B.A0C(AnonymousClass001.A0I());
    }

    public void BXe(C128516Co r5, A90 a90) {
        if (this.A02 != 0) {
            ((AnonymousClass67M) this.A01).A03.A02(a90, r5.A02, r5.A04.isEmpty());
            ((C159207iz) this.A00).BXe(r5, a90);
            return;
        }
        C167507yA r3 = (C167507yA) this.A01;
        C131496Pg r2 = r3.A0N;
        UserJid userJid = (UserJid) this.A00;
        r2.A02(a90, userJid, true);
        r3.A0B.A0C(r2.A01(userJid, "catalog_category_dummy_root_id"));
    }
}
