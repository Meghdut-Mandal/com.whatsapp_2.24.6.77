package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1PW  reason: invalid class name */
public class AnonymousClass1PW implements AnonymousClass1PV {
    public final Handler A00;
    public final C19630wG A01;
    public final AnonymousClass1MM A02;
    public final AtomicBoolean A03 = new AtomicBoolean();

    public void A00(C132636Up r3) {
        this.A00.obtainMessage(1, r3).sendToTarget();
    }

    public void A01(AnonymousClass7gG r3) {
        this.A00.obtainMessage(4, r3).sendToTarget();
    }

    public void A02(AnonymousClass7gG r3) {
        this.A00.obtainMessage(5, r3).sendToTarget();
    }

    public void BhJ(boolean z) {
        this.A03.set(true);
    }

    public void Bhv() {
        this.A03.set(false);
    }

    public AnonymousClass1PW(C19630wG r3, AnonymousClass1MM r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = new AnonymousClass1PX(Looper.getMainLooper(), this);
    }
}
