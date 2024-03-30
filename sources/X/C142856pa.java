package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.6pa  reason: invalid class name and case insensitive filesystem */
public final class C142856pa implements C160397kw {
    public final C27751Pr A00;

    public /* bridge */ /* synthetic */ void Ba5(Bitmap bitmap, C160797lb r6, boolean z) {
        C142886pd r62 = (C142886pd) r6;
        C36321k7.A0w(r62, bitmap);
        ImageView BCZ = r62.BCZ();
        if (BCZ != null) {
            BCZ.setImageDrawable(this.A00.A01(BCZ.getResources(), bitmap, C141716ni.A00));
        }
        C160197kc r0 = r62.A02;
        if (r0 != null) {
            r0.Bj5(bitmap);
        }
    }

    public C142856pa(C27751Pr r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void BRN(C160797lb r1) {
    }

    public /* bridge */ /* synthetic */ void BZu(C160797lb r1) {
    }

    public /* bridge */ /* synthetic */ void Ba1(C160797lb r1) {
    }
}
