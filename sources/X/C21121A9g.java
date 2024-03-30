package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.A9g  reason: case insensitive filesystem */
public final class C21121A9g implements C23066B2s {
    public final Context A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new C22093Age(this));
    public final AnonymousClass00T A02 = C36431kI.A1I(new C22094Agf(this));
    public final AnonymousClass00T A03 = C36431kI.A1I(new C22097Agi(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new C22098Agj(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new C22101Agm(this));
    public final AnonymousClass00T A06 = C36431kI.A1I(new C22102Agn(this));
    public final AnonymousClass00T A07 = C36431kI.A1I(new C22103Ago(this));
    public final AnonymousClass00T A08 = C36431kI.A1I(new C22104Agp(this));
    public final AnonymousClass00T A09 = C36431kI.A1I(new C22105Agq(this));
    public final AnonymousClass00T A0A = C36431kI.A1I(new C22106Agr(this));
    public final AnonymousClass00T A0B = C36431kI.A1I(new C22107Ags(this));
    public final AnonymousClass00T A0C = C36431kI.A1I(new C22108Agt(this));
    public final AnonymousClass00T A0D = C36431kI.A1I(new C22109Agu(this));
    public final AnonymousClass00T A0E = C36431kI.A1I(new C22110Agv(this));
    public final AnonymousClass00T A0F = C36431kI.A1I(new C22111Agw(this));
    public final AnonymousClass00T A0G = C36431kI.A1I(new C22112Agx(this));
    public final AnonymousClass00T A0H = C36431kI.A1I(new C22095Agg(this));
    public final AnonymousClass00T A0I = C36431kI.A1I(new C22096Agh(this));
    public final AnonymousClass00T A0J = C36431kI.A1I(new C22099Agk(this));
    public final AnonymousClass00T A0K = C36431kI.A1I(new C22100Agl(this));

    public C21121A9g(Context context, C20810yC r5, C19770wU r6) {
        int i;
        int i2;
        AnonymousClass00C.A0D(context, 1);
        C36341k9.A1E(r6, 2, r5);
        this.A00 = context;
        int A072 = r5.A07(7680);
        if (A072 != 0) {
            if (A072 == 1) {
                i2 = 7;
            } else if (A072 != 2) {
                r6.Bp1(new C1497172m(this, 10));
                r6.Bp1(new C1497172m(this, 15));
                r6.Bp1(new C1497172m(this, 9));
                i2 = 11;
            } else {
                C1497172m.A00(r6, this, 14);
                C1497172m.A00(r6, this, 13);
                C1497172m.A00(r6, this, 12);
                i = 8;
            }
            r6.Bp1(new C1497172m(this, i2));
            return;
        }
        i = 16;
        C1497172m.A00(r6, this, i);
    }

    public static final Paint A00(C21121A9g a9g, int i, int i2) {
        int A012 = C36351kA.A01(a9g.A00, i, i2);
        Paint paint = new Paint(1);
        paint.setColor(A012);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public static final NinePatchDrawable A01(Paint paint, AnonymousClass9Xb r9, C21121A9g a9g, boolean z) {
        AnonymousClass00T r0;
        AnonymousClass00T r02;
        float f = r9.A02;
        float f2 = r9.A05;
        float f3 = f + f2;
        if (!z) {
            f2 = r9.A0B;
        }
        float f4 = f3 + f2;
        float f5 = r9.A00;
        float f6 = r9.A0G;
        float f7 = f5 + f6 + r9.A0B;
        Bitmap createBitmap = Bitmap.createBitmap((int) f4, (int) f7, Bitmap.Config.ARGB_8888);
        AnonymousClass00C.A08(createBitmap);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        if (z) {
            canvas.scale(-1.0f, 1.0f, f4 / 2.0f, f7 / 2.0f);
            canvas.translate(-f6, 0.0f);
        }
        canvas.drawPath((Path) a9g.A07.getValue(), (Paint) a9g.A0G.getValue());
        canvas.drawPath((Path) a9g.A06.getValue(), paint);
        Resources resources = a9g.A00.getResources();
        if (z) {
            r0 = a9g.A09;
        } else {
            r0 = a9g.A08;
        }
        byte[] array = ((ByteBuffer) r0.getValue()).array();
        if (z) {
            r02 = a9g.A0C;
        } else {
            r02 = a9g.A0D;
        }
        return new NinePatchDrawable(resources, createBitmap, array, (Rect) r02.getValue(), (String) null);
    }

    public static final NinePatchDrawable A02(Paint paint, AnonymousClass9Xb r11, C21121A9g a9g, boolean z) {
        float f;
        float f2;
        AnonymousClass00T r0;
        float f3 = r11.A02;
        float f4 = r11.A0B;
        float f5 = r11.A00;
        float f6 = r11.A0G;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f3 + f4), (int) (f5 + f6 + f4), Bitmap.Config.ARGB_8888);
        AnonymousClass00C.A08(createBitmap);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        if (z) {
            f = r11.A0H;
            f2 = (f3 + r11.A06) - r11.A05;
        } else {
            float f7 = r11.A06;
            f4 = f7 + r11.A05;
            f = r11.A0H;
            f2 = f3 + f7;
        }
        RectF rectF = new RectF(f4, f, f2, f5 + f);
        RectF rectF2 = new RectF(rectF.left, rectF.top + f6, rectF.right, rectF.bottom + f6);
        float f8 = r11.A01;
        canvas.drawRoundRect(rectF2, f8, f8, (Paint) a9g.A0G.getValue());
        canvas.drawRoundRect(rectF, f8, f8, paint);
        Resources resources = a9g.A00.getResources();
        byte[] array = ((ByteBuffer) a9g.A09.getValue()).array();
        if (z) {
            r0 = a9g.A0C;
        } else {
            r0 = a9g.A0D;
        }
        return new NinePatchDrawable(resources, createBitmap, array, (Rect) r0.getValue(), (String) null);
    }

    public static AnonymousClass9Xb A03(C21121A9g a9g) {
        return (AnonymousClass9Xb) a9g.A05.getValue();
    }

    public static final ByteBuffer A04(AnonymousClass9Xb r4, boolean z) {
        float f;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        float f2 = r4.A0E;
        if (z) {
            float f3 = r4.A05;
            order.putInt((int) (f2 - f3));
            f = r4.A0F - f3;
        } else {
            order.putInt((int) f2);
            f = r4.A0F;
        }
        order.putInt((int) f);
        order.putInt((int) r4.A09);
        order.putInt((int) r4.A0A);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }

    public Drawable BCb() {
        return (Drawable) this.A01.getValue();
    }

    public Drawable BCc() {
        return (Drawable) this.A02.getValue();
    }

    public Drawable BEk() {
        return (Drawable) this.A03.getValue();
    }

    public Drawable BEl() {
        return (Drawable) this.A04.getValue();
    }
}
