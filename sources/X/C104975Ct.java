package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: X.5Ct  reason: invalid class name and case insensitive filesystem */
public class C104975Ct extends C131646Px {
    public AnonymousClass6L5 A00;
    public final float A01;
    public final Rect A02 = AnonymousClass001.A06();
    public final RectF A03 = C36441kJ.A0N();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104975Ct(android.graphics.Bitmap r14, android.graphics.Paint r15, android.graphics.PointF r16, android.graphics.PointF r17, X.AnonymousClass6L5 r18, float r19, int r20) {
        /*
            r13 = this;
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r19
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7)
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r13.A02 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r13.A03 = r0
            r0 = r18
            r13.A00 = r0
            java.util.List r0 = r13.A02
            r1 = r16
            r0.add(r1)
            android.graphics.Canvas r8 = r13.A00
            if (r8 == 0) goto L_0x0034
            float r10 = r1.x
            float r11 = r1.y
            android.graphics.Paint r9 = r13.A01
            float r0 = r13.A01
            int r12 = (int) r0
            r7 = r13
            r7.A08(r8, r9, r10, r11, r12)
        L_0x0034:
            r13.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104975Ct.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, X.6L5, float, int):void");
    }

    public void A08(Canvas canvas, Paint paint, float f, float f2, int i) {
        Bitmap bitmap;
        AnonymousClass6L5 r5 = this.A00;
        Bitmap bitmap2 = r5.A02;
        if (bitmap2 == null) {
            Bitmap bitmap3 = r5.A03;
            if (bitmap3 == null) {
                C117455mI r0 = r5.A04;
                if (r0 != null) {
                    MediaComposerFragment mediaComposerFragment = r0.A00.A0J;
                    if (mediaComposerFragment instanceof ImageComposerFragment) {
                        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) mediaComposerFragment;
                        int i2 = imageComposerFragment.A05.A01;
                        if (i2 != 0) {
                            bitmap = FilterUtils.A00(imageComposerFragment.A00, imageComposerFragment.A03, i2, true);
                        } else {
                            bitmap = imageComposerFragment.A00;
                        }
                    } else {
                        bitmap = null;
                    }
                    Objects.requireNonNull(bitmap);
                    r5.A01 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    r5.A00 = height;
                    bitmap3 = Bitmap.createScaledBitmap(bitmap, (int) (((float) r5.A01) * 0.05f), (int) (((float) height) * 0.05f), false);
                    r5.A03 = bitmap3;
                } else {
                    throw AnonymousClass001.A09("Origin bitmap loader is required to get origin bitmap");
                }
            }
            bitmap2 = Bitmap.createScaledBitmap(bitmap3, Math.round(((float) r5.A01) / 3.0f), Math.round(((float) r5.A00) / 3.0f), false);
            r5.A02 = bitmap2;
        }
        float f3 = (float) (i / 2);
        int i3 = (int) (f - f3);
        int i4 = (int) (f2 - f3);
        int i5 = i3 + i;
        int i6 = i + i4;
        Rect rect = this.A02;
        float f4 = (float) i3;
        rect.left = Math.round(f4 / 3.0f);
        float f5 = (float) i4;
        rect.top = Math.round(f5 / 3.0f);
        float f6 = (float) i5;
        rect.right = Math.round(f6 / 3.0f);
        float f7 = (float) i6;
        rect.bottom = Math.round(f7 / 3.0f);
        RectF rectF = this.A03;
        rectF.left = f4;
        rectF.top = f5;
        rectF.right = f6;
        rectF.bottom = f7;
        canvas.drawBitmap(bitmap2, rect, rectF, paint);
    }

    public void A07(JSONObject jSONObject) {
        super.A07(jSONObject);
        jSONObject.put("brush_blur", true);
    }
}
