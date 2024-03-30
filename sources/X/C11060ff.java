package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0ff  reason: invalid class name and case insensitive filesystem */
public class C11060ff implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C11060ff(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A02();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A0K);
    }
}
