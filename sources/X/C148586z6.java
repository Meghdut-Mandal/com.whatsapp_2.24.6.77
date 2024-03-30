package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6z6  reason: invalid class name and case insensitive filesystem */
public class C148586z6 implements C159687jl {
    public final /* synthetic */ AnonymousClass5KZ A00;
    public final /* synthetic */ List A01;

    public C148586z6(AnonymousClass5KZ r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void Bhg(AnonymousClass68B r5) {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        ArrayList A0I = AnonymousClass001.A0I();
        stickerStoreFeaturedTabFragment.A0I = A0I;
        A0I.add(r5);
        A0I.addAll(1, this.A01);
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
    }

    public void Bhi() {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        stickerStoreFeaturedTabFragment.A0I = this.A01;
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
        Log.e("StickerStoreFeaturedTabFragment/updatePackList: The avatar config is true but the avatar sticker pack is not available!");
    }
}
