package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.util.TypedValue;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class A28 implements C23082B3p {
    public static final Map A0q;
    public static volatile A28 A0r;
    public UUID A00;
    public int A01;
    public int A02;
    public int A03;
    public Matrix A04;
    public Matrix A05;
    public Rect A06;
    public CaptureRequest.Builder A07;
    public C23076B3g A08;
    public AnonymousClass9U6 A09;
    public C202639mL A0A;
    public C1692888m A0B;
    public C1692988n A0C;
    public B43 A0D;
    public B4X A0E;
    public C198429dX A0F;
    public FutureTask A0G;
    public boolean A0H;
    public boolean A0I;
    public AnonymousClass9W3 A0J;
    public AnonymousClass9W3 A0K;
    public boolean A0L;
    public final CameraManager A0M;
    public final C1692388h A0N = new C1692388h();
    public final C202949mz A0O;
    public final AnonymousClass9YE A0P;
    public final C199599fa A0Q;
    public final C202989n4 A0R;
    public final C195169St A0S;
    public final AnonymousClass9VB A0T = new AnonymousClass9VB();
    public final AnonymousClass9VB A0U = new AnonymousClass9VB();
    public final AnonymousClass9VB A0V = new AnonymousClass9VB();
    public final C201439jb A0W;
    public final C200199gr A0X;
    public final Object A0Y = C36441kJ.A11();
    public final Callable A0Z = new B8U(this, 10);
    public final int A0a;
    public final Context A0b;
    public final C159927kB A0c = new C23226BAi(this, 1);
    public final AnonymousClass9CZ A0d = new AnonymousClass9CZ(this);
    public final C191199Ca A0e = new C191199Ca(this);
    public final C191209Cb A0f = new C191209Cb(this);
    public final C191219Cc A0g = new C191219Cc(this);
    public final C191229Cd A0h = new C191229Cd(this);
    public volatile int A0i;
    public volatile CameraDevice A0j;
    public volatile C23072B3b A0k;
    public volatile A2F A0l;
    public volatile boolean A0m;
    public volatile boolean A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;

    public boolean B5Z(AnonymousClass9T8 r6) {
        C202389lj.A00();
        C201439jb r2 = this.A0W;
        UUID uuid = r2.A03;
        C202989n4 r1 = this.A0R;
        r1.A0M.A00();
        r1.A0N.A00();
        C23076B3g b3g = this.A08;
        this.A08 = null;
        if (b3g != null) {
            b3g.B2s();
        }
        this.A0U.A00();
        this.A0V.A00();
        C202639mL r0 = this.A0A;
        if (r0 != null) {
            r0.A0F.A00();
        }
        this.A0m = false;
        if (this.A0H) {
            r2.A03(this.A00);
            this.A00 = null;
        }
        C200199gr r22 = this.A0X;
        r22.A00(r6, "disconnect", new B8X(uuid, this, 10));
        r22.A07("disconnect_guard", C21735AYn.A00);
        return true;
    }

    public boolean BJn(int i) {
        try {
            return this.A0O.A06(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public void BKd(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        Rect rect = this.A06;
        if (rect == null) {
            rect = (Rect) C196509Zy.A00(this.A0M, this.A0O.A06(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A082 = A08();
        if (A082 == 90 || A082 == 270) {
            Objects.requireNonNull(rect);
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix A0B2 = C90524aI.A0B();
        A0B2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A01 == 1) {
            f = -1.0f;
        }
        A0B2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A082 / 90);
        Matrix A0B3 = C90524aI.A0B();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix A0B4 = C90524aI.A0B();
            float width = rectF2.width() / 2.0f;
            A0B4.setRotate(-90.0f, width, width);
            A0B4.mapRect(rectF2);
            A0B3.postConcat(A0B4);
        }
        A0B2.postConcat(A0B3);
        this.A05 = A0B2;
    }

    public boolean BNQ() {
        int i;
        AnonymousClass9JL[] r0;
        try {
            C202949mz r2 = this.A0O;
            if (C202949mz.A04(r2)) {
                i = C202949mz.A06;
            } else {
                if (r2.A05 != null) {
                    r0 = r2.A05;
                } else {
                    r2.A01.A06("Number of cameras must be loaded on background thread.");
                    C202949mz.A02(r2);
                    r0 = r2.A05;
                    Objects.requireNonNull(r0);
                }
                i = r0.length;
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void Bsq(AnonymousClass9T8 r5, int i) {
        this.A0X.A00((AnonymousClass9T8) null, "set_zoom_level", new B8Y(this, i, 4));
    }

    public static void A00(A28 a28) {
        a28.A0X.A06("Method closeCamera() must run on the Optic Background Thread.");
        C195169St r4 = a28.A0S;
        if (r4.A0D && (!a28.A0p || r4.A0C)) {
            r4.A00();
        }
        A06(a28, false);
        AnonymousClass9YE r2 = a28.A0P;
        r2.A0A.A02(false, "Failed to release PreviewController.");
        r2.A03 = null;
        r2.A01 = null;
        r2.A00 = null;
        r2.A07 = null;
        r2.A06 = null;
        r2.A05 = null;
        r2.A04 = null;
        r2.A02 = null;
        C199599fa r22 = a28.A0Q;
        r22.A0B.A02(false, "Failed to release PhotoCaptureController.");
        r22.A00 = null;
        r22.A08 = null;
        r22.A06 = null;
        r22.A03 = null;
        r22.A05 = null;
        r22.A02 = null;
        r22.A01 = null;
        r22.A07 = null;
        B32 b32 = r22.A09;
        if (b32 != null) {
            b32.release();
            r22.A09 = null;
        }
        A2O a2o = r22.A04;
        if (a2o != null) {
            a2o.release();
            r22.A04 = null;
        }
        r4.A09.A02(false, "Failed to release VideoCaptureController.");
        r4.A0B = null;
        r4.A05 = null;
        r4.A03 = null;
        r4.A04 = null;
        r4.A02 = null;
        r4.A01 = null;
        if (a28.A0j != null) {
            C1692388h r23 = a28.A0N;
            r23.A00 = a28.A0j.getId();
            r23.A02(0);
            a28.A0j.close();
            r23.A00();
        }
        a28.A0R.A0P.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0133, code lost:
        if (X.C165567td.A1a(X.B4X.A0R, r4.A07) == false) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.A28 r14) {
        /*
            X.9mL r6 = r14.A0A
            if (r6 == 0) goto L_0x0094
            X.9dX r4 = r14.A0F
            java.util.Objects.requireNonNull(r4)
            X.88m r1 = r14.A0B
            X.88n r0 = r14.A0C
            android.graphics.Rect r3 = r14.A06
            java.util.Objects.requireNonNull(r3)
            r6.A08 = r4
            r6.A06 = r1
            r6.A07 = r0
            r6.A05 = r3
            int r5 = r3.width()
            int r2 = r3.height()
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r1, r5, r2)
            r6.A04 = r0
            X.9Ci r0 = X.C198429dX.A0J
            boolean r0 = X.C198429dX.A04(r0, r4)
            r6.A0B = r0
            X.9Ci r0 = X.C198429dX.A0f
            int r0 = X.C198429dX.A01(r0, r4)
            r6.A03 = r0
            X.9Ci r0 = X.C198429dX.A19
            java.util.List r0 = X.C198429dX.A03(r0, r4)
            r6.A09 = r0
            X.9Ci r0 = X.C198429dX.A1A
            java.util.List r0 = X.C198429dX.A03(r0, r4)
            r6.A0A = r0
            X.9Ci r0 = X.C198429dX.A0d
            int r0 = X.C198429dX.A01(r0, r4)
            r6.A02 = r0
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = r3.width()
            int r0 = r3.height()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r5
            float r2 = r2 / r0
            r6.A00 = r2
            r3 = 0
            int r0 = r6.A03
            float r2 = (float) r0
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = X.C202639mL.A00(r3, r2, r1, r0, r5)
            r6.A01 = r0
            X.88n r4 = r6.A07
            if (r4 == 0) goto L_0x0094
            int r0 = r6.A05()
            float r3 = (float) r0
            int r0 = r6.A03
            float r2 = (float) r0
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = X.C202639mL.A00(r3, r2, r1, r0, r5)
            X.9Cj r1 = X.C201049ih.A0s
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.C1692988n.A00(r4, r1, r0)
        L_0x0094:
            X.9YE r13 = r14.A0P
            X.9CY r7 = new X.9CY
            r7.<init>(r14)
            android.hardware.camera2.CameraManager r6 = r14.A0M
            android.hardware.camera2.CameraDevice r5 = r14.A0j
            X.9dX r4 = r14.A0F
            X.88m r3 = r14.A0B
            X.9mL r1 = r14.A0A
            X.9n4 r12 = r14.A0R
            X.9VN r2 = r13.A0A
            java.lang.String r0 = "Can only prepare the FocusController on the Optic thread."
            r2.A01(r0)
            r13.A03 = r7
            r13.A01 = r6
            r13.A00 = r5
            r13.A07 = r4
            r13.A06 = r3
            r13.A05 = r1
            r13.A04 = r12
            r0 = 0
            r13.A0E = r0
            r1 = 1
            r13.A0D = r1
            java.lang.String r0 = "Failed to prepare FocusController."
            r2.A02(r1, r0)
            X.9St r11 = r14.A0S
            android.hardware.camera2.CameraDevice r4 = r14.A0j
            X.9dX r3 = r14.A0F
            X.88m r2 = r14.A0B
            X.B4X r0 = r14.A0E
            X.9VN r1 = r11.A09
            java.lang.String r10 = "Can prepare only on the Optic thread"
            r1.A01(r10)
            r11.A0B = r4
            r11.A05 = r3
            r11.A03 = r2
            r11.A04 = r0
            r11.A02 = r12
            r11.A01 = r13
            r5 = 1
            java.lang.String r0 = "Failed to prepare VideoCaptureController."
            r1.A02(r5, r0)
            X.9fa r4 = r14.A0Q
            android.hardware.camera2.CameraDevice r9 = r14.A0j
            X.9dX r8 = r14.A0F
            X.88m r7 = r14.A0B
            int r3 = r14.A03
            X.B3b r2 = r14.A0k
            X.9mL r0 = r14.A0A
            X.B4X r1 = r14.A0E
            X.9VN r6 = r4.A0B
            r6.A01(r10)
            r4.A00 = r9
            r4.A08 = r8
            r4.A06 = r7
            r4.A03 = r11
            r4.A05 = r0
            r4.A02 = r12
            r4.A01 = r13
            r4.A07 = r1
            if (r2 == 0) goto L_0x011a
            X.B32 r0 = r2.BFt()
            r4.A09 = r0
            r0 = 0
            r4.A04 = r0
        L_0x011a:
            r0 = 0
            r4.A0A = r0
            if (r1 == 0) goto L_0x0173
            java.util.Objects.requireNonNull(r8)
            X.9Ci r0 = X.C198429dX.A0X
            boolean r0 = X.C198429dX.A04(r0, r8)
            if (r0 == 0) goto L_0x0135
            X.B4X r1 = r4.A07
            X.9Ch r0 = X.B4X.A0R
            boolean r0 = X.C165567td.A1a(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            r4.A0A = r2
            X.B4X r1 = r4.A07
            X.9Ch r0 = X.B4X.A03
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 != 0) goto L_0x0144
            if (r2 == 0) goto L_0x0173
        L_0x0144:
            r0 = 0
            r4.A09 = r0
        L_0x0147:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x016d
            X.A2O r0 = r4.A04
            if (r0 != 0) goto L_0x0156
            X.A2O r0 = new X.A2O
            r0.<init>()
            r4.A04 = r0
        L_0x0156:
            X.88m r1 = r4.A06
            if (r1 == 0) goto L_0x016d
            X.9Cj r0 = X.C201049ih.A0y
            java.lang.Object r0 = r1.A08(r0)
            X.9W3 r0 = (X.AnonymousClass9W3) r0
            if (r0 == 0) goto L_0x016d
            X.A2O r2 = r4.A04
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BKK(r1, r0, r3)
        L_0x016d:
            java.lang.String r0 = "Failed to prepare PhotoCaptureController."
            r6.A02(r5, r0)
            return
        L_0x0173:
            X.B32 r0 = r4.A09
            if (r0 != 0) goto L_0x0196
            r2 = 256(0x100, float:3.59E-43)
            X.88m r0 = r4.A06
            if (r0 == 0) goto L_0x018f
            X.9Cj r1 = X.C201049ih.A0h
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x018f
            X.88m r0 = r4.A06
            java.lang.Object r0 = r0.A08(r1)
            int r2 = X.AnonymousClass000.A0I(r0)
        L_0x018f:
            X.A2P r0 = new X.A2P
            r0.<init>(r2)
            r4.A09 = r0
        L_0x0196:
            int r1 = r0.BCY()
            r0 = 32
            if (r1 == r0) goto L_0x01c4
            r0 = 35
            if (r1 == r0) goto L_0x01db
            r0 = 37
            if (r1 == r0) goto L_0x01bd
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x01b6
            r0 = 4101(0x1005, float:5.747E-42)
            if (r1 == r0) goto L_0x01b6
        L_0x01ae:
            java.lang.String r1 = "Invalid picture size"
            X.Ab6 r0 = new X.Ab6
            r0.<init>(r1)
            throw r0
        L_0x01b6:
            X.88m r1 = r4.A06
            if (r1 == 0) goto L_0x01ae
            X.9Cj r0 = X.C201049ih.A0j
            goto L_0x01e1
        L_0x01bd:
            X.9dX r1 = r4.A08
            if (r1 == 0) goto L_0x01ae
            X.9Ci r0 = X.C198429dX.A11
            goto L_0x01ca
        L_0x01c4:
            X.9dX r1 = r4.A08
            if (r1 == 0) goto L_0x01ae
            X.9Ci r0 = X.C198429dX.A12
        L_0x01ca:
            java.util.List r1 = X.C198429dX.A03(r0, r1)
            if (r1 == 0) goto L_0x01ae
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01ae
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            goto L_0x01e5
        L_0x01db:
            X.88m r1 = r4.A06
            if (r1 == 0) goto L_0x01ae
            X.9Cj r0 = X.C201049ih.A0y
        L_0x01e1:
            java.lang.Object r0 = r1.A08(r0)
        L_0x01e5:
            X.9W3 r0 = (X.AnonymousClass9W3) r0
            if (r0 == 0) goto L_0x01ae
            X.B32 r2 = r4.A09
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BKK(r1, r0, r3)
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.A01(X.A28):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r6 == 180) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (r6 == 180) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        r1 = r1 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if (r6 == 90) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r2 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r2 = (float) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r6 == 270) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r2 = r2 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.A28 r13) {
        /*
            X.9W3 r1 = r13.A0J
            if (r1 == 0) goto L_0x00c5
            X.9W3 r0 = r13.A0K
            if (r0 == 0) goto L_0x00c5
            android.graphics.Rect r0 = r13.A06
            if (r0 == 0) goto L_0x00c5
            int r2 = r1.A02
            int r1 = r1.A01
            int r10 = r0.width()
            android.graphics.Rect r0 = r13.A06
            int r3 = r0.height()
            int r6 = r13.A08()
            X.9W3 r0 = r13.A0J
            X.9W3 r11 = r13.A0K
            int r9 = r0.A02
            int r7 = r0.A01
            int r8 = r9 - r7
            int r5 = r11.A02
            int r4 = r11.A01
            int r0 = r5 - r4
            int r8 = r8 * r0
            if (r8 >= 0) goto L_0x0036
            X.9W3 r11 = new X.9W3
            r11.<init>(r4, r5)
        L_0x0036:
            float r8 = (float) r9
            int r0 = r11.A01
            float r5 = (float) r0
            int r0 = r11.A02
            float r4 = (float) r0
            float r0 = r5 / r4
            float r8 = r8 * r0
            int r0 = (int) r8
            if (r0 > r7) goto L_0x00bb
            X.9W3 r4 = new X.9W3
            r4.<init>(r9, r0)
        L_0x0048:
            int r0 = r4.A02
            int r0 = r2 - r0
            int r8 = r0 / 2
            int r0 = r4.A01
            int r0 = r1 - r0
            int r7 = r0 / 2
            int r4 = r13.A01
            r0 = 1
            r9 = 180(0xb4, float:2.52E-43)
            r11 = 270(0x10e, float:3.78E-43)
            r12 = 90
            if (r4 != r0) goto L_0x0088
            if (r6 == r12) goto L_0x00ab
            if (r6 == r11) goto L_0x00ab
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            int r0 = -r1
            float r4 = (float) r0
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x006e
            int r2 = -r8
        L_0x006e:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0099
        L_0x0071:
            int r1 = -r7
        L_0x0072:
            float r2 = (float) r1
        L_0x0073:
            android.graphics.Matrix r1 = X.C90524aI.A0B()
            r13.A04 = r1
            float r0 = (float) r6
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r13.A04
            r0.postScale(r5, r4)
            android.graphics.Matrix r0 = r13.A04
            r0.postTranslate(r3, r2)
            return
        L_0x0088:
            if (r6 == r12) goto L_0x009b
            if (r6 == r11) goto L_0x009b
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            float r4 = (float) r1
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x0096
            int r2 = -r8
        L_0x0096:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0071
        L_0x0099:
            int r1 = r1 - r7
            goto L_0x0072
        L_0x009b:
            float r5 = (float) r1
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r12) goto L_0x00a5
            int r1 = -r7
        L_0x00a5:
            float r3 = (float) r1
            if (r6 != r12) goto L_0x00b9
        L_0x00a8:
            int r2 = -r8
        L_0x00a9:
            float r2 = (float) r2
            goto L_0x0073
        L_0x00ab:
            int r0 = -r1
            float r5 = (float) r0
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r11) goto L_0x00b6
            int r1 = -r7
        L_0x00b6:
            float r3 = (float) r1
            if (r6 != r11) goto L_0x00a8
        L_0x00b9:
            int r2 = r2 - r8
            goto L_0x00a9
        L_0x00bb:
            float r0 = (float) r7
            float r4 = r4 / r5
            float r0 = r0 * r4
            int r0 = (int) r0
            X.9W3 r4 = new X.9W3
            r4.<init>(r0, r7)
            goto L_0x0048
        L_0x00c5:
            java.lang.String r0 = "Method updateDriverToPreviewMatrix() invoked without proper initialisation."
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.A02(X.A28):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0306, code lost:
        if (r9 >= r4) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        if (A07(r6) != false) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.A28 r23, java.lang.Float r24, java.lang.String r25) {
        /*
            r6 = r23
            X.9gr r0 = r6.A0X
            r22 = r0
            java.lang.String r1 = "Method configureAndStartCameraPreview() must run on the Optic Background Thread."
            r0.A06(r1)
            android.hardware.camera2.CameraDevice r0 = r6.A0j
            if (r0 == 0) goto L_0x037d
            X.9dX r0 = r6.A0F
            if (r0 == 0) goto L_0x037d
            X.9U6 r0 = r6.A09
            if (r0 == 0) goto L_0x037d
            X.B3b r0 = r6.A0k
            if (r0 == 0) goto L_0x0375
            X.B43 r0 = r6.A0D
            if (r0 == 0) goto L_0x036d
            X.B4X r0 = r6.A0E
            if (r0 == 0) goto L_0x0366
            X.88m r0 = r6.A0B
            java.lang.String r16 = "Camera params need to be configured before invoking configureAndStartCameraPreview()"
            if (r0 == 0) goto L_0x0361
            X.88n r0 = r6.A0C
            if (r0 == 0) goto L_0x0361
            X.9n4 r5 = r6.A0R
            boolean r0 = r5.A0Q
            r4 = 0
            if (r0 == 0) goto L_0x0037
            A06(r6, r4)
        L_0x0037:
            X.B3b r1 = r6.A0k
            java.util.List r0 = java.util.Collections.emptyList()
            X.B3g r14 = r6.A08
            if (r14 == 0) goto L_0x0048
            java.util.List r0 = r14.BDa()
            r14.B2s()
        L_0x0048:
            if (r1 == 0) goto L_0x004e
            X.B3g r14 = r1.BGB()
        L_0x004e:
            if (r14 != 0) goto L_0x0055
            X.A2B r14 = new X.A2B
            r14.<init>()
        L_0x0055:
            r14.B2s()
            r14.B0S(r0)
            r6.A08 = r14
            android.hardware.camera2.CameraDevice r13 = r6.A0j
            X.88m r12 = r6.A0B
            X.88n r11 = r6.A0C
            X.B4X r10 = r6.A0E
            X.9dX r9 = r6.A0F
            android.hardware.camera2.CameraManager r0 = r6.A0M
            r15 = r25
            android.hardware.camera2.CameraCharacteristics r8 = X.C196509Zy.A00(r0, r15)
            X.B43 r7 = r6.A0D
            X.9fa r2 = r6.A0Q
            X.9VN r1 = r2.A0B
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r1.A00(r0)
            X.B32 r0 = r2.A09
            if (r0 == 0) goto L_0x034a
            android.view.Surface r3 = r0.BI4()
        L_0x0082:
            java.lang.String r0 = "Cannot get raw picture ImageReader, not prepared"
            r1.A00(r0)
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r1.A00(r0)
            X.A2O r0 = r2.A04
            if (r0 == 0) goto L_0x0347
            android.view.Surface r2 = r0.BI4()
        L_0x0094:
            X.9VN r1 = r5.A0J
            java.lang.String r0 = "Can only prepare on the Optic thread"
            r1.A01(r0)
            r5.A01 = r13
            r5.A0A = r12
            r5.A0B = r11
            r5.A0D = r10
            r5.A0E = r9
            r5.A00 = r8
            r5.A0C = r7
            r5.A07 = r14
            r5.A03 = r3
            r5.A06 = r2
            X.A2F r0 = new X.A2F
            r0.<init>()
            r5.A08 = r0
            r2 = 1
            java.lang.String r0 = "Failed to prepare PreviewController."
            r1.A02(r2, r0)
            X.9mz r0 = r6.A0O
            r0.A05(r15)
            int r8 = r6.A01
            X.9U6 r0 = r6.A09
            int r3 = r0.A01
            int r2 = r0.A00
            X.9W3 r0 = new X.9W3
            r0.<init>(r3, r2)
            r6.A0K = r0
            X.9W3 r9 = r6.A0J
            if (r9 != 0) goto L_0x00d9
            X.9W3 r9 = new X.9W3
            r9.<init>(r4, r4)
        L_0x00d9:
            int r7 = r6.A03
            X.88m r3 = r6.A0B
            X.B4X r2 = r6.A0E
            X.9dX r0 = r6.A0F
            r17 = r14
            r18 = r2
            r19 = r0
            r20 = r3
            r21 = r9
            r23 = r7
            r17.BKP(r18, r19, r20, r21, r22, r23)
            A02(r6)
            X.9W3 r3 = r6.A0J
            if (r3 == 0) goto L_0x035c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "startCameraPreview "
            r2.append(r0)
            int r0 = r3.A02
            X.C90494aF.A1L(r2, r0)
            int r0 = r3.A01
            java.lang.String r0 = X.C36381kD.A10(r2, r0)
            android.os.Trace.beginSection(r0)
            X.B4X r2 = r6.A0E
            X.9Ch r0 = X.B4X.A0K
            boolean r0 = X.C165567td.A1a(r0, r2)
            r3 = 1
            if (r0 != 0) goto L_0x0120
            boolean r0 = A07(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0121
        L_0x0120:
            r2 = 1
        L_0x0121:
            X.88m r7 = r6.A0B
            X.9Cj r0 = X.C201049ih.A0I
            boolean r0 = X.C201049ih.A07(r0, r7)
            boolean r9 = X.AnonymousClass000.A1P(r0)
            X.B3b r10 = r6.A0k
            X.9W3 r0 = r6.A0J
            int r11 = r0.A02
            int r12 = r0.A01
            X.88m r7 = r6.A0B
            X.9Cj r0 = X.C201049ih.A0l
            int r13 = X.C201049ih.A02(r0, r7)
            int r14 = r6.A03
            int r15 = r6.A0i
            int r7 = r6.A02
            if (r7 == r3) goto L_0x0343
            r0 = 2
            if (r7 == r0) goto L_0x033f
            r0 = 3
            r16 = 270(0x10e, float:3.78E-43)
            if (r7 == r0) goto L_0x014f
            r16 = 0
        L_0x014f:
            r18 = 0
            if (r9 == 0) goto L_0x0155
            r18 = 7
        L_0x0155:
            r17 = r8
            android.graphics.SurfaceTexture r8 = r10.BI5(r11, r12, r13, r14, r15, r16, r17, r18)
            r6.A0o = r3
            X.9YE r7 = r6.A0P
            r7.A0C = r4
            if (r8 == 0) goto L_0x0354
            X.9W3 r0 = r6.A0J
            int r4 = r0.A02
            int r0 = r0.A01
            r8.setDefaultBufferSize(r4, r0)
            X.9Cb r0 = r6.A0f
            r5.A08(r8, r0)
            X.9mL r8 = r6.A0A
            if (r8 == 0) goto L_0x0200
            java.lang.String r0 = "Cannot get default AF regions."
            r1.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r5.A0H
            java.lang.String r0 = "Cannot get default AE regions."
            r1.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = r5.A0G
            r8.A0D = r4
            r8.A0C = r0
            if (r24 == 0) goto L_0x0200
            X.9mL r8 = r6.A0A
            float r9 = r24.floatValue()
            r13 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r13
            java.util.List r12 = r8.A0A
            if (r12 == 0) goto L_0x033c
            java.util.List r0 = r8.A09
            if (r0 == 0) goto L_0x033c
            int r11 = X.C36431kI.A07(r12)
            r10 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            float r0 = X.C165577te.A01(r12, r10)
            float r0 = r0 / r13
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x030b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r4, r4)
        L_0x01b1:
            int r4 = X.C36381kD.A04(r10)
            int r12 = X.C36381kD.A03(r10)
            java.util.List r0 = r8.A0A
            float r11 = X.C165577te.A01(r0, r12)
            float r11 = r11 / r13
            java.util.List r0 = r8.A0A
            float r10 = X.C165577te.A01(r0, r4)
            float r10 = r10 / r13
            float r4 = (float) r4
            float r0 = (float) r12
            float r11 = X.C202639mL.A00(r9, r10, r11, r4, r0)
            java.util.List r0 = r8.A09
            int r0 = X.C36431kI.A07(r0)
            int r0 = -r0
            float r10 = (float) r0
            java.util.List r0 = r8.A0A
            int r0 = X.C36431kI.A07(r0)
            float r9 = (float) r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = X.C202639mL.A00(r11, r10, r9, r4, r0)
        L_0x01e4:
            X.9dX r4 = r8.A08
            X.88m r0 = r8.A06
            X.88n r13 = r8.A07
            android.graphics.Rect r11 = r8.A05
            android.graphics.Rect r10 = r8.A04
            java.util.List r14 = r8.A0A
            if (r0 == 0) goto L_0x0200
            if (r13 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r14 == 0) goto L_0x0200
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x027e
            java.util.List r0 = r8.A09
            if (r0 != 0) goto L_0x027e
        L_0x0200:
            java.lang.String r0 = "Cannot get preview request builder."
            r1.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r5.A02
            if (r0 == 0) goto L_0x034d
            r6.A07 = r0
            java.lang.String r0 = "Cannot get camera operations callback."
            r1.A00(r0)
            X.A2F r0 = r5.A08
            r6.A0l = r0
            X.Axa r0 = r5.A0K
            r5.A04(r0, r2, r3)
            X.88m r1 = r6.A0B
            X.9Cj r0 = X.C201049ih.A0P
            boolean r0 = X.C201049ih.A07(r0, r1)
            if (r0 == 0) goto L_0x022b
            X.A2F r0 = r6.A0l
            java.util.Objects.requireNonNull(r0)
            r7.A03(r0)
        L_0x022b:
            X.9dX r1 = r6.A0F
            X.9Ci r0 = X.C198429dX.A05
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0277
            X.B4X r1 = r6.A0E
            X.9Ch r0 = X.B4X.A0T
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0277
            X.A2F r0 = r6.A0l
            java.util.Objects.requireNonNull(r0)
            X.B4X r4 = r6.A0E
            X.9Ch r0 = X.B4X.A0V
            java.lang.Object r0 = r4.B84(r0)
            long r2 = X.C36431kI.A09(r0)
            X.9Ch r0 = X.B4X.A0W
            java.lang.Object r0 = r4.B84(r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            X.9Ch r0 = X.B4X.A0U
            java.lang.Object r0 = r4.B84(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            X.A2F.A0L = r2
            X.A2F.A0K = r1
            X.A2F.A0J = r0
            X.A2F r1 = r6.A0l
            java.util.Objects.requireNonNull(r1)
            X.9Cd r0 = r6.A0h
        L_0x0271:
            r1.A01 = r0
            android.os.Trace.endSection()
            return
        L_0x0277:
            X.A2F r1 = r6.A0l
            java.util.Objects.requireNonNull(r1)
            r0 = 0
            goto L_0x0271
        L_0x027e:
            if (r10 == 0) goto L_0x0200
            if (r11 == 0) goto L_0x0200
            float r0 = r8.A04()
            float r4 = X.C90494aF.A01(r12, r0)
            float r0 = r8.A00
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0200
            float r9 = r8.A04()
            float r4 = r8.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x02fe
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x02fe
            r16 = 1
        L_0x02a0:
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r0 = X.C36421kH.A06(r14, r3)
            float r0 = (float) r0
            float r0 = X.C202639mL.A00(r12, r15, r9, r4, r0)
            int r9 = (int) r0
            X.9Cj r4 = X.C201049ih.A0z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.C1692988n.A00(r13, r4, r0)
            X.9Cj r4 = X.C201049ih.A0s
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            X.C1692988n.A00(r13, r4, r0)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x02f6
            android.os.Handler r4 = r8.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            android.os.Message r0 = r4.obtainMessage(r3, r9, r3, r0)
            r4.sendMessage(r0)
        L_0x02d2:
            X.9mL r4 = r6.A0A
            float r0 = r4.A04()
            float r10 = X.C202639mL.A01(r4, r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r0
            X.9mL r4 = r6.A0A
            android.graphics.Rect r9 = r4.A04
            android.hardware.camera2.params.MeteringRectangle[] r0 = r4.A0D
            android.hardware.camera2.params.MeteringRectangle[] r8 = X.C202639mL.A03(r4, r0)
            X.9mL r4 = r6.A0A
            android.hardware.camera2.params.MeteringRectangle[] r0 = r4.A0C
            android.hardware.camera2.params.MeteringRectangle[] r0 = X.C202639mL.A03(r4, r0)
            r5.A07(r9, r8, r0, r10)
            goto L_0x0200
        L_0x02f6:
            float r0 = X.C202639mL.A01(r8, r12)
            X.C202639mL.A02(r11, r10, r0)
            goto L_0x02d2
        L_0x02fe:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0308
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r16 = 2
            if (r0 < 0) goto L_0x02a0
        L_0x0308:
            r16 = 0
            goto L_0x02a0
        L_0x030b:
            float r0 = X.C165577te.A01(r12, r11)
            float r0 = r0 / r13
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x031f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r0, r0)
            goto L_0x01b1
        L_0x031f:
            r4 = 0
        L_0x0320:
            if (r4 >= r11) goto L_0x032e
            float r0 = X.C165577te.A01(r12, r4)
            float r0 = r0 / r13
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x032e
            int r4 = r4 + 1
            goto L_0x0320
        L_0x032e:
            if (r4 <= 0) goto L_0x0332
            int r10 = r4 + -1
        L_0x0332:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = X.C36341k9.A0I(r0, r4)
            goto L_0x01b1
        L_0x033c:
            r12 = 0
            goto L_0x01e4
        L_0x033f:
            r16 = 180(0xb4, float:2.52E-43)
            goto L_0x014f
        L_0x0343:
            r16 = 90
            goto L_0x014f
        L_0x0347:
            r2 = 0
            goto L_0x0094
        L_0x034a:
            r3 = 0
            goto L_0x0082
        L_0x034d:
            java.lang.String r0 = "Trying to get mPreviewRequestBuilder before configuring preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x0354:
            java.lang.String r0 = "SurfacePipeCoordinator unable to provide surface texture and surface holder."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            throw r1
        L_0x035c:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r16)
            throw r1
        L_0x0361:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r16)
            throw r1
        L_0x0366:
            java.lang.String r0 = "StartupSettings must be provided to configure preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)
            throw r1
        L_0x036d:
            java.lang.String r0 = "PreviewSetupDelegate must be provided to configure preview."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            throw r1
        L_0x0375:
            java.lang.String r0 = "SurfacePipeCoordinator must be provided to configure preview."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            throw r1
        L_0x037d:
            java.lang.String r0 = "Camera must be opened to configure preview."
            X.Ab6 r1 = new X.Ab6
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.A03(X.A28, java.lang.Float, java.lang.String):void");
    }

    public static void A04(A28 a28, String str) {
        B4X b4x;
        C200199gr r8 = a28.A0X;
        r8.A06("Method openCamera() must run on the Optic Background Thread.");
        Context context = a28.A0b;
        if (AnonymousClass6IC.A00(context)) {
            if (a28.A0j != null) {
                if (!a28.A0j.getId().equals(str)) {
                    A00(a28);
                } else {
                    return;
                }
            }
            a28.A0R.A0P.clear();
            CameraManager cameraManager = a28.A0M;
            CameraCharacteristics A002 = C196509Zy.A00(cameraManager, str);
            CameraExtensionCharacteristics cameraExtensionCharacteristics = null;
            B4X b4x2 = a28.A0E;
            if (b4x2 != null && C165567td.A1a(B4X.A0T, b4x2)) {
                cameraExtensionCharacteristics = C196529a0.A00(cameraManager, str);
            }
            C165807uB r2 = new C165807uB(a28.A0d, a28.A0e);
            AYZ ayz = new AYZ(a28, r2, str);
            synchronized (r8) {
                UUID uuid = r8.A01;
                Objects.requireNonNull(uuid);
                r8.A02.post(new AnonymousClass79Q(r8, "open_camera_on_camera_handler_thread", uuid, ayz));
            }
            int A052 = a28.A0O.A05(str);
            a28.A01 = A052;
            C1692588j r1 = new C1692588j(context, A002, cameraExtensionCharacteristics, A052);
            a28.A0F = r1;
            if (C198429dX.A04(C198429dX.A05, r1) && cameraExtensionCharacteristics != null && (b4x = a28.A0E) != null && C165567td.A1a(B4X.A0T, b4x)) {
                a28.A0F = new C1692688k(cameraExtensionCharacteristics, a28.A0F);
            }
            C1692888m r12 = new C1692888m(a28.A0F);
            a28.A0B = r12;
            a28.A0C = new C1692988n(r12);
            Number number = (Number) A002.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Objects.requireNonNull(number);
            a28.A03 = number.intValue();
            a28.A06 = (Rect) A002.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            r2.B1t();
            Boolean bool = r2.A02;
            if (bool == null) {
                throw AnonymousClass001.A09("Open Camera operation hasn't completed yet.");
            } else if (bool.booleanValue()) {
                CameraDevice cameraDevice = r2.A00;
                Objects.requireNonNull(cameraDevice);
                a28.A0j = cameraDevice;
            } else {
                throw r2.A01;
            }
        } else {
            throw new SecurityException("Open Camera 2 failed: No camera permissions!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (X.C165567td.A1a(X.B4X.A0M, r14.A0E) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.A28 r14, java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x0165
            X.9U6 r0 = r14.A09
            if (r0 == 0) goto L_0x015e
            X.B4X r1 = r14.A0E
            if (r1 == 0) goto L_0x0157
            X.9dX r2 = r14.A0F
            if (r2 == 0) goto L_0x0150
            X.88m r0 = r14.A0B
            if (r0 == 0) goto L_0x0149
            X.88n r0 = r14.A0C
            if (r0 == 0) goto L_0x0149
            X.B43 r0 = r14.A0D
            if (r0 == 0) goto L_0x0142
            X.9Ch r0 = X.B4X.A0a
            java.lang.Object r8 = r1.B84(r0)
            X.9nH r8 = (X.C203089nH) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r7 = 1
            if (r1 < r0) goto L_0x003c
            X.9Ci r0 = X.C198429dX.A0S
            boolean r0 = X.C198429dX.A04(r0, r2)
            if (r0 == 0) goto L_0x003c
            X.B4X r1 = r14.A0E
            X.9Ch r0 = X.B4X.A0M
            boolean r0 = X.C165567td.A1a(r0, r1)
            r6 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            X.B4X r1 = r14.A0E
            X.9Ch r0 = X.B4X.A0Y
            r1.B84(r0)
            X.9Ch r0 = X.B4X.A0c
            r1.B84(r0)
            X.9dX r1 = r14.A0F
            X.9Ci r0 = X.C198429dX.A10
            java.util.List r11 = X.C198429dX.A03(r0, r1)
            X.9dX r1 = r14.A0F
            if (r6 == 0) goto L_0x0137
            X.9Ci r0 = X.C198429dX.A16
        L_0x0057:
            java.util.List r9 = X.C198429dX.A03(r0, r1)
            X.9dX r1 = r14.A0F
            X.9Ci r0 = X.C198429dX.A0l
            r1.A06(r0)
            X.9dX r1 = r14.A0F
            X.9Ci r0 = X.C198429dX.A17
            java.util.List r10 = X.C198429dX.A03(r0, r1)
            X.9U6 r0 = r14.A09
            int r12 = r0.A01
            int r13 = r0.A00
            r14.A08()
            X.9JN r5 = X.C203089nH.A01(r8, r9, r10, r11, r12, r13)
            X.9W3 r4 = r5.A01
            X.9W3 r2 = r5.A00
            if (r2 == 0) goto L_0x013b
            r14.A0J = r4
            X.88n r3 = r14.A0C
            X.9Cj r1 = X.C201049ih.A0p
            X.9Up r0 = r3.A00
            r0.A01(r1, r4)
            X.9Cj r1 = X.C201049ih.A0h
            r0 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0090
            r0 = 4101(0x1005, float:5.747E-42)
        L_0x0090:
            X.C191299Ck.A02(r1, r3, r0)
            X.9Cj r1 = X.C201049ih.A0j
            X.9Up r0 = r3.A00
            r0.A01(r1, r2)
            X.9Cj r2 = X.C201049ih.A0w
            X.9W3 r1 = r5.A02
            if (r1 != 0) goto L_0x00a1
            r1 = r4
        L_0x00a1:
            X.9Up r0 = r3.A00
            r0.A01(r2, r1)
            X.9Cj r2 = X.C201049ih.A0T
            boolean r0 = r14.A0m
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.9Up r0 = r3.A00
            r0.A01(r2, r1)
            X.9Cj r1 = X.C201049ih.A0P
            java.lang.Boolean r2 = X.C36381kD.A0j()
            X.9Up r0 = r3.A00
            r0.A01(r1, r2)
            X.9Cj r1 = X.C201049ih.A0L
            X.9Up r0 = r3.A00
            r0.A01(r1, r2)
            X.9Cj r1 = X.C201049ih.A02
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            X.C1692988n.A00(r3, r1, r0)
            X.9dX r1 = r14.A0F
            X.9Ci r0 = X.C198429dX.A15
            java.util.List r3 = X.C198429dX.A03(r0, r1)
            r0 = 5
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x00f7
            X.B4X r1 = r14.A0E
            if (r1 == 0) goto L_0x00f7
            X.9Ch r0 = X.B4X.A0b
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x00f7
            X.88n r0 = r14.A0C
            X.9Cj r1 = X.C201049ih.A0t
            X.9Up r0 = r0.A00
            r0.A01(r1, r2)
        L_0x00f7:
            X.88n r3 = r14.A0C
            X.9Cj r2 = X.C201049ih.A0I
            X.9dX r1 = r14.A0F
            if (r1 == 0) goto L_0x0135
            X.9Ci r0 = X.C198429dX.A0F
            boolean r0 = X.C198429dX.A04(r0, r1)
            if (r0 == 0) goto L_0x0135
            X.B4X r1 = r14.A0E
            if (r1 == 0) goto L_0x0135
            X.9Ch r0 = X.B4X.A0J
            boolean r0 = X.C165567td.A1a(r0, r1)
            if (r0 == 0) goto L_0x0135
            boolean r0 = r14.A0n
            if (r0 == 0) goto L_0x0135
        L_0x0117:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            X.9Up r0 = r3.A00
            r0.A01(r2, r1)
            X.88n r2 = r14.A0C
            X.9Up r0 = r2.A00
            X.9T3 r1 = r0.A00()
            X.9Up r0 = new X.9Up
            r0.<init>()
            r2.A00 = r0
            X.88m r0 = r2.A00
            r0.A0A(r1)
            return
        L_0x0135:
            r7 = 0
            goto L_0x0117
        L_0x0137:
            X.9Ci r0 = X.C198429dX.A0w
            goto L_0x0057
        L_0x013b:
            java.lang.String r0 = "Invalid picture size: 'null'"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0142:
            java.lang.String r0 = "Trying to setup camera params without instantiating PreviewSetupDelegate."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0149:
            java.lang.String r0 = "Trying to setup camera params without instantiating CameraSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0150:
            java.lang.String r0 = "Trying to setup camera params without a Capabilities."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0157:
            java.lang.String r0 = "Trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x015e:
            java.lang.String r0 = "Trying to setup camera params without a CameraDeviceConfig."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0165:
            java.lang.String r1 = "Camera ID must be provided to setup camera params."
            X.Ab6 r0 = new X.Ab6
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.A05(X.A28, java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    public static void A06(X.A28 r7, boolean r8) {
        /*
            X.9gr r5 = r7.A0X
            java.lang.String r0 = "Method stopCameraPreview() must run on the Optic Background Thread."
            r5.A06(r0)
            java.lang.Object r6 = X.C202989n4.A0S
            monitor-enter(r6)
            X.9n4 r2 = r7.A0R     // Catch:{ all -> 0x00d0 }
            X.9VN r3 = r2.A0J     // Catch:{ all -> 0x00d0 }
            r1 = 0
            java.lang.String r0 = "Failed to release PreviewController."
            r3.A02(r1, r0)     // Catch:{ all -> 0x00d0 }
            r2.A0Q = r1     // Catch:{ all -> 0x00d0 }
            X.B3g r0 = r2.A07     // Catch:{ all -> 0x00d0 }
            r4 = 0
            if (r0 == 0) goto L_0x0020
            r0.release()     // Catch:{ all -> 0x00d0 }
            r2.A07 = r4     // Catch:{ all -> 0x00d0 }
        L_0x0020:
            X.A2F r1 = r2.A08     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0029
            r0 = 0
            r1.A0H = r0     // Catch:{ all -> 0x00d0 }
            r2.A08 = r4     // Catch:{ all -> 0x00d0 }
        L_0x0029:
            if (r8 == 0) goto L_0x0070
            java.lang.String r0 = "Method closeCameraSession must be called on Optic Thread."
            r3.A01(r0)     // Catch:{ Exception -> 0x0070 }
            X.B31 r0 = r2.A09     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.BLk()     // Catch:{ Exception -> 0x0070 }
            if (r0 == 0) goto L_0x0055
        L_0x003a:
            X.A2R r1 = r2.A0L     // Catch:{ Exception -> 0x0070 }
            r0 = 2
            r1.A03 = r0     // Catch:{ Exception -> 0x0070 }
            X.9WY r3 = r1.A01     // Catch:{ Exception -> 0x0070 }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x0070 }
            X.9gr r3 = r2.A0O     // Catch:{ Exception -> 0x0070 }
            r0 = 16
            X.B8U r1 = new X.B8U     // Catch:{ Exception -> 0x0070 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r0 = "camera_session_close_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0070
        L_0x0055:
            X.A2R r1 = r2.A0L     // Catch:{ Exception -> 0x0070 }
            r0 = 3
            r1.A03 = r0     // Catch:{ Exception -> 0x0070 }
            X.9WY r3 = r1.A01     // Catch:{ Exception -> 0x0070 }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x0070 }
            X.9gr r3 = r2.A0O     // Catch:{ Exception -> 0x0070 }
            r0 = 15
            X.B8U r1 = new X.B8U     // Catch:{ Exception -> 0x0070 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r0 = "camera_session_abort_capture_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x0070 }
            goto L_0x003a
        L_0x0070:
            X.B43 r0 = r2.A0C     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0076
            r2.A0C = r4     // Catch:{ all -> 0x00d0 }
        L_0x0076:
            android.view.Surface r1 = r2.A04     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0083
            boolean r0 = r2.A0F     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0081
            r1.release()     // Catch:{ all -> 0x00d0 }
        L_0x0081:
            r2.A04 = r4     // Catch:{ all -> 0x00d0 }
        L_0x0083:
            X.B31 r0 = r2.A09     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x008c
            r0.close()     // Catch:{ all -> 0x00d0 }
            r2.A09 = r4     // Catch:{ all -> 0x00d0 }
        L_0x008c:
            r2.A05 = r4     // Catch:{ all -> 0x00d0 }
            r2.A02 = r4     // Catch:{ all -> 0x00d0 }
            r2.A0H = r4     // Catch:{ all -> 0x00d0 }
            r2.A0G = r4     // Catch:{ all -> 0x00d0 }
            r2.A01 = r4     // Catch:{ all -> 0x00d0 }
            r2.A0A = r4     // Catch:{ all -> 0x00d0 }
            r2.A0B = r4     // Catch:{ all -> 0x00d0 }
            r2.A0D = r4     // Catch:{ all -> 0x00d0 }
            r2.A0E = r4     // Catch:{ all -> 0x00d0 }
            r2.A00 = r4     // Catch:{ all -> 0x00d0 }
            java.lang.Object r1 = r7.A0Y     // Catch:{ all -> 0x00d0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00d0 }
            java.util.concurrent.FutureTask r0 = r7.A0G     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00ac
            r5.A08(r0)     // Catch:{ all -> 0x00cd }
            r7.A0G = r4     // Catch:{ all -> 0x00cd }
        L_0x00ac:
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            r7.A0l = r4     // Catch:{ all -> 0x00d0 }
            r7.A07 = r4     // Catch:{ all -> 0x00d0 }
            r7.A0K = r4     // Catch:{ all -> 0x00d0 }
            X.9fa r1 = r7.A0Q     // Catch:{ all -> 0x00d0 }
            r0 = 0
            r1.A0F = r0     // Catch:{ all -> 0x00d0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d0 }
            X.9VB r0 = r2.A0N
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00cc
            r1 = 6
            X.72q r0 = new X.72q
            r0.<init>(r2, r1)
            X.C202399lk.A00(r0)
        L_0x00cc:
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.A06(X.A28, boolean):void");
    }

    public static boolean A07(A28 a28) {
        C23076B3g b3g = a28.A08;
        if (b3g == null || !b3g.BJw()) {
            return false;
        }
        return true;
    }

    public int A08() {
        Number number = (Number) C36371kC.A0r(A0q, this.A02);
        if (number != null) {
            return ((this.A03 - number.intValue()) + 360) % 360;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Invalid display rotation value: ");
        throw C165567td.A0O(A0u, this.A02);
    }

    public void B0b(C22877AxY axY) {
        if (axY != null) {
            C23076B3g b3g = this.A08;
            if (b3g != null) {
                boolean z = !A07(this);
                boolean B0Q = b3g.B0Q(axY);
                if (z && B0Q && b3g.BNP()) {
                    this.A0X.A07("restart_preview_to_resume_cpu_frames", new B8U(this, 6));
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Cannot add null OnPreviewFrameListener.");
    }

    public void B0c(C114715hh r2) {
        if (r2 != null) {
            this.A0R.A0M.A01(r2);
            return;
        }
        throw AnonymousClass001.A08("Cannot add null OnPreviewStartedListener.");
    }

    public void B7T(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0a;
        rect.inset(i3, i3);
        this.A0X.A00(new B6y(this, 7), "focus", new B8X(rect, this, 8));
    }

    public boolean BMy() {
        return this.A0S.A0D;
    }

    public boolean BP4(float[] fArr) {
        Matrix matrix = this.A05;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    public void BPw(AnonymousClass9T8 r4, AnonymousClass9T3 r5) {
        this.A0X.A00(r4, "modify_settings_on_background_thread", new B8X(r5, this, 9));
    }

    public void Bc2(int i) {
        if (!this.A0L) {
            this.A0i = i;
            C23072B3b b3b = this.A0k;
            if (b3b != null) {
                b3b.BVY(this.A0i);
            }
        }
    }

    public void Bns(C22877AxY axY) {
        C23076B3g b3g = this.A08;
        if (axY != null && b3g != null && b3g.Bnm(axY) && !A07(this) && b3g.BNP()) {
            synchronized (this.A0Y) {
                FutureTask futureTask = this.A0G;
                if (futureTask != null) {
                    this.A0X.A08(futureTask);
                }
                this.A0G = this.A0X.A02("restart_preview_if_to_stop_cpu_frames", this.A0Z, 200);
            }
        }
    }

    public void Bnt(C114715hh r2) {
        if (r2 != null) {
            this.A0R.A0M.A02(r2);
        }
    }

    public void BqN(Handler handler) {
        this.A0X.A00 = handler;
    }

    public void Bqw(C157797eh r2) {
        this.A0P.A02 = r2;
    }

    public void BrC(boolean z) {
        this.A0L = z;
        if (z) {
            this.A0i = 0;
            C23072B3b b3b = this.A0k;
            if (b3b != null) {
                b3b.BVY(this.A0i);
            }
        }
    }

    public void BrN(C191159Bw r3) {
        C201439jb r0 = this.A0W;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void Brh(AnonymousClass9T8 r4, int i) {
        this.A02 = i;
        this.A0X.A00(r4, "set_rotation", new B8U(this, 7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == 180) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bss(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            X.9W3 r0 = r6.A0J
            if (r0 == 0) goto L_0x007c
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A03
            if (r4 == 0) goto L_0x0019
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L_0x001b
        L_0x0019:
            float r1 = (float) r10
            float r0 = (float) r11
        L_0x001b:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0061
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L_0x0077
            float r0 = java.lang.Math.max(r2, r1)
        L_0x005e:
            r7.postScale(r0, r0, r5, r4)
        L_0x0061:
            int r3 = r6.A02
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x0072
            r0 = 3
            if (r3 == r0) goto L_0x0072
            if (r3 != r2) goto L_0x0071
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x006e:
            r7.postRotate(r0, r5, r4)
        L_0x0071:
            return r1
        L_0x0072:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L_0x006e
        L_0x0077:
            float r0 = java.lang.Math.min(r2, r1)
            goto L_0x005e
        L_0x007c:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A28.Bss(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    public void Bv1(AnonymousClass9T8 r20, File file, File file2) {
        C195169St r9 = this.A0S;
        String absolutePath = file.getAbsolutePath();
        int i = this.A01;
        int i2 = this.A03;
        int i3 = this.A0i;
        C23072B3b b3b = this.A0k;
        C159927kB r7 = this.A0c;
        CaptureRequest.Builder builder = this.A07;
        boolean A072 = A07(this);
        A2F a2f = this.A0l;
        C202989n4 r0 = r9.A02;
        AnonymousClass9T8 r1 = r20;
        if (r0 == null || !r0.A0Q || r9.A03 == null) {
            r1.A00(AnonymousClass001.A09("Cannot start recording video, camera is not ready or has been closed."));
        } else if (r9.A0D) {
            r1.A00(AnonymousClass001.A09("Cannot start recording video, there is a video already being recorded"));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1692888m r02 = r9.A03;
            C191289Cj r3 = C201049ih.A0w;
            Object A082 = r02.A08(r3);
            C1692888m r03 = r9.A03;
            if (A082 == null) {
                r3 = C201049ih.A0p;
            }
            AnonymousClass9W3 r11 = (AnonymousClass9W3) r03.A08(r3);
            if (absolutePath == null) {
                r1.A00(AnonymousClass001.A08("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            r9.A0D = true;
            r9.A0C = false;
            r9.A0A.A00(new C1692288g(builder, r1, r9, a2f, A072), "start_video_recording", new C21733AYk(builder, r7, b3b, r9, a2f, r11, absolutePath, i, i2, i3, elapsedRealtime));
        }
    }

    public void BvA(AnonymousClass9T8 r9, boolean z) {
        C195169St r4 = this.A0S;
        CaptureRequest.Builder builder = this.A07;
        A07(this);
        A2F a2f = this.A0l;
        if (!r4.A0D) {
            r9.A00(AnonymousClass001.A09("Not recording video."));
            return;
        }
        r4.A0A.A00(r9, "stop_video_capture", new C21731AYi(builder, r4, a2f, SystemClock.elapsedRealtime()));
    }

    public void BvV(AnonymousClass61X r19, C198749e8 r20) {
        int i;
        int i2;
        Integer num;
        C202989n4 r0;
        B4X b4x = this.A0E;
        if (b4x != null) {
            i = AnonymousClass000.A0I(b4x.B84(B4X.A0S));
        } else {
            i = 0;
        }
        C199599fa r9 = this.A0Q;
        CameraManager cameraManager = this.A0M;
        int i3 = this.A01;
        int i4 = (((this.A0i + 45) / 90) * 90) % 360;
        int i5 = this.A01;
        int i6 = this.A03;
        if (i5 == 1) {
            i2 = (i6 - i4) + 360;
        } else {
            i2 = i6 + i4;
        }
        int i7 = i2 % 360;
        int A082 = A08();
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        CaptureRequest.Builder builder = this.A07;
        B43 b43 = this.A0D;
        boolean A072 = A07(this);
        A2F a2f = this.A0l;
        AnonymousClass61X r8 = r19;
        if (r9.A00 == null || (r0 = r9.A02) == null || !r0.A0Q) {
            r9.A03(r8, new C21829Ab6("Camera not ready to take photo."));
        } else if (r9.A0F) {
            r9.A03(r8, new C21829Ab6("Cannot take photo, another capture in progress."));
        } else {
            C195169St r02 = r9.A03;
            Objects.requireNonNull(r02);
            if (r02.A0D) {
                r9.A03(r8, new C21829Ab6("Cannot take photo, video recording in progress."));
                return;
            }
            C1692888m r03 = r9.A06;
            Objects.requireNonNull(r03);
            C201049ih.A06(r03);
            r9.A0F = true;
            AnonymousClass9YE r04 = r9.A01;
            Objects.requireNonNull(r04);
            r04.A00();
            r9.A0E.A00(new C23138B6x(r8, r9, 1), "take_photo", new AYl(cameraManager, builder, r8, r9, a2f, b43, r20, num, i3, i7, A082, A072));
        }
    }

    public int getZoomLevel() {
        C202639mL r0 = this.A0A;
        if (r0 == null) {
            return -1;
        }
        return r0.A05();
    }

    public boolean isConnected() {
        if (this.A0j == null || !this.A0o) {
            return false;
        }
        return true;
    }

    static {
        HashMap A0J2 = AnonymousClass001.A0J();
        A0q = A0J2;
        Integer A0m2 = C36381kD.A0m();
        A0J2.put(A0m2, A0m2);
        C36341k9.A1K(C36331k8.A0L(C36331k8.A0K(C36361kB.A0i(), 90, A0J2), 180, A0J2), A0J2, 270);
    }

    public A28(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0b = applicationContext;
        C200199gr r4 = new C200199gr();
        this.A0X = r4;
        C201439jb r3 = new C201439jb(r4);
        this.A0W = r3;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0M = cameraManager;
        C202949mz r1 = new C202949mz(applicationContext.getPackageManager(), cameraManager, r3, r4);
        this.A0O = r1;
        this.A0Q = new C199599fa(r3, r4);
        this.A0S = new C195169St(r1, r4);
        this.A0a = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0X(context)));
        this.A0P = new AnonymousClass9YE(r4);
        this.A0R = new C202989n4(r4);
    }

    public void B3U(AnonymousClass9T8 r10, AnonymousClass9U6 r11, B4X b4x, C22791Aw2 aw2, AnonymousClass7cE r14, String str, int i, int i2) {
        C202389lj.A00();
        if (this.A0H) {
            this.A00 = this.A0W.A02(this.A0X.A00, str);
        }
        this.A0X.A00(r10, "connect", new B8T(r11, this, b4x, i, i2, 1));
        C202389lj.A00();
    }

    public int B9I() {
        return this.A01;
    }

    public C198429dX B9Q() {
        C198429dX r0;
        if (isConnected() && (r0 = this.A0F) != null) {
            return r0;
        }
        throw new C21815Aar("Cannot get camera capabilities");
    }

    public int BHL() {
        return this.A03;
    }

    public void BvQ(AnonymousClass9T8 r4) {
        C202389lj.A00();
        this.A0X.A00(r4, "switch_camera", new B8U(this, 9));
    }
}
