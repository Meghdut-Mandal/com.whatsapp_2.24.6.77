package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;

/* renamed from: X.9fa  reason: invalid class name and case insensitive filesystem */
public class C199599fa {
    public static final C196519Zz A0G = C196519Zz.A00;
    public CameraDevice A00;
    public AnonymousClass9YE A01;
    public C202989n4 A02;
    public C195169St A03;
    public A2O A04;
    public C202639mL A05;
    public C1692888m A06;
    public B4X A07;
    public C198429dX A08;
    public B32 A09;
    public boolean A0A;
    public final AnonymousClass9VN A0B;
    public final C196519Zz A0C;
    public final C201439jb A0D;
    public final C200199gr A0E;
    public volatile boolean A0F;

    public C199599fa(C201439jb r3, C200199gr r4) {
        C196519Zz r1 = A0G;
        this.A0E = r4;
        this.A0D = r3;
        this.A0B = new AnonymousClass9VN(r4);
        this.A0C = r1;
    }

    public static void A00(CaptureRequest.Builder builder, C199599fa r9) {
        C202639mL r1 = r9.A05;
        C202639mL r12 = r9.A05;
        Rect rect = r12.A04;
        MeteringRectangle[] A032 = C202639mL.A03(r12, r12.A0D);
        C202639mL r13 = r9.A05;
        MeteringRectangle[] A033 = C202639mL.A03(r13, r13.A0C);
        CaptureRequest.Builder builder2 = builder;
        C202989n4.A01(rect, builder2, r9.A08, A032, A033, C202639mL.A01(r1, r1.A04()) * 100.0f);
    }

    public static void A01(CaptureRequest.Builder builder, C199599fa r3, int i) {
        AnonymousClass9Yv.A01(builder, r3.A06, r3.A08, i);
    }

    public void A03(AnonymousClass61X r5, Exception exc) {
        this.A0E.A05(new AnonymousClass74N(r5, exc, 0), this.A0D.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        if (r0 != 1) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d0, code lost:
        if ((X.C202639mL.A01(r1, r1.A04()) * 100.0f) != 100.0f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r0.A0C != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if ((X.C202639mL.A01(r1, r1.A04()) * 100.0f) != 100.0f) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r1 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0130, code lost:
        if (r5 == null) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.hardware.camera2.CameraManager r24, android.hardware.camera2.CaptureRequest.Builder r25, X.AnonymousClass61X r26, X.A2F r27, X.B43 r28, X.C198749e8 r29, java.lang.Integer r30, int r31, int r32, int r33, boolean r34) {
        /*
            r23 = this;
            r8 = r23
            X.88m r0 = r8.A06
            java.util.Objects.requireNonNull(r0)
            X.C201049ih.A06(r0)
            X.9VN r12 = r8.A0B
            java.lang.String r0 = "Cannot capture photo, not prepared"
            r12.A00(r0)
            X.9n4 r0 = r8.A02
            r3 = 0
            if (r0 == 0) goto L_0x05ab
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x05ab
            X.9gr r0 = r8.A0E
            r19 = r0
            X.9jb r0 = r8.A0D
            r18 = r0
            java.util.UUID r4 = r0.A03
            r22 = r26
            java.util.Objects.requireNonNull(r22)
            r2 = 4
            X.72q r1 = new X.72q
            r0 = r22
            r1.<init>(r0, r2)
            r0 = r19
            r0.A05(r1, r4)
            X.9n4 r0 = r8.A02
            X.9VN r1 = r0.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x004f
            if (r34 == 0) goto L_0x004f
            X.9n4 r0 = r8.A02
            r0.A09(r3)
            X.9n4 r0 = r8.A02
            r0.A05()
        L_0x004f:
            X.88m r1 = r8.A06
            X.9Cj r0 = X.C201049ih.A0A
            int r0 = X.C201049ih.A02(r0, r1)
            r2 = 2
            r7 = 1
            r13 = 1
            if (r0 == r2) goto L_0x0060
            r13 = 0
            r11 = 1
            if (r0 == r7) goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            X.88m r1 = r8.A06
            X.9Cj r0 = X.C201049ih.A0C
            int r0 = X.C201049ih.A02(r0, r1)
            boolean r0 = X.AnonymousClass000.A1S(r0, r7)
            r10 = r25
            r9 = r27
            if (r13 != 0) goto L_0x031c
            if (r0 == 0) goto L_0x007e
            X.9YE r0 = r8.A01
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x031c
        L_0x007e:
            r20 = r31
            r0 = r20
            if (r0 != r7) goto L_0x0314
            if (r11 == 0) goto L_0x00f9
            X.B4X r1 = r8.A07
            if (r1 == 0) goto L_0x00f9
            X.9Ch r0 = X.B4X.A0I
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x00f9
        L_0x0092:
            java.lang.String r0 = "Cannot run precapture sequence, not prepared"
            r12.A00(r0)
            if (r25 == 0) goto L_0x059c
            X.88m r0 = r8.A06
            if (r0 == 0) goto L_0x059c
            X.9dX r0 = r8.A08
            if (r0 == 0) goto L_0x059c
            X.9n4 r3 = r8.A02
            if (r3 == 0) goto L_0x059c
            X.9mL r0 = r8.A05
            if (r0 == 0) goto L_0x059c
            X.9VN r1 = r3.A0J
            java.lang.String r0 = "Cannot get camera operations callback."
            r1.A00(r0)
            X.A2F r4 = r3.A08
            r0 = 0
            A01(r10, r8, r0)
            X.88m r1 = r8.A06
            X.9Cj r0 = X.C201049ih.A08
            int r0 = X.C201049ih.A02(r0, r1)
            if (r0 == 0) goto L_0x00c3
            A01(r10, r8, r7)
        L_0x00c3:
            X.9mL r0 = r8.A05
            int r0 = r0.A05()
            if (r0 != 0) goto L_0x00dc
            X.9mL r1 = r8.A05
            float r0 = r1.A04()
            float r1 = X.C202639mL.A01(r1, r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00df
        L_0x00dc:
            A00(r10, r8)
        L_0x00df:
            java.util.Objects.requireNonNull(r4)
            r0 = 3
            r4.A0F = r0
            X.9WY r3 = r4.A0D
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.A02(r0)
            r0 = 4
            X.B8V r3 = new X.B8V
            r3.<init>(r10, r8, r4, r0)
            java.lang.String r1 = "run_precapture_sequence_on_camera_handler_thread"
            r0 = r19
            r0.A04(r1, r3)
        L_0x00f9:
            java.lang.String r0 = "Cannot capture still picture, not prepared"
            r12.A00(r0)
            android.hardware.camera2.CameraDevice r0 = r8.A00
            r11 = 0
            if (r0 == 0) goto L_0x0592
            X.88m r0 = r8.A06
            if (r0 == 0) goto L_0x0592
            X.B32 r14 = r8.A09
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r12.A00(r0)
            X.B32 r0 = r8.A09
            if (r0 == 0) goto L_0x0311
            android.view.Surface r5 = r0.BI4()
        L_0x0116:
            boolean r4 = r8.A0A
            X.A2O r15 = r8.A04
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r12.A00(r0)
            X.A2O r0 = r8.A04
            if (r0 == 0) goto L_0x030e
            android.view.Surface r1 = r0.BI4()
        L_0x0127:
            if (r15 == 0) goto L_0x012c
            r3 = 1
            if (r1 != 0) goto L_0x012d
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r14 == 0) goto L_0x0132
            r0 = 1
            if (r5 != 0) goto L_0x0133
        L_0x0132:
            r0 = 0
        L_0x0133:
            if (r4 == 0) goto L_0x02f4
            if (r3 == 0) goto L_0x02f6
        L_0x0137:
            r0 = 0
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            if (r4 != 0) goto L_0x02ef
            r3.add(r5)
            r3.add(r0)
        L_0x0144:
            java.lang.String r0 = "Cannot create still capture builder, not prepared"
            r12.A00(r0)
            if (r25 == 0) goto L_0x058b
            android.hardware.camera2.CameraDevice r1 = r8.A00
            if (r1 == 0) goto L_0x058b
            X.9mL r0 = r8.A05
            if (r0 == 0) goto L_0x058b
            X.88m r0 = r8.A06
            if (r0 == 0) goto L_0x058b
            X.9n4 r0 = r8.A02
            if (r0 == 0) goto L_0x058b
            X.9dX r0 = r8.A08
            if (r0 == 0) goto L_0x058b
            android.hardware.camera2.CaptureRequest$Builder r6 = r1.createCaptureRequest(r2)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6.set(r0, r5)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Object r0 = r10.get(r1)
            r6.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Object r0 = r10.get(r1)
            r6.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r10.get(r1)
            r6.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Object r0 = r10.get(r1)
            r6.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r10.get(r1)
            r6.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            r1 = r32
            X.C165577te.A0v(r6, r0, r1)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            if (r30 == 0) goto L_0x02eb
            byte r1 = r30.byteValue()
        L_0x01a8:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r6.set(r0, r1)
            X.B4X r0 = r8.A07
            if (r0 == 0) goto L_0x0292
            X.9dX r1 = r8.A08
            if (r1 == 0) goto L_0x0292
            X.9Ci r0 = X.C198429dX.A0r
            int r13 = X.C198429dX.A01(r0, r1)
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0j
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x01d6
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A05
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x01d6
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE
            r6.set(r0, r5)
        L_0x01d6:
            if (r13 == r2) goto L_0x01e9
            if (r13 < r7) goto L_0x01e9
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A06
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x01e9
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            r6.set(r0, r5)
        L_0x01e9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0208
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0m
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x0208
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A07
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0208
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.DISTORTION_CORRECTION_MODE
            r6.set(r0, r5)
        L_0x0208:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0n
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x0221
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A08
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0221
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.EDGE_MODE
            r6.set(r0, r5)
        L_0x0221:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0s
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x023a
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A09
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x023a
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.HOT_PIXEL_MODE
            r6.set(r0, r5)
        L_0x023a:
            if (r13 == r2) goto L_0x024b
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A0A
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x024b
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            X.C165577te.A0v(r6, r0, r7)
        L_0x024b:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0u
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x0264
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A0B
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0264
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r6.set(r0, r5)
        L_0x0264:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0279
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A0F
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0279
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.SENSOR_PIXEL_MODE
            X.C165577te.A0v(r6, r0, r7)
        L_0x0279:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A14
            boolean r0 = X.C198429dX.A05(r0, r1, r5)
            if (r0 == 0) goto L_0x0292
            X.B4X r1 = r8.A07
            X.9Ch r0 = X.B4X.A0G
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0292
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.SHADING_MODE
            r6.set(r0, r5)
        L_0x0292:
            A01(r6, r8, r11)
            r0 = 3
            A01(r6, r8, r0)
            r0 = 4
            A01(r6, r8, r0)
            r0 = 7
            A01(r6, r8, r0)
            A01(r6, r8, r2)
            r0 = 6
            A01(r6, r8, r0)
            r0 = 5
            A01(r6, r8, r0)
            X.88m r1 = r8.A06
            X.9Cj r0 = X.C201049ih.A08
            int r0 = X.C201049ih.A02(r0, r1)
            if (r0 == 0) goto L_0x02b9
            A01(r10, r8, r7)
        L_0x02b9:
            X.9mL r0 = r8.A05
            int r0 = r0.A05()
            if (r0 != 0) goto L_0x02d2
            X.9mL r1 = r8.A05
            float r0 = r1.A04()
            float r1 = X.C202639mL.A01(r1, r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02d5
        L_0x02d2:
            A00(r6, r8)
        L_0x02d5:
            java.util.Iterator r1 = r3.iterator()
        L_0x02d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0350
            java.lang.Object r0 = r1.next()
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L_0x02d9
            r6.addTarget(r0)
            goto L_0x02d9
        L_0x02eb:
            r1 = 90
            goto L_0x01a8
        L_0x02ef:
            r3.add(r1)
            goto L_0x0144
        L_0x02f4:
            if (r0 != 0) goto L_0x0137
        L_0x02f6:
            r8.A0F = r11
            java.lang.Object[] r1 = new java.lang.Object[r7]
            if (r4 == 0) goto L_0x030b
            java.lang.String r0 = "YUV"
        L_0x02fe:
            r1[r11] = r0
            java.lang.String r0 = "%s ImageReader not setup before taking picture."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x030b:
            java.lang.String r0 = "JPEG"
            goto L_0x02fe
        L_0x030e:
            r1 = 0
            goto L_0x0127
        L_0x0311:
            r5 = 0
            goto L_0x0116
        L_0x0314:
            if (r11 != 0) goto L_0x0092
            if (r13 == 0) goto L_0x00f9
            if (r3 != 0) goto L_0x00f9
            goto L_0x0092
        L_0x031c:
            X.9YE r6 = r8.A01
            java.util.Objects.requireNonNull(r6)
            X.9n4 r0 = r8.A02
            X.B31 r5 = r0.A09
            X.9VN r1 = r6.A0A
            java.lang.String r0 = "Method lockFocusForCapture() must run on the Optic Background Thread."
            r1.A01(r0)
            if (r27 == 0) goto L_0x05a3
            r9.A0F = r2
            X.9WY r4 = r9.A0D
            r0 = 300(0x12c, double:1.48E-321)
            r4.A02(r0)
            X.9gr r4 = r6.A0B
            X.AYf r1 = new X.AYf
            r1.<init>(r10, r6, r9, r5)
            java.lang.String r0 = "lock_focus_for_capture_on_camera_handler_thread"
            r4.A04(r0, r1)
            java.lang.Integer r0 = r9.A0A
            if (r0 == 0) goto L_0x007e
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x007e
            r3 = 1
            goto L_0x007e
        L_0x0350:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x035f
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r6.set(r1, r0)
        L_0x035f:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0K
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x036e
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            r6.set(r0, r5)
        L_0x036e:
            X.9dX r1 = r8.A08
            X.9Ci r0 = X.C198429dX.A0B
            r1.A06(r0)
            if (r4 != 0) goto L_0x0585
            java.util.Objects.requireNonNull(r14)
        L_0x037a:
            boolean r1 = r14 instanceof X.A2O
            X.A2E r0 = new X.A2E
            r0.<init>(r1)
            r1 = r19
            android.os.Handler r2 = r1.A02
            X.9PF r1 = r0.A03
            r14.Bm5(r2, r1)
            r1 = 3
            X.B8V r3 = new X.B8V
            r3.<init>(r0, r8, r6, r1)
            java.lang.String r2 = "capture_still_picture_on_camera_handler_thread"
            r1 = r19
            java.lang.Object r13 = r1.A04(r2, r3)
            X.9ch r13 = (X.C197979ch) r13
            r8.A0F = r11
            byte[] r4 = r13.A04
            X.9Sq r1 = r13.A01
            r17 = r1
            r21 = r29
            if (r4 == 0) goto L_0x03a9
            int r1 = r4.length
            if (r1 != 0) goto L_0x043e
        L_0x03a9:
            if (r17 != 0) goto L_0x043e
            java.lang.String r1 = "Image data was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            X.C202389lj.A00()
            java.lang.String r0 = "Photo capture returned empty image data."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            r0 = r22
            r8.A03(r0, r1)
        L_0x03c1:
            X.9Cm r1 = X.C198749e8.A04
            r0 = r21
            boolean r0 = X.C198749e8.A00(r1, r0)
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = "Cannot restore preview post capture, not prepared"
            r12.A00(r0)
            if (r28 == 0) goto L_0x043d
            X.9n4 r1 = r8.A02
            if (r1 == 0) goto L_0x043d
            X.9dX r0 = r8.A08
            if (r0 == 0) goto L_0x043d
            X.88m r0 = r8.A06
            if (r0 == 0) goto L_0x043d
            X.9mL r0 = r8.A05
            if (r0 == 0) goto L_0x043d
            X.B31 r2 = r1.A09
            if (r2 == 0) goto L_0x043d
            if (r34 == 0) goto L_0x03eb
            r1.A09(r7)
        L_0x03eb:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r10.set(r0, r5)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            r10.set(r0, r5)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r3 = 0
            X.C165577te.A0v(r10, r0, r3)
            A00(r10, r8)
            android.hardware.camera2.CameraDevice r0 = r8.A00
            java.util.Objects.requireNonNull(r0)
            java.lang.String r15 = r0.getId()
            X.88m r1 = r8.A06
            X.9dX r0 = r8.A08
            r16 = 0
            r11 = r24
            r12 = r10
            r13 = r1
            r14 = r0
            X.AnonymousClass9Yv.A00(r11, r12, r13, r14, r15, r16)
            if (r27 == 0) goto L_0x0428
            X.9n4 r0 = r8.A02
            X.Axa r0 = r0.A0K
            r9.A0F = r7
            r9.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r9.A09 = r0
            r0 = 0
            r9.A02 = r0
        L_0x0428:
            android.hardware.camera2.CaptureRequest r0 = r10.build()
            r1 = 0
            r2.B2a(r0, r1, r1)
            r2.Brx(r0, r1, r9)
            A01(r10, r8, r3)
            android.hardware.camera2.CaptureRequest r0 = r10.build()
            r2.Brx(r0, r1, r9)
        L_0x043d:
            return
        L_0x043e:
            java.lang.Integer r1 = r13.A03
            if (r1 == 0) goto L_0x0571
            java.lang.Integer r2 = r13.A02
            if (r2 == 0) goto L_0x0571
            int r1 = r1.intValue()
            int r2 = r2.intValue()
        L_0x044e:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r11, r11, r1, r2)
            X.88m r2 = r8.A06
            X.9Cj r1 = X.C201049ih.A0o
            java.lang.Object r3 = X.C201049ih.A04(r1, r2)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.lang.Long r14 = r0.A00
            X.9QP r0 = r0.A01
            int r1 = r0.A00
            int r1 = r1 + 3
            int r1 = r1 + -1
            int r1 = r1 % 3
            X.9fZ[] r0 = r0.A01
            r2 = r0[r1]
            if (r2 == 0) goto L_0x056b
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0568
            X.9Cl r0 = X.C199589fZ.A0T
            java.lang.Object r0 = r2.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x0485
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x0485:
            if (r14 != 0) goto L_0x048d
            X.9Cl r1 = X.C199589fZ.A0K
            java.lang.Object r14 = r2.A00(r1)
        L_0x048d:
            if (r0 == 0) goto L_0x056b
            int r16 = r0.intValue()
        L_0x0493:
            r1 = r33
            r0 = r16
            X.AnonymousClass94Y.A00(r15, r3, r1, r0)
            X.9Un r1 = new X.9Un
            r0 = r20
            r1.<init>(r15, r3, r11, r0)
            X.9Co r11 = X.C199609fb.A0d
            X.9Cm r3 = X.C198749e8.A05
            r0 = r21
            java.lang.Boolean r0 = r0.A01(r3)
            r1.A01(r11, r0)
            X.9Co r0 = X.C199609fb.A0T
            r1.A01(r0, r14)
            int r3 = r13.A00
            r0 = 35
            if (r3 != r0) goto L_0x0561
            X.9Co r3 = X.C199609fb.A0Y
            r0 = r17
            r1.A01(r3, r0)
        L_0x04c0:
            if (r2 == 0) goto L_0x0511
            X.9Co r3 = X.C199609fb.A0Z
            X.9Cl r0 = X.C199589fZ.A0R
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9Co r3 = X.C199609fb.A0O
            X.9Cl r0 = X.C199589fZ.A0F
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9Co r3 = X.C199609fb.A0V
            X.9Cl r0 = X.C199589fZ.A0M
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9Co r3 = X.C199609fb.A0P
            X.9Cl r0 = X.C199589fZ.A0G
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9Co r3 = X.C199609fb.A0S
            X.9Cl r0 = X.C199589fZ.A0J
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            X.9Co r3 = X.C199609fb.A0U
            X.9Cl r0 = X.C199589fZ.A0L
            java.lang.Object r0 = r2.A00(r0)
            r1.A01(r3, r0)
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0511
            X.9Co r2 = X.C199609fb.A0a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A01(r2, r0)
        L_0x0511:
            X.9mL r0 = r8.A05
            if (r0 == 0) goto L_0x0522
            X.9Co r2 = X.C199609fb.A0e
            int r0 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r2, r0)
        L_0x0522:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            X.9Co r2 = X.C199609fb.A0c
            if (r0 == 0) goto L_0x055f
            int r0 = r0.intValue()
            int r0 = X.C203739og.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x053a:
            r1.A01(r2, r0)
            r15.width()
            r15.height()
            X.C202389lj.A00()
            X.9fb r4 = new X.9fb
            r4.<init>(r1)
            r0 = r18
            java.util.UUID r3 = r0.A03
            r2 = 49
            X.75C r1 = new X.75C
            r0 = r22
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r4, (int) r2)
            r0 = r19
            r0.A05(r1, r3)
            goto L_0x03c1
        L_0x055f:
            r0 = 0
            goto L_0x053a
        L_0x0561:
            X.9Co r0 = X.C199609fb.A0X
            r1.A01(r0, r4)
            goto L_0x04c0
        L_0x0568:
            r0 = 0
            goto L_0x0485
        L_0x056b:
            int r16 = X.C196319Yw.A00(r4)
            goto L_0x0493
        L_0x0571:
            java.util.Objects.requireNonNull(r4)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r7
            int r1 = r4.length
            android.graphics.BitmapFactory.decodeByteArray(r4, r11, r1, r2)
            int r1 = r2.outWidth
            int r2 = r2.outHeight
            goto L_0x044e
        L_0x0585:
            r14 = r15
            java.util.Objects.requireNonNull(r15)
            goto L_0x037a
        L_0x058b:
            java.lang.String r0 = "Trying to create capture settings after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0592:
            r8.A0F = r11
            java.lang.String r0 = "Camera must be opened to capture still picture."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            throw r1
        L_0x059c:
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x05a3:
            java.lang.String r1 = "Preview closed while processing capture request."
            X.Ab6 r0 = new X.Ab6
            r0.<init>(r1)
            throw r0
        L_0x05ab:
            r8.A0F = r3
            java.lang.String r0 = "Preview closed while processing capture request."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199599fa.A02(android.hardware.camera2.CameraManager, android.hardware.camera2.CaptureRequest$Builder, X.61X, X.A2F, X.B43, X.9e8, java.lang.Integer, int, int, int, boolean):void");
    }
}
