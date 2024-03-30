package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* renamed from: X.6G8  reason: invalid class name */
public abstract class AnonymousClass6G8 {
    public static final void A00(View view) {
        view.clearViewTranslationCallback();
    }

    public static final void A01(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }
}
