package X;

import com.whatsapp.jid.UserJid;

public final class A91 implements C159217j0 {
    public final /* synthetic */ C202279lS A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public void BXm(C21112A8x a8x, C200939iV r10) {
        C202279lS r7 = this.A00;
        r7.A02 = false;
        boolean z = this.A03;
        if (z) {
            C36341k9.A19(r7.A05, false);
        }
        String str = r10.A08;
        if (str == null || str.equals(this.A02)) {
            boolean z2 = true;
            boolean A1V = AnonymousClass000.A1V(str);
            C29461Ws r0 = r7.A0B;
            UserJid userJid = this.A01;
            r0.A0B(a8x, userJid, A1V);
            AnonymousClass2ZL r2 = r7.A0A;
            String str2 = this.A02;
            r2.A00(userJid, false, AnonymousClass000.A1W(str2));
            if (z) {
                C001700s r22 = r7.A03;
                if (str2 != null) {
                    z2 = false;
                }
                r22.A0C(new AnonymousClass8WB(userJid, "catalog_products_all_items_collection_id", false, z2));
            }
        }
    }

    public A91(C202279lS r1, UserJid userJid, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void BXl(C200939iV r6, int i) {
        C36321k7.A1S("onFetchPageCatalogFail error =", AnonymousClass000.A0u(), i);
        C202279lS r4 = this.A00;
        r4.A02 = false;
        boolean z = this.A03;
        if (z) {
            C36341k9.A19(r4.A05, false);
        }
        if (i == 404 || i == 406) {
            r4.A0B.A0D(this.A01);
        }
        AnonymousClass2ZL r1 = r4.A0A;
        UserJid userJid = this.A01;
        AnonymousClass00C.A0D(userJid, 0);
        Iterable<C88364Sk> observers = r1.getObservers();
        AnonymousClass00C.A08(observers);
        for (C88364Sk BXb : observers) {
            BXb.BXb(userJid, i);
        }
        if (z) {
            r4.A03.A0C(new AnonymousClass8WA(userJid, i, "catalog_products_all_items_collection_id"));
        }
    }
}
