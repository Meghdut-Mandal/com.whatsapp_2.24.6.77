package X;

import android.content.ContentValues;

/* renamed from: X.2TF  reason: invalid class name */
public final class AnonymousClass2TF extends C78353ry {
    public final AnonymousClass005 A00;

    public void B7J(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        super.B7J(r4);
        C25081Ex.A01((C25081Ex) this.A00.get(), (C46842bl) r4, "SELECT message_row_id, business_owner_jid, title, description FROM message_product WHERE message_row_id=?", "GET_CATALOG_MESSAGE_SQL");
    }

    public void BKi(AnonymousClass3T1 r10) {
        AnonymousClass00C.A0D(r10, 0);
        C78353ry.A00(this, r10);
        C25081Ex r4 = (C25081Ex) this.A00.get();
        C46842bl r102 = (C46842bl) r10;
        boolean z = false;
        boolean A1R = AnonymousClass000.A1R((r102.A1N > 0 ? 1 : (r102.A1N == 0 ? 0 : -1)));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogMessageStore/insertCatalogMessage/message must have row_id set; key=");
        C64933Qa r3 = r102.A1J;
        C18740tg.A0E(A1R, AnonymousClass000.A0o(r3, A0u));
        C18740tg.A0E(AnonymousClass000.A1S(r102.A0H(), 1), AnonymousClass000.A0l(r3, "CatalogMessageStore/insertCatalogMessage/message in main storage; key=", AnonymousClass000.A0u()));
        AnonymousClass1M0 A05 = r4.A00.A05();
        try {
            ContentValues A0E = C36441kJ.A0E();
            C25081Ex.A00(A0E, r4, r102, r102.A1N);
            if (A05.A02.A05("message_product", "INSERT_MESSAGE_CATALOG_SQL", A0E) == r102.A1N) {
                z = true;
            }
            C18740tg.A0F(z, "CatalogMessageStore/insertCatalogMessage/inserted row should have same row_id");
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78353ry.A00(this, r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2TF(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        super(r1, r2, r3);
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
