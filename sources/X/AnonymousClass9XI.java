package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9XI  reason: invalid class name */
public class AnonymousClass9XI {
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C63553Km A03;
    public final AnonymousClass1KK A04;
    public final AnonymousClass2ZL A05;
    public final AnonymousClass3L6 A06;
    public final C202279lS A07;

    public C79593ty A00(Context context, UserJid userJid, int i, int i2) {
        this.A06.A00(774781666, "catalog_collections_view_tag", "CatalogModuleHelper");
        C79593ty r3 = new C79593ty();
        this.A05.registerObserver(new C21111A8w(context, r3, this, userJid, i, i2));
        this.A07.A08(userJid, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        return r3;
    }

    public C79593ty A01(UserJid userJid) {
        C79593ty r3 = new C79593ty();
        this.A04.A0C(new BAH(r3, this, userJid, 0), userJid);
        return r3;
    }

    public C79593ty A02(UserJid userJid) {
        C79593ty r3 = new C79593ty();
        this.A04.A0C(new BAH(r3, this, userJid, 1), userJid);
        return r3;
    }

    public AnonymousClass9XI(C24801Dv r1, AnonymousClass17Y r2, C19730wQ r3, C63553Km r4, AnonymousClass1KK r5, AnonymousClass2ZL r6, C202279lS r7, AnonymousClass3L6 r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r8;
        this.A07 = r7;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
