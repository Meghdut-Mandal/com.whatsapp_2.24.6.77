package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* renamed from: X.9uu  reason: invalid class name and case insensitive filesystem */
public class C207319uu implements SurfaceHolder.Callback {
    public final /* synthetic */ C1690683c A00;

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public C207319uu(C1690683c r1) {
        this.A00 = r1;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C1690683c r1 = this.A00;
        Surface surface = surfaceHolder.getSurface();
        Objects.requireNonNull(surface);
        r1.Brm(surface, i2, i3);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1690683c r3 = this.A00;
        C199559fW r2 = r3.A08;
        if (r2 != null && r2.A00() == surfaceHolder.getSurface()) {
            r3.A08 = null;
            r3.A06 = 0;
            r3.A05 = 0;
            C1690683c.A02(r3, r2);
            r2.A01();
        }
    }
}
