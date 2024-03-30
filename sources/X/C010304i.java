package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: X.04i  reason: invalid class name and case insensitive filesystem */
public class C010304i extends C010204h {
    public final /* synthetic */ AnonymousClass02U A00;

    public void onContentChanged() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C010304i(Window.Callback callback, AnonymousClass02U r2) {
        super(callback);
        this.A00 = r2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A0Z(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C016307a)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r2 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
        /*
            r3 = this;
            boolean r0 = r6 instanceof X.C016307a
            if (r0 == 0) goto L_0x000d
            r2 = r6
            X.07a r2 = (X.C016307a) r2
        L_0x0007:
            r1 = 0
            if (r4 != 0) goto L_0x000f
            if (r2 != 0) goto L_0x0011
            return r1
        L_0x000d:
            r2 = 0
            goto L_0x0007
        L_0x000f:
            if (r2 == 0) goto L_0x0014
        L_0x0011:
            r0 = 1
            r2.A0D = r0
        L_0x0014:
            boolean r0 = super.onPreparePanel(r4, r5, r6)
            if (r2 == 0) goto L_0x001c
            r2.A0D = r1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010304i.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C016307a r0 = this.A00.A0V(0).A0A;
        if (r0 != null) {
            super.onProvideKeyboardShortcuts(list, r0, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        AnonymousClass02U r2 = this.A00;
        C09330cC r1 = new C09330cC(r2.A0i, callback);
        AnonymousClass0V9 A0G = r2.A0G(r1);
        if (A0G != null) {
            return r1.A00(A0G);
        }
        return null;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C016307a r0;
        C016307a r02;
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        AnonymousClass02U r6 = this.A00;
        int keyCode = keyEvent.getKeyCode();
        AnonymousClass02U.A0B(r6);
        AnonymousClass07B r03 = r6.A0C;
        if (r03 != null && r03.A0a(keyCode, keyEvent)) {
            return true;
        }
        C011404y r2 = r6.A0G;
        if (r2 != null) {
            int keyCode2 = keyEvent.getKeyCode();
            if (!keyEvent.isSystem() && ((r2.A0D || AnonymousClass02U.A0D(keyEvent, r2, r6)) && (r02 = r2.A0A) != null && r02.performShortcut(keyCode2, keyEvent, 1))) {
                C011404y r04 = r6.A0G;
                if (r04 == null) {
                    return true;
                }
                r04.A0B = true;
                return true;
            }
        }
        if (r6.A0G != null) {
            return false;
        }
        C011404y A0V = r6.A0V(0);
        AnonymousClass02U.A0D(keyEvent, A0V, r6);
        int keyCode3 = keyEvent.getKeyCode();
        boolean z = false;
        if (!keyEvent.isSystem() && ((A0V.A0D || AnonymousClass02U.A0D(keyEvent, A0V, r6)) && (r0 = A0V.A0A) != null)) {
            z = r0.performShortcut(keyCode3, keyEvent, 1);
        }
        A0V.A0D = false;
        if (z) {
            return true;
        }
        return false;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        AnonymousClass02U r1 = this.A00;
        if (i != 108) {
            return true;
        }
        AnonymousClass02U.A0B(r1);
        AnonymousClass07B r12 = r1.A0C;
        if (r12 == null) {
            return true;
        }
        r12.A0S(true);
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        AnonymousClass02U r3 = this.A00;
        if (i == 108) {
            AnonymousClass02U.A0B(r3);
            AnonymousClass07B r0 = r3.A0C;
            if (r0 != null) {
                r0.A0S(false);
            }
        } else if (i == 0) {
            C011404y A0V = r3.A0V(i);
            if (A0V.A0C) {
                r3.A0X(A0V, false);
            }
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AnonymousClass02U r2 = this.A00;
        C09330cC r1 = new C09330cC(r2.A0i, callback);
        AnonymousClass0V9 A0G = r2.A0G(r1);
        if (A0G != null) {
            return r1.A00(A0G);
        }
        return null;
    }
}
