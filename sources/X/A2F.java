package X;

import android.hardware.camera2.CaptureRequest;

public class A2F implements B2M, C23013B0e {
    public static int A0J = 16;
    public static int A0K = 400;
    public static long A0L = 30000000;
    public static int A0M;
    public static boolean A0N;
    public static boolean A0O;
    public static final float[] A0P = new float[4];
    public static final int[] A0Q = new int[18];
    public C191209Cb A00;
    public C191229Cd A01;
    public C21829Ab6 A02;
    public C191239Ce A03;
    public C191249Cf A04;
    public AnonymousClass9QP A05;
    public C22878AxZ A06;
    public C22879Axa A07;
    public B31 A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public int A0C = 0;
    public final AnonymousClass9WY A0D;
    public final C22880Axb A0E;
    public volatile int A0F = 0;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;

    private void A00(B31 b31) {
        if (this.A0F == 1) {
            this.A0F = 0;
            this.A09 = true;
            this.A08 = b31;
            this.A0D.A01();
            C22879Axa axa = this.A07;
            if (axa != null) {
                C203899p8 r1 = (C203899p8) axa;
                int i = r1.A01;
                C202989n4 r3 = (C202989n4) r1.A00;
                if (i == 0) {
                    C202389lj.A00();
                    if (!r3.A0M.A00.isEmpty()) {
                        C202399lk.A00(new C1497572q(r3, 5));
                    }
                }
                r3.A0O.A07("handle_preview_started", new B8U((Object) r3, 14));
                return;
            }
            return;
        }
        throw C90514aH.A0s("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    private void A01(B31 b31) {
        if (this.A0F == 7) {
            this.A0F = 0;
            this.A09 = C36371kC.A0m();
            this.A08 = b31;
            this.A0D.A01();
            return;
        }
        throw C90514aH.A0s("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public void B1t() {
        this.A0D.A00();
    }

    public /* bridge */ /* synthetic */ Object BGo() {
        Boolean bool = this.A09;
        if (bool == null) {
            throw AnonymousClass001.A09("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A08;
        } else {
            throw this.A02;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:19|20|21|(1:23)|24|25|(1:27)|28|(2:31|(2:33|(1:35)(2:96|(2:98|99))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
        if (r0 != 5) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010c, code lost:
        if (r7.intValue() != 4) goto L_0x010e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ IllegalArgumentException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BT8(X.C22882Axd r11, X.B31 r12) {
        /*
            r10 = this;
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x01f9
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x003a
            int r1 = r0.intValue()
            int r0 = r10.A0C
            if (r1 == r0) goto L_0x003a
            r10.A0C = r1
            X.9Cf r0 = r10.A04
            if (r0 == 0) goto L_0x003a
            X.B8V r5 = r0.A00
            java.lang.Object r4 = r5.A00
            X.9YE r4 = (X.AnonymousClass9YE) r4
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x003a
            r0 = 1
            if (r1 != r0) goto L_0x003a
            r1 = 0
            java.lang.Object r3 = r5.A02
            android.hardware.camera2.CaptureRequest$Builder r3 = (android.hardware.camera2.CaptureRequest.Builder) r3
            java.lang.Object r0 = r5.A01
            X.A2F r0 = (X.A2F) r0
            r4.A02(r3, r0, r1)
        L_0x003a:
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x0084
            X.9QP r0 = r10.A05
            if (r0 == 0) goto L_0x0084
            X.9fZ r3 = r0.A01(r11)
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Object r0 = r11.B83(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x005b
            float[] r1 = A0P     // Catch:{ IllegalArgumentException -> 0x005b }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005b }
            X.9Cl r0 = X.C199589fZ.A0H     // Catch:{ IllegalArgumentException -> 0x005b }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x005b }
        L_0x005b:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x006f }
            java.lang.Object r0 = r11.B83(r0)     // Catch:{ IllegalArgumentException -> 0x006f }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x006f }
            if (r0 == 0) goto L_0x006f
            int[] r1 = A0Q     // Catch:{ IllegalArgumentException -> 0x006f }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x006f }
            X.9Cl r0 = X.C199589fZ.A0I     // Catch:{ IllegalArgumentException -> 0x006f }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            X.9Ce r0 = r10.A03
            if (r0 == 0) goto L_0x0084
            X.A2B r1 = r0.A00
            r1.A01 = r10
            X.9gr r0 = r1.A02
            if (r0 == 0) goto L_0x0084
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0152
            X.A2B.A00(r1)
        L_0x0084:
            boolean r0 = r10.A0G
            if (r0 == 0) goto L_0x008d
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            r11.B83(r0)
        L_0x008d:
            X.9Cd r0 = r10.A01
            if (r0 == 0) goto L_0x00db
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r1 = r11.B83(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r9 = r11.B83(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            if (r1 == 0) goto L_0x00db
            if (r9 == 0) goto L_0x00db
            boolean r2 = A0O
            r6 = 0
            long r0 = r1.longValue()
            if (r2 != 0) goto L_0x0135
            long r3 = A0L
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x014f
            int r1 = r9.intValue()
            int r0 = A0K
            if (r1 <= r0) goto L_0x014f
        L_0x00bc:
            r0 = 1
        L_0x00bd:
            boolean r2 = A0N
            if (r0 == r2) goto L_0x012e
            A0N = r0
            r2 = r0
            A0M = r6
            r1 = 0
        L_0x00c7:
            int r0 = A0J
            if (r1 < r0) goto L_0x00db
            X.9Cd r1 = r10.A01
            X.75B r0 = new X.75B
            r0.<init>((int) r6, (java.lang.Object) r1, (boolean) r2)
            X.C202399lk.A00(r0)
            boolean r0 = A0N
            A0O = r0
            A0M = r6
        L_0x00db:
            X.AxZ r0 = r10.A06
            r3 = 0
            r2 = 1
            r4 = 5
            r5 = 4
            if (r0 == 0) goto L_0x0112
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r7 = r11.B83(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x0101
            X.AxZ r6 = r10.A06
            if (r6 == 0) goto L_0x00f9
            int r1 = r7.intValue()
            if (r1 != r2) goto L_0x011a
            r10.A0B = r2
        L_0x00f9:
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x0101
            if (r0 != r4) goto L_0x0112
        L_0x0101:
            X.AxZ r6 = r10.A06
            if (r6 == 0) goto L_0x0112
            if (r7 == 0) goto L_0x010e
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            r6.BYF(r0)
        L_0x0112:
            int r0 = r10.A0F
            if (r0 != r2) goto L_0x0161
            r10.A00(r12)
            return
        L_0x011a:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x00f9
            r0 = 2
            if (r1 != r0) goto L_0x0127
            r6.BYF(r2)
        L_0x0124:
            r10.A0B = r3
            goto L_0x00f9
        L_0x0127:
            r0 = 6
            if (r1 != r0) goto L_0x00f9
            r6.BYF(r3)
            goto L_0x0124
        L_0x012e:
            int r0 = A0M
            int r1 = r0 + 1
            A0M = r1
            goto L_0x00c7
        L_0x0135:
            double r4 = (double) r0
            long r2 = A0L
            double r0 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 * r7
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x014f
            int r0 = r9.intValue()
            double r3 = (double) r0
            int r0 = A0K
            double r1 = (double) r0
            double r1 = r1 * r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
            goto L_0x00bc
        L_0x014f:
            r0 = 0
            goto L_0x00bd
        L_0x0152:
            android.media.Image r0 = r1.A00
            if (r0 == 0) goto L_0x0084
            X.9gr r2 = r1.A02     // Catch:{ Exception -> 0x0084 }
            java.util.concurrent.Callable r1 = r1.A07     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "onFrameCaptured"
            r2.A07(r0, r1)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0084
        L_0x0161:
            int r1 = r10.A0F
            r0 = 7
            if (r1 != r0) goto L_0x016a
            r10.A01(r12)
            return
        L_0x016a:
            int r0 = r10.A0F
            r1 = 2
            if (r0 != r1) goto L_0x0197
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x018b
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x018b
            if (r0 != r4) goto L_0x01f9
        L_0x018b:
            int r0 = r10.A0F
            if (r0 != r1) goto L_0x01f9
        L_0x018f:
            r10.A0F = r3
            X.9WY r0 = r10.A0D
            r0.A01()
            return
        L_0x0197:
            int r1 = r10.A0F
            r0 = 3
            if (r1 != r0) goto L_0x01b1
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
            if (r0 == 0) goto L_0x01ae
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x01f9
        L_0x01ae:
            r10.A0F = r5
            return
        L_0x01b1:
            int r0 = r10.A0F
            if (r0 != r5) goto L_0x01c8
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
            if (r0 == 0) goto L_0x018f
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x01f9
            goto L_0x018f
        L_0x01c8:
            int r0 = r10.A0F
            r1 = 6
            if (r0 != r4) goto L_0x01e2
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
            if (r0 == 0) goto L_0x01df
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x01f9
        L_0x01df:
            r10.A0F = r1
            return
        L_0x01e2:
            int r0 = r10.A0F
            if (r0 != r1) goto L_0x01f9
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r11.B83(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
            if (r0 == 0) goto L_0x018f
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x01f9
            goto L_0x018f
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2F.BT8(X.Axd, X.B31):void");
    }

    public void BT9(C22881Axc axc, B31 b31) {
        if (!this.A0H) {
            return;
        }
        if (this.A0F == 1 || this.A0F == 7) {
            this.A0F = 0;
            this.A09 = false;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Failed to start operation. Reason: ");
            this.A02 = new C21829Ab6(C36381kD.A10(A0u, axc.BGX()));
            if (this.A00 != null) {
                axc.BGX();
            }
            this.A0D.A01();
        }
    }

    public void BTA(CaptureRequest captureRequest, B31 b31, long j, long j2) {
        if (!this.A0H) {
            return;
        }
        if (this.A0F == 1) {
            A00(b31);
        } else if (this.A0F == 7) {
            A01(b31);
        }
    }

    public A2F() {
        C203459o3 r1 = new C203459o3(this, 0);
        this.A0E = r1;
        this.A0H = true;
        AnonymousClass9WY r0 = new AnonymousClass9WY();
        this.A0D = r0;
        r0.A00 = r1;
    }
}
