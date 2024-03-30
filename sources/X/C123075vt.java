package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.Objects;

/* renamed from: X.5vt  reason: invalid class name and case insensitive filesystem */
public class C123075vt {
    public long A00 = 0;
    public HandlerThread A01;
    public Surface A02;
    public AnonymousClass6ZO A03;
    public final /* synthetic */ C114985i9 A04;

    public C123075vt(C114985i9 r5) {
        this.A04 = r5;
        C125015zB r0 = r5.A00;
        Objects.requireNonNull(r0);
        SurfaceTexture surfaceTexture = r0.A02;
        Objects.requireNonNull(surfaceTexture);
        this.A03 = new AnonymousClass6ZO(surfaceTexture);
        HandlerThread handlerThread = new HandlerThread("videotranscoder-framecallback", -19);
        this.A01 = handlerThread;
        handlerThread.start();
        AnonymousClass6ZO r2 = this.A03;
        Looper looper = this.A01.getLooper();
        Objects.requireNonNull(looper);
        surfaceTexture.setOnFrameAvailableListener(r2, new Handler(looper));
        this.A02 = new Surface(surfaceTexture);
    }
}
