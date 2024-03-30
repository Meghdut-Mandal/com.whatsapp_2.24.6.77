package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.3Yy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67213Yy implements View.OnKeyListener {
    public final /* synthetic */ C60963Aa A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C67213Yy(C60963Aa r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C60963Aa r2 = this.A00;
        if (!this.A01 || keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 66 || !keyEvent.isCtrlPressed()) {
            return false;
        }
        C36371kC.A1H(r2.A05);
        return true;
    }
}
