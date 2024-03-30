package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import com.whatsapp.R;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;
import java.util.List;

/* renamed from: X.1Pn  reason: invalid class name and case insensitive filesystem */
public class C27731Pn implements AnonymousClass00M {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final AnonymousClass1Pp A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final AnonymousClass16K A05;
    public final C27761Ps A06;
    public final C21060yb A07;
    public final C19630wG A08;
    public final C18820ts A09;
    public final C220412q A0A;
    public final C27751Pr A0B;
    public final AnonymousClass1EM A0C;

    public AnonymousClass1RY A06(String str, float f, int i) {
        return new AnonymousClass1RY(this, str, f, i, false);
    }

    public static Bitmap A01(List list, float f) {
        Rect rect;
        RectF rectF;
        int i;
        List<Bitmap> list2 = list;
        boolean z = false;
        if (list2.size() > 1) {
            z = true;
        }
        C18740tg.A0D(z, "Insufficient number of bitmaps to combine");
        if (list2.size() == 1) {
            return (Bitmap) list2.get(0);
        }
        int i2 = 0;
        int i3 = 0;
        for (Bitmap bitmap : list2) {
            if (i2 < bitmap.getWidth()) {
                i2 = bitmap.getWidth();
            }
            if (i3 < bitmap.getHeight()) {
                i3 = bitmap.getHeight();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = (float) i2;
        float f3 = (float) i3;
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, f3);
        Paint paint = new Paint();
        paint.setColor(-1);
        float f4 = f;
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i4 != 0) {
            if (i4 > 0) {
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            } else {
                canvas.drawArc(rectF2, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        if (list2.size() == 2) {
            Rect rect2 = new Rect(((int) (((double) i2) * 0.25d)) + 1, 0, ((int) (0.75f * f2)) - 1, i3);
            float f5 = 0.5f * f2;
            canvas.drawBitmap((Bitmap) list2.get(0), rect2, new RectF(0.0f, 0.0f, f5 - 2.0f, f3), paint);
            canvas.drawBitmap((Bitmap) list2.get(1), rect2, new RectF(f5 + 2.0f, 0.0f, f2, f3), paint);
        } else {
            if (list2.size() == 3) {
                int i5 = ((int) (((double) i2) * 0.25d)) + 1;
                int i6 = ((int) (0.75f * f2)) - 1;
                float f6 = f2 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(0), new Rect(i5, 0, i6, i3), new RectF(0.0f, 0.0f, f6 - 2.0f, f3), paint);
                double d = (double) i3;
                rect = new Rect(i5, ((int) (d * 0.25d)) + 1, i6, ((int) (d * 0.75d)) - 1);
                float f7 = f6 + 2.0f;
                float f8 = f3 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(f7, 0.0f, f2, f8 - 2.0f), paint);
                rectF = new RectF(f7, f8 + 2.0f, f2, f3);
                i = 2;
            } else if (list2.size() == 4) {
                double d2 = (double) i3;
                rect = new Rect(((int) (((double) i2) * 0.25d)) + 1, ((int) (d2 * 0.25d)) + 1, ((int) (0.75f * f2)) - 1, ((int) (d2 * 0.75d)) - 1);
                float f9 = f2 * 0.5f;
                float f10 = f9 - 2.0f;
                float f11 = 0.5f * f3;
                float f12 = f11 - 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(0), rect, new RectF(0.0f, 0.0f, f10, f12), paint);
                float f13 = f11 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(0.0f, f13, f10, f3), paint);
                float f14 = f9 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(2), rect, new RectF(f14, 0.0f, f2, f12), paint);
                rectF = new RectF(f14, f13, f2, f3);
                i = 3;
            }
            canvas.drawBitmap((Bitmap) list2.get(i), rect, rectF, paint);
            return createBitmap;
        }
        return createBitmap;
    }

    public C27731Pn(AnonymousClass17Y r1, C19730wQ r2, AnonymousClass1Pp r3, AnonymousClass16D r4, AnonymousClass171 r5, AnonymousClass16K r6, C27761Ps r7, C21060yb r8, C19630wG r9, C18820ts r10, C220412q r11, C27751Pr r12, AnonymousClass1EM r13) {
        this.A00 = r1;
        this.A08 = r9;
        this.A01 = r2;
        this.A0A = r11;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A09 = r10;
        this.A0C = r13;
        this.A05 = r6;
        this.A0B = r12;
        this.A06 = r7;
    }

    public static Bitmap A00(Bitmap bitmap, float f, int i) {
        Rect rect;
        int i2 = i;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i2 && ((int) f) == 0) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f2 = (float) i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i3 == 0) {
            canvas.drawRect(rectF, paint);
        } else if (i3 > 0) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else if (f == -2.14748365E9f) {
            canvas.drawPath(AnonymousClass6Y8.A06(rectF), paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
        int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
        if (width > 0) {
            rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
        } else {
            rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        }
        canvas.drawBitmap(bitmap, rect, rectF2, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public Bitmap A02(Context context, AnonymousClass141 r9, int i, int i2) {
        int min = Math.min(i, i2);
        AnonymousClass1EM r2 = this.A0C;
        AnonymousClass141 r3 = r9;
        AnonymousClass11F r1 = r9.A0H;
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        boolean A062 = r2.A06(C65533Sl.A03(r1));
        int i3 = -1;
        if (A062) {
            i3 = Integer.MIN_VALUE;
        }
        AnonymousClass16K r0 = this.A05;
        float f = (float) i3;
        Bitmap bitmap = (Bitmap) r0.A02.A01().A09(r9.A08(f, min));
        if (bitmap != null || !r9.A0f || min <= 0) {
            return bitmap;
        }
        return this.A06.A07(context, r3, f, min, true);
    }

    public AnonymousClass1RY A03(Context context, AnonymousClass012 r5, String str) {
        AnonymousClass1RY A052 = A05(context, str);
        r5.getLifecycle().A04(new ContactPhotos$LoaderLifecycleEventObserver(A052));
        return A052;
    }

    public AnonymousClass1RY A04(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        return new AnonymousClass1RY(this, str, resources.getDimension(R.dimen.f7nameremoved), dimensionPixelSize, true);
    }

    public AnonymousClass1RY A05(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        return new AnonymousClass1RY(this, str, resources.getDimension(R.dimen.f7nameremoved), dimensionPixelSize, false);
    }
}
