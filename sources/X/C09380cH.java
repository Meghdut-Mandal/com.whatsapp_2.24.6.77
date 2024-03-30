package X;

import android.view.Window;

/* renamed from: X.0cH  reason: invalid class name and case insensitive filesystem */
public final class C09380cH implements C16990qX {
    public final /* synthetic */ AnonymousClass02U A00;

    public C09380cH(AnonymousClass02U r1) {
        this.A00 = r1;
    }

    public void BTt(C016307a r2, boolean z) {
        this.A00.A0Y(r2);
    }

    public boolean Bbv(C016307a r3) {
        Window.Callback callback = this.A00.A0A.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(C65953Uc.A03, r3);
        return true;
    }
}
