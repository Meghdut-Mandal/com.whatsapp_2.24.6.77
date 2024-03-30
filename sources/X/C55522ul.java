package X;

import android.os.Bundle;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;

/* renamed from: X.2ul  reason: invalid class name and case insensitive filesystem */
public abstract class C55522ul {
    public static final RemoveStickerFromFavoritesDialogFragment A00(C135066c4 r3) {
        AnonymousClass00C.A0D(r3, 0);
        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = new RemoveStickerFromFavoritesDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("sticker", r3);
        removeStickerFromFavoritesDialogFragment.A17(A07);
        return removeStickerFromFavoritesDialogFragment;
    }
}
