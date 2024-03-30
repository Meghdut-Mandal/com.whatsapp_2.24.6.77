package X;

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Rn  reason: invalid class name and case insensitive filesystem */
public class C194859Rn {
    public final AnonymousClass9QO A00 = new AnonymousClass9QO();
    public final AnonymousClass9VB A01 = new AnonymousClass9VB();
    public final AnonymousClass9VB A02 = new AnonymousClass9VB();
    public volatile AnonymousClass9PG A03;

    public void A00(boolean z, Camera camera) {
        AnonymousClass9QO r1 = this.A00;
        ReentrantLock reentrantLock = r1.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!r1.A00()) {
                    camera.stopPreview();
                    reentrantLock.lock();
                    r1.A00 = 0;
                    reentrantLock.unlock();
                    AnonymousClass9PG r2 = this.A03;
                    if (r2 != null && !r2.A00.isEmpty()) {
                        C202399lk.A00(new C1497572q(r2, 8));
                    }
                    if (z) {
                        AnonymousClass9VB r12 = this.A02;
                        if (!r12.A00.isEmpty()) {
                            C202399lk.A00(new AnonymousClass75C((Object) this, (Object) r12.A00, 48));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        reentrantLock.unlock();
    }
}
