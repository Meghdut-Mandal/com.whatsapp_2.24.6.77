package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.A8v  reason: case insensitive filesystem */
public class C21110A8v implements C88364Sk {
    public final /* synthetic */ AnonymousClass8W7 A00;

    public C21110A8v(AnonymousClass8W7 r1) {
        this.A00 = r1;
    }

    public void BXb(UserJid userJid, int i) {
        AnonymousClass8W7 r2 = this.A00;
        if (C1901797e.A00(userJid, r2.A0L)) {
            C167507yA r1 = r2.A0I;
            r1.A02 = true;
            r1.A01 = Integer.valueOf(i);
            if (!r2.A0E.A01) {
                r2.A0H.A0S(i);
                r2.A0M.A05("catalog_collections_view_tag", false);
            }
        }
    }

    public void BXc(UserJid userJid, boolean z, boolean z2) {
        AnonymousClass8W7 r2 = this.A00;
        if (C1901797e.A00(userJid, r2.A0L)) {
            if (!z && z2) {
                r2.A0I.A02 = true;
            }
            r2.A0I.A01 = null;
            if (!r2.A0E.A01) {
                r2.A03.A0C(new BAK(userJid, this, 3), userJid);
            }
        }
    }
}
