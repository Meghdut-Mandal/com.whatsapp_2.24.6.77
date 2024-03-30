package X;

import android.hardware.Camera;

/* renamed from: X.3WK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WK implements Camera.ErrorCallback {
    public final /* synthetic */ C37461mP A00;

    public /* synthetic */ AnonymousClass3WK(C37461mP r1) {
        this.A00 = r1;
    }

    public final void onError(int i, Camera camera) {
        C37461mP r2 = this.A00;
        C36321k7.A1U("qrview/startcamera camera error:", AnonymousClass000.A0u(), i);
        if (i == 100) {
            C81133wW.A00(r2.A04, r2, 41);
            C81133wW.A00(r2.A04, r2, 39);
        } else if (i == 2) {
            r2.A03 = null;
            C37461mP.A00(r2, i);
        }
    }
}
