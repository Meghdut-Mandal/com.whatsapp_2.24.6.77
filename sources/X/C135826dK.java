package X;

import android.view.ViewTreeObserver;

/* renamed from: X.6dK  reason: invalid class name and case insensitive filesystem */
public class C135826dK implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = false;
    public final /* synthetic */ C133586Zc A01;

    public C135826dK(C133586Zc r2) {
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        C133586Zc r2 = this.A01;
        boolean A002 = AnonymousClass1N2.A00(r2.A0I);
        if (A002 != this.A00) {
            this.A00 = A002;
            r2.A0U((Float) null, false);
        }
    }
}
