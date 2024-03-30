package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.1s9  reason: invalid class name and case insensitive filesystem */
public final class C39361s9 extends AnonymousClass07T {
    public StickerSearchTabFragment A00;

    public C39361s9(AnonymousClass01z r2) {
        super(r2, 1);
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        C36321k7.A0v(viewGroup, 0, obj);
        super.A0E(viewGroup, obj, i);
        if (this.A00 != obj) {
            this.A00 = (StickerSearchTabFragment) obj;
        }
    }

    public int A0H() {
        return 7;
    }

    public /* bridge */ /* synthetic */ AnonymousClass02E A0M(int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("sticker_category_tab", i);
        StickerSearchTabFragment stickerSearchTabFragment = new StickerSearchTabFragment();
        stickerSearchTabFragment.A17(A07);
        return stickerSearchTabFragment;
    }
}
