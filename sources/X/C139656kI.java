package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.6kI  reason: invalid class name and case insensitive filesystem */
public final class C139656kI implements C161977nn {
    public Rect A00;
    public int A01;
    public int A02;
    public C114775ho A03;
    public final Paint A04 = C36441kJ.A0L(6);
    public final C160897ll A05;
    public final C160337kq A06;
    public final C1263563p A07;
    public final boolean A08;
    public final Bitmap.Config A09 = Bitmap.Config.ARGB_8888;
    public final Matrix A0A = C90524aI.A0B();
    public final Path A0B = C36441kJ.A0M();
    public final C160327kp A0C;
    public final C123025vo A0D;
    public final AnonymousClass6NZ A0E;

    public C139656kI(C160327kp r2, C160897ll r3, C160337kq r4, C123025vo r5, C1263563p r6, AnonymousClass6NZ r7, boolean z) {
        AnonymousClass00C.A0D(r7, 1);
        this.A0E = r7;
        this.A05 = r3;
        this.A0C = r2;
        this.A07 = r6;
        this.A08 = z;
        this.A06 = r4;
        this.A0D = r5;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e6, code lost:
        if (r3 != null) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(android.graphics.Canvas r9, int r10, int r11) {
        /*
            r8 = this;
            r3 = 0
            boolean r0 = r8.A08     // Catch:{ all -> 0x00fa }
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x004f
            X.7kq r2 = r8.A06     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00f9
            int r1 = r9.getWidth()     // Catch:{ all -> 0x00fa }
            int r0 = r9.getHeight()     // Catch:{ all -> 0x00fa }
            X.AU0 r5 = r2.B8m(r10, r1, r0)     // Catch:{ all -> 0x00fa }
            if (r5 == 0) goto L_0x0042
            boolean r0 = r5.A02()     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0042
            java.lang.Object r2 = r5.A01()     // Catch:{ all -> 0x00fc }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x00fc }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x00fc }
            android.graphics.Rect r1 = r8.A00     // Catch:{ all -> 0x00fc }
            if (r1 != 0) goto L_0x0033
            android.graphics.Paint r1 = r8.A04     // Catch:{ all -> 0x00fc }
            r0 = 0
            r9.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x00fc }
            goto L_0x003e
        L_0x0033:
            r1.width()     // Catch:{ all -> 0x00fc }
            r1.height()     // Catch:{ all -> 0x00fc }
            android.graphics.Paint r0 = r8.A04     // Catch:{ all -> 0x00fc }
            r9.drawBitmap(r2, r3, r1, r0)     // Catch:{ all -> 0x00fc }
        L_0x003e:
            r5.close()
            return r6
        L_0x0042:
            int r1 = r9.getWidth()     // Catch:{ all -> 0x00fc }
            int r0 = r9.getHeight()     // Catch:{ all -> 0x00fc }
            r2.Bm8(r3, r1, r0)     // Catch:{ all -> 0x00fc }
            goto L_0x00f4
        L_0x004f:
            r5 = -1
            r1 = 3
            r7 = 2
            if (r11 == 0) goto L_0x00d9
            if (r11 == r6) goto L_0x00ab
            if (r11 == r7) goto L_0x0065
            X.7ll r0 = r8.A05     // Catch:{ all -> 0x00fa }
            X.AU0 r3 = r0.BBl(r10)     // Catch:{ all -> 0x00fa }
            boolean r4 = r8.A02(r9, r3, r10, r1)     // Catch:{ all -> 0x00fa }
            r6 = -1
            goto L_0x00e6
        L_0x0065:
            X.6NZ r6 = r8.A0E     // Catch:{ RuntimeException -> 0x0095 }
            int r2 = r8.A02     // Catch:{ RuntimeException -> 0x0095 }
            int r1 = r8.A01     // Catch:{ RuntimeException -> 0x0095 }
            android.graphics.Bitmap$Config r0 = r8.A09     // Catch:{ RuntimeException -> 0x0095 }
            X.AU0 r3 = r6.A01(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0095 }
            boolean r0 = r3.A02()     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0093
            X.63p r1 = r8.A07     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = r3.A01()     // Catch:{ all -> 0x00fa }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00fa }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00fa }
            boolean r0 = r1.A00(r0, r10)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x008c
            r3.close()     // Catch:{ all -> 0x00fa }
            goto L_0x0093
        L_0x008c:
            boolean r0 = r8.A02(r9, r3, r10, r7)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0093
            r4 = 1
        L_0x0093:
            r6 = 3
            goto L_0x00e8
        L_0x0095:
            r6 = move-exception
            java.lang.Class<X.6kI> r5 = X.C139656kI.class
            java.lang.String r2 = "Failed to create frame bitmap"
            X.7m1 r1 = X.C132886Vq.A00     // Catch:{ all -> 0x00fa }
            r0 = 5
            boolean r0 = r1.BMH(r0)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r5.getSimpleName()     // Catch:{ all -> 0x00fa }
            r1.BxO(r0, r2, r6)     // Catch:{ all -> 0x00fa }
            return r4
        L_0x00ab:
            X.7ll r2 = r8.A05     // Catch:{ all -> 0x00fa }
            int r1 = r8.A02     // Catch:{ all -> 0x00fa }
            int r0 = r8.A01     // Catch:{ all -> 0x00fa }
            X.AU0 r3 = r2.B8n(r10, r1, r0)     // Catch:{ all -> 0x00fa }
            if (r3 == 0) goto L_0x00e5
            boolean r0 = r3.A02()     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00e5
            X.63p r1 = r8.A07     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = r3.A01()     // Catch:{ all -> 0x00fa }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00fa }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00fa }
            boolean r0 = r1.A00(r0, r10)     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00d2
            r3.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00e5
        L_0x00d2:
            boolean r0 = r8.A02(r9, r3, r10, r6)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00e5
            goto L_0x00e4
        L_0x00d9:
            X.7ll r0 = r8.A05     // Catch:{ all -> 0x00fa }
            X.AU0 r3 = r0.B9A(r10)     // Catch:{ all -> 0x00fa }
            boolean r4 = r8.A02(r9, r3, r10, r4)     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00e4:
            r4 = 1
        L_0x00e5:
            r6 = 2
        L_0x00e6:
            if (r3 == 0) goto L_0x00eb
        L_0x00e8:
            r3.close()
        L_0x00eb:
            if (r4 != 0) goto L_0x00f9
            if (r6 == r5) goto L_0x00f9
            boolean r4 = r8.A01(r9, r10, r6)
            return r4
        L_0x00f4:
            if (r5 == 0) goto L_0x00f9
            r5.close()
        L_0x00f9:
            return r4
        L_0x00fa:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fc:
            r0 = move-exception
            r3 = r5
        L_0x00fe:
            if (r3 == 0) goto L_0x0103
            r3.close()
        L_0x0103:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139656kI.A01(android.graphics.Canvas, int, int):boolean");
    }

    public boolean B64(Canvas canvas, Drawable drawable, int i) {
        C123025vo r5;
        C160337kq r2;
        AnonymousClass00C.A0D(canvas, 1);
        int i2 = i;
        boolean A012 = A01(canvas, i, 0);
        if (!(this.A08 || (r5 = this.A0D) == null || (r2 = this.A06) == null)) {
            r2.Bm9(this, this.A05, r5, (AnonymousClass00S) null, i2);
        }
        return A012;
    }

    private final void A00() {
        int i;
        C1263563p r2 = this.A07;
        int width = r2.A00.A06.getWidth();
        this.A02 = width;
        int i2 = -1;
        if (width == -1) {
            Rect rect = this.A00;
            if (rect != null) {
                i = rect.width();
            } else {
                i = -1;
            }
            this.A02 = i;
        }
        int height = r2.A00.A06.getHeight();
        this.A01 = height;
        if (height == -1) {
            Rect rect2 = this.A00;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A01 = i2;
        }
    }

    private final boolean A02(Canvas canvas, AU0 au0, int i, int i2) {
        if (au0 == null || !au0.A02()) {
            return false;
        }
        Object A012 = au0.A01();
        AnonymousClass00C.A08(A012);
        Bitmap bitmap = (Bitmap) A012;
        Rect rect = this.A00;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A04);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.A04);
        }
        if (i2 == 3 || this.A08) {
            return true;
        }
        this.A05.BYS(au0, i, i2);
        return true;
    }

    public int BC6(int i) {
        return this.A0C.BC6(i);
    }

    public int BDi() {
        return this.A0C.BDi();
    }

    public void Bq6(int i) {
        this.A04.setAlpha(i);
    }

    public void BqI(Rect rect) {
        this.A00 = rect;
        C1263563p r4 = this.A07;
        C202069kz r3 = r4.A00;
        if (!C202069kz.A01(rect, r3.A06).equals(r3.A05)) {
            r3 = new C202069kz(rect, r3.A07, r3.A08, r3.A09);
        }
        if (r3 != r4.A00) {
            r4.A00 = r3;
            r4.A01 = new C202019ku(r3, r4.A03, r4.A04);
        }
        A00();
    }

    public void BqW(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public int getFrameCount() {
        return this.A0C.getFrameCount();
    }

    public int getLoopCount() {
        return this.A0C.getLoopCount();
    }

    public int BCp() {
        return this.A01;
    }

    public int BCq() {
        return this.A02;
    }

    public void BqA(C114775ho r1) {
        this.A03 = r1;
    }
}
