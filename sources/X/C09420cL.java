package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.0cL  reason: invalid class name and case insensitive filesystem */
public class C09420cL implements C16990qX, DialogInterface.OnDismissListener, DialogInterface.OnClickListener, DialogInterface.OnKeyListener {
    public AnonymousClass0FM A00;
    public C09440cN A01;
    public C016307a A02;

    public void BTt(C016307a r2, boolean z) {
        AnonymousClass0FM r0;
        if ((z || r2 == this.A02) && (r0 = this.A00) != null) {
            r0.dismiss();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C016307a r3 = this.A02;
        C09440cN r1 = this.A01;
        C03330Ed r0 = r1.A04;
        if (r0 == null) {
            r0 = new C03330Ed(r1);
            r1.A04 = r0;
        }
        r3.A0K((C018707z) r0.getItem(i), (AnonymousClass07X) null, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A01.BTt(this.A02, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0F(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }

    public C09420cL(C016307a r1) {
        this.A02 = r1;
    }

    public boolean Bbv(C016307a r2) {
        return false;
    }
}
