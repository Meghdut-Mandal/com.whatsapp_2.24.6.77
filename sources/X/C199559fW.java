package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.9fW  reason: invalid class name and case insensitive filesystem */
public class C199559fW {
    public final boolean A00;
    public volatile int A01;
    public volatile int A02 = 0;
    public volatile int A03;
    public volatile int A04;
    public volatile SurfaceTexture A05;
    public volatile Surface A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public synchronized Surface A00() {
        SurfaceTexture surfaceTexture = this.A05;
        if (this.A06 == null && surfaceTexture != null) {
            this.A06 = new Surface(surfaceTexture);
        }
        return this.A06;
    }

    public synchronized void A01() {
        Surface surface = this.A06;
        if (surface != null && this.A00) {
            surface.release();
            this.A06 = null;
        }
    }

    public C199559fW(Surface surface, boolean z) {
        this.A06 = surface;
        this.A00 = z;
        this.A07 = true;
        this.A08 = false;
    }

    public C199559fW(SurfaceTexture surfaceTexture) {
        this.A05 = surfaceTexture;
        this.A00 = true;
        this.A07 = true;
        this.A08 = false;
    }
}
