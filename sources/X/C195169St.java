package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: X.9St  reason: invalid class name and case insensitive filesystem */
public class C195169St {
    public long A00;
    public AnonymousClass9YE A01;
    public C202989n4 A02;
    public C1692888m A03;
    public B4X A04;
    public C198429dX A05;
    public C199989gN A06;
    public C23014B0f A07;
    public final C202949mz A08;
    public final AnonymousClass9VN A09;
    public final C200199gr A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public Exception A00() {
        Surface surface;
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        C23014B0f b0f = this.A07;
        if (b0f != null) {
            try {
                b0f.Bv9();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        C202989n4 r2 = this.A02;
        if (r2 != null) {
            AnonymousClass9VN r1 = r2.A0J;
            r1.A01("Can only stop video recording on the Optic thread");
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                CaptureRequest.Builder builder = r2.A02;
                if (!(builder == null || (surface = r2.A05) == null)) {
                    builder.removeTarget(surface);
                }
                r2.A05 = null;
            }
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public C195169St(C202949mz r2, C200199gr r3) {
        this.A0A = r3;
        this.A08 = r2;
        this.A09 = new AnonymousClass9VN(r3);
    }
}
