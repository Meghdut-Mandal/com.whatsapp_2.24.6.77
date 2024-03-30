package X;

import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.3dI  reason: invalid class name and case insensitive filesystem */
public final class C69293dI implements C159217j0 {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ C69313dK A01;

    public void BXm(C21112A8x a8x, C200939iV r6) {
        C69313dK r2 = this.A01;
        r2.A00 = false;
        if (r6.A08 == null) {
            C29461Ws r0 = r2.A05;
            UserJid userJid = this.A00;
            r0.A0B(a8x, userJid, false);
            r2.A08.A00(userJid);
        }
    }

    public C69293dI(UserJid userJid, C69313dK r2) {
        this.A01 = r2;
        this.A00 = userJid;
    }

    public void BXl(C200939iV r7, int i) {
        C69313dK r2 = this.A01;
        r2.A00 = false;
        if (i == 404 || i == 406) {
            r2.A05.A0D(this.A00);
        }
        AnonymousClass2ZO r0 = r2.A08;
        UserJid userJid = this.A00;
        Iterator A0s = C36361kB.A0s(r0);
        while (A0s.hasNext()) {
            C69393dS r1 = (C69393dS) A0s.next();
            CatalogMediaCard catalogMediaCard = r1.A04;
            if (C1901797e.A00(catalogMediaCard.A06, userJid)) {
                C89034Uz r22 = r1.A03;
                UserJid userJid2 = catalogMediaCard.A06;
                AnonymousClass00C.A0D(userJid2, 0);
                if (!((C69313dK) r22).A05.A0I(userJid2)) {
                    int i2 = R.string.f12nameremoved;
                    if (i != -1) {
                        i2 = R.string.f12nameremoved;
                        if (i != 404) {
                            i2 = R.string.f12nameremoved;
                        }
                    }
                    catalogMediaCard.setError(i2);
                }
            }
        }
    }
}
