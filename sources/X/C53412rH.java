package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.2rH  reason: invalid class name and case insensitive filesystem */
public abstract class C53412rH {
    public static void A00(WaImageView waImageView, int i) {
        boolean z = true;
        if (!(i == 3 || i == 1)) {
            z = false;
        }
        Drawable drawable = waImageView.getDrawable();
        if (!z || drawable == null) {
            C36411kG.A1D(waImageView);
            waImageView.setRotation(((float) i) * -90.0f);
            return;
        }
        waImageView.setRotation(0.0f);
        waImageView.setScaleType(ImageView.ScaleType.MATRIX);
        Matrix matrix = new Matrix();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int A00 = C36331k8.A00(waImageView, waImageView.getWidth());
        int A0D = AnonymousClass000.A0D(waImageView, waImageView.getHeight());
        int i2 = intrinsicWidth * A00;
        int i3 = A0D * intrinsicHeight;
        float f = (float) A0D;
        float f2 = f;
        float f3 = (float) intrinsicWidth;
        float f4 = f3;
        if (i2 > i3) {
            f = (float) A00;
            f3 = (float) intrinsicHeight;
        }
        float f5 = f / f3;
        float f6 = (float) intrinsicHeight;
        matrix.setRotate(((float) i) * -90.0f, f4 / 2.0f, f6 / 2.0f);
        matrix.postScale(f5, f5);
        matrix.postTranslate((float) Math.round((((float) A00) - (f4 * f5)) * 0.5f), (float) Math.round((f2 - (f6 * f5)) * 0.5f));
        waImageView.setImageMatrix(matrix);
    }
}
