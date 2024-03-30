package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.5b6  reason: invalid class name and case insensitive filesystem */
public abstract class C110705b6 {
    public static final StickerExpressionsFragment A00(AnonymousClass3XM r4, String str, int i, boolean z, boolean z2) {
        StickerExpressionsFragment stickerExpressionsFragment = new StickerExpressionsFragment();
        boolean A1U = C36381kD.A1U(i, 7);
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("rawChatJid", str);
        A07.putBoolean("isExpressionsSearch", z);
        A07.putBoolean("shouldAnimateStickers", A1U);
        A07.putBoolean("isCollapsed", z2);
        A07.putInt("arg_search_opener", i);
        if (r4 != null) {
            A07.putParcelable("funStickerData", r4);
        }
        stickerExpressionsFragment.A17(A07);
        return stickerExpressionsFragment;
    }
}
