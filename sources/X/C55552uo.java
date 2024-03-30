package X;

import android.os.Bundle;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;

/* renamed from: X.2uo  reason: invalid class name and case insensitive filesystem */
public abstract class C55552uo {
    public static final StickerInfoBottomSheet A00(C135066c4 r3, C52482pV r4, String str, boolean z, boolean z2) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("arg_from_me", z);
        A07.putParcelable("arg_sticker", r3);
        A07.putString("arc_raw_chat_jid", str);
        A07.putInt("arg_launcher_origin", r4.value);
        A07.putBoolean("arg_search_flow", z2);
        StickerInfoBottomSheet stickerInfoBottomSheet = new StickerInfoBottomSheet();
        stickerInfoBottomSheet.A17(A07);
        return stickerInfoBottomSheet;
    }
}
