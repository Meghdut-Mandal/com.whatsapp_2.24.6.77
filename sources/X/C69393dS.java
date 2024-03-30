package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3dS  reason: invalid class name and case insensitive filesystem */
public class C69393dS implements C88914Un {
    public C207109uZ A00;
    public boolean A01;
    public final C32691e2 A02;
    public final C89034Uz A03;
    public final CatalogMediaCard A04;
    public final C21010yW A05;
    public final AnonymousClass62F A06;
    public final C63553Km A07;
    public final AnonymousClass2ZO A08;
    public final C603337l A09;

    public AnonymousClass4SC BII(C207269up r3, UserJid userJid, boolean z) {
        return new AnonymousClass4XJ(r3, this, 0);
    }

    public void B0f() {
        if (!this.A01) {
            this.A04.A08.A07((View.OnClickListener) null, 6);
            this.A01 = true;
        }
    }

    public void B7E(UserJid userJid, int i) {
        C69313dK r2 = (C69313dK) this.A03;
        AnonymousClass00C.A0D(userJid, 0);
        if (r2.A05.A0I(userJid)) {
            r2.A08.A00(userJid);
        } else if (!r2.A00) {
            r2.A00 = true;
            r2.A04.A0C(new C69233dC(userJid, r2, i), userJid);
        }
    }

    public int BGI(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        return ((C69313dK) this.A03).A05.A02(userJid);
    }

    public boolean BJp(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        return ((C69313dK) this.A03).A05.A0G(userJid);
    }

    public void BKb(UserJid userJid) {
        CatalogMediaCard catalogMediaCard = this.A04;
        C47942gR r3 = catalogMediaCard.A08;
        r3.setSeeMoreClickListener(new C89804Xy(this, 0));
        r3.setCatalogBrandingDrawable(AnonymousClass0BT.A00((Resources.Theme) null, catalogMediaCard.getResources(), R.drawable.ic_shops_logo));
    }

    public void BXq(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        List A092 = ((C69313dK) this.A03).A05.A09(userJid);
        if (A092 != null && !A092.isEmpty()) {
            this.A04.setupThumbnails(userJid, R.string.f12nameremoved, A092);
        }
    }

    public boolean BtF() {
        return !this.A07.A02(this.A00);
    }

    public void cleanup() {
        this.A08.unregisterObserver(this);
    }

    public C69393dS(C32691e2 r1, C63553Km r2, C89034Uz r3, CatalogMediaCard catalogMediaCard, C603337l r5, C21010yW r6, AnonymousClass2ZO r7, AnonymousClass62F r8) {
        this.A05 = r6;
        this.A02 = r1;
        this.A03 = r3;
        this.A08 = r7;
        this.A09 = r5;
        this.A04 = catalogMediaCard;
        this.A06 = r8;
        this.A07 = r2;
        r7.registerObserver(this);
    }
}
