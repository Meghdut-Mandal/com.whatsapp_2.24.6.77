package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.07O  reason: invalid class name */
public class AnonymousClass07O extends C010204h {
    public final /* synthetic */ AnonymousClass07E A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass07O(Window.Callback callback, AnonymousClass07E r2) {
        super(callback);
        this.A00 = r2;
    }

    public View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(((AnonymousClass07J) this.A00.A00).A09.getContext());
        }
        return super.onCreatePanelView(i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            AnonymousClass07E r2 = this.A00;
            if (!r2.A01) {
                ((AnonymousClass07J) r2.A00).A0C = true;
                r2.A01 = true;
            }
        }
        return onPreparePanel;
    }
}
