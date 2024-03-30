package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4da  reason: invalid class name and case insensitive filesystem */
public final class C92324da extends View implements C160967ls {
    public static Field A0F;
    public static Method A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static final ViewOutlineProvider A0J = new C92434dy();
    public static final C125205zU A0K = new C125205zU();
    public static final C009003v A0L = AnonymousClass7ZV.A00;
    public boolean A00;
    public int A01;
    public long A02 = C112365dm.A00;
    public Rect A03;
    public AnonymousClass00S A04;
    public C006302t A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final AnonymousClass6VB A09;
    public final long A0A;
    public final C114355h5 A0B = new C114355h5();
    public final AndroidComposeView A0C;
    public final C92384dr A0D;
    public final C1273067t A0E = new C1273067t(A0L);

    public void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.A0C;
        androidComposeView.A07 = true;
        this.A05 = null;
        this.A04 = null;
        boolean A0I2 = androidComposeView.A0I(this);
        if (Build.VERSION.SDK_INT >= 23 || A0I || !A0I2) {
            this.A0D.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    public void forceLayout() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        Rect rect;
        if (this.A06) {
            Rect rect2 = this.A03;
            if (rect2 == null) {
                this.A03 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A03;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A0C.A0H(this, z);
        }
    }

    public void BP2(AnonymousClass675 r2, boolean z) {
        float[] fArr;
        C1273067t r0 = this.A0E;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                r2.A01 = 0.0f;
                r2.A03 = 0.0f;
                r2.A02 = 0.0f;
                r2.A00 = 0.0f;
                return;
            }
        } else {
            fArr = r0.A01(this);
        }
        AnonymousClass6VX.A01(r2, fArr);
    }

    public long BP3(long j, boolean z) {
        float[] fArr;
        C1273067t r0 = this.A0E;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                return C133206Xf.A01;
            }
        } else {
            fArr = r0.A01(this);
        }
        return AnonymousClass6VX.A00(fArr, j);
    }

    public void Boo(AnonymousClass00S r4, C006302t r5) {
        if (Build.VERSION.SDK_INT >= 23 || A0I) {
            this.A0D.addView(this);
        } else {
            setVisibility(0);
        }
        this.A06 = false;
        this.A07 = false;
        this.A02 = C112365dm.A00;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void Bwe() {
        if (this.A00 && !A0I) {
            A0K.A00(this);
            setInvalidated(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r13.A09 == X.C112355dl.A00) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r13.A09 != X.C112355dl.A00) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwi(X.C137396g4 r13, X.C161937ni r14, X.AnonymousClass5RW r15) {
        /*
            r12 = this;
            int r3 = r13.A05
            int r0 = r12.A01
            r3 = r3 | r0
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0029
            long r4 = r13.A08
            r12.A02 = r4
            long r0 = X.C112365dm.A00
            float r1 = X.C90464aC.A01(r4)
            float r0 = X.C36441kJ.A01(r12)
            float r1 = r1 * r0
            r12.setPivotX(r1)
            long r0 = r12.A02
            float r1 = X.C90464aC.A00(r0)
            float r0 = X.C36441kJ.A02(r12)
            float r1 = r1 * r0
            r12.setPivotY(r1)
        L_0x0029:
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0032
            float r0 = r13.A02
            r12.setScaleX(r0)
        L_0x0032:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x003b
            float r0 = r13.A03
            r12.setScaleY(r0)
        L_0x003b:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0044
            float r0 = r13.A00
            r12.setAlpha(r0)
        L_0x0044:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x004c
            r0 = 0
            r12.setTranslationX(r0)
        L_0x004c:
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r12.setTranslationY(r0)
        L_0x0054:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x005d
            float r0 = r13.A04
            r12.setElevation(r0)
        L_0x005d:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0065
            r0 = 0
            r12.setRotation(r0)
        L_0x0065:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x006d
            r0 = 0
            r12.setRotationX(r0)
        L_0x006d:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0075
            r0 = 0
            r12.setRotationY(r0)
        L_0x0075:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x007e
            float r0 = r13.A01
            r12.setCameraDistancePx(r0)
        L_0x007e:
            X.7mK r0 = r12.getManualClipPath()
            r2 = 0
            boolean r4 = X.AnonymousClass000.A1V(r0)
            boolean r5 = r13.A0B
            if (r5 == 0) goto L_0x0092
            X.7dt r1 = r13.A09
            X.7dt r0 = X.C112355dl.A00
            r11 = 1
            if (r1 != r0) goto L_0x0093
        L_0x0092:
            r11 = 0
        L_0x0093:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00a9
            if (r5 == 0) goto L_0x00a0
            X.7dt r5 = r13.A09
            X.7dt r1 = X.C112355dl.A00
            r0 = 1
            if (r5 == r1) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r12.A06 = r0
            r12.A00()
            r12.setClipToOutline(r11)
        L_0x00a9:
            X.6VB r5 = r12.A09
            X.7dt r6 = r13.A09
            float r9 = r13.A00
            float r10 = r13.A04
            r7 = r14
            r8 = r15
            boolean r1 = r5.A06(r6, r7, r8, r9, r10, r11)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x00c6
            android.graphics.Outline r0 = r5.A03()
            if (r0 == 0) goto L_0x0142
            android.view.ViewOutlineProvider r0 = A0J
        L_0x00c3:
            r12.setOutlineProvider(r0)
        L_0x00c6:
            X.7mK r0 = r12.getManualClipPath()
            boolean r0 = X.AnonymousClass000.A1V(r0)
            if (r4 != r0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d7
            if (r1 == 0) goto L_0x00d7
        L_0x00d4:
            r12.invalidate()
        L_0x00d7:
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x00eb
            float r1 = r12.getElevation()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            X.00S r0 = r12.A04
            if (r0 == 0) goto L_0x00eb
            r0.invoke()
        L_0x00eb:
            r0 = r3 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x00f6
            X.67t r1 = r12.A0E
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x00f6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0122
            r0 = r3 & 64
            if (r0 == 0) goto L_0x010f
            long r0 = r13.A06
            X.4iQ r4 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r4, r0)
            int r0 = X.C90514aH.A0D(r0)
            X.AnonymousClass6G9.A00(r12, r0)
        L_0x010f:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0122
            long r0 = r13.A07
            X.4iQ r4 = X.C114185go.A0G
            long r0 = X.C133336Xx.A06(r4, r0)
            int r0 = X.C90514aH.A0D(r0)
            X.AnonymousClass6G9.A01(r12, r0)
        L_0x0122:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0130
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0130
            X.AnonymousClass5XD.A00(r12)
        L_0x0130:
            r0 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x013d
            r0 = 0
            r12.setLayerType(r2, r0)
            r0 = 1
            r12.A08 = r0
        L_0x013d:
            int r0 = r13.A05
            r12.A01 = r0
            return
        L_0x0142:
            r0 = 0
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92324da.Bwi(X.6g4, X.7ni, X.5RW):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6.isHardwareAccelerated() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            X.5h5 r0 = r5.A0B
            X.6g3 r4 = r0.A00
            android.graphics.Canvas r3 = r4.A00
            r4.A00 = r6
            X.7mK r0 = r5.getManualClipPath()
            r2 = 0
            if (r0 != 0) goto L_0x0016
            boolean r0 = r6.isHardwareAccelerated()
            r1 = 0
            if (r0 != 0) goto L_0x001f
        L_0x0016:
            r1 = 1
            r4.BpF()
            X.6VB r0 = r5.A09
            r0.A04(r4)
        L_0x001f:
            X.02t r0 = r5.A05
            if (r0 == 0) goto L_0x0026
            r0.invoke(r4)
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r4.Boi()
        L_0x002b:
            r4.A00 = r3
            r5.setInvalidated(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92324da.dispatchDraw(android.graphics.Canvas):void");
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass5XC.A00(this.A0C);
        }
        return -1;
    }

    public void invalidate() {
        if (!this.A00) {
            setInvalidated(true);
            super.invalidate();
            this.A0C.invalidate();
        }
    }

    public C92324da(AndroidComposeView androidComposeView, C92384dr r4, AnonymousClass00S r5, C006302t r6) {
        super(androidComposeView.getContext());
        this.A0C = androidComposeView;
        this.A0D = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A09 = new AnonymousClass6VB(androidComposeView.A04);
        setWillNotDraw(false);
        r4.addView(this);
        this.A0A = (long) View.generateViewId();
    }

    private final C161177mK getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        AnonymousClass6VB r1 = this.A09;
        if (!r1.A08) {
            return null;
        }
        AnonymousClass6VB.A00(r1);
        return r1.A05;
    }

    public void B69(C161047m3 r4) {
        boolean A1R = AnonymousClass000.A1R((getElevation() > 0.0f ? 1 : (getElevation() == 0.0f ? 0 : -1)));
        this.A07 = A1R;
        if (A1R) {
            r4.B6R();
        }
        this.A0D.A00(this, r4, getDrawingTime());
        if (this.A07) {
            r4.B5U();
        }
    }

    public boolean BLx(long j) {
        float A002 = C133206Xf.A00(j);
        float A012 = C133206Xf.A01(j);
        if (this.A06) {
            if (0.0f > A002 || A002 >= C36441kJ.A01(this) || 0.0f > A012 || A012 >= C36441kJ.A02(this)) {
                return false;
            }
        } else if (getClipToOutline()) {
            return this.A09.A05(j);
        }
        return true;
    }

    public void BPx(long j) {
        int A082 = C90494aF.A08(j);
        if (A082 != getLeft()) {
            offsetLeftAndRight(A082 - getLeft());
            C1273067t r1 = this.A0E;
            r1.A00 = true;
            r1.A01 = true;
        }
        int A032 = C90474aD.A03(j);
        if (A032 != getTop()) {
            offsetTopAndBottom(A032 - getTop());
            C1273067t r12 = this.A0E;
            r12.A00 = true;
            r12.A01 = true;
        }
    }

    public void Boc(long j) {
        ViewOutlineProvider viewOutlineProvider;
        int A082 = C90494aF.A08(j);
        int A032 = C90474aD.A03(j);
        if (A082 != getWidth() || A032 != getHeight()) {
            long j2 = this.A02;
            long j3 = C112365dm.A00;
            float A012 = C90464aC.A01(j2);
            float f = (float) A082;
            setPivotX(A012 * f);
            float f2 = (float) A032;
            setPivotY(C90464aC.A00(this.A02) * f2);
            AnonymousClass6VB r7 = this.A09;
            long A0B2 = C90464aC.A0B(f, f2);
            long j4 = AnonymousClass6X0.A02;
            if (r7.A03 != A0B2) {
                r7.A03 = A0B2;
                r7.A06 = true;
            }
            if (r7.A03() != null) {
                viewOutlineProvider = A0J;
            } else {
                viewOutlineProvider = null;
            }
            setOutlineProvider(viewOutlineProvider);
            layout(getLeft(), getTop(), getLeft() + A082, getTop() + A032);
            A00();
            C1273067t r1 = this.A0E;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) C36361kB.A0B(this).densityDpi);
    }

    public final C92384dr getContainer() {
        return this.A0D;
    }

    public long getLayerId() {
        return this.A0A;
    }

    public final AndroidComposeView getOwnerView() {
        return this.A0C;
    }

    public boolean hasOverlappingRendering() {
        return this.A08;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) C36361kB.A0B(this).densityDpi));
    }
}
