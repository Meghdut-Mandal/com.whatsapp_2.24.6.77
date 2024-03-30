package X;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6dV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135936dV implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView A00;

    public /* synthetic */ C135936dV(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        this.A00.A0T.A00.setValue(new AnonymousClass68L(C36391kE.A00(z ? 1 : 0)));
    }
}
