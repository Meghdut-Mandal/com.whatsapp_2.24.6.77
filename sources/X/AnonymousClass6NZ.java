package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.6NZ  reason: invalid class name */
public abstract class AnonymousClass6NZ {
    public static void A00(int i, int i2) {
        boolean z = true;
        if (AnonymousClass000.A1R(i)) {
            if (i2 <= 0) {
                z = false;
            }
            if (!z) {
                throw AnonymousClass001.A08(String.valueOf("height must be > 0"));
            }
            return;
        }
        throw AnonymousClass001.A08(String.valueOf("width must be > 0"));
    }

    public abstract AU0 A01(Bitmap.Config config, int i, int i2);

    public AU0 A02(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        A00(width, height);
        boolean z = true;
        if (C90504aG.A1U(width, bitmap.getWidth())) {
            if (height > bitmap.getHeight()) {
                z = false;
            }
            if (z) {
                Rect rect = new Rect(0, 0, width, height);
                RectF A0L = C90514aH.A0L((float) width, height);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 != null) {
                    int A03 = C90524aI.A03(config2, C112735eN.A00);
                    if (A03 == 1) {
                        config = Bitmap.Config.RGB_565;
                    } else if (A03 == 2) {
                        config = Bitmap.Config.ALPHA_8;
                    }
                }
                boolean hasAlpha = bitmap.hasAlpha();
                A00(width, height);
                AU0 A01 = A01(config, width, height);
                Bitmap bitmap2 = (Bitmap) A01.A01();
                bitmap2.setHasAlpha(hasAlpha);
                if (config == Bitmap.Config.ARGB_8888 && !hasAlpha) {
                    bitmap2.eraseColor(-16777216);
                }
                Bitmap bitmap3 = (Bitmap) A01.A01();
                bitmap3.setDensity(bitmap.getDensity());
                bitmap3.setHasAlpha(bitmap.hasAlpha());
                bitmap3.setPremultiplied(bitmap.isPremultiplied());
                Canvas A0A = C90524aI.A0A((Bitmap) A01.A01());
                A0A.drawBitmap(bitmap, rect, A0L, (Paint) null);
                A0A.setBitmap((Bitmap) null);
                return A01;
            }
            throw AnonymousClass001.A08(String.valueOf("y + height must be <= bitmap.height()"));
        }
        throw AnonymousClass001.A08(String.valueOf("x + width must be <= bitmap.width()"));
    }
}
