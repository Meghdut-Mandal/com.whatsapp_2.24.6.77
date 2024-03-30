package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3rR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C78023rR implements C158527he {
    public final /* synthetic */ WeakReference A00;

    public /* synthetic */ C78023rR(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public final void Bhj(boolean z) {
        C87334Oj r3 = (C87334Oj) this.A00.get();
        if (r3 != null) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r3;
            stickerStorePackPreviewActivity.A0R = false;
            if (z) {
                stickerStorePackPreviewActivity.A05.A06(R.string.f12nameremoved, 1);
                if (!stickerStorePackPreviewActivity.A0S) {
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
            }
            StickerStorePackPreviewActivity.A0G(stickerStorePackPreviewActivity);
        }
    }
}
