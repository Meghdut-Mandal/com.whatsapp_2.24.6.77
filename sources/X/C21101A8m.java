package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.A8m  reason: case insensitive filesystem */
public final class C21101A8m implements C23021B0r {
    public final /* synthetic */ C198219d6 A00;

    public void BVm(UserJid userJid) {
    }

    public C21101A8m(C198219d6 r1) {
        this.A00 = r1;
    }

    public void BVl(UserJid userJid) {
        Log.e("CatalogSearchCatalogPageRequestFactory/reloadDCBusinessInfo/");
        this.A00.A02.A0E("product-search-enc-dc-refetch-failed", "", false);
    }
}
