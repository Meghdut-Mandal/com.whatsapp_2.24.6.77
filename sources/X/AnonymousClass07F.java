package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.07F  reason: invalid class name */
public class AnonymousClass07F implements Runnable {
    public final /* synthetic */ AnonymousClass07E A00;

    public AnonymousClass07F(AnonymousClass07E r1) {
        this.A00 = r1;
    }

    public void run() {
        C016307a r3;
        AnonymousClass07E r1 = this.A00;
        Menu A002 = AnonymousClass07E.A00(r1);
        if (A002 instanceof C016307a) {
            r3 = (C016307a) A002;
            if (r3 != null) {
                r3.A07();
            }
        } else {
            r3 = null;
        }
        try {
            A002.clear();
            Window.Callback callback = r1.A02;
            if (!callback.onCreatePanelMenu(0, A002) || !callback.onPreparePanel(0, (View) null, A002)) {
                A002.clear();
            }
        } finally {
            if (r3 != null) {
                r3.A06();
            }
        }
    }
}
