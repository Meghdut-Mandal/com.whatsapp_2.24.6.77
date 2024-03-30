package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.071  reason: invalid class name */
public abstract class AnonymousClass071 {
    public abstract void A01(int i);

    public abstract void A02(Typeface typeface);

    public final void A00(int i) {
        new Handler(Looper.getMainLooper()).post(new AnonymousClass073(this, i));
    }
}
