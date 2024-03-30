package X;

import android.app.Dialog;
import android.os.Handler;

/* renamed from: X.0Jh  reason: invalid class name and case insensitive filesystem */
public final class C04110Jh extends C06300Tb {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ C11580gY A01;

    public C04110Jh(Dialog dialog, C11580gY r2) {
        this.A01 = r2;
        this.A00 = dialog;
    }

    public final void A00() {
        AnonymousClass0JX r2 = this.A01.A01;
        r2.A04.set((Object) null);
        Handler handler = r2.A03.A06;
        handler.sendMessage(handler.obtainMessage(3));
        Dialog dialog = this.A00;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
