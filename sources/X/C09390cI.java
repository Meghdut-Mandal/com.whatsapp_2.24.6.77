package X;

import android.view.Window;

/* renamed from: X.0cI  reason: invalid class name and case insensitive filesystem */
public final class C09390cI implements C16990qX {
    public final /* synthetic */ AnonymousClass02U A00;

    public C09390cI(AnonymousClass02U r1) {
        this.A00 = r1;
    }

    public void BTt(C016307a r10, boolean z) {
        C016307a r0;
        C016307a A01 = r10.A01();
        boolean z2 = false;
        if (A01 != r10) {
            z2 = true;
        }
        AnonymousClass02U r5 = this.A00;
        if (z2) {
            r10 = A01;
        }
        C011404y[] r4 = r5.A0a;
        int i = 0;
        if (r4 != null) {
            int length = r4.length;
            while (i < length) {
                C011404y r2 = r4[i];
                if (r2 == null || (r0 = r2.A0A) != r10) {
                    i++;
                } else if (z2) {
                    int i2 = r2.A03;
                    if (A01 == null) {
                        A01 = r0;
                    }
                    if (r2.A0C && !r5.A0T) {
                        r5.A0D.A00.onPanelClosed(i2, A01);
                    }
                    r5.A0X(r2, true);
                    return;
                } else {
                    r5.A0X(r2, z);
                    return;
                }
            }
        }
    }

    public boolean Bbv(C016307a r4) {
        Window.Callback callback;
        if (r4 != r4.A01()) {
            return true;
        }
        AnonymousClass02U r2 = this.A00;
        if (!r2.A00 || (callback = r2.A0A.getCallback()) == null || r2.A0T) {
            return true;
        }
        callback.onMenuOpened(C65953Uc.A03, r4);
        return true;
    }
}
