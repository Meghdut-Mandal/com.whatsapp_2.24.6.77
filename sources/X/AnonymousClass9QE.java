package X;

import android.os.Handler;

/* renamed from: X.9QE  reason: invalid class name */
public final class AnonymousClass9QE {
    public final Handler A00;
    public final C209409zx A01;

    public void A00(AnonymousClass9OH r3) {
        synchronized (r3) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            C165587tf.A0y(handler, this, r3, 29);
        }
    }

    public AnonymousClass9QE(Handler handler, C209409zx r2) {
        this.A00 = r2 == null ? null : handler;
        this.A01 = r2;
    }
}
