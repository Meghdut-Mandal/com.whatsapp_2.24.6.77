package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6ZO  reason: invalid class name */
public class AnonymousClass6ZO implements SurfaceTexture.OnFrameAvailableListener {
    public static final long A05 = TimeUnit.MILLISECONDS.toNanos(10000);
    public long A00 = 0;
    public boolean A01;
    public final SurfaceTexture A02;
    public final Object A03 = C36441kJ.A11();
    public final AtomicLong A04 = new AtomicLong(0);

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Class<AnonymousClass6ZO> cls = AnonymousClass6ZO.class;
        if (AnonymousClass6YR.A01.BMH(2)) {
            AnonymousClass6YR.A01.BxE(cls.getSimpleName(), "new frame available");
        }
        synchronized (this) {
            this.A00++;
        }
        Object obj = this.A03;
        synchronized (obj) {
            if (!this.A01) {
                this.A01 = true;
                obj.notifyAll();
            } else {
                throw C90514aH.A0s("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public AnonymousClass6ZO(SurfaceTexture surfaceTexture) {
        System.nanoTime();
        this.A02 = surfaceTexture;
    }
}
