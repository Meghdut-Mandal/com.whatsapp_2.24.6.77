package X;

import android.graphics.Typeface;

/* renamed from: X.6hH  reason: invalid class name and case insensitive filesystem */
public final class C138086hH implements C158877iO {
    public Typeface B4T(AnonymousClass72W r4, int i) {
        if (i != 0 || !AnonymousClass00C.A0J(r4, AnonymousClass72W.A03)) {
            return Typeface.create(Typeface.DEFAULT, r4.A00, AnonymousClass000.A1O(i));
        }
        return Typeface.DEFAULT;
    }

    public Typeface B4k(AnonymousClass72W r4, C95074jk r5, int i) {
        if (i == 0 && AnonymousClass00C.A0J(r4, AnonymousClass72W.A03) && "sans-serif".length() == 0) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(Typeface.create("sans-serif", 0), r4.A00, AnonymousClass000.A1O(i));
    }
}
