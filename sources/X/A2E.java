package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;

public class A2E implements B2M, C23013B0e {
    public static final float[] A09 = new float[4];
    public static final int[] A0A = new int[18];
    public Long A00;
    public final AnonymousClass9QP A01;
    public final AnonymousClass9WY A02;
    public final AnonymousClass9PF A03 = new AnonymousClass9PF(this);
    public final boolean A04;
    public final C22880Axb A05;
    public volatile C21829Ab6 A06 = new C21829Ab6("Uninitialized exception.");
    public volatile C197979ch A07;
    public volatile Boolean A08;

    public void BT9(C22881Axc axc, B31 b31) {
    }

    public void B1t() {
        this.A02.A00();
    }

    public /* bridge */ /* synthetic */ Object BGo() {
        if (this.A08 == null) {
            throw AnonymousClass001.A09("Photo capture operation hasn't completed yet.");
        } else if (this.A08.booleanValue()) {
            C197979ch r1 = this.A07;
            if (r1 != null && (r1.A04 != null || r1.A01 != null)) {
                return r1;
            }
            throw AnonymousClass001.A09("Photo capture data is null.");
        } else {
            throw this.A06;
        }
    }

    public A2E(boolean z) {
        C203459o3 r0 = new C203459o3(this, 2);
        this.A05 = r0;
        this.A04 = z;
        AnonymousClass9WY r2 = new AnonymousClass9WY();
        this.A02 = r2;
        r2.A00 = r0;
        r2.A02(10000);
        this.A01 = new AnonymousClass9QP();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f A[Catch:{ IllegalArgumentException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BT8(X.C22882Axd r5, X.B31 r6) {
        /*
            r4 = this;
            X.9j3 r3 = X.C201199j3.A00()
            long r1 = r3.A02
            r0 = 6
            X.C201199j3.A01(r3, r0, r1)
            X.9QP r0 = r4.A01
            X.9fZ r3 = r0.A01(r5)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.lang.Object r0 = r5.B83(r0)     // Catch:{ IllegalArgumentException -> 0x0025 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0025 }
            if (r0 == 0) goto L_0x0025
            float[] r1 = A09     // Catch:{ IllegalArgumentException -> 0x0025 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0025 }
            X.9Cl r0 = X.C199589fZ.A0H     // Catch:{ IllegalArgumentException -> 0x0025 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0025 }
        L_0x0025:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x0039 }
            java.lang.Object r0 = r5.B83(r0)     // Catch:{ IllegalArgumentException -> 0x0039 }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            int[] r1 = A0A     // Catch:{ IllegalArgumentException -> 0x0039 }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0039 }
            X.9Cl r0 = X.C199589fZ.A0I     // Catch:{ IllegalArgumentException -> 0x0039 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0039:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r5.B83(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A00 = r0
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0056
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.9WY r0 = r4.A02
            r0.A01()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2E.BT8(X.Axd, X.B31):void");
    }

    public void BTA(CaptureRequest captureRequest, B31 b31, long j, long j2) {
        C201199j3.A00().A02 = SystemClock.elapsedRealtime();
    }
}
