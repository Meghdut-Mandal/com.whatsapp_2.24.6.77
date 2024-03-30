package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5zr  reason: invalid class name and case insensitive filesystem */
public class C125405zr {
    public Bitmap A00(Resources resources, Drawable drawable, ImageView imageView) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        imageView.setBackground((Drawable) null);
        imageView.setPadding(112, 112, 112, 112);
        AnonymousClass000.A16(imageView, 640, 1073741824, View.MeasureSpec.makeMeasureSpec(640, 1073741824));
        imageView.layout(0, 0, imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        imageView.setImageDrawable(drawable);
        try {
            bitmap2 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
            bitmap = bitmap2;
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
            bitmap = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        Canvas A0A = C90524aI.A0A(bitmap2);
        imageView.setLayerType(1, (Paint) null);
        imageView.draw(A0A);
        try {
            bitmap3 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            bitmap3 = null;
        }
        if (bitmap3 == null) {
            return null;
        }
        Canvas A0A2 = C90524aI.A0A(bitmap3);
        Paint A0K = C36441kJ.A0K();
        A0K.setMaskFilter(new BlurMaskFilter(49.28f, BlurMaskFilter.Blur.NORMAL));
        int[] A1O = C36441kJ.A1O();
        Bitmap extractAlpha = bitmap.extractAlpha(A0K, A1O);
        Paint A0K2 = C36441kJ.A0K();
        C90484aE.A14(resources, A0K2, R.color.f6nameremoved);
        A0A2.drawBitmap(extractAlpha, (float) A1O[0], ((float) A1O[1]) + 32.0f, A0K2);
        A0A2.drawBitmap(bitmap, 0.0f, 0.0f, C36441kJ.A0K());
        bitmap.recycle();
        extractAlpha.recycle();
        return bitmap3;
    }
}
