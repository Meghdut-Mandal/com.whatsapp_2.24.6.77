package X;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.0fg  reason: invalid class name and case insensitive filesystem */
public class C11070fg implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout A00;

    public C11070fg(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.A00 = actionBarOverlayLayout;
    }

    public void run() {
        ActionBarOverlayLayout actionBarOverlayLayout = this.A00;
        actionBarOverlayLayout.A02();
        actionBarOverlayLayout.A00 = actionBarOverlayLayout.A02.animate().translationY((float) (-actionBarOverlayLayout.A02.getHeight())).setListener(actionBarOverlayLayout.A0K);
    }
}
