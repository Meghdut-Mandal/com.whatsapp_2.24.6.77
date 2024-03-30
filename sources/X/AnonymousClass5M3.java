package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.5M3  reason: invalid class name */
public final class AnonymousClass5M3 extends C132446Tt {
    public final AnonymousClass1AP A00;
    public final C117905n1 A01;

    public AnonymousClass5M3(AnonymousClass1AP r2, C117905n1 r3) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C127916Ad r15 = (C127916Ad) obj;
        AnonymousClass00C.A0D(r15, 0);
        AnonymousClass6CW r9 = r15.A01;
        C127906Ac r3 = r15.A00;
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A01.A00;
        stickerStorePackPreviewActivity.A0V = false;
        if (stickerStorePackPreviewActivity.A0L == null) {
            C20810yC r5 = stickerStorePackPreviewActivity.A0D;
            AnonymousClass1HA r7 = stickerStorePackPreviewActivity.A0E;
            int dimensionPixelSize = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            boolean z = stickerStorePackPreviewActivity.A0U;
            C96144mr r4 = new C96144mr(r5, stickerStorePackPreviewActivity.A0D, r7, stickerStorePackPreviewActivity.A0I, r9, dimensionPixelSize, dimensionPixelSize2, true, z);
            stickerStorePackPreviewActivity.A0L = r4;
            r4.A05 = stickerStorePackPreviewActivity.A0g;
            stickerStorePackPreviewActivity.A04.setAdapter(r4);
        }
        C96144mr r1 = stickerStorePackPreviewActivity.A0L;
        r1.A04 = r3.A00;
        r1.A06 = r3.A01;
        r1.A06();
        StickerStorePackPreviewActivity.A0G(stickerStorePackPreviewActivity);
    }
}
