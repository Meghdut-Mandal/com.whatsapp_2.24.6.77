package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4ht  reason: invalid class name and case insensitive filesystem */
public final class C94244ht extends C137856gq implements C161817nW {
    public AnonymousClass00S A00;
    public boolean A01;

    public void B5y(C161667nH r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!this.A01) {
            this.A01 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new C80223v3(this, 7));
            } else {
                throw C36381kD.A0l();
            }
        }
        r4.B63();
    }

    public /* synthetic */ void BaV() {
    }

    public C94244ht(AnonymousClass00S r1) {
        this.A00 = r1;
    }
}
