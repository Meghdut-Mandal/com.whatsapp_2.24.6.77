package X;

import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import java.util.Set;

/* renamed from: X.4YK  reason: invalid class name */
public class AnonymousClass4YK implements C158497hb {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4YK(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BVC(String str) {
        if (this.A02 != 0) {
            ((StickerInfoViewModel) this.A01).A03.A0Q((Set) this.A00);
            return;
        }
        ((StarOrRemoveFromRecentsStickerDialogFragment) this.A00).A00.A0Q((Set) this.A01);
    }
}
