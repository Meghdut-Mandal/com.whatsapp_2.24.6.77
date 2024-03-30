package X;

import com.whatsapp.ShareCatalogLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Za  reason: invalid class name and case insensitive filesystem */
public class C90084Za implements AnonymousClass4P5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C90084Za(ShareCatalogLinkActivity shareCatalogLinkActivity, UserJid userJid, int i) {
        this.A02 = i;
        this.A00 = shareCatalogLinkActivity;
        this.A01 = userJid;
    }

    public final void BOX() {
        int i;
        int i2 = this.A02;
        ShareCatalogLinkActivity shareCatalogLinkActivity = (ShareCatalogLinkActivity) this.A00;
        UserJid userJid = (UserJid) this.A01;
        AnonymousClass9Y1 A3p = shareCatalogLinkActivity.A3p();
        C195209Sx r1 = new C195209Sx();
        switch (i2) {
            case 0:
                A00(shareCatalogLinkActivity, r1);
                C36401kF.A1F(r1, 22);
                i = 39;
                break;
            case 1:
                A00(shareCatalogLinkActivity, r1);
                C36401kF.A1F(r1, 19);
                i = 36;
                break;
            default:
                A00(shareCatalogLinkActivity, r1);
                C36401kF.A1F(r1, 24);
                i = 41;
                break;
        }
        C36411kG.A1G(r1, i);
        r1.A00 = userJid;
        A3p.A03(r1);
    }

    public static void A00(ShareCatalogLinkActivity shareCatalogLinkActivity, C195209Sx r2) {
        r2.A0A = shareCatalogLinkActivity.A3p().A02;
        r2.A05 = Integer.valueOf(shareCatalogLinkActivity.A3p().A0C.get());
        r2.A0D = shareCatalogLinkActivity.A3p().A00;
        r2.A0E = shareCatalogLinkActivity.A3p().A01;
        r2.A09 = Long.valueOf((long) shareCatalogLinkActivity.A3p().A0D.getAndIncrement());
    }
}
