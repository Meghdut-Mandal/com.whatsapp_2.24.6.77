package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.67z  reason: invalid class name and case insensitive filesystem */
public class C1273667z {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public AnonymousClass6VI A04 = null;
    public AnonymousClass6VI A05 = null;
    public AnonymousClass6VI[] A06 = new AnonymousClass6VI[4];
    public Paint A07 = C36441kJ.A0L(2);
    public final Rect A08 = AnonymousClass001.A06();
    public final RectF A09 = C36441kJ.A0N();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap bitmap;
        Bitmap A022;
        AnonymousClass6VI r0 = this.A05;
        Bitmap bitmap2 = null;
        if (r0 != null) {
            bitmap = r0.A02();
        } else {
            bitmap = null;
        }
        Bitmap bitmap3 = AnonymousClass6VI.A0F;
        if (bitmap != bitmap3) {
            Canvas canvas2 = canvas;
            float f3 = f;
            float f4 = f2;
            if (AnonymousClass000.A1V(bitmap)) {
                Paint paint = this.A07;
                paint.setAlpha(255);
                canvas2.drawBitmap(bitmap, f3, f4, paint);
                return;
            }
            Paint paint2 = this.A07;
            paint2.setAlpha(255);
            AnonymousClass6VI[] r5 = this.A06;
            int i = 0;
            int i2 = 0;
            do {
                if (!(r5[i] == null || r5[i].A04 != this.A02 + 1 || r5[i].A02() == null)) {
                    i2++;
                }
                i++;
            } while (i < 4);
            AnonymousClass6VI r02 = this.A04;
            if (r02 != null) {
                bitmap2 = r02.A02();
            }
            if (i2 != 4) {
                if (!(bitmap2 == null || bitmap2 == bitmap3)) {
                    int i3 = this.A02;
                    AnonymousClass6VI r1 = this.A04;
                    int i4 = i3 - r1.A04;
                    int i5 = r1.A00 >> i4;
                    int i6 = (1 << i4) - 1;
                    int i7 = (this.A00 & i6) * i5;
                    int i8 = (i6 & this.A01) * i5;
                    Rect rect = this.A08;
                    rect.set(i7, i8, i7 + i5, i5 + i8);
                    RectF rectF = this.A09;
                    AnonymousClass6VI r2 = this.A04;
                    rectF.set(f3, f4, ((float) r2.A01) + f, ((float) r2.A00) + f2);
                    canvas2.drawBitmap(bitmap2, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i9 = 0;
            do {
                int i10 = 0;
                do {
                    AnonymousClass6VI r15 = r5[(i9 << 1) + i10];
                    if (!(r15 == null || r15.A04 != this.A02 + 1 || (A022 = r15.A02()) == null || A022 == bitmap3)) {
                        int i11 = r15.A00;
                        int i12 = i11 >> 1;
                        float f5 = ((float) (i12 * i9)) + f;
                        float f6 = ((float) (i12 * i10)) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, r15.A01, i11);
                        RectF rectF2 = this.A09;
                        float f7 = (float) i12;
                        rectF2.set(f5, f6, f5 + f7, f7 + f6);
                        canvas2.drawBitmap(A022, rect2, rectF2, paint2);
                    }
                    i10++;
                } while (i10 < 2);
                i9++;
            } while (i9 < 2);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("{tile=");
        Object obj = this.A05;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        A0u.append(obj);
        A0u.append(", mParentTile=");
        Object obj3 = this.A04;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0u.append(obj2);
        A0u.append(", status=");
        A0u.append(this.A03);
        return AnonymousClass000.A0q("}", A0u);
    }
}
