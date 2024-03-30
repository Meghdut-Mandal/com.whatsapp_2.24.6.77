package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5zv  reason: invalid class name and case insensitive filesystem */
public abstract class C125445zv {
    public void A00(List list) {
        Object obj;
        List list2 = list;
        if (this instanceof AnonymousClass5KZ) {
            AnonymousClass5KZ r2 = (AnonymousClass5KZ) this;
            Collections.sort(list2, new AnonymousClass75V());
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = r2.A00;
            stickerStoreFeaturedTabFragment.A07 = false;
            if (!stickerStoreFeaturedTabFragment.A1c() || !stickerStoreFeaturedTabFragment.A0A.A01()) {
                stickerStoreFeaturedTabFragment.A0I = list2;
                StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
            } else {
                stickerStoreFeaturedTabFragment.A0E.A0C(new C148586z6(r2, list2), "meta-avatar", false);
            }
            stickerStoreFeaturedTabFragment.A1a();
            return;
        }
        C106525Ka r22 = (C106525Ka) this;
        AnonymousClass00C.A0D(list2, 0);
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AnonymousClass00C.A0J(((AnonymousClass68B) obj).A0F, "whatsappcuppy")) {
                break;
            }
        }
        AnonymousClass68B r13 = (AnonymousClass68B) obj;
        if (r13 != null) {
            AnonymousClass633 r1 = r22.A00;
            AnonymousClass1GO r3 = r1.A00;
            C25471Gl r4 = C25471Gl.A0d;
            AnonymousClass00C.A09(r4);
            if (!r3.A02(r4, 0, r13.A02, true, false, false, false, false)) {
                Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            } else {
                r1.A01.A03(r13, new C148556z3(r22.A01), (Integer) null, (Integer) null, 4, false);
            }
        }
    }
}
