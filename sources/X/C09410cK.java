package X;

import android.view.Window;

/* renamed from: X.0cK  reason: invalid class name and case insensitive filesystem */
public final class C09410cK implements C16990qX {
    public boolean A00;
    public final /* synthetic */ AnonymousClass07E A01;

    public C09410cK(AnonymousClass07E r1) {
        this.A01 = r1;
    }

    public void BTt(C016307a r3, boolean z) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass07E r1 = this.A01;
            r1.A00.B5c();
            Window.Callback callback = r1.A02;
            if (callback != null) {
                callback.onPanelClosed(C65953Uc.A03, r3);
            }
            this.A00 = false;
        }
    }

    public boolean Bbv(C016307a r3) {
        Window.Callback callback = this.A01.A02;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(C65953Uc.A03, r3);
        return true;
    }
}
