package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3dT  reason: invalid class name and case insensitive filesystem */
public class C69403dT implements C88914Un, C88364Sk {
    public Context A00;
    public CatalogMediaCard A01;
    public C207109uZ A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C24801Dv A07;
    public final AnonymousClass17Y A08;
    public final C19730wQ A09;
    public final C63553Km A0A;
    public final AnonymousClass1KK A0B;
    public final AnonymousClass9XI A0C;
    public final C29461Ws A0D;
    public final C199439fJ A0E;
    public final AnonymousClass9R0 A0F;
    public final C19460v5 A0G;
    public final AnonymousClass2ZL A0H;
    public final C202279lS A0I;
    public final C603337l A0J;
    public final C19770wU A0K;

    public void B0f() {
        if (!this.A06) {
            this.A01.A08.A07((View.OnClickListener) null, 3);
            this.A06 = true;
        }
    }

    public void B7E(UserJid userJid, int i) {
        this.A0I.A08(userJid, i);
    }

    public int BGI(UserJid userJid) {
        return this.A0D.A02(userJid);
    }

    public AnonymousClass4SC BII(C207269up r2, UserJid userJid, boolean z) {
        return new C79133tE(r2, this, userJid, z);
    }

    public boolean BJp(UserJid userJid) {
        return this.A0D.A0G(userJid);
    }

    public void BKb(UserJid userJid) {
        if (this.A03 != null) {
            this.A01.A08.setTitle(this.A00.getString(R.string.f12nameremoved));
            this.A01.A08.setTitleTextColor(AnonymousClass00F.A00(this.A00, R.color.f6nameremoved));
            int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            this.A01.A08.A05(dimensionPixelSize, dimensionPixelSize);
        }
        this.A01.A08.setSeeMoreClickListener(new C79113tC(this, userJid));
        this.A01.A08.setCatalogBrandingDrawable((Drawable) null);
    }

    public void BXb(UserJid userJid, int i) {
        CatalogMediaCard catalogMediaCard;
        int i2;
        if (C1901797e.A00(this.A01.A06, userJid) && !this.A0D.A0I(this.A01.A06)) {
            C36321k7.A1U("CatalogMediaCard/requestCatalogProductsFromBeginning/FetchFailed/Error: ", AnonymousClass000.A0u(), i);
            if (i == 406) {
                catalogMediaCard = this.A01;
                i2 = R.string.f12nameremoved;
            } else {
                catalogMediaCard = this.A01;
                if (i == 404) {
                    i2 = R.string.f12nameremoved;
                } else {
                    i2 = R.string.f12nameremoved;
                    if (i == -1) {
                        i2 = R.string.f12nameremoved;
                    }
                }
            }
            catalogMediaCard.setError(i2);
        }
    }

    public void BXc(UserJid userJid, boolean z, boolean z2) {
        if (C1901797e.A00(this.A01.A06, userJid)) {
            BXq(userJid);
        }
    }

    public void BXq(UserJid userJid) {
        C29461Ws r5 = this.A0D;
        int A022 = r5.A02(userJid);
        CatalogMediaCard catalogMediaCard = this.A01;
        if (A022 != catalogMediaCard.A00) {
            catalogMediaCard.A00 = A022;
            boolean A0I2 = r5.A0I(userJid);
            C207109uZ r1 = this.A02;
            if (!A0I2) {
                if (r1 != null && r1.A0Y) {
                    C199179ep r0 = new C199179ep(r1);
                    r0.A0V = false;
                    this.A02 = r0.A01();
                    C36391kE.A1R(this.A0K, this, userJid, 36);
                }
                Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
                this.A01.A08.setError(this.A00.getString(R.string.f12nameremoved));
                Activity A002 = C24801Dv.A00(this.A00);
                if (A002 instanceof C87044Ng) {
                    AnonymousClass8WH r12 = (AnonymousClass8WH) ((C87044Ng) A002);
                    r12.A0h.A01 = true;
                    C36341k9.A0y(r12.A0a);
                }
            } else {
                if (r1 != null && !r1.A0Y) {
                    C199179ep r02 = new C199179ep(r1);
                    r02.A0V = true;
                    this.A02 = r02.A01();
                    C36391kE.A1R(this.A0K, this, userJid, 37);
                }
                ArrayList A003 = this.A01.A00(userJid, this.A00.getString(R.string.f12nameremoved), r5.A09(userJid), this.A04);
                if (A003.isEmpty()) {
                    Activity A004 = C24801Dv.A00(this.A00);
                    if (A004 instanceof C87044Ng) {
                        AnonymousClass8WH r13 = (AnonymousClass8WH) ((C87044Ng) A004);
                        r13.A0h.A01 = true;
                        C36341k9.A0y(r13.A0a);
                    }
                }
                this.A01.A03(A003);
            }
            C207109uZ r03 = this.A02;
            if (r03 == null || r03.A0Y || r5.A0I(userJid)) {
                this.A01.setVisibility(0);
            } else {
                this.A01.setVisibility(8);
            }
            if (!this.A05) {
                this.A05 = true;
            }
        }
    }

    public boolean BtF() {
        C207109uZ r0 = this.A02;
        if (r0 == null || !r0.A0Y) {
            return true;
        }
        return false;
    }

    public void cleanup() {
        this.A0H.unregisterObserver(this);
    }

    public C69403dT(C19460v5 r1, C24801Dv r2, AnonymousClass17Y r3, C19730wQ r4, C63553Km r5, AnonymousClass1KK r6, AnonymousClass9XI r7, AnonymousClass2ZL r8, C29461Ws r9, C202279lS r10, C603337l r11, C199439fJ r12, AnonymousClass9R0 r13, C19770wU r14) {
        this.A08 = r3;
        this.A09 = r4;
        this.A0G = r1;
        this.A07 = r2;
        this.A0J = r11;
        this.A0K = r14;
        this.A0B = r6;
        this.A0I = r10;
        this.A0D = r9;
        this.A0H = r8;
        this.A0F = r13;
        this.A0A = r5;
        this.A0E = r12;
        this.A0C = r7;
        r8.registerObserver(this);
    }
}
