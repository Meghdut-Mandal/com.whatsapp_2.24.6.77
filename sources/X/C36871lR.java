package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.1lR  reason: invalid class name and case insensitive filesystem */
public final class C36871lR extends Drawable {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05 = C36441kJ.A0N();
    public final RectF A06 = C36441kJ.A0N();
    public final AnonymousClass3AP A07;

    public C36871lR(AnonymousClass3AP r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A07 = r3;
        Paint A0L = C36441kJ.A0L(1);
        C36421kH.A0q(A0L);
        this.A04 = A0L;
        Paint A0L2 = C36441kJ.A0L(1);
        C36431kI.A1L(A0L2);
        this.A03 = A0L2;
    }

    public void draw(Canvas canvas) {
        boolean z;
        AnonymousClass00C.A0D(canvas, 0);
        if (this.A01 || this.A02) {
            RectF rectF = this.A05;
            float height = rectF.height() * 0.5f;
            canvas.drawRoundRect(rectF, height, height, this.A03);
        }
        if (this.A01) {
            z = this.A00;
        } else {
            z = this.A02;
        }
        if (!z) {
            RectF rectF2 = this.A06;
            float height2 = rectF2.height() * 0.5f;
            canvas.drawRoundRect(rectF2, height2, height2, this.A04);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 < 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r6) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            boolean r4 = r5.A02
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int r2 = r6.length
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x0014
            r0 = r6[r1]
            if (r3 != r0) goto L_0x0028
            r0 = 1
            if (r1 >= 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r4 == r0) goto L_0x001f
            r5.A02 = r0
            A02(r5)
            r5.invalidateSelf()
        L_0x001f:
            boolean r0 = r5.A02
            if (r4 == r0) goto L_0x002b
            r5.invalidateSelf()
            r0 = 1
            return r0
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36871lR.onStateChange(int[]):boolean");
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A00(int i) {
        AnonymousClass3AP r2;
        int i2;
        int i3;
        Paint paint = this.A04;
        float f = (float) i;
        paint.setStrokeWidth(0.025f * f);
        if (this.A00) {
            paint.setPathEffect((PathEffect) null);
            r2 = this.A07;
            i2 = r2.A05;
        } else {
            float f2 = f * 0.0478602f;
            paint.setPathEffect(new DashPathEffect(new float[]{f2, f2}, 0.0f));
            r2 = this.A07;
            i2 = r2.A06;
        }
        paint.setColor(i2);
        Paint paint2 = this.A03;
        if (this.A02 || !this.A01) {
            i3 = r2.A07;
        } else {
            i3 = r2.A02;
        }
        paint2.setColor(i3);
    }

    private final void A01(int i, int i2, int i3, int i4) {
        float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        this.A06.set(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth);
        this.A05.set(f, f2, f3, f4);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        A00(i3 - i);
        A01(i, i2, i3, i4);
        super.setBounds(i, i2, i3, i4);
    }

    public static final void A02(C36871lR r4) {
        r4.A00(C36421kH.A03(r4));
        r4.A01(r4.getBounds().left, r4.getBounds().top, r4.getBounds().right, r4.getBounds().bottom);
    }
}
