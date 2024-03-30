package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;

/* renamed from: X.633  reason: invalid class name */
public final class AnonymousClass633 {
    public final AnonymousClass1GO A00;
    public final StickerPackDownloader A01;
    public final C606038m A02;

    public final void A00(Runnable runnable) {
        AnonymousClass1GO r0 = this.A00;
        C25471Gl r1 = C25471Gl.A0d;
        AnonymousClass00C.A09(r1);
        if (!r0.A02(r1, 0, 1048576, true, false, false, false, false)) {
            Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            return;
        }
        C606038m r4 = this.A02;
        r4.A03.Boy(new C81203wd(r4, new C106525Ka(this, runnable), 14));
    }

    public AnonymousClass633(AnonymousClass1GO r1, C606038m r2, StickerPackDownloader stickerPackDownloader) {
        C36321k7.A0x(r1, stickerPackDownloader);
        this.A00 = r1;
        this.A01 = stickerPackDownloader;
        this.A02 = r2;
    }
}
