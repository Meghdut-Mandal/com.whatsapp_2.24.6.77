package X;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5XE  reason: invalid class name */
public abstract class AnonymousClass5XE {
    public static final void A00(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
