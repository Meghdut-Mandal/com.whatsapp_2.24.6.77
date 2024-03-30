package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.6lQ  reason: invalid class name and case insensitive filesystem */
public final class C140336lQ implements C159067ik {
    public AnonymousClass5S3 A00 = AnonymousClass5S3.NONE;
    public C108525Tv A01;
    public AnonymousClass5TY A02;
    public C91174ba A03;
    public C91174ba A04;
    public AnonymousClass61O A05;
    public AnonymousClass6K4 A06;
    public final Context A07;
    public final RectF A08 = C36441kJ.A0N();
    public final AnonymousClass00T A09 = C36431kI.A1I(AnonymousClass7QU.A00);
    public final AnonymousClass00T A0A = C36431kI.A1I(new AnonymousClass7NF(this));
    public final AnonymousClass00T A0B = C36431kI.A1I(AnonymousClass7QV.A00);
    public final C18820ts A0C;
    public final AnonymousClass7i5 A0D;

    public static void A01(Drawable drawable, C140336lQ r7, float f) {
        AnonymousClass00T r4 = r7.A0B;
        ((RectF) r4.getValue()).set(r7.A08);
        float f2 = (float) 2;
        ((RectF) r4.getValue()).inset((((RectF) r4.getValue()).width() / f2) * f, (((RectF) r4.getValue()).height() / f2) * f);
        drawable.setBounds((int) ((RectF) r4.getValue()).left, (int) ((RectF) r4.getValue()).top, (int) ((RectF) r4.getValue()).right, (int) ((RectF) r4.getValue()).bottom);
    }

    public void A02(RectF rectF) {
        float f;
        float f2;
        AnonymousClass00C.A0D(rectF, 0);
        AnonymousClass61O r0 = this.A05;
        Context context = this.A07;
        float dimension = context.getResources().getDimension(r0.A00);
        PointF A002 = AnonymousClass6RA.A00(context, this.A01, this.A02);
        RectF rectF2 = this.A08;
        float f3 = rectF.bottom - (dimension - A002.y);
        rectF2.top = f3;
        rectF2.bottom = f3 + dimension;
        if (C36401kF.A1X(this.A0C)) {
            f = rectF.left;
            f2 = A002.x;
        } else {
            f = rectF.right;
            f2 = dimension - A002.x;
        }
        float f4 = f - f2;
        rectF2.left = f4;
        float f5 = f4 + dimension;
        rectF2.right = f5;
        float A003 = this.A05.A00();
        rectF2.left = f4 - A003;
        rectF2.top -= A003;
        rectF2.right = f5 + A003;
        rectF2.bottom += A003;
        A00();
    }

    private final void A00() {
        float f = (float) ((AnonymousClass6E4) this.A0A.getValue()).A07.A00;
        C91174ba r2 = this.A03;
        if (r2 != null) {
            A01(r2, this, f);
            r2.setAlpha((int) (((double) 255) * (1.0d - ((double) f))));
        }
        C91174ba r22 = this.A04;
        if (r22 != null) {
            A01(r22, this, (float) (1.0d - ((double) f)));
            r22.setAlpha((int) (((float) 255) * f));
        }
    }

    public void Bgw(AnonymousClass6E4 r6) {
        AnonymousClass5S3 r0;
        double d = r6.A07.A00;
        if (d == 0.0d) {
            r0 = AnonymousClass5S3.NONE;
        } else if (d == 1.0d) {
            r0 = AnonymousClass5S3.CHECKED;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public C140336lQ(Context context, C18820ts r4, AnonymousClass7i5 r5, C108525Tv r6, AnonymousClass5TY r7, AnonymousClass6K4 r8) {
        C91174ba r0;
        this.A07 = context;
        this.A0C = r4;
        this.A0D = r5;
        this.A01 = r6;
        AnonymousClass61O A012 = AnonymousClass6RA.A01(context, r7);
        this.A05 = A012;
        if (r8 != null) {
            r0 = new C91174ba(context, A012, r8);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A02 = r7;
        this.A06 = r8;
    }

    public void Bgx(AnonymousClass6E4 r2) {
        A00();
        this.A0D.invalidate();
    }
}
