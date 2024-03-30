package X;

import android.graphics.Bitmap;

/* renamed from: X.1BC  reason: invalid class name */
public final class AnonymousClass1BC {
    public final AnonymousClass16L A00;

    public AnonymousClass1BC(AnonymousClass16L r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(Bitmap bitmap, String str) {
        AnonymousClass00C.A0D(str, 0);
        if (!bitmap.isRecycled()) {
            AnonymousClass16L r2 = this.A00;
            AnonymousClass1SZ A04 = r2.A04();
            AnonymousClass00C.A08(A04);
            Bitmap bitmap2 = (Bitmap) A04.A09(str);
            if (bitmap2 != null) {
                if (bitmap2.isRecycled()) {
                    A04.A0C(str);
                } else {
                    return;
                }
            }
            r2.A04().A0D(str, bitmap);
        }
    }
}
