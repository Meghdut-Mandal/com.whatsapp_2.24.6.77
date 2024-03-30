package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4ba  reason: invalid class name and case insensitive filesystem */
public final class C91174ba extends Drawable {
    public float A00;
    public Drawable A01;
    public AnonymousClass61O A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public AnonymousClass6K4 A07;
    public final Path A08 = C36441kJ.A0M();
    public final Path A09 = C36441kJ.A0M();
    public final RectF A0A = C36441kJ.A0N();
    public final AnonymousClass00T A0B;
    public final Context A0C;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91174ba(android.content.Context r5, X.AnonymousClass61O r6, X.AnonymousClass6K4 r7) {
        /*
            r4 = this;
            r1 = 2
            r4.<init>()
            r4.A0C = r5
            r0 = 2131102667(0x7f060bcb, float:1.7817778E38)
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            r4.A06 = r0
            android.graphics.Path r0 = X.C36441kJ.A0M()
            r4.A08 = r0
            android.graphics.Path r0 = X.C36441kJ.A0M()
            r4.A09 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r4.A0A = r0
            boolean r0 = r7 instanceof X.AnonymousClass5QH
            if (r0 == 0) goto L_0x00b5
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
        L_0x0028:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r5, r0)
        L_0x002c:
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r0 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r3 = X.AnonymousClass08I.A01(r0)
            X.AnonymousClass00C.A08(r3)
            boolean r0 = r7 instanceof X.C50922mr
            if (r0 != 0) goto L_0x0052
            X.5vd r0 = r7.A01
            int r2 = r0.A01
            int r0 = r0.A03
            if (r2 == 0) goto L_0x004b
            int r0 = X.C224514j.A00(r5, r2, r0)
        L_0x004b:
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            X.AnonymousClass076.A06(r3, r0)
        L_0x0052:
            r4.A01 = r3
            android.content.res.Resources r3 = r5.getResources()
            X.6Ca r2 = r7.A00
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            boolean r0 = r6 instanceof X.AnonymousClass5QA
            if (r0 == 0) goto L_0x009e
            int r0 = r2.A00
        L_0x0064:
            float r0 = r3.getDimension(r0)
            float r2 = (float) r1
            float r0 = r0 / r2
            r4.A00 = r0
            X.5vd r0 = r7.A01
            int r1 = r0.A00
            int r0 = r0.A02
            if (r1 == 0) goto L_0x0078
            int r0 = X.C224514j.A00(r5, r1, r0)
        L_0x0078:
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            r4.A04 = r0
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r6.A00
            float r1 = r1.getDimension(r0)
            float r0 = r6.A00()
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A05 = r0
            X.7QZ r0 = X.AnonymousClass7QZ.A00
            X.00U r0 = X.C36431kI.A1I(r0)
            r4.A0B = r0
            r4.A02 = r6
            r4.A07 = r7
            return
        L_0x009e:
            boolean r0 = r6 instanceof X.AnonymousClass5QD
            if (r0 == 0) goto L_0x00a5
            int r0 = r2.A03
            goto L_0x0064
        L_0x00a5:
            boolean r0 = r6 instanceof X.AnonymousClass5QC
            if (r0 == 0) goto L_0x00ac
            int r0 = r2.A02
            goto L_0x0064
        L_0x00ac:
            boolean r0 = r6 instanceof X.AnonymousClass5QB
            if (r0 == 0) goto L_0x00f3
            int r0 = r2.A01
            goto L_0x0064
        L_0x00b3:
            r3 = 0
            goto L_0x0052
        L_0x00b5:
            boolean r0 = r7 instanceof X.AnonymousClass5QF
            if (r0 == 0) goto L_0x00be
            r0 = 2131232122(0x7f08057a, float:1.8080344E38)
            goto L_0x0028
        L_0x00be:
            boolean r0 = r7 instanceof X.AnonymousClass5QI
            if (r0 == 0) goto L_0x00cb
            r0 = r7
            X.5QI r0 = (X.AnonymousClass5QI) r0
            X.5TT r0 = r0.A00
            int r0 = r0.drawableRes
            goto L_0x0028
        L_0x00cb:
            boolean r0 = r7 instanceof X.C50912mq
            if (r0 == 0) goto L_0x00d4
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            goto L_0x0028
        L_0x00d4:
            boolean r0 = r7 instanceof X.AnonymousClass5QG
            if (r0 == 0) goto L_0x00dd
            r0 = 2131232168(0x7f0805a8, float:1.8080438E38)
            goto L_0x0028
        L_0x00dd:
            boolean r0 = r7 instanceof X.C50932ms
            if (r0 == 0) goto L_0x00e8
            r0 = r7
            X.2ms r0 = (X.C50932ms) r0
            int r0 = r0.A00
            goto L_0x0028
        L_0x00e8:
            boolean r0 = r7 instanceof X.C50922mr
            if (r0 == 0) goto L_0x00f8
            r0 = r7
            X.2mr r0 = (X.C50922mr) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x002c
        L_0x00f3:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00f8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91174ba.<init>(android.content.Context, X.61O, X.6K4):void");
    }

    public void draw(Canvas canvas) {
        int i;
        AnonymousClass00C.A0D(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable != null) {
            boolean z = this.A03;
            AnonymousClass00T r4 = this.A0B;
            Paint paint = (Paint) r4.getValue();
            if (z) {
                Context context = this.A0C;
                i = AnonymousClass00F.A00(context, C224314h.A01(context, R.attr.f4nameremoved));
            } else {
                i = this.A06;
            }
            paint.setColor(i);
            C90504aG.A13(canvas, this.A09, r4);
        }
        AnonymousClass00T r2 = this.A0B;
        ((Paint) r2.getValue()).setColor(this.A04);
        C122915vd r1 = this.A07.A01;
        if ((r1 instanceof C50902mp) || (r1 instanceof AnonymousClass5QE)) {
            C90504aG.A13(canvas, this.A08, r2);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        AnonymousClass00C.A0D(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A0A;
        rectF.set(rect);
        Path path = this.A09;
        path.reset();
        float f = (float) 2;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f, direction);
        float A002 = this.A02.A00();
        rectF.inset(A002, A002);
        Path path2 = this.A08;
        path2.reset();
        path2.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f, direction);
        Drawable drawable = this.A01;
        if (drawable != null) {
            float centerX = rectF.centerX();
            float f2 = this.A00;
            RectF rectF2 = new RectF(centerX - f2, rectF.centerY() - f2, rectF.centerX() + f2, rectF.centerY() + f2);
            Rect A062 = AnonymousClass001.A06();
            rectF2.roundOut(A062);
            drawable.setBounds(A062);
        }
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setAlpha(int i) {
        ((Paint) this.A0B.getValue()).setAlpha(i);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public int getIntrinsicHeight() {
        return this.A05;
    }

    public int getIntrinsicWidth() {
        return this.A05;
    }
}
