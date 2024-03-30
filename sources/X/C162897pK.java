package X;

import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;

/* renamed from: X.7pK  reason: invalid class name and case insensitive filesystem */
public class C162897pK extends C129156Fn {
    public Object A00;
    public final int A01;

    public C162897pK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0B(String str, String str2) {
        switch (this.A01) {
            case 1:
            case 2:
            case 3:
                ((C133356Xz) this.A00).A04();
                return;
            case 4:
                StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) this.A00;
                if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                    StickerStoreMyTabFragment.A00((StickerStoreMyTabFragment) stickerStoreTabFragment);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
