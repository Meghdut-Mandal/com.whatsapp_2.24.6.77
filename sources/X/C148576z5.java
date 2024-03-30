package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.6z5  reason: invalid class name and case insensitive filesystem */
public class C148576z5 implements C159687jl {
    public final /* synthetic */ StickerStorePackPreviewActivity A00;

    public C148576z5(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        this.A00 = stickerStorePackPreviewActivity;
    }

    public void Bhg(AnonymousClass68B r2) {
        StickerStorePackPreviewActivity.A07(r2, this.A00);
    }

    public void Bhi() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        if (StickerStorePackPreviewActivity.A0I(stickerStorePackPreviewActivity) && !stickerStorePackPreviewActivity.A09.A01()) {
            if (!stickerStorePackPreviewActivity.A0Q) {
                StickerStorePackPreviewActivity.A0F(stickerStorePackPreviewActivity);
            }
            stickerStorePackPreviewActivity.A0Q = true;
        } else if (stickerStorePackPreviewActivity.A0S && !stickerStorePackPreviewActivity.isFinishing() && !stickerStorePackPreviewActivity.isDestroyed()) {
            C39001qm A002 = AnonymousClass3LW.A00(stickerStorePackPreviewActivity);
            A002.A0L(R.string.f12nameremoved);
            A002.A0K(R.string.f12nameremoved);
            A002.setPositiveButton(R.string.f12nameremoved, new C163297py(this, 42));
            A002.A0V(new C163977r4(this, 9));
            AnonymousClass0FM create = A002.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        }
    }
}
