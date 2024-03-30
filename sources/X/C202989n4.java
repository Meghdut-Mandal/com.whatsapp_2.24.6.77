package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9n4  reason: invalid class name and case insensitive filesystem */
public class C202989n4 {
    public static final Object A0S = C36441kJ.A11();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public Surface A06;
    public C23076B3g A07;
    public A2F A08;
    public B31 A09;
    public C1692888m A0A;
    public C1692988n A0B;
    public B43 A0C;
    public B4X A0D;
    public C198429dX A0E;
    public boolean A0F;
    public MeteringRectangle[] A0G;
    public MeteringRectangle[] A0H;
    public final C22879Axa A0I = new C203899p8(this, 1);
    public final AnonymousClass9VN A0J;
    public final C22879Axa A0K = new C203899p8(this, 0);
    public final A2R A0L = new A2R(new C191259Cg(this));
    public final AnonymousClass9VB A0M = new AnonymousClass9VB();
    public final AnonymousClass9VB A0N = new AnonymousClass9VB();
    public final C200199gr A0O;
    public final List A0P = AnonymousClass001.A0I();
    public volatile boolean A0Q;
    public volatile boolean A0R;

    public static boolean A03(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (X.AnonymousClass000.A0I(r4.A0A.A08(r1)) == 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.B31 A00(X.C202989n4 r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            X.9VN r1 = r4.A0J
            java.lang.String r0 = "Method createCaptureSession must be called on Optic Thread"
            r1.A01(r0)
            X.88m r0 = r4.A0A
            r3 = 1
            if (r0 == 0) goto L_0x003a
            X.9Cj r1 = X.C201049ih.A0d
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x003a
            X.88m r0 = r4.A0A
            java.lang.Object r0 = r0.A08(r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 != r3) goto L_0x003a
        L_0x0020:
            X.A2R r1 = r4.A0L
            r0 = 1
            r1.A03 = r0
            X.9WY r2 = r1.A01
            r0 = 0
            r2.A02(r0)
            X.9gr r1 = r4.A0O
            X.AYg r0 = new X.AYg
            r0.<init>(r4, r6, r3, r7)
            java.lang.Object r0 = r1.A04(r5, r0)
            X.B31 r0 = (X.B31) r0
            return r0
        L_0x003a:
            r3 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202989n4.A00(X.9n4, java.lang.String, java.util.List, boolean):X.B31");
    }

    public static void A01(Rect rect, CaptureRequest.Builder builder, C198429dX r4, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        if (Build.VERSION.SDK_INT >= 30 && C198429dX.A04(C198429dX.A0J, r4)) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f / 100.0f));
        } else if (C198429dX.A04(C198429dX.A0Z, r4)) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (C198429dX.A04(C198429dX.A0P, r4)) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (C198429dX.A04(C198429dX.A0Q, r4)) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    private boolean A02(int i) {
        CameraCharacteristics cameraCharacteristics = this.A00;
        Objects.requireNonNull(cameraCharacteristics);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (java.lang.Boolean.TRUE.equals(r7.A08(X.C201049ih.A0I)) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r10 != 0) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B31 A04(X.C22879Axa r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            X.9VN r5 = r11.A0J
            java.lang.String r0 = "Cannot start preview."
            r5.A00(r0)
            X.A2F r1 = r11.A08
            java.util.Objects.requireNonNull(r1)
            r0 = 1
            r1.A0F = r0
            r1.A07 = r12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A09 = r0
            r0 = 0
            r1.A02 = r0
            X.B31 r0 = r11.A09
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r2 = 0
            if (r1 < r0) goto L_0x00cc
            X.88m r0 = r11.A0A
            if (r0 == 0) goto L_0x00cc
            X.9Cj r1 = X.C201049ih.A0t
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x00cc
            X.88m r0 = r11.A0A
            java.lang.Object r0 = X.C201049ih.A04(r1, r0)
            long r0 = X.C36431kI.A09(r0)
        L_0x003f:
            X.88m r7 = r11.A0A
            if (r7 == 0) goto L_0x0052
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            X.9Cj r4 = X.C201049ih.A0I
            java.lang.Object r4 = r7.A08(r4)
            boolean r4 = r6.equals(r4)
            r10 = 1
            if (r4 != 0) goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            r6 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x005b
            r8 = 0
            if (r10 == 0) goto L_0x005c
        L_0x005b:
            r8 = 1
        L_0x005c:
            java.lang.String r4 = "Cannot get output surfaces."
            r5.A00(r4)
            X.B3g r9 = r11.A07
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            android.view.Surface r5 = r11.A04
            if (r5 == 0) goto L_0x0073
            X.9JM r4 = new X.9JM
            r4.<init>(r5, r10, r0)
            r7.add(r4)
        L_0x0073:
            r4 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0087
            X.B4X r1 = r11.A0D
            if (r1 == 0) goto L_0x0087
            X.9Ch r0 = X.B4X.A0X
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0087
            r4 = 2
        L_0x0087:
            if (r13 == 0) goto L_0x00a6
            if (r9 == 0) goto L_0x00a6
            boolean r0 = r9.BNP()
            if (r0 == 0) goto L_0x00a6
            android.view.Surface r0 = r9.BI4()
            if (r0 == 0) goto L_0x00a6
            X.B3g r0 = r11.A07
            android.view.Surface r9 = r0.BI4()
            r1 = 0
            X.9JM r0 = new X.9JM
            r0.<init>(r9, r1, r2)
            r7.add(r0)
        L_0x00a6:
            android.view.Surface r2 = r11.A06
            if (r2 != 0) goto L_0x00ae
            android.view.Surface r2 = r11.A03
            if (r2 == 0) goto L_0x00b7
        L_0x00ae:
            r1 = 0
            X.9JM r0 = new X.9JM
            r0.<init>(r2, r1, r4)
            r7.add(r0)
        L_0x00b7:
            java.lang.String r0 = "start_preview_on_camera_handler_thread"
            X.B31 r0 = A00(r11, r0, r7, r8)
            r11.A09 = r0
            r11.A09(r13)
            java.lang.String r0 = "Preview session was closed while starting preview"
            r11.A0A(r14, r0)
            r11.A0Q = r6
            X.B31 r0 = r11.A09
            return r0
        L_0x00cc:
            r0 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202989n4.A04(X.Axa, boolean, boolean):X.B31");
    }

    public void A05() {
        this.A0J.A00("Cannot refresh camera preview.");
        try {
            A0A(false, (String) null);
        } catch (Exception unused) {
        }
    }

    public void A06() {
        C191239Ce r1;
        this.A0J.A00("Cannot update frame metadata collection.");
        C1692888m r12 = this.A0A;
        if (r12 != null && this.A07 != null && this.A08 != null) {
            boolean A072 = C201049ih.A07(C201049ih.A0T, r12);
            A2F a2f = this.A08;
            if (A072) {
                r1 = this.A07.BC5();
                if (a2f.A05 == null) {
                    a2f.A05 = new AnonymousClass9QP();
                }
            } else {
                r1 = null;
            }
            a2f.A0I = A072;
            a2f.A03 = r1;
        }
    }

    public void A07(Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f) {
        CaptureRequest.Builder builder;
        C198429dX r2;
        AnonymousClass9VN r1 = this.A0J;
        r1.A01("Can only apply zoom on the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && (builder = this.A02) != null && (r2 = this.A0E) != null) {
            A01(rect, builder, r2, meteringRectangleArr, meteringRectangleArr2, f);
            if (this.A0Q) {
                A05();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d9, code lost:
        if (X.C198429dX.A04(X.C198429dX.A0M, r1) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.graphics.SurfaceTexture r10, X.C191209Cb r11) {
        /*
            r9 = this;
            X.B43 r0 = r9.A0C
            java.util.Objects.requireNonNull(r0)
            android.view.Surface r3 = new android.view.Surface
            r3.<init>(r10)
            X.B43 r0 = r9.A0C
            java.util.Objects.requireNonNull(r0)
            r2 = 1
            X.9VN r1 = r9.A0J
            java.lang.String r0 = "Cannot configure camera preview."
            r1.A00(r0)
            r9.A04 = r3
            r9.A0F = r2
            android.hardware.camera2.CameraDevice r1 = r9.A01
            java.util.Objects.requireNonNull(r1)
            X.B43 r0 = r9.A0C
            java.util.Objects.requireNonNull(r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r1.createCaptureRequest(r2)
            r9.A02 = r1
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r9.A0H = r0
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            java.lang.Object r0 = r1.get(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = (android.hardware.camera2.params.MeteringRectangle[]) r0
            r9.A0G = r0
            r8 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r5 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.set(r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r1.set(r0, r4)
            X.B4X r1 = r9.A0D
            java.util.Objects.requireNonNull(r1)
            X.9Ch r0 = X.B4X.A04
            boolean r0 = X.C165567td.A1a(r0, r1)
            r2 = 0
            if (r0 != 0) goto L_0x006e
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            X.C165577te.A0v(r1, r0, r2)
        L_0x006e:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.set(r0, r3)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.set(r0, r2)
            X.88n r0 = r9.A0B
            if (r0 == 0) goto L_0x00a1
            r7 = 4
            boolean r0 = r9.A02(r7)
            if (r0 == 0) goto L_0x01fb
            X.88n r1 = r9.A0B
            X.9Cj r0 = X.C201049ih.A0C
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            X.C1692988n.A00(r1, r0, r7)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r7)
        L_0x00a1:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x0235
            X.88n r0 = r9.A0B
            if (r0 == 0) goto L_0x0235
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x00c7
            X.9Ci r0 = X.C198429dX.A0L
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x00c7
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            r1.set(r0, r4)
            X.88n r7 = r9.A0B
            X.9Cj r1 = X.C201049ih.A0W
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C1692988n.A00(r7, r1, r0)
        L_0x00c7:
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x00e1
            X.9Ci r0 = X.C198429dX.A0V
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x00e1
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r1.set(r0, r2)
            X.88n r1 = r9.A0B
            X.9Cj r0 = X.C201049ih.A0Y
            X.C1692988n.A00(r1, r0, r3)
        L_0x00e1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 2
            r3 = 33
            if (r0 < r3) goto L_0x01bf
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x01bf
            X.9Ci r0 = X.C198429dX.A0M
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x01bf
            X.B4X r1 = r9.A0D
            if (r1 == 0) goto L_0x01bf
            X.9Ch r0 = X.B4X.A0E
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x01bf
        L_0x0100:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
        L_0x0108:
            r1.set(r0, r4)
            X.88n r3 = r9.A0B
            X.9Cj r1 = X.C201049ih.A0X
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C1692988n.A00(r3, r1, r0)
        L_0x0116:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x022e
            X.9dX r0 = r9.A0E
            if (r0 == 0) goto L_0x022e
            X.88n r0 = r9.A0B
            if (r0 == 0) goto L_0x022e
            X.B4X r1 = r9.A0D
            java.util.Objects.requireNonNull(r1)
            X.9Ch r0 = X.B4X.A0H
            java.lang.Object r3 = r1.B84(r0)
            X.9Ot r3 = (X.C194239Ot) r3
            X.9dX r1 = r9.A0E
            X.9Ci r0 = X.C198429dX.A0y
            java.util.List r0 = X.C198429dX.A03(r0, r1)
            int[] r3 = r3.A00(r0)
            boolean r0 = A03(r0, r3)
            if (r0 == 0) goto L_0x015b
            X.88n r1 = r9.A0B
            X.9Cj r0 = X.C201049ih.A0m
            X.C1692988n.A00(r1, r0, r3)
            X.9dX r1 = r9.A0E
            X.9Ci r0 = X.C198429dX.A0g
            boolean r0 = X.C198429dX.A04(r0, r1)
            android.util.Range r3 = X.C165607th.A0J(r3, r0)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.set(r0, r3)
        L_0x015b:
            android.hardware.camera2.CaptureRequest$Builder r0 = r9.A02
            if (r0 == 0) goto L_0x0227
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x0227
            X.88m r0 = r9.A0A
            if (r0 == 0) goto L_0x0227
            X.9Ci r0 = X.C198429dX.A0B
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0176
            X.88m r1 = r9.A0A
            X.9Cj r0 = X.C201049ih.A0k
            r1.A08(r0)
        L_0x0176:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r1.set(r0, r2)
            X.9dX r1 = r9.A0E
            java.util.Objects.requireNonNull(r1)
            X.9Ci r0 = X.C198429dX.A0K
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0191
            android.hardware.camera2.CaptureRequest$Builder r2 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.NOISE_REDUCTION_MODE
            X.C165577te.A0v(r2, r1, r7)
        L_0x0191:
            X.88m r2 = r9.A0A
            if (r2 == 0) goto L_0x01ad
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            X.9Cj r0 = X.C201049ih.A0I
            java.lang.Object r0 = r2.A08(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01ad
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            java.util.Objects.requireNonNull(r1)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r1.set(r0, r6)
        L_0x01ad:
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.view.Surface r0 = r9.A04
            r1.addTarget(r0)
            X.A2F r0 = r9.A08
            java.util.Objects.requireNonNull(r0)
            r0.A00 = r11
            r9.A06()
            return
        L_0x01bf:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x01dd
            X.B4X r1 = r9.A0D
            if (r1 == 0) goto L_0x01dd
            X.9Ch r0 = X.B4X.A0D
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x01dd
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x0116
            X.9Ci r0 = X.C198429dX.A0M
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0116
            goto L_0x0100
        L_0x01dd:
            X.9dX r1 = r9.A0E
            if (r1 == 0) goto L_0x0116
            X.9Ci r0 = X.C198429dX.A0N
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0116
            X.B4X r1 = r9.A0D
            if (r1 == 0) goto L_0x0116
            X.9Ch r0 = X.B4X.A0C
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0116
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x0108
        L_0x01fb:
            boolean r0 = r9.A02(r8)
            if (r0 == 0) goto L_0x0211
            X.88n r1 = r9.A0B
            X.9Cj r0 = X.C201049ih.A0C
            X.C1692988n.A00(r1, r0, r6)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r6)
            goto L_0x00a1
        L_0x0211:
            boolean r0 = r9.A02(r5)
            if (r0 == 0) goto L_0x00a1
            X.88n r1 = r9.A0B
            X.9Cj r0 = X.C201049ih.A0C
            X.C1692988n.A00(r1, r0, r4)
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.A02
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r1.set(r0, r4)
            goto L_0x00a1
        L_0x0227:
            java.lang.String r0 = "Cannot initialize custom capture settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x022e:
            java.lang.String r0 = "Cannot initialize fps settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0235:
            java.lang.String r0 = "Cannot initialize stabilization settings, preview closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202989n4.A08(android.graphics.SurfaceTexture, X.9Cb):void");
    }

    public void A09(boolean z) {
        CaptureRequest.Builder builder;
        this.A0J.A00("Cannot update preview builder for CPU frames.");
        C23076B3g b3g = this.A07;
        if ((b3g == null || b3g.BNP()) && (builder = this.A02) != null && b3g != null) {
            Surface BI4 = b3g.BI4();
            Objects.requireNonNull(BI4);
            if (z) {
                builder.addTarget(BI4);
                this.A0R = true;
                return;
            }
            builder.removeTarget(BI4);
            this.A0R = false;
        }
    }

    public void A0A(boolean z, String str) {
        CaptureRequest.Builder builder;
        this.A0J.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0S) {
            B31 b31 = this.A09;
            if (b31 != null && (builder = this.A02) != null) {
                b31.Brx(builder.build(), (Handler) null, this.A08);
            } else if (z) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new C21829Ab6(str);
            }
        }
    }

    public void A0B(boolean z, boolean z2) {
        C22879Axa axa;
        AnonymousClass9VN r1 = this.A0J;
        r1.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                A2F a2f = this.A08;
                if (!a2f.A0H || a2f.A0F != 1) {
                    if (z2) {
                        axa = this.A0K;
                    } else {
                        axa = this.A0I;
                    }
                    this.A09 = A04(axa, z, false);
                    return;
                }
                this.A0P.add(new C192299Gl(z, z2));
            }
        }
    }

    public C202989n4(C200199gr r3) {
        this.A0O = r3;
        this.A0J = new AnonymousClass9VN(r3);
    }
}
