package X;

import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.List;

/* renamed from: X.5Mk  reason: invalid class name and case insensitive filesystem */
public class C107065Mk extends C132446Tt {
    public final C24041Av A00;
    public final AnonymousClass7d5 A01;
    public final AnonymousClass1AP A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        boolean A1X = AnonymousClass000.A1X(pair.first);
        Number number = (Number) pair.second;
        AnonymousClass7d5 r4 = this.A01;
        if (r4 != null && number != null) {
            int intValue = number.intValue();
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r4;
            if (A1X) {
                stickerStorePackPreviewActivity.A0L.A0M(intValue, false);
                List A002 = C96144mr.A00(stickerStorePackPreviewActivity.A0L);
                if (intValue >= 0 && intValue < A002.size()) {
                    ((AnonymousClass6CV) A002.get(intValue)).A02 = true;
                    return;
                }
                return;
            }
            stickerStorePackPreviewActivity.A05.A06(R.string.f12nameremoved, 1);
            stickerStorePackPreviewActivity.A0L.A0M(intValue, false);
        }
    }

    public C107065Mk(C24041Av r1, AnonymousClass7d5 r2, AnonymousClass1AP r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
