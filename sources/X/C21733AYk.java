package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.AYk  reason: case insensitive filesystem */
public final /* synthetic */ class C21733AYk implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C159927kB A05;
    public final /* synthetic */ C23072B3b A06;
    public final /* synthetic */ C195169St A07;
    public final /* synthetic */ A2F A08;
    public final /* synthetic */ AnonymousClass9W3 A09;
    public final /* synthetic */ String A0A;

    public /* synthetic */ C21733AYk(CaptureRequest.Builder builder, C159927kB r2, C23072B3b b3b, C195169St r4, A2F a2f, AnonymousClass9W3 r6, String str, int i, int i2, int i3, long j) {
        this.A07 = r4;
        this.A0A = str;
        this.A09 = r6;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A06 = b3b;
        this.A05 = r2;
        this.A04 = builder;
        this.A08 = a2f;
        this.A03 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0132, code lost:
        if (X.AnonymousClass000.A0I(r13.A06.A08(r15)) == 1) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0175, code lost:
        if (r0.equals(X.C188348zR.LOW) == false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r22 = this;
            r1 = r22
            X.9St r6 = r1.A07
            java.lang.String r0 = r1.A0A
            r21 = r0
            r7 = 0
            X.9W3 r13 = r1.A09
            int r5 = r1.A00
            int r10 = r1.A01
            int r9 = r1.A02
            X.B3b r0 = r1.A06
            r17 = r0
            X.7kB r0 = r1.A05
            r16 = r0
            android.hardware.camera2.CaptureRequest$Builder r12 = r1.A04
            X.A2F r11 = r1.A08
            long r0 = r1.A03
            r19 = r0
            java.util.Objects.requireNonNull(r13)
            r14 = 1
            r8 = 0
            X.9VN r1 = r6.A09
            java.lang.String r0 = "Method recordVideo() must run on the Optic Background Thread."
            r1.A01(r0)
            android.hardware.camera2.CameraDevice r0 = r6.A0B
            if (r0 == 0) goto L_0x01e9
            X.9dX r0 = r6.A05
            if (r0 == 0) goto L_0x01e9
            X.88m r1 = r6.A03
            if (r1 == 0) goto L_0x01e9
            X.9n4 r0 = r6.A02
            if (r0 == 0) goto L_0x01e9
            X.9YE r0 = r6.A01
            if (r0 == 0) goto L_0x01e9
            X.B4X r0 = r6.A04
            if (r0 == 0) goto L_0x01e2
            X.9Cj r3 = X.C201049ih.A0A
            int r0 = X.C201049ih.A02(r3, r1)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r2 = 3
            if (r0 != 0) goto L_0x0075
            if (r12 == 0) goto L_0x0075
            X.9Up r1 = new X.9Up
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01(r3, r0)
            X.9T3 r1 = r1.A00()
            X.88m r0 = r6.A03
            r0.A0A(r1)
            X.88m r1 = r6.A03
            X.9dX r0 = r6.A05
            X.AnonymousClass9Yv.A01(r12, r1, r0, r8)
            X.9n4 r0 = r6.A02
            r0.A05()
        L_0x0075:
            java.util.Objects.requireNonNull(r12)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            X.C165577te.A0v(r12, r0, r2)
            X.B4X r1 = r6.A04
            X.9Ch r0 = X.B4X.A0c
            java.lang.Object r0 = r1.B84(r0)
            X.9mz r4 = r6.A08
            X.9JL r1 = X.C202949mz.A01(r4, r5)     // Catch:{ CameraAccessException -> 0x0092 }
            java.lang.String r1 = r1.A02     // Catch:{ CameraAccessException -> 0x0092 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ CameraAccessException -> 0x0092 }
            goto L_0x009a
        L_0x0092:
            java.lang.String r2 = "CameraInventory"
            java.lang.String r1 = "Failed to load CameraInfo to obtain camera id"
            X.C202389lj.A02(r2, r1)
            r1 = 0
        L_0x009a:
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r1, r14)
            X.88m r1 = r6.A03
            X.9Cj r15 = X.C201049ih.A0u
            java.lang.Object r1 = r1.A08(r15)
            java.util.Objects.requireNonNull(r1)
            int r2 = r13.A02
            int r1 = r13.A01
            X.8zR r13 = X.C188348zR.HIGH
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x015f
            r13 = 5000000(0x4c4b40, float:7.006492E-39)
        L_0x00b8:
            r3.videoBitRate = r13
        L_0x00ba:
            r0 = 2
            r3.videoCodec = r0
            X.88m r0 = r6.A03
            int r0 = X.C201049ih.A02(r15, r0)
            r3.videoFrameRate = r0
            r3.videoFrameWidth = r2
            r3.videoFrameHeight = r1
            java.util.Objects.requireNonNull(r17)
            X.B0f r0 = r17.BJ1()
            r6.A07 = r0
            if (r0 != 0) goto L_0x00e5
            X.88m r1 = r6.A03
            X.9Cj r0 = X.C201049ih.A0M
            boolean r2 = X.C201049ih.A07(r0, r1)
            X.6lH r1 = new X.6lH
            r0 = r16
            r1.<init>(r0, r2)
            r6.A07 = r1
        L_0x00e5:
            X.9YE r13 = r6.A01
            X.9gr r1 = r13.A0B
            java.lang.String r0 = "Method setFocusModeForVideo() must run on the Optic Background Thread."
            r1.A06(r0)
            android.hardware.camera2.CameraManager r0 = r13.A01
            if (r0 == 0) goto L_0x010b
            android.hardware.camera2.CameraDevice r0 = r13.A00
            if (r0 == 0) goto L_0x010b
            X.9n4 r1 = r13.A04
            if (r1 == 0) goto L_0x010b
            X.9dX r0 = r13.A07
            if (r0 == 0) goto L_0x010b
            X.B31 r2 = r1.A09
            if (r2 == 0) goto L_0x010b
            r13.A0E = r14
            boolean r0 = r13.A0C
            if (r0 == 0) goto L_0x0111
            r13.A00()
        L_0x010b:
            X.B0f r11 = r6.A07
            r0 = -1
            if (r9 == r0) goto L_0x01a1
            goto L_0x0179
        L_0x0111:
            X.9dX r1 = r13.A07
            X.9Ci r0 = X.C198429dX.A09
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0153
            r1 = 3
        L_0x011c:
            X.88m r0 = r13.A06
            if (r0 == 0) goto L_0x0134
            X.9Cj r15 = X.C201049ih.A0d
            java.lang.Object r0 = r0.A08(r15)
            if (r0 == 0) goto L_0x0134
            X.88m r0 = r13.A06
            java.lang.Object r0 = r0.A08(r15)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 == r14) goto L_0x0141
        L_0x0134:
            android.hardware.camera2.CaptureRequest$Key r13 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            X.C165577te.A0v(r12, r13, r0)
            android.hardware.camera2.CaptureRequest r0 = r12.build()
            r2.B2a(r0, r7, r11)
        L_0x0141:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            X.C165577te.A0v(r12, r0, r1)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            X.C165577te.A0v(r12, r0, r8)
            android.hardware.camera2.CaptureRequest r0 = r12.build()
            r2.Brx(r0, r7, r11)
            goto L_0x010b
        L_0x0153:
            X.9dX r1 = r13.A07
            X.9Ci r0 = X.C198429dX.A08
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x010b
            r1 = 4
            goto L_0x011c
        L_0x015f:
            X.8zR r13 = X.C188348zR.MEDIUM
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x016c
            r13 = 3000000(0x2dc6c0, float:4.203895E-39)
            goto L_0x00b8
        L_0x016c:
            X.8zR r13 = X.C188348zR.LOW
            boolean r0 = r0.equals(r13)
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00ba
        L_0x0179:
            X.9JL r2 = X.C202949mz.A01(r4, r5)     // Catch:{ CameraAccessException -> 0x0191 }
            int r0 = r9 + 45
            int r0 = r0 / 90
            int r1 = r0 * 90
            int r0 = r2.A01     // Catch:{ CameraAccessException -> 0x0191 }
            if (r0 != 0) goto L_0x018d
            int r10 = r10 - r1
            int r0 = r10 + 360
            int r8 = r0 % 360
            goto L_0x01a1
        L_0x018d:
            int r10 = r10 + r1
            int r8 = r10 % 360
            goto L_0x01a1
        L_0x0191:
            r4 = move-exception
            java.lang.String r2 = "CameraInventory"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to get info to calculate media rotation: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r4)
            X.C202389lj.A02(r2, r0)
        L_0x01a1:
            X.88m r1 = r6.A03
            X.9Cj r0 = X.C201049ih.A0M
            boolean r17 = X.C201049ih.A07(r0, r1)
            X.9n4 r0 = r6.A02
            if (r0 == 0) goto L_0x01df
            X.88m r2 = r0.A0A
            if (r2 == 0) goto L_0x01df
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Cj r0 = X.C201049ih.A0I
            java.lang.Object r0 = r2.A08(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01df
            r18 = 1
        L_0x01c1:
            r13 = r7
            r16 = 1
            r9 = r11
            r10 = r3
            r11 = r7
            r12 = r21
            r14 = r5
            r15 = r8
            X.9gN r2 = r9.Bv0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.A06 = r2
            r6.A06 = r2
            X.9Cp r1 = X.C199989gN.A0N
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r2.A02(r1, r0)
            X.9gN r0 = r6.A06
            return r0
        L_0x01df:
            r18 = 0
            goto L_0x01c1
        L_0x01e2:
            java.lang.String r0 = "Cannot setup media recorder, trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01e9:
            java.lang.String r0 = "Cannot start recording video, camera is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21733AYk.call():java.lang.Object");
    }
}
