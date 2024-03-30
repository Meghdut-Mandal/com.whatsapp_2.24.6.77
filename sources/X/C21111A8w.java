package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.A8w  reason: case insensitive filesystem */
public class C21111A8w implements C88364Sk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C79593ty A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ AnonymousClass9XI A05;

    public C21111A8w(Context context, C79593ty r2, AnonymousClass9XI r3, UserJid userJid, int i, int i2) {
        this.A05 = r3;
        this.A04 = userJid;
        this.A02 = context;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
    }

    public void BXb(UserJid userJid, int i) {
        if (C1901797e.A00(this.A04, userJid)) {
            AnonymousClass9XI r3 = this.A05;
            r3.A01.A0H(new C1497072l(this, 39));
            this.A03.accept(false);
            r3.A06.A05("catalog_collections_view_tag", false);
        }
    }

    public void BXc(UserJid userJid, boolean z, boolean z2) {
        UserJid userJid2 = this.A04;
        if (C1901797e.A00(userJid2, userJid)) {
            AnonymousClass9XI r4 = this.A05;
            r4.A01.A0H(new C1497072l(this, 40));
            r4.A02.A0M(userJid2);
            Context context = this.A02;
            Intent A0m = AnonymousClass190.A0m(context, userJid2, Integer.valueOf(this.A01), this.A00);
            A0m.putExtra("is_prefetched_catalog", true);
            r4.A00.A06(context, A0m);
            this.A03.accept(true);
        }
    }
}
