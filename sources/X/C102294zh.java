package X;

import com.whatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4zh  reason: invalid class name and case insensitive filesystem */
public class C102294zh extends AnonymousClass80I {
    public final CatalogHeader A00;

    public C102294zh(C24801Dv r3, C19730wQ r4, CatalogHeader catalogHeader, UserJid userJid) {
        super(catalogHeader);
        this.A00 = catalogHeader;
        catalogHeader.setUp(userJid);
        if (!r4.A0M(userJid)) {
            catalogHeader.setOnTextClickListener(new C48932iI(r3, this, userJid, 3));
        }
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r1) {
    }
}
